package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R$styleable;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.e0;
import com.squareup.cash.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class ViewTransition {
    public final ConstraintSet.Constraint mConstraintDelta;
    public final Context mContext;
    public int mId;
    public final KeyFrames mKeyFrames;
    public int mTargetId;
    public String mTargetString;
    public int mViewTransitionMode;
    public int mOnStateTransition = -1;
    public boolean mDisabled = false;
    public int mPathMotionArc = 0;
    public int mDuration = -1;
    public int mUpDuration = -1;
    public int mDefaultInterpolator = 0;
    public String mDefaultInterpolatorString = null;
    public int mDefaultInterpolatorID = -1;
    public int mSetsTag = -1;
    public int mClearsTag = -1;
    public int mIfTagSet = -1;
    public int mIfTagNotSet = -1;
    public int mSharedValueTarget = -1;
    public int mSharedValueID = -1;

    public final class Animate {
        public final int mClearsTag;
        public float mDpositionDt;
        public final boolean mHoldAt100;
        public final Interpolator mInterpolator;
        public final MotionController mMC;
        public float mPosition;
        public final int mSetsTag;
        public final int mUpDuration;
        public final e0 mVtController;
        public final Easing mCache = new Easing(1);
        public boolean mReverse = false;
        public final Rect mTempRec = new Rect();
        public long mLastRender = System.nanoTime();

        public Animate(e0 e0Var, MotionController motionController, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.mHoldAt100 = false;
            this.mVtController = e0Var;
            this.mMC = motionController;
            this.mUpDuration = i2;
            if (((ArrayList) e0Var.f) == null) {
                e0Var.f = new ArrayList();
            }
            ((ArrayList) e0Var.f).add(this);
            this.mInterpolator = interpolator;
            this.mSetsTag = i4;
            this.mClearsTag = i5;
            if (i3 == 3) {
                this.mHoldAt100 = true;
            }
            this.mDpositionDt = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            mutate();
        }

        public final void mutate() {
            boolean z = this.mReverse;
            int i = this.mClearsTag;
            int i2 = this.mSetsTag;
            Interpolator interpolator = this.mInterpolator;
            MotionController motionController = this.mMC;
            e0 e0Var = this.mVtController;
            if (z) {
                long nanoTime = System.nanoTime();
                long j = nanoTime - this.mLastRender;
                this.mLastRender = nanoTime;
                float f = this.mPosition - (((float) (j * 1.0E-6d)) * this.mDpositionDt);
                this.mPosition = f;
                if (f < RecyclerView.DECELERATION_RATE) {
                    this.mPosition = RecyclerView.DECELERATION_RATE;
                }
                float f2 = this.mPosition;
                if (interpolator != null) {
                    f2 = interpolator.getInterpolation(f2);
                }
                boolean interpolate = motionController.interpolate(f2, nanoTime, motionController.mView, this.mCache);
                if (this.mPosition <= RecyclerView.DECELERATION_RATE) {
                    if (i2 != -1) {
                        motionController.mView.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    if (i != -1) {
                        motionController.mView.setTag(i, null);
                    }
                    ((ArrayList) e0Var.h).add(this);
                }
                if (this.mPosition > RecyclerView.DECELERATION_RATE || interpolate) {
                    ((MotionLayout) e0Var.a).invalidate();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            long j2 = nanoTime2 - this.mLastRender;
            this.mLastRender = nanoTime2;
            float f3 = (((float) (j2 * 1.0E-6d)) * this.mDpositionDt) + this.mPosition;
            this.mPosition = f3;
            if (f3 >= 1.0f) {
                this.mPosition = 1.0f;
            }
            float f4 = this.mPosition;
            if (interpolator != null) {
                f4 = interpolator.getInterpolation(f4);
            }
            boolean interpolate2 = motionController.interpolate(f4, nanoTime2, motionController.mView, this.mCache);
            if (this.mPosition >= 1.0f) {
                if (i2 != -1) {
                    motionController.mView.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    motionController.mView.setTag(i, null);
                }
                if (!this.mHoldAt100) {
                    ((ArrayList) e0Var.h).add(this);
                }
            }
            if (this.mPosition < 1.0f || interpolate2) {
                ((MotionLayout) e0Var.a).invalidate();
            }
        }

        public final void reverse() {
            this.mReverse = true;
            int i = this.mUpDuration;
            if (i != -1) {
                this.mDpositionDt = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            ((MotionLayout) this.mVtController.a).invalidate();
            this.mLastRender = System.nanoTime();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r2.equals("CustomMethod") != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewTransition(Context context, XmlResourceParser xmlResourceParser) {
        this.mContext = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                this.mConstraintDelta = ConstraintSet.buildDelta(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", Debug.getLoc() + " unknown tag " + name);
                            StringBuilder sb = new StringBuilder();
                            sb.append(".xml:");
                            sb.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb.toString());
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                this.mKeyFrames = new KeyFrames(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", Debug.getLoc() + " unknown tag " + name);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(".xml:");
                            sb2.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2.toString());
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                parseViewTransitionTags(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", Debug.getLoc() + " unknown tag " + name);
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(".xml:");
                            sb22.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb22.toString());
                            break;
                        case 366511058:
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                ConstraintAttribute.parse(context, xmlResourceParser, this.mConstraintDelta.mCustomConstraints);
                                break;
                            }
                            Log.e("ViewTransition", Debug.getLoc() + " unknown tag " + name);
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append(".xml:");
                            sb222.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb222.toString());
                            break;
                        default:
                            Log.e("ViewTransition", Debug.getLoc() + " unknown tag " + name);
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append(".xml:");
                            sb2222.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2222.toString());
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    public final void applyTransition(e0 e0Var, MotionLayout motionLayout, int i, ConstraintSet constraintSet, View... viewArr) {
        int[] iArr;
        Interpolator loadInterpolator;
        Interpolator interpolator;
        if (this.mDisabled) {
            return;
        }
        int i2 = this.mViewTransitionMode;
        KeyFrames keyFrames = this.mKeyFrames;
        int i3 = 2;
        int i4 = 0;
        if (i2 == 2) {
            View view = viewArr[0];
            MotionController motionController = new MotionController(view);
            MotionPaths motionPaths = motionController.mStartMotionPath;
            float f = RecyclerView.DECELERATION_RATE;
            motionPaths.mTime = RecyclerView.DECELERATION_RATE;
            motionPaths.mPosition = RecyclerView.DECELERATION_RATE;
            motionController.mNoMovement = true;
            motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            motionController.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            MotionConstrainedPoint motionConstrainedPoint = motionController.mStartPoint;
            motionConstrainedPoint.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            motionConstrainedPoint.mVisibility = view.getVisibility();
            motionConstrainedPoint.mAlpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
            motionConstrainedPoint.mElevation = view.getElevation();
            motionConstrainedPoint.mRotation = view.getRotation();
            motionConstrainedPoint.mRotationX = view.getRotationX();
            motionConstrainedPoint.rotationY = view.getRotationY();
            motionConstrainedPoint.mScaleX = view.getScaleX();
            motionConstrainedPoint.mScaleY = view.getScaleY();
            motionConstrainedPoint.mPivotX = view.getPivotX();
            motionConstrainedPoint.mPivotY = view.getPivotY();
            motionConstrainedPoint.mTranslationX = view.getTranslationX();
            motionConstrainedPoint.mTranslationY = view.getTranslationY();
            motionConstrainedPoint.mTranslationZ = view.getTranslationZ();
            MotionConstrainedPoint motionConstrainedPoint2 = motionController.mEndPoint;
            motionConstrainedPoint2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            motionConstrainedPoint2.mVisibility = view.getVisibility();
            if (view.getVisibility() == 0) {
                f = view.getAlpha();
            }
            motionConstrainedPoint2.mAlpha = f;
            motionConstrainedPoint2.mElevation = view.getElevation();
            motionConstrainedPoint2.mRotation = view.getRotation();
            motionConstrainedPoint2.mRotationX = view.getRotationX();
            motionConstrainedPoint2.rotationY = view.getRotationY();
            motionConstrainedPoint2.mScaleX = view.getScaleX();
            motionConstrainedPoint2.mScaleY = view.getScaleY();
            motionConstrainedPoint2.mPivotX = view.getPivotX();
            motionConstrainedPoint2.mPivotY = view.getPivotY();
            motionConstrainedPoint2.mTranslationX = view.getTranslationX();
            motionConstrainedPoint2.mTranslationY = view.getTranslationY();
            motionConstrainedPoint2.mTranslationZ = view.getTranslationZ();
            ArrayList arrayList = (ArrayList) keyFrames.mFramesMap.get(-1);
            if (arrayList != null) {
                motionController.mKeyList.addAll(arrayList);
            }
            motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i5 = this.mDuration;
            int i6 = this.mUpDuration;
            int i7 = this.mOnStateTransition;
            Context context = motionLayout.getContext();
            int i8 = this.mDefaultInterpolator;
            if (i8 == -2) {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.mDefaultInterpolatorID);
            } else if (i8 == -1) {
                loadInterpolator = new MotionScene.AnonymousClass1(Easing.getInterpolator(this.mDefaultInterpolatorString), i3);
            } else if (i8 == 0) {
                loadInterpolator = new AccelerateDecelerateInterpolator();
            } else if (i8 == 1) {
                loadInterpolator = new AccelerateInterpolator();
            } else if (i8 == 2) {
                loadInterpolator = new DecelerateInterpolator();
            } else if (i8 == 4) {
                loadInterpolator = new BounceInterpolator();
            } else if (i8 == 5) {
                loadInterpolator = new OvershootInterpolator();
            } else {
                if (i8 != 6) {
                    interpolator = null;
                    new Animate(e0Var, motionController, i5, i6, i7, interpolator, this.mSetsTag, this.mClearsTag);
                    return;
                }
                loadInterpolator = new AnticipateInterpolator();
            }
            interpolator = loadInterpolator;
            new Animate(e0Var, motionController, i5, i6, i7, interpolator, this.mSetsTag, this.mClearsTag);
            return;
        }
        ConstraintSet.Constraint constraint = this.mConstraintDelta;
        if (i2 == 1) {
            MotionScene motionScene = motionLayout.mScene;
            if (motionScene == null) {
                iArr = null;
            } else {
                SparseArray sparseArray = motionScene.mConstraintSetMap;
                int size = sparseArray.size();
                iArr = new int[size];
                for (int i9 = 0; i9 < size; i9++) {
                    iArr[i9] = sparseArray.keyAt(i9);
                }
            }
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 != i) {
                    MotionScene motionScene2 = motionLayout.mScene;
                    ConstraintSet constraintSet2 = motionScene2 == null ? null : motionScene2.getConstraintSet(i11);
                    int length = viewArr.length;
                    for (int i12 = i4; i12 < length; i12++) {
                        ConstraintSet.Constraint constraint2 = constraintSet2.getConstraint(viewArr[i12].getId());
                        if (constraint != null) {
                            ConstraintSet.Constraint.Delta delta = constraint.mDelta;
                            if (delta != null) {
                                delta.applyDelta(constraint2);
                            }
                            constraint2.mCustomConstraints.putAll(constraint.mCustomConstraints);
                        }
                    }
                }
                i10++;
                i4 = 0;
            }
        }
        ConstraintSet constraintSet3 = new ConstraintSet();
        HashMap hashMap = constraintSet3.mConstraints;
        hashMap.clear();
        for (Integer num : constraintSet.mConstraints.keySet()) {
            ConstraintSet.Constraint constraint3 = (ConstraintSet.Constraint) constraintSet.mConstraints.get(num);
            if (constraint3 != null) {
                hashMap.put(num, constraint3.m1087clone());
            }
        }
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraint4 = constraintSet3.getConstraint(view2.getId());
            if (constraint != null) {
                ConstraintSet.Constraint.Delta delta2 = constraint.mDelta;
                if (delta2 != null) {
                    delta2.applyDelta(constraint4);
                }
                constraint4.mCustomConstraints.putAll(constraint.mCustomConstraints);
            }
        }
        motionLayout.updateState(i, constraintSet3);
        motionLayout.updateState(R.id.view_transition, constraintSet);
        motionLayout.setState(R.id.view_transition, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(motionLayout.mScene, i);
        for (View view3 : viewArr) {
            int i13 = this.mDuration;
            if (i13 != -1) {
                transition.mDuration = Math.max(i13, 8);
            }
            transition.mPathMotionArc = this.mPathMotionArc;
            int i14 = this.mDefaultInterpolator;
            String str = this.mDefaultInterpolatorString;
            int i15 = this.mDefaultInterpolatorID;
            transition.mDefaultInterpolator = i14;
            transition.mDefaultInterpolatorString = str;
            transition.mDefaultInterpolatorID = i15;
            int id = view3.getId();
            if (keyFrames != null) {
                ArrayList arrayList2 = (ArrayList) keyFrames.mFramesMap.get(-1);
                KeyFrames keyFrames2 = new KeyFrames();
                keyFrames2.mFramesMap = new HashMap();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Key m1086clone = ((Key) it.next()).m1086clone();
                    m1086clone.mTargetId = id;
                    keyFrames2.addKey(m1086clone);
                }
                transition.mKeyFramesList.add(keyFrames2);
            }
        }
        motionLayout.setTransition(transition);
        Recorder$$ExternalSyntheticLambda15 recorder$$ExternalSyntheticLambda15 = new Recorder$$ExternalSyntheticLambda15(27, this, viewArr);
        motionLayout.animateTo(1.0f);
        motionLayout.mOnComplete = recorder$$ExternalSyntheticLambda15;
    }

    public final boolean checkTags(View view) {
        int i = this.mIfTagSet;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.mIfTagNotSet;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean matchesView(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.mTargetId == -1 && this.mTargetString == null) || !checkTags(view)) {
            return false;
        }
        if (view.getId() == this.mTargetId) {
            return true;
        }
        return this.mTargetString != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.mTargetString);
    }

    public final void parseViewTransitionTags(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
            } else if (index == 8) {
                int i2 = MotionLayout.$r8$clinit;
                if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.mTargetString = obtainStyledAttributes.getString(index);
                } else {
                    this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                }
            } else if (index == 9) {
                this.mOnStateTransition = obtainStyledAttributes.getInt(index, this.mOnStateTransition);
            } else if (index == 12) {
                this.mDisabled = obtainStyledAttributes.getBoolean(index, this.mDisabled);
            } else if (index == 10) {
                this.mPathMotionArc = obtainStyledAttributes.getInt(index, this.mPathMotionArc);
            } else if (index == 4) {
                this.mDuration = obtainStyledAttributes.getInt(index, this.mDuration);
            } else if (index == 13) {
                this.mUpDuration = obtainStyledAttributes.getInt(index, this.mUpDuration);
            } else if (index == 14) {
                this.mViewTransitionMode = obtainStyledAttributes.getInt(index, this.mViewTransitionMode);
            } else if (index == 7) {
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
                    if (string2 == null || string2.indexOf("/") <= 0) {
                        this.mDefaultInterpolator = -1;
                    } else {
                        this.mDefaultInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                        this.mDefaultInterpolator = -2;
                    }
                } else {
                    this.mDefaultInterpolator = obtainStyledAttributes.getInteger(index, this.mDefaultInterpolator);
                }
            } else if (index == 11) {
                this.mSetsTag = obtainStyledAttributes.getResourceId(index, this.mSetsTag);
            } else if (index == 3) {
                this.mClearsTag = obtainStyledAttributes.getResourceId(index, this.mClearsTag);
            } else if (index == 6) {
                this.mIfTagSet = obtainStyledAttributes.getResourceId(index, this.mIfTagSet);
            } else if (index == 5) {
                this.mIfTagNotSet = obtainStyledAttributes.getResourceId(index, this.mIfTagNotSet);
            } else if (index == 2) {
                this.mSharedValueID = obtainStyledAttributes.getResourceId(index, this.mSharedValueID);
            } else if (index == 1) {
                this.mSharedValueTarget = obtainStyledAttributes.getInteger(index, this.mSharedValueTarget);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + Debug.getName(this.mContext, this.mId) + ")";
    }
}
