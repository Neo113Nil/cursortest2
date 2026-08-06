package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.combinations.level.experts.R;
import com.combinations.level.experts.core.domain.model.Side;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class vc0 {
    public static final pp AvO7iQsrTN;
    public static final eb1 E7jCp8Ls;
    public static final eb1 JFJ3QoxA;
    public static i00 Mjvvu5DE;
    public static yu0 OOA6hdeuvCS;
    public static final eb1 WIEu4Ya2g8;
    public static final eb1 XnEVoBF0td1l;
    public static boolean Y6hRI1cF8;
    public static final eb1 YmKjaVtbfp5Z;
    public static final pp encWxUiV2;
    public static final eb1 iwATDS1i01k;
    public static Method jivtDDk9H;
    public static Method mE4lRynR;
    public static final eb1 mOu10nynGul;
    public static final eb1 rQPn8YBR;
    public static final eb1 uFEq9NpZ;
    public static final float[] GWasM1elztuh = new float[91];
    public static final ja Yi7zF1RB1 = new ja();
    public static final Object X1lG3V04pd = new Object();
    public static final Class[] xqGvceK5x = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final tz EljAMC1QTz = new tz(2);

    static {
        int i = 1;
        AvO7iQsrTN = new pp("NONE", i);
        encWxUiV2 = new pp("PENDING", i);
        final int i2 = 15;
        mOu10nynGul = new eb1(new dx0(28), new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i2) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
        final int i3 = 0;
        JFJ3QoxA = new eb1(new dx0(29), new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i3) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
        final int i4 = 1;
        final int i5 = 2;
        rQPn8YBR = new eb1(new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i4) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        }, new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i5) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
        final int i6 = 3;
        final int i7 = 4;
        E7jCp8Ls = new eb1(new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i6) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        }, new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i7) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
        final int i8 = 5;
        final int i9 = 6;
        XnEVoBF0td1l = new eb1(new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i8) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        }, new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i9) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
        final int i10 = 7;
        final int i11 = 8;
        uFEq9NpZ = new eb1(new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i10) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        }, new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i11) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
        final int i12 = 9;
        final int i13 = 10;
        iwATDS1i01k = new eb1(new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i12) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        }, new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i13) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
        final int i14 = 11;
        final int i15 = 12;
        WIEu4Ya2g8 = new eb1(new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i14) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        }, new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i15) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
        final int i16 = 13;
        final int i17 = 14;
        YmKjaVtbfp5Z = new eb1(new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i16) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        }, new hv() { // from class: nd1
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                switch (i17) {
                    case 0:
                        return Integer.valueOf((int) ((n3) obj).GWasM1elztuh);
                    case 1:
                        return new n3(((cn) obj).OOA6hdeuvCS);
                    case 2:
                        return new cn(((n3) obj).GWasM1elztuh);
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        en enVar = (en) obj;
                        return new o3(Float.intBitsToFloat((int) (enVar.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & enVar.GWasM1elztuh)));
                    case 4:
                        float f = ((o3) obj).GWasM1elztuh;
                        return new en((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case 5:
                        t21 t21Var = (t21) obj;
                        return new o3(Float.intBitsToFloat((int) (t21Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & t21Var.GWasM1elztuh)));
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((o3) obj).GWasM1elztuh;
                        return new t21((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        uk0 uk0Var = (uk0) obj;
                        return new o3(Float.intBitsToFloat((int) (uk0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (4294967295L & uk0Var.GWasM1elztuh)));
                    case 8:
                        float f3 = ((o3) obj).GWasM1elztuh;
                        return new uk0((Float.floatToRawIntBits(r8.Yi7zF1RB1) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((u20) obj).GWasM1elztuh;
                        return new o3((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        o3 o3Var = (o3) obj;
                        return new u20((Math.round(o3Var.Yi7zF1RB1) & 4294967295L) | (Math.round(o3Var.GWasM1elztuh) << 32));
                    case 11:
                        long j2 = ((b30) obj).GWasM1elztuh;
                        return new o3((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        o3 o3Var2 = (o3) obj;
                        int round = Math.round(o3Var2.GWasM1elztuh);
                        if (round < 0) {
                            round = 0;
                        }
                        return new b30((round << 32) | (4294967295L & (Math.round(o3Var2.Yi7zF1RB1) >= 0 ? r8 : 0)));
                    case 13:
                        kt0 kt0Var = (kt0) obj;
                        return new q3(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x);
                    case 14:
                        q3 q3Var = (q3) obj;
                        return new kt0(q3Var.GWasM1elztuh, q3Var.Yi7zF1RB1, q3Var.X1lG3V04pd, q3Var.xqGvceK5x);
                    case Side.ALL /* 15 */:
                        return Float.valueOf(((n3) obj).GWasM1elztuh);
                    default:
                        ih1 ih1Var = (ih1) obj;
                        ih1Var.getClass();
                        return ih1Var;
                }
            }
        });
    }

    public static final gn0 A1EKNP6CxJ(xk xkVar) {
        gn0 gn0Var = eUH21U3apd(xkVar).Mjvvu5DE;
        if (gn0Var != null) {
            return gn0Var;
        }
        throw mr0.EljAMC1QTz("This node does not have an owner.");
    }

    public static final bk0 AEn1Rrio(xk xkVar, int i) {
        bk0 bk0Var = ((he0) xkVar).OOA6hdeuvCS.E7jCp8Ls;
        bk0Var.getClass();
        if (bk0Var.iK7aQfvhG() != xkVar || !ck0.AvO7iQsrTN(i)) {
            return bk0Var;
        }
        bk0 bk0Var2 = bk0Var.jivtDDk9H;
        bk0Var2.getClass();
        return bk0Var2;
    }

    public static final void AvO7iQsrTN(String str, String str2, boolean z, hv hvVar, qx qxVar, int i) {
        qxVar.Uxq83abb04(-1874449659);
        int i2 = i | (qxVar.EljAMC1QTz(str) ? 4 : 2) | (qxVar.EljAMC1QTz(str2) ? 32 : 16) | (qxVar.AvO7iQsrTN(z) ? 256 : 128) | (qxVar.encWxUiV2(hvVar) ? 2048 : 1024);
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 1171) != 1170)) {
            y61.GWasM1elztuh(v21.GWasM1elztuh, vv0.GWasM1elztuh(16.0f), yb.Yi7zF1RB1(0.7f, ac.xqGvceK5x), 0L, 0.0f, null, rj0.YZjbz8VdP5(-1090159328, new o11(z, hvVar, str, str2), qxVar), qxVar, 12583302, 120);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new o11(str, str2, z, hvVar, i);
        }
    }

    public static long DmJncFq5(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        o4.mE4lRynR("Cannot round NaN value.");
        return 0L;
    }

    public static final he0 E7jCp8Ls(rg0 rg0Var) {
        int i;
        if (rg0Var == null || (i = rg0Var.AvO7iQsrTN) == 0) {
            return null;
        }
        return (he0) rg0Var.rQPn8YBR(i - 1);
    }

    public static ie0 EXrPz3p7hFb(ie0 ie0Var, rd1 rd1Var, s6 s6Var) {
        return ie0Var.X1lG3V04pd(new pn0(rd1Var, s6Var));
    }

    public static final p51 EljAMC1QTz(Object obj) {
        if (obj == null) {
            obj = n30.JFJ3QoxA;
        }
        return new p51(obj);
    }

    public static final void GWasM1elztuh(ie0 ie0Var, r6 r6Var, jd jdVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(380139498);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(ie0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz(r6Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= qxVar.encWxUiV2(jdVar) ? 2048 : 1024;
        }
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 1171) != 1170)) {
            bd0 xqGvceK5x2 = n7.xqGvceK5x(r6Var, false);
            boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(xqGvceK5x2) | ((i3 & 7168) == 2048);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz2 || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new t7(xqGvceK5x2, jdVar);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            rj0.encWxUiV2(ie0Var, (lv) HFYAaqMd6, qxVar, i3 & 14);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new u7(ie0Var, r6Var, jdVar, i, 0);
        }
    }

    public static final void HFYAaqMd6(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    public static final int JFJ3QoxA(int i, rg0 rg0Var) {
        int i2 = rg0Var.AvO7iQsrTN - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = rg0Var.OOA6hdeuvCS;
            int i5 = ((j30) objArr[i4]).GWasM1elztuh;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((j30) objArr[i3]).GWasM1elztuh) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static int MZhzXH72(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        o4.mE4lRynR("Cannot round NaN value.");
        return 0;
    }

    public static final mg0 Mjvvu5DE(n51 n51Var, qx qxVar) {
        t90 t90Var = (t90) qxVar.JFJ3QoxA(za0.GWasM1elztuh);
        Object value = n51Var.getValue();
        Object AvO7iQsrTN2 = t90Var.AvO7iQsrTN();
        m90 m90Var = m90.encWxUiV2;
        Object obj = vp.OOA6hdeuvCS;
        Object[] objArr = {n51Var, AvO7iQsrTN2, m90Var, obj};
        boolean encWxUiV22 = qxVar.encWxUiV2(AvO7iQsrTN2) | qxVar.xqGvceK5x(m90Var.ordinal()) | qxVar.encWxUiV2(obj) | qxVar.encWxUiV2(n51Var);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        Object obj2 = ue.GWasM1elztuh;
        if (encWxUiV22 || HFYAaqMd6 == obj2) {
            Object eiVar = new ei(AvO7iQsrTN2, m90Var, obj, n51Var, null, 1);
            qxVar.dcDmLGVhzWm(eiVar);
            HFYAaqMd6 = eiVar;
        }
        lv lvVar = (lv) HFYAaqMd6;
        Object HFYAaqMd62 = qxVar.HFYAaqMd6();
        if (HFYAaqMd62 == obj2) {
            HFYAaqMd62 = z50.WRKkgoJXwDn(value);
            qxVar.dcDmLGVhzWm(HFYAaqMd62);
        }
        mg0 mg0Var = (mg0) HFYAaqMd62;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean encWxUiV23 = qxVar.encWxUiV2(lvVar);
        Object HFYAaqMd63 = qxVar.HFYAaqMd6();
        if (encWxUiV23 || HFYAaqMd63 == obj2) {
            HFYAaqMd63 = new m41(lvVar, mg0Var, null, 2);
            qxVar.dcDmLGVhzWm(HFYAaqMd63);
        }
        lv lvVar2 = (lv) HFYAaqMd63;
        gh ghVar = qxVar.YXi2hvwn7WL;
        boolean z = false;
        for (Object obj3 : Arrays.copyOf(copyOf, copyOf.length)) {
            z |= qxVar.EljAMC1QTz(obj3);
        }
        Object HFYAaqMd64 = qxVar.HFYAaqMd6();
        if (!z && HFYAaqMd64 != obj2) {
            return mg0Var;
        }
        qxVar.dcDmLGVhzWm(new j50(ghVar, lvVar2));
        return mg0Var;
    }

    public static final il OOA6hdeuvCS(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        ju GWasM1elztuh2 = ku.GWasM1elztuh(f);
        if (GWasM1elztuh2 == null) {
            GWasM1elztuh2 = new la0(f);
        }
        return new il(f2, f, GWasM1elztuh2);
    }

    public static final Object WIEu4Ya2g8(oq0 oq0Var, lv lvVar, vg vgVar) {
        qh qhVar;
        kc1 kc1Var;
        tu tuVar = new tu(vgVar.OOA6hdeuvCS(), lvVar, null);
        h71 h71Var = (h71) oq0Var;
        h71Var.getClass();
        n9 n9Var = new n9(1, rj0.M3K9sHhK(vgVar));
        n9Var.cilMamHF();
        g71 g71Var = new g71(h71Var, n9Var);
        synchronized (h71Var.WRKkgoJXwDn) {
            h71Var.WdrkLMV3xh.Yi7zF1RB1(g71Var);
            vg M3K9sHhK = rj0.M3K9sHhK(rj0.mE4lRynR(g71Var, g71Var, tuVar));
            qhVar = qh.OOA6hdeuvCS;
            fw0 fw0Var = new fw0(M3K9sHhK);
            kc1Var = kc1.GWasM1elztuh;
            fw0Var.AvO7iQsrTN(kc1Var);
        }
        n9Var.WdrkLMV3xh(new NWXxPwoOUSX9(20, g71Var));
        Object jivtDDk9H2 = n9Var.jivtDDk9H();
        return jivtDDk9H2 == qhVar ? jivtDDk9H2 : kc1Var;
    }

    public static ie0 WRKkgoJXwDn(ie0 ie0Var, float f, float f2, float f3, z11 z11Var, int i) {
        float f4 = (i & 1) != 0 ? 1.0f : f;
        float f5 = (i & 2) != 0 ? 1.0f : f2;
        float f6 = (i & 4) != 0 ? 1.0f : f3;
        long j = ga1.Yi7zF1RB1;
        z11 z11Var2 = (i & 2048) != 0 ? EljAMC1QTz : z11Var;
        boolean z = (i & 4096) == 0;
        long j2 = sy.GWasM1elztuh;
        return ie0Var.X1lG3V04pd(new py(f4, f5, f6, 0.0f, j, z11Var2, z, j2, j2));
    }

    public static ie0 WdrkLMV3xh(float f, float f2, float f3, float f4, z11 z11Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = ga1.Yi7zF1RB1;
        z11 z11Var2 = (i & 2048) != 0 ? EljAMC1QTz : z11Var;
        long j2 = sy.GWasM1elztuh;
        return new py(f5, f6, f7, f8, j, z11Var2, false, j2, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void X1lG3V04pd(qs0 qs0Var, lv lvVar, qx qxVar, int i) {
        jd1 jd1Var;
        boolean z;
        at0 Mjvvu5DE2;
        qxVar.Uxq83abb04(-149765515);
        c30 c30Var = qxVar.WdrkLMV3xh;
        cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
        qxVar.J3Xc8BaqpN8(201, we.Yi7zF1RB1);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (o30.rQPn8YBR(HFYAaqMd6, ue.GWasM1elztuh)) {
            jd1Var = null;
        } else {
            HFYAaqMd6.getClass();
            jd1Var = (jd1) HFYAaqMd6;
        }
        ps0 ps0Var = qs0Var.GWasM1elztuh;
        jd1 X1lG3V04pd2 = ps0Var.X1lG3V04pd(qs0Var, jd1Var);
        boolean equals = X1lG3V04pd2.equals(jd1Var);
        if (!equals) {
            qxVar.dcDmLGVhzWm(X1lG3V04pd2);
        }
        if (qxVar.CMh55RymNfS) {
            if (qs0Var.EljAMC1QTz || !E7jCp8Ls2.containsKey(ps0Var)) {
                E7jCp8Ls2 = E7jCp8Ls2.Yi7zF1RB1(ps0Var, X1lG3V04pd2);
            }
            qxVar.MZhzXH72 = true;
        } else {
            y21 y21Var = qxVar.YZjbz8VdP5;
            Object Yi7zF1RB12 = y21Var.Yi7zF1RB1(y21Var.Yi7zF1RB1, y21Var.AvO7iQsrTN);
            Yi7zF1RB12.getClass();
            cp0 cp0Var = (cp0) Yi7zF1RB12;
            if (!(qxVar.pog2g9KITJA() && equals) && (qs0Var.EljAMC1QTz || !E7jCp8Ls2.containsKey(ps0Var))) {
                E7jCp8Ls2 = E7jCp8Ls2.Yi7zF1RB1(ps0Var, X1lG3V04pd2);
            } else if ((equals && !qxVar.lv06NcmrQ) || !qxVar.lv06NcmrQ) {
                E7jCp8Ls2 = cp0Var;
            }
            if (qxVar.WRKkgoJXwDn || cp0Var != E7jCp8Ls2) {
                z = true;
                if (z && !qxVar.CMh55RymNfS) {
                    qxVar.MZhzXH72(E7jCp8Ls2);
                }
                c30Var.X1lG3V04pd(qxVar.lv06NcmrQ ? 1 : 0);
                qxVar.lv06NcmrQ = z;
                qxVar.DmJncFq5 = E7jCp8Ls2;
                qxVar.CMh55RymNfS(202, 0, we.X1lG3V04pd, E7jCp8Ls2);
                lvVar.EljAMC1QTz(qxVar, Integer.valueOf((i >> 3) & 14));
                qxVar.WIEu4Ya2g8(false);
                qxVar.WIEu4Ya2g8(false);
                qxVar.lv06NcmrQ = c30Var.Yi7zF1RB1() != 0;
                qxVar.DmJncFq5 = null;
                Mjvvu5DE2 = qxVar.Mjvvu5DE();
                if (Mjvvu5DE2 == null) {
                    Mjvvu5DE2.xqGvceK5x = new w9(i, 2, qs0Var, lvVar);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            qxVar.MZhzXH72(E7jCp8Ls2);
        }
        c30Var.X1lG3V04pd(qxVar.lv06NcmrQ ? 1 : 0);
        qxVar.lv06NcmrQ = z;
        qxVar.DmJncFq5 = E7jCp8Ls2;
        qxVar.CMh55RymNfS(202, 0, we.X1lG3V04pd, E7jCp8Ls2);
        lvVar.EljAMC1QTz(qxVar, Integer.valueOf((i >> 3) & 14));
        qxVar.WIEu4Ya2g8(false);
        qxVar.WIEu4Ya2g8(false);
        qxVar.lv06NcmrQ = c30Var.Yi7zF1RB1() != 0;
        qxVar.DmJncFq5 = null;
        Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 == null) {
        }
    }

    public static final ie0 XnEVoBF0td1l(ie0 ie0Var, float f) {
        return f == 1.0f ? ie0Var : WRKkgoJXwDn(ie0Var, 0.0f, 0.0f, f, null, 520187);
    }

    public static final float Y6hRI1cF8(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = n81.GWasM1elztuh;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : s00.GWasM1elztuh[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final bk0 YZjbz8VdP5(xk xkVar) {
        if (!((he0) xkVar).OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        bk0 AEn1Rrio = AEn1Rrio(xkVar, 2);
        if (!AEn1Rrio.iK7aQfvhG().Mjvvu5DE) {
            t10.Yi7zF1RB1("LayoutCoordinates is not attached.");
        }
        return AEn1Rrio;
    }

    public static final void Yi7zF1RB1(ls lsVar, hv hvVar, qx qxVar, int i) {
        lsVar.getClass();
        hvVar.getClass();
        qxVar.Uxq83abb04(456789568);
        int i2 = 2;
        int i3 = (qxVar.encWxUiV2(lsVar) ? 4 : 2) | i | (qxVar.encWxUiV2(hvVar) ? 32 : 16);
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 19) != 18)) {
            lf lfVar = r.GWasM1elztuh;
            t90 t90Var = (t90) qxVar.JFJ3QoxA(za0.GWasM1elztuh);
            boolean encWxUiV22 = qxVar.encWxUiV2(t90Var) | qxVar.encWxUiV2(lsVar) | ((i3 & 112) == 32);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (encWxUiV22 || HFYAaqMd6 == ue.GWasM1elztuh) {
                EljAMC1QTz eljAMC1QTz = new EljAMC1QTz(t90Var, lsVar, hvVar, null, 4);
                qxVar.dcDmLGVhzWm(eljAMC1QTz);
                HFYAaqMd6 = eljAMC1QTz;
            }
            ki1.mOu10nynGul(lsVar, t90Var, (lv) HFYAaqMd6, qxVar);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new t7(i, i2, lsVar, hvVar);
        }
    }

    public static final boolean YmKjaVtbfp5Z(Object obj) {
        if (obj instanceof i41) {
            i41 i41Var = (i41) obj;
            if (i41Var.xqGvceK5x() == b9xEq24R1.qugwajBSa59j || i41Var.xqGvceK5x() == k61.EljAMC1QTz || i41Var.xqGvceK5x() == b9xEq24R1.Uxq83abb04) {
                Object value = i41Var.getValue();
                if (value == null) {
                    return true;
                }
                return YmKjaVtbfp5Z(value);
            }
        } else if (!(obj instanceof tv) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (xqGvceK5x[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void arNh8D4Z5gB(gh ghVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = kh.GWasM1elztuh.iterator();
        while (it.hasNext()) {
            try {
                ((jh) it.next()).uFEq9NpZ(ghVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    p.xqGvceK5x(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            p.xqGvceK5x(th, new rl(ghVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final float cilMamHF(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = n81.GWasM1elztuh;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? s00.GWasM1elztuh[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final g60 eUH21U3apd(xk xkVar) {
        bk0 bk0Var = ((he0) xkVar).OOA6hdeuvCS.E7jCp8Ls;
        if (bk0Var != null) {
            return bk0Var.mE4lRynR;
        }
        throw mr0.EljAMC1QTz("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final void encWxUiV2(wu wuVar, u11 u11Var, qx qxVar, int i) {
        u11 u11Var2;
        int i2;
        Object dkVar;
        p31 p31Var;
        wuVar.getClass();
        qxVar.Uxq83abb04(1093863556);
        int i3 = (qxVar.encWxUiV2(wuVar) ? 4 : 2) | i | 16;
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 19) != 18)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                ff1 GWasM1elztuh2 = eb0.GWasM1elztuh(qxVar);
                if (GWasM1elztuh2 == null) {
                    o4.jivtDDk9H("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-113);
                    u11Var2 = (u11) ki1.DmJncFq5(st0.GWasM1elztuh(u11.class), GWasM1elztuh2.OOA6hdeuvCS(), ki1.WRKkgoJXwDn(GWasM1elztuh2), b50.GWasM1elztuh(qxVar));
                }
            } else {
                qxVar.YXi2hvwn7WL();
                i2 = i3 & (-113);
                u11Var2 = u11Var;
            }
            qxVar.YmKjaVtbfp5Z();
            mg0 Mjvvu5DE2 = Mjvvu5DE(u11Var2.X1lG3V04pd, qxVar);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (HFYAaqMd6 == k61Var) {
                HFYAaqMd6 = new p31();
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            p31 p31Var2 = (p31) HFYAaqMd6;
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (HFYAaqMd62 == k61Var) {
                HFYAaqMd62 = ki1.WdrkLMV3xh(qxVar);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            ph phVar = (ph) HFYAaqMd62;
            String lv06NcmrQ = w60.lv06NcmrQ(R.string.message_progress_reset, qxVar);
            aa aaVar = u11Var2.OOA6hdeuvCS;
            boolean encWxUiV22 = qxVar.encWxUiV2(phVar) | ((i2 & 14) == 4) | qxVar.EljAMC1QTz(lv06NcmrQ);
            Object HFYAaqMd63 = qxVar.HFYAaqMd6();
            if (encWxUiV22 || HFYAaqMd63 == k61Var) {
                p31Var = p31Var2;
                dkVar = new dk(wuVar, p31Var, phVar, lv06NcmrQ, 6);
                qxVar.dcDmLGVhzWm(dkVar);
            } else {
                dkVar = HFYAaqMd63;
                p31Var = p31Var2;
            }
            Yi7zF1RB1(aaVar, (hv) dkVar, qxVar, 0);
            ki1.iwATDS1i01k(ac.JFJ3QoxA, null, rj0.YZjbz8VdP5(526289188, new gz0(p31Var, u11Var2, Mjvvu5DE2), qxVar), qxVar, 390);
        } else {
            qxVar.YXi2hvwn7WL();
            u11Var2 = u11Var;
        }
        at0 Mjvvu5DE3 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE3 != null) {
            Mjvvu5DE3.xqGvceK5x = new t7(i, 15, wuVar, u11Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object iwATDS1i01k(g71 g71Var, hq0 hq0Var, h6 h6Var) {
        su suVar;
        int i;
        qh qhVar;
        int size;
        int i2;
        if (h6Var instanceof su) {
            suVar = (su) h6Var;
            int i3 = suVar.rQPn8YBR;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                suVar.rQPn8YBR = i3 - Integer.MIN_VALUE;
                Object obj = suVar.JFJ3QoxA;
                i = suVar.rQPn8YBR;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    List list = g71Var.JFJ3QoxA.lv06NcmrQ.GWasM1elztuh;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (((kq0) list.get(i4)).xqGvceK5x) {
                            suVar.encWxUiV2 = g71Var;
                            suVar.mOu10nynGul = hq0Var;
                            suVar.rQPn8YBR = 1;
                            obj = g71Var.GWasM1elztuh(hq0Var, suVar);
                            qhVar = qh.OOA6hdeuvCS;
                            if (obj == qhVar) {
                            }
                            List list2 = ((gq0) obj).GWasM1elztuh;
                            size = list2.size();
                            i2 = 0;
                            while (i2 < size) {
                            }
                            return kc1.GWasM1elztuh;
                        }
                    }
                    return kc1.GWasM1elztuh;
                }
                if (i != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hq0 hq0Var2 = suVar.mOu10nynGul;
                g71 g71Var2 = suVar.encWxUiV2;
                o50.A1EKNP6CxJ(obj);
                hq0Var = hq0Var2;
                g71Var = g71Var2;
                List list22 = ((gq0) obj).GWasM1elztuh;
                size = list22.size();
                i2 = 0;
                while (i2 < size) {
                    if (((kq0) list22.get(i2)).xqGvceK5x) {
                        suVar.encWxUiV2 = g71Var;
                        suVar.mOu10nynGul = hq0Var;
                        suVar.rQPn8YBR = 1;
                        obj = g71Var.GWasM1elztuh(hq0Var, suVar);
                        qhVar = qh.OOA6hdeuvCS;
                        if (obj == qhVar) {
                            return qhVar;
                        }
                        List list222 = ((gq0) obj).GWasM1elztuh;
                        size = list222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    } else {
                        i2++;
                    }
                }
                return kc1.GWasM1elztuh;
            }
        }
        suVar = new su(h6Var);
        Object obj2 = suVar.JFJ3QoxA;
        i = suVar.rQPn8YBR;
        if (i != 0) {
        }
    }

    public static final i00 jivtDDk9H() {
        i00 i00Var = Mjvvu5DE;
        if (i00Var != null) {
            return i00Var;
        }
        h00 h00Var = new h00("AutoMirrored.Filled.ArrowBack", true, 96);
        int i = pd1.GWasM1elztuh;
        t41 t41Var = new t41(yb.Yi7zF1RB1);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new no0(20.0f, 11.0f));
        arrayList.add(new lo0(7.83f));
        arrayList.add(new ro0(5.59f, -5.59f));
        arrayList.add(new mo0(12.0f, 4.0f));
        arrayList.add(new ro0(-8.0f, 8.0f));
        arrayList.add(new ro0(8.0f, 8.0f));
        arrayList.add(new ro0(1.41f, -1.41f));
        arrayList.add(new mo0(7.83f, 13.0f));
        arrayList.add(new lo0(20.0f));
        arrayList.add(new to0(-2.0f));
        arrayList.add(jo0.Yi7zF1RB1);
        h00.GWasM1elztuh(h00Var, arrayList, t41Var);
        i00 Yi7zF1RB12 = h00Var.Yi7zF1RB1();
        Mjvvu5DE = Yi7zF1RB12;
        return Yi7zF1RB12;
    }

    public static final int lv06NcmrQ(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static void mE4lRynR(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!Y6hRI1cF8) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    mE4lRynR = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    jivtDDk9H = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    mE4lRynR = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    jivtDDk9H = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = mE4lRynR;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = jivtDDk9H;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            Y6hRI1cF8 = true;
        }
        if (z) {
            try {
                Method method4 = mE4lRynR;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = jivtDDk9H) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final void mOu10nynGul(rg0 rg0Var, he0 he0Var) {
        rg0 arNh8D4Z5gB = eUH21U3apd(he0Var).arNh8D4Z5gB();
        int i = arNh8D4Z5gB.AvO7iQsrTN - 1;
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        if (i < objArr.length) {
            while (i >= 0) {
                rg0Var.Yi7zF1RB1(((g60) objArr[i]).A1EKNP6CxJ.EljAMC1QTz);
                i--;
            }
        }
    }

    public static final Object ozMwhSAI(Object obj) {
        return obj instanceof uc ? o50.rQPn8YBR(((uc) obj).GWasM1elztuh) : obj;
    }

    public static final ie0 pog2g9KITJA(h80 h80Var, x7 x7Var, xm0 xm0Var) {
        return new f70(h80Var, x7Var, xm0Var);
    }

    public static final boolean rQPn8YBR(gn gnVar, long j) {
        if (!gnVar.OOA6hdeuvCS.Mjvvu5DE) {
            return false;
        }
        z10 z10Var = eUH21U3apd(gnVar).A1EKNP6CxJ.X1lG3V04pd;
        if (!z10Var.J3Xc8BaqpN8.Mjvvu5DE) {
            return false;
        }
        long pjimB8cb = z10Var.pjimB8cb(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (pjimB8cb >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (pjimB8cb & 4294967295L));
        long j2 = gnVar.Y6hRI1cF8;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w50 uFEq9NpZ(he0 he0Var) {
        if ((he0Var.AvO7iQsrTN & 2) != 0) {
            if (he0Var instanceof w50) {
                return (w50) he0Var;
            }
            if (he0Var instanceof yk) {
                he0 he0Var2 = ((yk) he0Var).jivtDDk9H;
                while (he0Var2 != 0) {
                    if (he0Var2 instanceof w50) {
                        return (w50) he0Var2;
                    }
                    he0Var2 = (!(he0Var2 instanceof yk) || (he0Var2.AvO7iQsrTN & 2) == 0) ? he0Var2.JFJ3QoxA : ((yk) he0Var2).jivtDDk9H;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xqGvceK5x(qs0[] qs0VarArr, lv lvVar, qx qxVar, int i) {
        cp0 EDwNPVYuViP0;
        boolean z;
        at0 Mjvvu5DE2;
        qxVar.Uxq83abb04(415205898);
        c30 c30Var = qxVar.WdrkLMV3xh;
        cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
        qxVar.J3Xc8BaqpN8(201, we.Yi7zF1RB1);
        if (qxVar.CMh55RymNfS) {
            EDwNPVYuViP0 = qxVar.EDwNPVYuViP0(E7jCp8Ls2, rj0.HFYAaqMd6(qs0VarArr, E7jCp8Ls2, cp0.encWxUiV2));
            qxVar.MZhzXH72 = true;
        } else {
            y21 y21Var = qxVar.YZjbz8VdP5;
            Object encWxUiV22 = y21Var.encWxUiV2(y21Var.AvO7iQsrTN, 0);
            encWxUiV22.getClass();
            cp0 cp0Var = (cp0) encWxUiV22;
            y21 y21Var2 = qxVar.YZjbz8VdP5;
            Object encWxUiV23 = y21Var2.encWxUiV2(y21Var2.AvO7iQsrTN, 1);
            encWxUiV23.getClass();
            cp0 cp0Var2 = (cp0) encWxUiV23;
            cp0 HFYAaqMd6 = rj0.HFYAaqMd6(qs0VarArr, E7jCp8Ls2, cp0Var2);
            if (qxVar.pog2g9KITJA() && !qxVar.WRKkgoJXwDn && cp0Var2.equals(HFYAaqMd6)) {
                qxVar.E7jCp8Ls = qxVar.YZjbz8VdP5.mE4lRynR() + qxVar.E7jCp8Ls;
                EDwNPVYuViP0 = cp0Var;
            } else {
                EDwNPVYuViP0 = qxVar.EDwNPVYuViP0(E7jCp8Ls2, HFYAaqMd6);
                if (qxVar.WRKkgoJXwDn || !o30.rQPn8YBR(EDwNPVYuViP0, cp0Var)) {
                    z = true;
                    if (z && !qxVar.CMh55RymNfS) {
                        qxVar.MZhzXH72(EDwNPVYuViP0);
                    }
                    c30Var.X1lG3V04pd(qxVar.lv06NcmrQ ? 1 : 0);
                    qxVar.lv06NcmrQ = z;
                    qxVar.DmJncFq5 = EDwNPVYuViP0;
                    qxVar.CMh55RymNfS(202, 0, we.X1lG3V04pd, EDwNPVYuViP0);
                    lvVar.EljAMC1QTz(qxVar, Integer.valueOf((i >> 3) & 14));
                    qxVar.WIEu4Ya2g8(false);
                    qxVar.WIEu4Ya2g8(false);
                    qxVar.lv06NcmrQ = c30Var.Yi7zF1RB1() != 0;
                    qxVar.DmJncFq5 = null;
                    Mjvvu5DE2 = qxVar.Mjvvu5DE();
                    if (Mjvvu5DE2 == null) {
                        Mjvvu5DE2.xqGvceK5x = new w9(i, 3, qs0VarArr, lvVar);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            qxVar.MZhzXH72(EDwNPVYuViP0);
        }
        c30Var.X1lG3V04pd(qxVar.lv06NcmrQ ? 1 : 0);
        qxVar.lv06NcmrQ = z;
        qxVar.DmJncFq5 = EDwNPVYuViP0;
        qxVar.CMh55RymNfS(202, 0, we.X1lG3V04pd, EDwNPVYuViP0);
        lvVar.EljAMC1QTz(qxVar, Integer.valueOf((i >> 3) & 14));
        qxVar.WIEu4Ya2g8(false);
        qxVar.WIEu4Ya2g8(false);
        qxVar.lv06NcmrQ = c30Var.Yi7zF1RB1() != 0;
        qxVar.DmJncFq5 = null;
        Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 == null) {
        }
    }

    public abstract void M3K9sHhK(Throwable th);

    public abstract void k8h8IjolWQ(rx0 rx0Var);
}
