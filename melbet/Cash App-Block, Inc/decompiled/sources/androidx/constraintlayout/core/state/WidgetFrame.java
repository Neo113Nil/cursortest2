package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class WidgetFrame {
    public float alpha;
    public int left;
    public final HashMap mCustom;
    public float pivotX;
    public float pivotY;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public final ConstraintWidget widget;

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap();
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        updateAttributes(widgetFrame);
    }

    public final void updateAttributes(WidgetFrame widgetFrame) {
        if (widgetFrame == null) {
            return;
        }
        this.pivotX = widgetFrame.pivotX;
        this.pivotY = widgetFrame.pivotY;
        this.rotationX = widgetFrame.rotationX;
        this.rotationY = widgetFrame.rotationY;
        this.rotationZ = widgetFrame.rotationZ;
        this.translationX = widgetFrame.translationX;
        this.translationY = widgetFrame.translationY;
        this.translationZ = widgetFrame.translationZ;
        this.scaleX = widgetFrame.scaleX;
        this.scaleY = widgetFrame.scaleY;
        this.alpha = widgetFrame.alpha;
        this.visibility = widgetFrame.visibility;
        HashMap hashMap = this.mCustom;
        hashMap.clear();
        for (CustomVariable customVariable : widgetFrame.mCustom.values()) {
            String str = customVariable.mName;
            CustomVariable customVariable2 = new CustomVariable();
            customVariable2.mIntegerValue = PKIFailureInfo.systemUnavail;
            customVariable2.mFloatValue = Float.NaN;
            customVariable2.mName = str;
            customVariable2.mType = customVariable.mType;
            customVariable2.mIntegerValue = customVariable.mIntegerValue;
            customVariable2.mFloatValue = customVariable.mFloatValue;
            hashMap.put(str, customVariable2);
        }
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap();
        this.widget = constraintWidget;
    }
}
