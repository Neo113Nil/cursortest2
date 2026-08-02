package androidx.compose.ui.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Connector;
import androidx.compose.ui.graphics.colorspace.ConnectorKt;
import androidx.compose.ui.graphics.colorspace.Illuminant;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ULong;
import kotlin.UnsignedKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class Color {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long Unspecified;
    public final long value;
    public static final long Black = ColorKt.Color(4278190080L);
    public static final long DarkGray = ColorKt.Color(4282664004L);
    public static final long Gray = ColorKt.Color(4287137928L);
    public static final long LightGray = ColorKt.Color(4291611852L);
    public static final long White = ColorKt.Color(BodyPartID.bodyIdMax);
    public static final long Red = ColorKt.Color(4294901760L);
    public static final long Green = ColorKt.Color(4278255360L);
    public static final long Blue = ColorKt.Color(4278190335L);
    public static final long Yellow = ColorKt.Color(4294967040L);
    public static final long Cyan = ColorKt.Color(4278255615L);
    public static final long Magenta = ColorKt.Color(4294902015L);
    public static final long Transparent = ColorKt.Color(0);

    static {
        float[] fArr = ColorSpaces.SrgbPrimaries;
        Unspecified = ColorKt.Color(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, ColorSpaces.Unspecified);
    }

    public /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m674convertvNxB06k(long j, ColorSpace colorSpace) {
        Connector connector;
        ColorSpace m679getColorSpaceimpl = m679getColorSpaceimpl(j);
        int i = m679getColorSpaceimpl.id;
        int i2 = colorSpace.id;
        if ((i | i2) < 0) {
            connector = Illuminant.m718createConnectorYBCOT_4(m679getColorSpaceimpl, colorSpace);
        } else {
            MutableIntObjectMap mutableIntObjectMap = ConnectorKt.Connectors;
            int i3 = i | (i2 << 6);
            Object obj = mutableIntObjectMap.get(i3);
            if (obj == null) {
                obj = Illuminant.m718createConnectorYBCOT_4(m679getColorSpaceimpl, colorSpace);
                mutableIntObjectMap.set(i3, obj);
            }
            connector = (Connector) obj;
        }
        return connector.mo717transformToColorl2rxGTc$ui_graphics(j);
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static long m675copywmQWz5c$default(float f, long j, int i) {
        if ((i & 1) != 0) {
            f = m677getAlphaimpl(j);
        }
        return ColorKt.Color(m681getRedimpl(j), m680getGreenimpl(j), m678getBlueimpl(j), f, m679getColorSpaceimpl(j));
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m676equalsimpl0(long j, long j2) {
        ULong.Companion companion = ULong.Companion;
        return j == j2;
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m677getAlphaimpl(long j) {
        float ulongToDouble;
        float f;
        long j2 = 63 & j;
        ULong.Companion companion = ULong.Companion;
        if (j2 == 0) {
            ulongToDouble = (float) UnsignedKt.ulongToDouble((j >>> 56) & 255);
            f = 255.0f;
        } else {
            ulongToDouble = (float) UnsignedKt.ulongToDouble((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return ulongToDouble / f;
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m678getBlueimpl(long j) {
        int i;
        int i2;
        int i3;
        float f;
        long j2 = 63 & j;
        ULong.Companion companion = ULong.Companion;
        if (j2 == 0) {
            return ((float) UnsignedKt.ulongToDouble((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608);
                f = Float16Kt.Fp32DenormalFloat;
                float f2 = intBitsToFloat - f;
                return i4 == 0 ? f2 : -f2;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m679getColorSpaceimpl(long j) {
        float[] fArr = ColorSpaces.SrgbPrimaries;
        ULong.Companion companion = ULong.Companion;
        return ColorSpaces.ColorSpacesArray[(int) (j & 63)];
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m680getGreenimpl(long j) {
        int i;
        int i2;
        int i3;
        float f;
        long j2 = 63 & j;
        ULong.Companion companion = ULong.Companion;
        if (j2 == 0) {
            return ((float) UnsignedKt.ulongToDouble((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608);
                f = Float16Kt.Fp32DenormalFloat;
                float f2 = intBitsToFloat - f;
                return i4 == 0 ? f2 : -f2;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m681getRedimpl(long j) {
        int i;
        int i2;
        int i3;
        float f;
        long j2 = 63 & j;
        ULong.Companion companion = ULong.Companion;
        if (j2 == 0) {
            return ((float) UnsignedKt.ulongToDouble((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608);
                f = Float16Kt.Fp32DenormalFloat;
                float f2 = intBitsToFloat - f;
                return i4 == 0 ? f2 : -f2;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m682toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m681getRedimpl(j));
        sb.append(", ");
        sb.append(m680getGreenimpl(j));
        sb.append(", ");
        sb.append(m678getBlueimpl(j));
        sb.append(", ");
        sb.append(m677getAlphaimpl(j));
        sb.append(", ");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, m679getColorSpaceimpl(j).name, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Color) {
            return this.value == ((Color) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return m682toStringimpl(this.value);
    }
}
