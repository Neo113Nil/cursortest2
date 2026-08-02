package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.R$styleable;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public abstract class ColorStateListInflaterCompat {
    public static final ThreadLocal sTempTypedValue = new ThreadLocal();

    public static ColorStateList createFromXml(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0138  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        char c;
        int[] iArr;
        int i2;
        int intFromLStar;
        float f2;
        int i3;
        float cbrt;
        float f3;
        float f4;
        int i4;
        TypedValue typedValue;
        ?? r0 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = R$styleable.ColorStateListItem;
                ?? obtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i5, i5);
                int resourceId = obtainAttributes.getResourceId(i5, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = sTempTypedValue;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, z);
                    int i7 = typedValue.type;
                    if (i7 < 28 || i7 > 31) {
                        try {
                            color = createFromXml(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i5, -65281);
                        }
                        f = !obtainAttributes.hasValue(z) ? obtainAttributes.getFloat(z, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c2 = z;
                        float f5 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i5;
                        int i8 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i9 = i8 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i8] = attributeNameResource;
                                i8 = i9;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i8);
                        float f6 = RecyclerView.DECELERATION_RATE;
                        c = (f5 >= RecyclerView.DECELERATION_RATE || f5 > 100.0f) ? (char) 0 : c2;
                        if (f == 1.0f || c != 0) {
                            int clamp = MathUtils.clamp((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                            if (c == 0) {
                                CamColor fromColor = CamColor.fromColor(color);
                                float f7 = fromColor.mHue;
                                float f8 = fromColor.mChroma;
                                ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
                                if (f8 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i2 = depth2;
                                    intFromLStar = CamUtils.intFromLStar(f5);
                                } else {
                                    float min = f7 < RecyclerView.DECELERATION_RATE ? 0.0f : Math.min(360.0f, f7);
                                    float f9 = f8;
                                    char c3 = c2;
                                    CamColor camColor = null;
                                    while (true) {
                                        if (Math.abs(f6 - f8) >= 0.4f) {
                                            float f10 = 1000.0f;
                                            iArr = trimStateSet;
                                            float f11 = 0.0f;
                                            float f12 = 100.0f;
                                            float f13 = 1000.0f;
                                            CamColor camColor2 = null;
                                            while (true) {
                                                if (Math.abs(f11 - f12) <= 0.01f) {
                                                    i2 = depth2;
                                                    f2 = f5;
                                                    break;
                                                }
                                                float m = Recorder$$ExternalSyntheticOutline2.m(f12, f11, 2.0f, f11);
                                                float f14 = f12;
                                                int viewed = CamColor.fromJch(m, f9, min).viewed(ViewingConditions.DEFAULT);
                                                float linearized = CamUtils.linearized(Color.red(viewed));
                                                float linearized2 = CamUtils.linearized(Color.green(viewed));
                                                float linearized3 = CamUtils.linearized(Color.blue(viewed));
                                                float[] fArr = CamUtils.SRGB_TO_XYZ[c2];
                                                float f15 = ((linearized3 * fArr[2]) + ((linearized2 * fArr[c2]) + (linearized * fArr[0]))) / 100.0f;
                                                if (f15 <= 0.008856452f) {
                                                    cbrt = f15 * 903.2963f;
                                                    i3 = viewed;
                                                } else {
                                                    i3 = viewed;
                                                    cbrt = (((float) Math.cbrt(f15)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f5 - cbrt);
                                                if (abs < 0.2f) {
                                                    CamColor fromColor2 = CamColor.fromColor(i3);
                                                    f3 = cbrt;
                                                    f4 = m;
                                                    CamColor fromJch = CamColor.fromJch(fromColor2.mJ, fromColor2.mChroma, min);
                                                    float f16 = fromColor2.mJstar - fromJch.mJstar;
                                                    float f17 = fromColor2.mAstar - fromJch.mAstar;
                                                    float f18 = fromColor2.mBstar - fromJch.mBstar;
                                                    i2 = depth2;
                                                    f2 = f5;
                                                    float pow = (float) (Math.pow(Math.sqrt((f18 * f18) + (f17 * f17) + (f16 * f16)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        camColor2 = fromColor2;
                                                        f13 = pow;
                                                        f10 = abs;
                                                    }
                                                } else {
                                                    f3 = cbrt;
                                                    f4 = m;
                                                    i2 = depth2;
                                                    f2 = f5;
                                                }
                                                if (f10 == RecyclerView.DECELERATION_RATE && f13 == RecyclerView.DECELERATION_RATE) {
                                                    break;
                                                }
                                                if (f3 < f2) {
                                                    f12 = f14;
                                                    f11 = f4;
                                                } else {
                                                    f12 = f4;
                                                }
                                                depth2 = i2;
                                                f5 = f2;
                                            }
                                            CamColor camColor3 = camColor2;
                                            if (c3 == 0) {
                                                if (camColor3 == null) {
                                                    f8 = f9;
                                                } else {
                                                    camColor = camColor3;
                                                    f6 = f9;
                                                }
                                                f9 = Recorder$$ExternalSyntheticOutline2.m(f8, f6, 2.0f, f6);
                                                trimStateSet = iArr;
                                                depth2 = i2;
                                                f5 = f2;
                                            } else {
                                                if (camColor3 != null) {
                                                    intFromLStar = camColor3.viewed(viewingConditions);
                                                    break;
                                                }
                                                f9 = Recorder$$ExternalSyntheticOutline2.m(f8, f6, 2.0f, f6);
                                                trimStateSet = iArr;
                                                depth2 = i2;
                                                f5 = f2;
                                                c3 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i2 = depth2;
                                            intFromLStar = camColor == null ? CamUtils.intFromLStar(f5) : camColor.viewed(viewingConditions);
                                        }
                                    }
                                }
                                color = intFromLStar;
                            } else {
                                iArr = trimStateSet;
                                i2 = depth2;
                            }
                            color = (16777215 & color) | (clamp << 24);
                        } else {
                            iArr = trimStateSet;
                            i2 = depth2;
                        }
                        i4 = i6 + 1;
                        if (i4 > iArr3.length) {
                            int[] iArr6 = new int[i6 <= 4 ? 8 : i6 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i6);
                            iArr3 = iArr6;
                        }
                        iArr3[i6] = color;
                        if (i4 > iArr2.length) {
                            ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i6 > 4 ? i6 * 2 : 8);
                            System.arraycopy(iArr2, 0, r1, 0, i6);
                            iArr2 = r1;
                        }
                        iArr2[i6] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i6 = i4;
                        z = c2;
                        depth2 = i2;
                        i5 = 0;
                        r0 = resources;
                    }
                }
                color = obtainAttributes.getColor(i5, -65281);
                if (!obtainAttributes.hasValue(z)) {
                }
                char c22 = z;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i5;
                int i82 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i82);
                float f62 = RecyclerView.DECELERATION_RATE;
                if (f5 >= RecyclerView.DECELERATION_RATE) {
                }
                if (f == 1.0f) {
                }
                int clamp2 = MathUtils.clamp((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                if (c == 0) {
                }
                color = (16777215 & color) | (clamp2 << 24);
                i4 = i6 + 1;
                if (i4 > iArr3.length) {
                }
                iArr3[i6] = color;
                if (i4 > iArr2.length) {
                }
                iArr2[i6] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i6 = i4;
                z = c22;
                depth2 = i2;
                i5 = 0;
                r0 = resources;
            } else {
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z = z;
                depth2 = depth2;
                i5 = 0;
            }
        }
        int[] iArr7 = new int[i6];
        int[][] iArr8 = new int[i6][];
        System.arraycopy(iArr3, 0, iArr7, 0, i6);
        System.arraycopy(iArr2, 0, iArr8, 0, i6);
        return new ColorStateList(iArr8, iArr7);
    }

    public static ColorStateList inflate(Resources resources, int i, Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }
}
