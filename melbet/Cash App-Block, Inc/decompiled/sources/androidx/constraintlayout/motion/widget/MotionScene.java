package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R$styleable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.e0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class MotionScene {
    public final ArrayList mAbstractTransitionList;
    public final HashMap mConstraintSetIdMap;
    public final SparseArray mConstraintSetMap;
    public Transition mCurrentTransition;
    public int mDefaultDuration;
    public final Transition mDefaultTransition;
    public final SparseIntArray mDeriveMap;
    public boolean mIgnoreTouch;
    public MotionEvent mLastTouchDown;
    public float mLastTouchX;
    public float mLastTouchY;
    public int mLayoutDuringTransition;
    public final MotionLayout mMotionLayout;
    public boolean mMotionOutsideRegion;
    public boolean mRtl;
    public final Sniffer mStateSet;
    public final ArrayList mTransitionList;
    public MotionLayout.MyTracker mVelocityTracker;
    public final e0 mViewTransitionController;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionScene$1, reason: invalid class name */
    public final class AnonymousClass1 implements Interpolator {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Easing val$easing;

        public /* synthetic */ AnonymousClass1(Easing easing, int i) {
            this.$r8$classId = i;
            this.val$easing = easing;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            double d;
            switch (this.$r8$classId) {
                case 0:
                    d = this.val$easing.get(f);
                    break;
                case 1:
                    d = this.val$easing.get(f);
                    break;
                default:
                    d = this.val$easing.get(f);
                    break;
            }
            return (float) d;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public MotionScene(Context context, MotionLayout motionLayout, int i) {
        this.mStateSet = null;
        this.mCurrentTransition = null;
        ArrayList arrayList = new ArrayList();
        this.mTransitionList = arrayList;
        this.mDefaultTransition = null;
        this.mAbstractTransitionList = new ArrayList();
        this.mConstraintSetMap = new SparseArray();
        this.mConstraintSetIdMap = new HashMap();
        this.mDeriveMap = new SparseIntArray();
        this.mDefaultDuration = 400;
        this.mLayoutDuringTransition = 0;
        this.mIgnoreTouch = false;
        this.mMotionOutsideRegion = false;
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new e0(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            Transition transition = null;
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
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                KeyFrames keyFrames = new KeyFrames(context, xml);
                                if (transition != null) {
                                    transition.mKeyFramesList.add(keyFrames);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -687739768:
                            if (!name.equals("Include")) {
                                break;
                            }
                            parseInclude(context, xml);
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                ViewTransition viewTransition = new ViewTransition(context, xml);
                                e0 e0Var = this.mViewTransitionController;
                                ((ArrayList) e0Var.b).add(viewTransition);
                                e0Var.c = null;
                                int i2 = viewTransition.mOnStateTransition;
                                if (i2 == 4) {
                                    e0.listenForSharedVariable(viewTransition);
                                    break;
                                } else if (i2 == 5) {
                                    e0.listenForSharedVariable(viewTransition);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 269306229:
                            if (name.equals("Transition")) {
                                transition = new Transition(this, context, xml);
                                boolean z = transition.mIsAbstract;
                                arrayList.add(transition);
                                if (this.mCurrentTransition == null && !z) {
                                    this.mCurrentTransition = transition;
                                    TouchResponse touchResponse = transition.mTouchResponse;
                                    if (touchResponse != null) {
                                        touchResponse.setRTL(this.mRtl);
                                    }
                                }
                                if (z) {
                                    if (transition.mConstraintSetEnd == -1) {
                                        this.mDefaultTransition = transition;
                                    } else {
                                        this.mAbstractTransitionList.add(transition);
                                    }
                                    arrayList.remove(transition);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 312750793:
                            if (name.equals("OnClick") && transition != null) {
                                transition.mOnClicks.add(new Transition.TransitionOnClick(context, transition, xml));
                                break;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (transition == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (transition != null) {
                                    transition.mTouchResponse = new TouchResponse(context, this.mMotionLayout, xml);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                parseMotionSceneTags(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.mStateSet = new Sniffer(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1942574248:
                            if (name.equals("include")) {
                                parseInclude(context, xml);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.mConstraintSetMap.put(R.id.motion_base, new ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    public static int getId(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(Fragment$5$$ExternalSyntheticOutline0.m(47, 1, str), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return i;
    }

    public final boolean autoTransition(int i, MotionLayout motionLayout) {
        Transition transition;
        if (this.mVelocityTracker != null) {
            return false;
        }
        Iterator it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition transition2 = (Transition) it.next();
            int i2 = transition2.mAutoTransition;
            if (i2 != 0 && ((transition = this.mCurrentTransition) != transition2 || (transition.mTransitionFlags & 2) == 0)) {
                if (i == transition2.mConstraintSetStart && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState$1(4);
                    motionLayout.setTransition(transition2);
                    if (transition2.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState$1(2);
                        motionLayout.setState$1(3);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.evaluate(true);
                    motionLayout.setState$1(2);
                    motionLayout.setState$1(3);
                    motionLayout.setState$1(4);
                    motionLayout.onNewStateAttachHandlers();
                    return true;
                }
                if (i == transition2.mConstraintSetEnd && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState$1(4);
                    motionLayout.setTransition(transition2);
                    if (transition2.mAutoTransition == 3) {
                        motionLayout.animateTo(RecyclerView.DECELERATION_RATE);
                        motionLayout.setState$1(2);
                        motionLayout.setState$1(3);
                        return true;
                    }
                    motionLayout.setProgress(RecyclerView.DECELERATION_RATE);
                    motionLayout.evaluate(true);
                    motionLayout.setState$1(2);
                    motionLayout.setState$1(3);
                    motionLayout.setState$1(4);
                    motionLayout.onNewStateAttachHandlers();
                    return true;
                }
            }
        }
        return false;
    }

    public final ConstraintSet getConstraintSet(int i) {
        int stateGetConstraintID;
        Sniffer sniffer = this.mStateSet;
        if (sniffer != null && (stateGetConstraintID = sniffer.stateGetConstraintID(i)) != -1) {
            i = stateGetConstraintID;
        }
        SparseArray sparseArray = this.mConstraintSetMap;
        if (sparseArray.get(i) != null) {
            return (ConstraintSet) sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.getName(this.mMotionLayout.getContext(), i) + " In MotionScene");
        return (ConstraintSet) sparseArray.get(sparseArray.keyAt(0));
    }

    public final Interpolator getInterpolator() {
        Transition transition = this.mCurrentTransition;
        int i = transition.mDefaultInterpolator;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
        }
        if (i == -1) {
            return new AnonymousClass1(Easing.getInterpolator(transition.mDefaultInterpolatorString), 0);
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void getKeyFrames(MotionController motionController) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            Iterator it = transition.mKeyFramesList.iterator();
            while (it.hasNext()) {
                ((KeyFrames) it.next()).addFrames(motionController);
            }
        } else {
            Transition transition2 = this.mDefaultTransition;
            if (transition2 != null) {
                Iterator it2 = transition2.mKeyFramesList.iterator();
                while (it2.hasNext()) {
                    ((KeyFrames) it2.next()).addFrames(motionController);
                }
            }
        }
    }

    public final float getMaxAcceleration() {
        TouchResponse touchResponse;
        Transition transition = this.mCurrentTransition;
        return (transition == null || (touchResponse = transition.mTouchResponse) == null) ? RecyclerView.DECELERATION_RATE : touchResponse.mMaxAcceleration;
    }

    public final int getStartId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetStart;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int parseConstraintSet(Context context, XmlResourceParser xmlResourceParser) {
        boolean z;
        boolean z2;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.mForceId = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlResourceParser.getAttributeName(i3);
            String attributeValue = xmlResourceParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 973381616:
                    if (attributeName.equals("stateLabels")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    i2 = getId(context, attributeValue);
                    break;
                case true:
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                                constraintSet.mRotate = 4;
                                break;
                            case true:
                                constraintSet.mRotate = 2;
                                break;
                            case true:
                                constraintSet.mRotate = 0;
                                break;
                            case true:
                                constraintSet.mRotate = 1;
                                break;
                            case true:
                                constraintSet.mRotate = 3;
                                break;
                        }
                    }
                    break;
                case true:
                    i = getId(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.mConstraintSetIdMap.put(attributeValue, Integer.valueOf(i));
                    constraintSet.mIdString = Debug.getName(context, i);
                    break;
                case true:
                    constraintSet.mMatchLabels = attributeValue.split(",");
                    int i4 = 0;
                    while (true) {
                        String[] strArr = constraintSet.mMatchLabels;
                        if (i4 < strArr.length) {
                            strArr[i4] = strArr[i4].trim();
                            i4++;
                        }
                    }
                    break;
            }
        }
        if (i != -1) {
            int i5 = this.mMotionLayout.mDebugPath;
            constraintSet.load(context, xmlResourceParser);
            if (i2 != -1) {
                this.mDeriveMap.put(i, i2);
            }
            this.mConstraintSetMap.put(i, constraintSet);
        }
        return i;
    }

    public final int parseInclude(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return parseConstraintSet(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void parseMotionSceneTags(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.mDefaultDuration);
                this.mDefaultDuration = i2;
                if (i2 < 8) {
                    this.mDefaultDuration = 8;
                }
            } else if (index == 1) {
                this.mLayoutDuringTransition = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void readConstraintChain(int i, MotionLayout motionLayout) {
        SparseArray sparseArray = this.mConstraintSetMap;
        ConstraintSet constraintSet = (ConstraintSet) sparseArray.get(i);
        String str = constraintSet.mIdString;
        HashMap hashMap = constraintSet.mConstraints;
        constraintSet.derivedState = str;
        int i2 = this.mDeriveMap.get(i);
        if (i2 > 0) {
            readConstraintChain(i2, motionLayout);
            ConstraintSet constraintSet2 = (ConstraintSet) sparseArray.get(i2);
            if (constraintSet2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.getName(this.mMotionLayout.getContext(), i2));
                return;
            }
            HashMap hashMap2 = constraintSet2.mConstraints;
            constraintSet.derivedState += "/" + constraintSet2.derivedState;
            for (Integer num : hashMap2.keySet()) {
                num.getClass();
                ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new ConstraintSet.Constraint());
                }
                ConstraintSet.Constraint constraint2 = (ConstraintSet.Constraint) hashMap.get(num);
                if (constraint2 != null) {
                    ConstraintSet.Layout layout = constraint2.layout;
                    if (!layout.mApply) {
                        layout.copyFrom(constraint.layout);
                    }
                    ConstraintSet.PropertySet propertySet = constraint2.propertySet;
                    if (!propertySet.mApply) {
                        ConstraintSet.PropertySet propertySet2 = constraint.propertySet;
                        propertySet.mApply = propertySet2.mApply;
                        propertySet.visibility = propertySet2.visibility;
                        propertySet.alpha = propertySet2.alpha;
                        propertySet.mProgress = propertySet2.mProgress;
                        propertySet.mVisibilityMode = propertySet2.mVisibilityMode;
                    }
                    ConstraintSet.Transform transform = constraint2.transform;
                    if (!transform.mApply) {
                        transform.copyFrom(constraint.transform);
                    }
                    ConstraintSet.Motion motion = constraint2.motion;
                    if (!motion.mApply) {
                        motion.copyFrom(constraint.motion);
                    }
                    for (String str2 : constraint.mCustomConstraints.keySet()) {
                        if (!constraint2.mCustomConstraints.containsKey(str2)) {
                            constraint2.mCustomConstraints.put(str2, (ConstraintAttribute) constraint.mCustomConstraints.get(str2));
                        }
                    }
                }
            }
        } else {
            constraintSet.derivedState = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), constraintSet.derivedState, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id = childAt.getId();
                if (constraintSet.mForceId && id == -1) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new ConstraintSet.Constraint());
                }
                ConstraintSet.Constraint constraint3 = (ConstraintSet.Constraint) hashMap.get(Integer.valueOf(id));
                if (constraint3 != null) {
                    ConstraintSet.PropertySet propertySet3 = constraint3.propertySet;
                    ConstraintSet.Layout layout2 = constraint3.layout;
                    ConstraintSet.Transform transform2 = constraint3.transform;
                    if (!layout2.mApply) {
                        constraint3.fillFrom(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                            layout2.mReferenceIds = Arrays.copyOf(constraintHelper.mIds, constraintHelper.mCount);
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                androidx.constraintlayout.core.widgets.Barrier barrier2 = barrier.mBarrier;
                                layout2.mBarrierAllowsGoneWidgets = barrier2.mAllowsGoneWidget;
                                layout2.mBarrierDirection = barrier.mIndicatedType;
                                layout2.mBarrierMargin = barrier2.mMargin;
                            }
                        }
                        layout2.mApply = true;
                    }
                    if (!propertySet3.mApply) {
                        propertySet3.visibility = childAt.getVisibility();
                        propertySet3.alpha = childAt.getAlpha();
                        propertySet3.mApply = true;
                    }
                    if (!transform2.mApply) {
                        transform2.mApply = true;
                        transform2.rotation = childAt.getRotation();
                        transform2.rotationX = childAt.getRotationX();
                        transform2.rotationY = childAt.getRotationY();
                        transform2.scaleX = childAt.getScaleX();
                        transform2.scaleY = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            transform2.transformPivotX = pivotX;
                            transform2.transformPivotY = pivotY;
                        }
                        transform2.translationX = childAt.getTranslationX();
                        transform2.translationY = childAt.getTranslationY();
                        transform2.translationZ = childAt.getTranslationZ();
                        if (transform2.applyElevation) {
                            transform2.elevation = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (ConstraintSet.Constraint constraint4 : hashMap.values()) {
            if (constraint4.mDelta != null) {
                if (constraint4.mTargetString == null) {
                    constraint4.mDelta.applyDelta(constraintSet.getConstraint(constraint4.mViewId));
                } else {
                    Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        ConstraintSet.Constraint constraint5 = constraintSet.getConstraint(((Integer) it.next()).intValue());
                        String str3 = constraint5.layout.mConstraintTag;
                        if (str3 != null && constraint4.mTargetString.matches(str3)) {
                            constraint4.mDelta.applyDelta(constraint5);
                            constraint5.mCustomConstraints.putAll((HashMap) constraint4.mCustomConstraints.clone());
                        }
                    }
                }
            }
        }
    }

    public final void readFallback(MotionLayout motionLayout) {
        int i = 0;
        loop0: while (true) {
            SparseArray sparseArray = this.mConstraintSetMap;
            if (i >= sparseArray.size()) {
                return;
            }
            int keyAt = sparseArray.keyAt(i);
            SparseIntArray sparseIntArray = this.mDeriveMap;
            int i2 = sparseIntArray.get(keyAt);
            int size = sparseIntArray.size();
            while (i2 > 0) {
                if (i2 == keyAt) {
                    break loop0;
                }
                int i3 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i2 = sparseIntArray.get(i2);
                size = i3;
            }
            readConstraintChain(keyAt, motionLayout);
            i++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r1 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTransition(int i, int i2) {
        int i3;
        int i4;
        Sniffer sniffer = this.mStateSet;
        if (sniffer != null) {
            i3 = sniffer.stateGetConstraintID(i);
            if (i3 == -1) {
                i3 = i;
            }
            i4 = sniffer.stateGetConstraintID(i2);
        } else {
            i3 = i;
        }
        i4 = i2;
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mConstraintSetEnd == i2 && transition.mConstraintSetStart == i) {
            return;
        }
        ArrayList arrayList = this.mTransitionList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Transition transition2 = (Transition) it.next();
            int i5 = transition2.mConstraintSetEnd;
            if ((i5 == i4 && transition2.mConstraintSetStart == i3) || (i5 == i2 && transition2.mConstraintSetStart == i)) {
                this.mCurrentTransition = transition2;
                TouchResponse touchResponse = transition2.mTouchResponse;
                if (touchResponse != null) {
                    touchResponse.setRTL(this.mRtl);
                    return;
                }
                return;
            }
        }
        Iterator it2 = this.mAbstractTransitionList.iterator();
        Transition transition3 = this.mDefaultTransition;
        while (it2.hasNext()) {
            Transition transition4 = (Transition) it2.next();
            if (transition4.mConstraintSetEnd == i2) {
                transition3 = transition4;
            }
        }
        Transition transition5 = new Transition(this, transition3);
        transition5.mConstraintSetStart = i3;
        transition5.mConstraintSetEnd = i4;
        if (i3 != -1) {
            arrayList.add(transition5);
        }
        this.mCurrentTransition = transition5;
    }

    public final boolean supportTouch() {
        Iterator it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (((Transition) it.next()).mTouchResponse != null) {
                return true;
            }
        }
        Transition transition = this.mCurrentTransition;
        return (transition == null || transition.mTouchResponse == null) ? false : true;
    }

    public final void parseInclude(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                parseInclude(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final class Transition {
        public final int mAutoTransition;
        public int mConstraintSetEnd;
        public int mConstraintSetStart;
        public int mDefaultInterpolator;
        public int mDefaultInterpolatorID;
        public String mDefaultInterpolatorString;
        public final boolean mDisable;
        public int mDuration;
        public final int mId;
        public final boolean mIsAbstract;
        public final ArrayList mKeyFramesList;
        public final int mLayoutDuringTransition;
        public final MotionScene mMotionScene;
        public final ArrayList mOnClicks;
        public int mPathMotionArc;
        public final float mStagger;
        public TouchResponse mTouchResponse;
        public final int mTransitionFlags;

        public final class TransitionOnClick implements View.OnClickListener {
            public final int mMode;
            public final int mTargetId;
            public final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlResourceParser xmlResourceParser) {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                    } else if (index == 0) {
                        this.mMode = obtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
            public final void addOnClickListeners(MotionLayout motionLayout, int i, Transition transition) {
                int i2 = this.mTargetId;
                MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    motionLayout2 = motionLayout.findViewById(i2);
                }
                if (motionLayout2 == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i2);
                    return;
                }
                int i3 = transition.mConstraintSetStart;
                int i4 = transition.mConstraintSetEnd;
                if (i3 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i5 = this.mMode;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                Transition transition = this.mTransition;
                MotionScene motionScene = transition.mMotionScene;
                MotionLayout motionLayout = motionScene.mMotionLayout;
                if (motionLayout.mInteractionEnabled) {
                    if (transition.mConstraintSetStart == -1) {
                        int i = motionLayout.mCurrentState;
                        if (i == -1) {
                            motionLayout.transitionToState(transition.mConstraintSetEnd);
                            return;
                        }
                        Transition transition2 = new Transition(motionScene, transition);
                        transition2.mConstraintSetStart = i;
                        transition2.mConstraintSetEnd = transition.mConstraintSetEnd;
                        motionLayout.setTransition(transition2);
                        motionLayout.transitionToEnd();
                        return;
                    }
                    Transition transition3 = motionScene.mCurrentTransition;
                    int i2 = this.mMode;
                    int i3 = i2 & 1;
                    boolean z = false;
                    boolean z2 = true;
                    boolean z3 = (i3 == 0 && (i2 & 256) == 0) ? false : true;
                    int i4 = i2 & 16;
                    if (i4 == 0 && (i2 & 4096) == 0) {
                        z2 = false;
                    }
                    if (z3 && z2) {
                        if (transition3 != transition) {
                            motionLayout.setTransition(transition);
                        }
                        if (motionLayout.mCurrentState != motionLayout.mEndState && motionLayout.mTransitionLastPosition <= 0.5f) {
                            z2 = false;
                        }
                        if (transition != transition3) {
                            int i5 = transition.mConstraintSetEnd;
                            int i6 = transition.mConstraintSetStart;
                            int i7 = motionLayout.mCurrentState;
                            if (i6 == -1) {
                                if (i7 == i5) {
                                    return;
                                }
                            } else if (i7 != i6 && i7 != i5) {
                                return;
                            }
                        }
                        if (!z && i3 != 0) {
                            motionLayout.setTransition(transition);
                            motionLayout.transitionToEnd();
                            return;
                        }
                        if (!z2 && i4 != 0) {
                            motionLayout.setTransition(transition);
                            motionLayout.animateTo(RecyclerView.DECELERATION_RATE);
                            return;
                        } else if (!z && (i2 & 256) != 0) {
                            motionLayout.setTransition(transition);
                            motionLayout.setProgress(1.0f);
                            return;
                        } else {
                            if (z2 || (i2 & 4096) == 0) {
                            }
                            motionLayout.setTransition(transition);
                            motionLayout.setProgress(RecyclerView.DECELERATION_RATE);
                            return;
                        }
                    }
                    z = z3;
                    if (transition != transition3) {
                    }
                    if (!z) {
                    }
                    if (!z2) {
                    }
                    if (!z) {
                    }
                    if (z2) {
                    }
                }
            }

            public final void removeOnClickListeners(MotionLayout motionLayout) {
                int i = this.mTargetId;
                if (i == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i);
                if (findViewById != null) {
                    findViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i);
            }
        }

        public Transition(MotionScene motionScene, Context context, XmlResourceParser xmlResourceParser) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = RecyclerView.DECELERATION_RATE;
            this.mKeyFramesList = new ArrayList();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mTransitionFlags = 0;
            int i = motionScene.mDefaultDuration;
            SparseArray sparseArray = motionScene.mConstraintSetMap;
            this.mDuration = i;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
            this.mMotionScene = motionScene;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Transition);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.mConstraintSetEnd = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintSetEnd);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        sparseArray.append(this.mConstraintSetEnd, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.mConstraintSetEnd = motionScene.parseInclude(context, this.mConstraintSetEnd);
                    }
                } else if (index == 3) {
                    this.mConstraintSetStart = obtainStyledAttributes.getResourceId(index, this.mConstraintSetStart);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.mConstraintSetStart);
                    if ("layout".equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        sparseArray.append(this.mConstraintSetStart, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.mConstraintSetStart = motionScene.parseInclude(context, this.mConstraintSetStart);
                    }
                } else if (index == 6) {
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (i3 == 3) {
                        String string2 = obtainStyledAttributes.getString(index);
                        this.mDefaultInterpolatorString = string2;
                        if (string2 != null) {
                            if (string2.indexOf("/") > 0) {
                                this.mDefaultInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                                this.mDefaultInterpolator = -2;
                            } else {
                                this.mDefaultInterpolator = -1;
                            }
                        }
                    } else {
                        this.mDefaultInterpolator = obtainStyledAttributes.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == 4) {
                    int i4 = obtainStyledAttributes.getInt(index, this.mDuration);
                    this.mDuration = i4;
                    if (i4 < 8) {
                        this.mDuration = 8;
                    }
                } else if (index == 8) {
                    this.mStagger = obtainStyledAttributes.getFloat(index, this.mStagger);
                } else if (index == 1) {
                    this.mAutoTransition = obtainStyledAttributes.getInteger(index, this.mAutoTransition);
                } else if (index == 0) {
                    this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == 9) {
                    this.mDisable = obtainStyledAttributes.getBoolean(index, this.mDisable);
                } else if (index == 7) {
                    this.mPathMotionArc = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.mLayoutDuringTransition = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.mTransitionFlags = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
            obtainStyledAttributes.recycle();
        }

        public Transition(MotionScene motionScene, int i) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = RecyclerView.DECELERATION_RATE;
            this.mKeyFramesList = new ArrayList();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mId = -1;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = R.id.view_transition;
            this.mConstraintSetEnd = i;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
        }

        public Transition(MotionScene motionScene, Transition transition) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = RecyclerView.DECELERATION_RATE;
            this.mKeyFramesList = new ArrayList();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mMotionScene = motionScene;
            this.mDuration = motionScene.mDefaultDuration;
            if (transition != null) {
                this.mPathMotionArc = transition.mPathMotionArc;
                this.mDefaultInterpolator = transition.mDefaultInterpolator;
                this.mDefaultInterpolatorString = transition.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = transition.mDefaultInterpolatorID;
                this.mDuration = transition.mDuration;
                this.mKeyFramesList = transition.mKeyFramesList;
                this.mStagger = transition.mStagger;
                this.mLayoutDuringTransition = transition.mLayoutDuringTransition;
            }
        }
    }
}
