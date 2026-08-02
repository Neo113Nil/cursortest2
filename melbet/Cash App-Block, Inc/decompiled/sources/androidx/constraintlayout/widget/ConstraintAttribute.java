package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ConstraintAttribute {
    public boolean mBooleanValue;
    public int mColorValue;
    public float mFloatValue;
    public int mIntegerValue;
    public boolean mMethod = false;
    public String mName;
    public String mStringValue;
    public int mType;

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.mName = constraintAttribute.mName;
        this.mType = constraintAttribute.mType;
        setValue(obj);
    }

    public static void parse(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, RecyclerView.DECELERATION_RATE), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, RecyclerView.DECELERATION_RATE));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (str != null && obj != null) {
            ConstraintAttribute constraintAttribute = new ConstraintAttribute();
            constraintAttribute.mName = str;
            constraintAttribute.mType = i;
            constraintAttribute.mMethod = z;
            constraintAttribute.setValue(obj);
            hashMap.put(str, constraintAttribute);
        }
        obtainStyledAttributes.recycle();
    }

    public static void setAttributes(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) hashMap.get(str);
            String m = !constraintAttribute.mMethod ? Recorder$$ExternalSyntheticOutline2.m("set", str) : str;
            try {
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(constraintAttribute.mType);
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (ordinal) {
                    case 0:
                        cls.getMethod(m, cls3).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                    case 1:
                        cls.getMethod(m, cls2).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 2:
                        cls.getMethod(m, cls3).invoke(view, Integer.valueOf(constraintAttribute.mColorValue));
                        break;
                    case 3:
                        Method method = cls.getMethod(m, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.mColorValue);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(m, CharSequence.class).invoke(view, constraintAttribute.mStringValue);
                        break;
                    case 5:
                        cls.getMethod(m, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.mBooleanValue));
                        break;
                    case 6:
                        cls.getMethod(m, cls2).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 7:
                        cls.getMethod(m, cls3).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m(" Custom Attribute \"", str, "\" not found on ");
                m3m.append(cls.getName());
                Log.e("TransitionLayout", m3m.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + m, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m(" Custom Attribute \"", str, "\" not found on ");
                m3m2.append(cls.getName());
                Log.e("TransitionLayout", m3m2.toString(), e3);
            }
        }
    }

    public final float getValueToInterpolate() {
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mType)) {
            case 2:
            case 3:
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Color does not have a single color to interpolate");
                break;
            case 4:
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Cannot interpolate String");
                break;
            case 5:
                if (this.mBooleanValue) {
                }
                break;
        }
        return RecyclerView.DECELERATION_RATE;
    }

    public final void getValuesToInterpolate(float[] fArr) {
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mType)) {
            case 0:
                fArr[0] = this.mIntegerValue;
                break;
            case 1:
                fArr[0] = this.mFloatValue;
                break;
            case 2:
            case 3:
                int i = (this.mColorValue >> 24) & 255;
                float pow = (float) Math.pow(((r9 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r9 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r9 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i / 255.0f;
                break;
            case 4:
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Color does not have a single color to interpolate");
                break;
            case 5:
                fArr[0] = this.mBooleanValue ? 1.0f : RecyclerView.DECELERATION_RATE;
                break;
            case 6:
                fArr[0] = this.mFloatValue;
                break;
        }
    }

    public final int numberOfInterpolatedValues() {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mType);
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public final void setValue(Object obj) {
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mType)) {
            case 0:
            case 7:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case 1:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case 4:
                this.mStringValue = (String) obj;
                break;
            case 5:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }
}
