package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class ConstraintLayoutStates {
    public final ConstraintLayout mConstraintLayout;
    public int mCurrentStateId = -1;
    public int mCurrentConstraintNumber = -1;
    public final SparseArray mStateList = new SparseArray();
    public final SparseArray mConstraintSetMap = new SparseArray();

    public final class State {
        public final int mConstraintID;
        public final ConstraintSet mConstraintSet;
        public final int mId;
        public final ArrayList mVariants = new ArrayList();

        public State(Context context, XmlResourceParser xmlResourceParser) {
            this.mConstraintID = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    this.mConstraintID = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, resourceId);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final class Variant {
        public final int mConstraintID;
        public final ConstraintSet mConstraintSet;
        public final float mMaxHeight;
        public final float mMaxWidth;
        public final float mMinHeight;
        public final float mMinWidth;

        public Variant(Context context, XmlResourceParser xmlResourceParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    this.mConstraintID = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, resourceId);
                    }
                } else if (index == 1) {
                    this.mMaxHeight = obtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == 2) {
                    this.mMinHeight = obtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == 3) {
                    this.mMaxWidth = obtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == 4) {
                    this.mMinWidth = obtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean match(float f, float f2) {
            float f3 = this.mMinWidth;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.mMinHeight;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.mMaxWidth;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.mMaxHeight;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        String str;
        this.mConstraintLayout = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            State state = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                parseConstraintSet(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                State state2 = new State(context, xml);
                                this.mStateList.put(state2.mId, state2);
                                state = state2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                Variant variant = new Variant(context, xml);
                                if (state != null) {
                                    state.mVariants.add(variant);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
    }

    public final void parseConstraintSet(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(Fragment$5$$ExternalSyntheticOutline0.m(47, 1, attributeValue), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.load(context, xmlResourceParser);
                this.mConstraintSetMap.put(identifier, constraintSet);
                return;
            }
        }
    }

    public final void updateConstraints(float f, float f2, int i) {
        int i2 = this.mCurrentStateId;
        int i3 = 0;
        ConstraintLayout constraintLayout = this.mConstraintLayout;
        SparseArray sparseArray = this.mStateList;
        if (i2 == i) {
            State state = i == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(i2);
            int i4 = this.mCurrentConstraintNumber;
            if (i4 == -1 || !((Variant) state.mVariants.get(i4)).match(f, f2)) {
                ArrayList arrayList = state.mVariants;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (((Variant) arrayList.get(i3)).match(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                ArrayList arrayList2 = state.mVariants;
                if (this.mCurrentConstraintNumber == i3) {
                    return;
                }
                ConstraintSet constraintSet = i3 == -1 ? null : ((Variant) arrayList2.get(i3)).mConstraintSet;
                if (i3 != -1) {
                    int i5 = ((Variant) arrayList2.get(i3)).mConstraintID;
                }
                if (constraintSet == null) {
                    return;
                }
                this.mCurrentConstraintNumber = i3;
                constraintSet.applyTo(constraintLayout);
                return;
            }
            return;
        }
        this.mCurrentStateId = i;
        State state2 = (State) sparseArray.get(i);
        ArrayList arrayList3 = state2.mVariants;
        while (true) {
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (((Variant) arrayList3.get(i3)).match(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList arrayList4 = state2.mVariants;
        ConstraintSet constraintSet2 = i3 == -1 ? state2.mConstraintSet : ((Variant) arrayList4.get(i3)).mConstraintSet;
        if (i3 != -1) {
            int i6 = ((Variant) arrayList4.get(i3)).mConstraintID;
        }
        if (constraintSet2 != null) {
            this.mCurrentConstraintNumber = i3;
            constraintSet2.applyTo(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
    }
}
