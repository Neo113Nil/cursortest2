package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.alicekit.core.slideup.SlidingBehavior;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class f96 {
    public static final int[] h = {0, 4, 8};
    public static final SparseIntArray i;
    public static final SparseIntArray j;
    public String a;
    public String b = "";
    public String[] c = new String[0];
    public int d = 0;
    public final HashMap e = new HashMap();
    public boolean f = true;
    public final HashMap g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(BuildConfig.API_LEVEL, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static a96 d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a96 a96Var = new a96();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, cen.d);
        r(a96Var, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return a96Var;
    }

    public static int[] i(Barrier barrier, String str) {
        int i2;
        String[] split = str.split(StringUtils.COMMA);
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            Object obj = null;
            try {
                i2 = pdn.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, ConnectableDevice.KEY_ID, context.getPackageName());
            }
            if (i2 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.m.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i2 = ((Integer) obj).intValue();
                }
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public static a96 j(Context context, AttributeSet attributeSet, boolean z) {
        a96 a96Var = new a96();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? cen.d : cen.a);
        if (z) {
            r(a96Var, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                b96 b96Var = a96Var.e;
                if (i2 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i2);
                    d96 d96Var = a96Var.c;
                    e96 e96Var = a96Var.f;
                    c96 c96Var = a96Var.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        c96Var.a = true;
                        b96Var.b = true;
                        d96Var.a = true;
                        e96Var.a = true;
                    }
                    SparseIntArray sparseIntArray = i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            b96Var.q = o(obtainStyledAttributes, index, b96Var.q);
                            break;
                        case 2:
                            b96Var.J = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.J);
                            break;
                        case 3:
                            b96Var.p = o(obtainStyledAttributes, index, b96Var.p);
                            break;
                        case 4:
                            b96Var.o = o(obtainStyledAttributes, index, b96Var.o);
                            break;
                        case 5:
                            b96Var.z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            b96Var.D = obtainStyledAttributes.getDimensionPixelOffset(index, b96Var.D);
                            break;
                        case 7:
                            b96Var.E = obtainStyledAttributes.getDimensionPixelOffset(index, b96Var.E);
                            break;
                        case 8:
                            b96Var.K = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.K);
                            break;
                        case 9:
                            b96Var.w = o(obtainStyledAttributes, index, b96Var.w);
                            break;
                        case 10:
                            b96Var.v = o(obtainStyledAttributes, index, b96Var.v);
                            break;
                        case 11:
                            b96Var.Q = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.Q);
                            break;
                        case 12:
                            b96Var.R = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.R);
                            break;
                        case 13:
                            b96Var.N = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.N);
                            break;
                        case 14:
                            b96Var.P = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.P);
                            break;
                        case 15:
                            b96Var.S = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.S);
                            break;
                        case 16:
                            b96Var.O = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.O);
                            break;
                        case 17:
                            b96Var.e = obtainStyledAttributes.getDimensionPixelOffset(index, b96Var.e);
                            break;
                        case 18:
                            b96Var.f = obtainStyledAttributes.getDimensionPixelOffset(index, b96Var.f);
                            break;
                        case 19:
                            b96Var.g = obtainStyledAttributes.getFloat(index, b96Var.g);
                            break;
                        case 20:
                            b96Var.x = obtainStyledAttributes.getFloat(index, b96Var.x);
                            break;
                        case 21:
                            b96Var.d = obtainStyledAttributes.getLayoutDimension(index, b96Var.d);
                            break;
                        case 22:
                            int i3 = obtainStyledAttributes.getInt(index, d96Var.b);
                            d96Var.b = i3;
                            d96Var.b = h[i3];
                            break;
                        case 23:
                            b96Var.c = obtainStyledAttributes.getLayoutDimension(index, b96Var.c);
                            break;
                        case 24:
                            b96Var.G = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.G);
                            break;
                        case 25:
                            b96Var.i = o(obtainStyledAttributes, index, b96Var.i);
                            break;
                        case 26:
                            b96Var.j = o(obtainStyledAttributes, index, b96Var.j);
                            break;
                        case 27:
                            b96Var.F = obtainStyledAttributes.getInt(index, b96Var.F);
                            break;
                        case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                            b96Var.H = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.H);
                            break;
                        case 29:
                            b96Var.k = o(obtainStyledAttributes, index, b96Var.k);
                            break;
                        case 30:
                            b96Var.l = o(obtainStyledAttributes, index, b96Var.l);
                            break;
                        case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                            b96Var.L = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.L);
                            break;
                        case 32:
                            b96Var.t = o(obtainStyledAttributes, index, b96Var.t);
                            break;
                        case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                            b96Var.u = o(obtainStyledAttributes, index, b96Var.u);
                            break;
                        case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                            b96Var.I = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.I);
                            break;
                        case 35:
                            b96Var.n = o(obtainStyledAttributes, index, b96Var.n);
                            break;
                        case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                            b96Var.m = o(obtainStyledAttributes, index, b96Var.m);
                            break;
                        case 37:
                            b96Var.y = obtainStyledAttributes.getFloat(index, b96Var.y);
                            break;
                        case 38:
                            a96Var.a = obtainStyledAttributes.getResourceId(index, a96Var.a);
                            break;
                        case 39:
                            b96Var.V = obtainStyledAttributes.getFloat(index, b96Var.V);
                            break;
                        case 40:
                            b96Var.U = obtainStyledAttributes.getFloat(index, b96Var.U);
                            break;
                        case 41:
                            b96Var.W = obtainStyledAttributes.getInt(index, b96Var.W);
                            break;
                        case 42:
                            b96Var.X = obtainStyledAttributes.getInt(index, b96Var.X);
                            break;
                        case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                            d96Var.d = obtainStyledAttributes.getFloat(index, d96Var.d);
                            break;
                        case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                            e96Var.m = true;
                            e96Var.n = obtainStyledAttributes.getDimension(index, e96Var.n);
                            break;
                        case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                            e96Var.c = obtainStyledAttributes.getFloat(index, e96Var.c);
                            break;
                        case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                            e96Var.d = obtainStyledAttributes.getFloat(index, e96Var.d);
                            break;
                        case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                            e96Var.e = obtainStyledAttributes.getFloat(index, e96Var.e);
                            break;
                        case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                            e96Var.f = obtainStyledAttributes.getFloat(index, e96Var.f);
                            break;
                        case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                            e96Var.g = obtainStyledAttributes.getDimension(index, e96Var.g);
                            break;
                        case 50:
                            e96Var.h = obtainStyledAttributes.getDimension(index, e96Var.h);
                            break;
                        case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                            e96Var.j = obtainStyledAttributes.getDimension(index, e96Var.j);
                            break;
                        case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                            e96Var.k = obtainStyledAttributes.getDimension(index, e96Var.k);
                            break;
                        case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                            e96Var.l = obtainStyledAttributes.getDimension(index, e96Var.l);
                            break;
                        case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                            b96Var.Y = obtainStyledAttributes.getInt(index, b96Var.Y);
                            break;
                        case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                            b96Var.Z = obtainStyledAttributes.getInt(index, b96Var.Z);
                            break;
                        case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                            b96Var.a0 = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.a0);
                            break;
                        case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                            b96Var.b0 = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.b0);
                            break;
                        case 58:
                            b96Var.c0 = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.c0);
                            break;
                        case 59:
                            b96Var.d0 = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.d0);
                            break;
                        case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                            e96Var.b = obtainStyledAttributes.getFloat(index, e96Var.b);
                            break;
                        case 61:
                            b96Var.A = o(obtainStyledAttributes, index, b96Var.A);
                            break;
                        case 62:
                            b96Var.B = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.B);
                            break;
                        case 63:
                            b96Var.C = obtainStyledAttributes.getFloat(index, b96Var.C);
                            break;
                        case SQLiteDatabase.OPEN_URI /* 64 */:
                            c96Var.b = o(obtainStyledAttributes, index, c96Var.b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type != 3) {
                                c96Var.d = jya.d[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                c96Var.d = obtainStyledAttributes.getString(index);
                                break;
                            }
                        case 66:
                            c96Var.f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            c96Var.h = obtainStyledAttributes.getFloat(index, c96Var.h);
                            break;
                        case 68:
                            d96Var.e = obtainStyledAttributes.getFloat(index, d96Var.e);
                            break;
                        case 69:
                            b96Var.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                            b96Var.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            b96Var.g0 = obtainStyledAttributes.getInt(index, b96Var.g0);
                            break;
                        case 73:
                            b96Var.h0 = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.h0);
                            break;
                        case 74:
                            b96Var.k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            b96Var.o0 = obtainStyledAttributes.getBoolean(index, b96Var.o0);
                            break;
                        case 76:
                            c96Var.e = obtainStyledAttributes.getInt(index, c96Var.e);
                            break;
                        case 77:
                            b96Var.l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            d96Var.c = obtainStyledAttributes.getInt(index, d96Var.c);
                            break;
                        case 79:
                            c96Var.g = obtainStyledAttributes.getFloat(index, c96Var.g);
                            break;
                        case SlidingBehavior.WIDE_EXPANDED_PERCENTAGE /* 80 */:
                            b96Var.m0 = obtainStyledAttributes.getBoolean(index, b96Var.m0);
                            break;
                        case 81:
                            b96Var.n0 = obtainStyledAttributes.getBoolean(index, b96Var.n0);
                            break;
                        case 82:
                            c96Var.c = obtainStyledAttributes.getInteger(index, c96Var.c);
                            break;
                        case 83:
                            e96Var.i = o(obtainStyledAttributes, index, e96Var.i);
                            break;
                        case 84:
                            c96Var.j = obtainStyledAttributes.getInteger(index, c96Var.j);
                            break;
                        case 85:
                            c96Var.i = obtainStyledAttributes.getFloat(index, c96Var.i);
                            break;
                        case 86:
                            int i4 = obtainStyledAttributes.peekValue(index).type;
                            if (i4 != 1) {
                                if (i4 != 3) {
                                    c96Var.l = obtainStyledAttributes.getInteger(index, c96Var.m);
                                    break;
                                } else {
                                    String string = obtainStyledAttributes.getString(index);
                                    c96Var.k = string;
                                    if (string.indexOf("/") <= 0) {
                                        c96Var.l = -1;
                                        break;
                                    } else {
                                        c96Var.m = obtainStyledAttributes.getResourceId(index, -1);
                                        c96Var.l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                c96Var.m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    c96Var.l = -2;
                                    break;
                                }
                            }
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            b96Var.r = o(obtainStyledAttributes, index, b96Var.r);
                            break;
                        case 92:
                            b96Var.s = o(obtainStyledAttributes, index, b96Var.s);
                            break;
                        case 93:
                            b96Var.M = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.M);
                            break;
                        case 94:
                            b96Var.T = obtainStyledAttributes.getDimensionPixelSize(index, b96Var.T);
                            break;
                        case 95:
                            p(b96Var, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            p(b96Var, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            b96Var.p0 = obtainStyledAttributes.getInt(index, b96Var.p0);
                            break;
                    }
                    i2++;
                } else if (b96Var.k0 != null) {
                    b96Var.j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return a96Var;
    }

    public static int o(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i2).type;
        boolean z = true;
        int i5 = 0;
        if (i4 == 3) {
            String string = typedArray.getString(i2);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof t86) {
                        t86 t86Var = (t86) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) t86Var).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) t86Var).height = 0;
                        }
                        q(t86Var, trim2);
                        return;
                    }
                    if (obj instanceof b96) {
                        ((b96) obj).z = trim2;
                        return;
                    } else {
                        if (obj instanceof z86) {
                            ((z86) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof t86) {
                            t86 t86Var2 = (t86) obj;
                            if (i3 == 0) {
                                ((ViewGroup.MarginLayoutParams) t86Var2).width = 0;
                                t86Var2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) t86Var2).height = 0;
                                t86Var2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof b96) {
                            b96 b96Var = (b96) obj;
                            if (i3 == 0) {
                                b96Var.c = 0;
                                b96Var.V = parseFloat;
                                return;
                            } else {
                                b96Var.d = 0;
                                b96Var.U = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof z86) {
                            z86 z86Var = (z86) obj;
                            if (i3 == 0) {
                                z86Var.b(23, 0);
                                z86Var.a(39, parseFloat);
                                return;
                            } else {
                                z86Var.b(21, 0);
                                z86Var.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof t86) {
                            t86 t86Var3 = (t86) obj;
                            if (i3 == 0) {
                                ((ViewGroup.MarginLayoutParams) t86Var3).width = 0;
                                t86Var3.R = max;
                                t86Var3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) t86Var3).height = 0;
                                t86Var3.S = max;
                                t86Var3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof b96) {
                            b96 b96Var2 = (b96) obj;
                            if (i3 == 0) {
                                b96Var2.c = 0;
                                b96Var2.e0 = max;
                                b96Var2.Y = 2;
                                return;
                            } else {
                                b96Var2.d = 0;
                                b96Var2.f0 = max;
                                b96Var2.Z = 2;
                                return;
                            }
                        }
                        if (obj instanceof z86) {
                            z86 z86Var2 = (z86) obj;
                            if (i3 == 0) {
                                z86Var2.b(23, 0);
                                z86Var2.b(54, 2);
                                return;
                            } else {
                                z86Var2.b(21, 0);
                                z86Var2.b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i4 != 5) {
            dimensionPixelSize = typedArray.getInt(i2, 0);
            if (dimensionPixelSize == -4) {
                i5 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof t86)) {
                t86 t86Var4 = (t86) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) t86Var4).width = i5;
                    t86Var4.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) t86Var4).height = i5;
                    t86Var4.X = z;
                    return;
                }
            }
            if (obj instanceof b96) {
                b96 b96Var3 = (b96) obj;
                if (i3 == 0) {
                    b96Var3.c = i5;
                    b96Var3.m0 = z;
                    return;
                } else {
                    b96Var3.d = i5;
                    b96Var3.n0 = z;
                    return;
                }
            }
            if (obj instanceof z86) {
                z86 z86Var3 = (z86) obj;
                if (i3 == 0) {
                    z86Var3.b(23, i5);
                    z86Var3.d(80, z);
                    return;
                } else {
                    z86Var3.b(21, i5);
                    z86Var3.d(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
        z = false;
        i5 = dimensionPixelSize;
        if (!(obj instanceof t86)) {
        }
    }

    public static void q(t86 t86Var, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        t86Var.G = str;
    }

    public static void r(a96 a96Var, TypedArray typedArray) {
        char c;
        int indexCount = typedArray.getIndexCount();
        z86 z86Var = new z86();
        z86Var.a = new int[10];
        z86Var.b = new int[10];
        z86Var.c = 0;
        z86Var.d = new int[10];
        z86Var.e = new float[10];
        z86Var.f = 0;
        z86Var.g = new int[5];
        z86Var.h = new String[5];
        z86Var.i = 0;
        z86Var.j = new int[4];
        z86Var.k = new boolean[4];
        z86Var.l = 0;
        a96Var.h = z86Var;
        c96 c96Var = a96Var.d;
        c96Var.a = false;
        b96 b96Var = a96Var.e;
        b96Var.b = false;
        d96 d96Var = a96Var.c;
        d96Var.a = false;
        e96 e96Var = a96Var.f;
        e96Var.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i3) {
                case 2:
                    c = 5;
                    z86Var.b(2, typedArray.getDimensionPixelSize(index, b96Var.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                case 35:
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c = 5;
                    break;
                case 5:
                    c = 5;
                    z86Var.c(5, typedArray.getString(index));
                    break;
                case 6:
                    z86Var.b(6, typedArray.getDimensionPixelOffset(index, b96Var.D));
                    c = 5;
                    break;
                case 7:
                    z86Var.b(7, typedArray.getDimensionPixelOffset(index, b96Var.E));
                    c = 5;
                    break;
                case 8:
                    z86Var.b(8, typedArray.getDimensionPixelSize(index, b96Var.K));
                    c = 5;
                    break;
                case 11:
                    z86Var.b(11, typedArray.getDimensionPixelSize(index, b96Var.Q));
                    c = 5;
                    break;
                case 12:
                    z86Var.b(12, typedArray.getDimensionPixelSize(index, b96Var.R));
                    c = 5;
                    break;
                case 13:
                    z86Var.b(13, typedArray.getDimensionPixelSize(index, b96Var.N));
                    c = 5;
                    break;
                case 14:
                    z86Var.b(14, typedArray.getDimensionPixelSize(index, b96Var.P));
                    c = 5;
                    break;
                case 15:
                    z86Var.b(15, typedArray.getDimensionPixelSize(index, b96Var.S));
                    c = 5;
                    break;
                case 16:
                    z86Var.b(16, typedArray.getDimensionPixelSize(index, b96Var.O));
                    c = 5;
                    break;
                case 17:
                    z86Var.b(17, typedArray.getDimensionPixelOffset(index, b96Var.e));
                    c = 5;
                    break;
                case 18:
                    z86Var.b(18, typedArray.getDimensionPixelOffset(index, b96Var.f));
                    c = 5;
                    break;
                case 19:
                    z86Var.a(19, typedArray.getFloat(index, b96Var.g));
                    c = 5;
                    break;
                case 20:
                    z86Var.a(20, typedArray.getFloat(index, b96Var.x));
                    c = 5;
                    break;
                case 21:
                    z86Var.b(21, typedArray.getLayoutDimension(index, b96Var.d));
                    c = 5;
                    break;
                case 22:
                    z86Var.b(22, h[typedArray.getInt(index, d96Var.b)]);
                    c = 5;
                    break;
                case 23:
                    z86Var.b(23, typedArray.getLayoutDimension(index, b96Var.c));
                    c = 5;
                    break;
                case 24:
                    z86Var.b(24, typedArray.getDimensionPixelSize(index, b96Var.G));
                    c = 5;
                    break;
                case 27:
                    z86Var.b(27, typedArray.getInt(index, b96Var.F));
                    c = 5;
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    z86Var.b(28, typedArray.getDimensionPixelSize(index, b96Var.H));
                    c = 5;
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    z86Var.b(31, typedArray.getDimensionPixelSize(index, b96Var.L));
                    c = 5;
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    z86Var.b(34, typedArray.getDimensionPixelSize(index, b96Var.I));
                    c = 5;
                    break;
                case 37:
                    z86Var.a(37, typedArray.getFloat(index, b96Var.y));
                    c = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, a96Var.a);
                    a96Var.a = resourceId;
                    z86Var.b(38, resourceId);
                    c = 5;
                    break;
                case 39:
                    z86Var.a(39, typedArray.getFloat(index, b96Var.V));
                    c = 5;
                    break;
                case 40:
                    z86Var.a(40, typedArray.getFloat(index, b96Var.U));
                    c = 5;
                    break;
                case 41:
                    z86Var.b(41, typedArray.getInt(index, b96Var.W));
                    c = 5;
                    break;
                case 42:
                    z86Var.b(42, typedArray.getInt(index, b96Var.X));
                    c = 5;
                    break;
                case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                    z86Var.a(43, typedArray.getFloat(index, d96Var.d));
                    c = 5;
                    break;
                case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                    z86Var.d(44, true);
                    z86Var.a(44, typedArray.getDimension(index, e96Var.n));
                    c = 5;
                    break;
                case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                    z86Var.a(45, typedArray.getFloat(index, e96Var.c));
                    c = 5;
                    break;
                case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                    z86Var.a(46, typedArray.getFloat(index, e96Var.d));
                    c = 5;
                    break;
                case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                    z86Var.a(47, typedArray.getFloat(index, e96Var.e));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                    z86Var.a(48, typedArray.getFloat(index, e96Var.f));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                    z86Var.a(49, typedArray.getDimension(index, e96Var.g));
                    c = 5;
                    break;
                case 50:
                    z86Var.a(50, typedArray.getDimension(index, e96Var.h));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                    z86Var.a(51, typedArray.getDimension(index, e96Var.j));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                    z86Var.a(52, typedArray.getDimension(index, e96Var.k));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                    z86Var.a(53, typedArray.getDimension(index, e96Var.l));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                    z86Var.b(54, typedArray.getInt(index, b96Var.Y));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                    z86Var.b(55, typedArray.getInt(index, b96Var.Z));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    z86Var.b(56, typedArray.getDimensionPixelSize(index, b96Var.a0));
                    c = 5;
                    break;
                case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                    z86Var.b(57, typedArray.getDimensionPixelSize(index, b96Var.b0));
                    c = 5;
                    break;
                case 58:
                    z86Var.b(58, typedArray.getDimensionPixelSize(index, b96Var.c0));
                    c = 5;
                    break;
                case 59:
                    z86Var.b(59, typedArray.getDimensionPixelSize(index, b96Var.d0));
                    c = 5;
                    break;
                case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    z86Var.a(60, typedArray.getFloat(index, e96Var.b));
                    c = 5;
                    break;
                case 62:
                    z86Var.b(62, typedArray.getDimensionPixelSize(index, b96Var.B));
                    c = 5;
                    break;
                case 63:
                    z86Var.a(63, typedArray.getFloat(index, b96Var.C));
                    c = 5;
                    break;
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    z86Var.b(64, o(typedArray, index, c96Var.b));
                    c = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        z86Var.c(65, typedArray.getString(index));
                    } else {
                        z86Var.c(65, jya.d[typedArray.getInteger(index, 0)]);
                    }
                    c = 5;
                    break;
                case 66:
                    z86Var.b(66, typedArray.getInt(index, 0));
                    c = 5;
                    break;
                case 67:
                    z86Var.a(67, typedArray.getFloat(index, c96Var.h));
                    c = 5;
                    break;
                case 68:
                    z86Var.a(68, typedArray.getFloat(index, d96Var.e));
                    c = 5;
                    break;
                case 69:
                    z86Var.a(69, typedArray.getFloat(index, 1.0f));
                    c = 5;
                    break;
                case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                    z86Var.a(70, typedArray.getFloat(index, 1.0f));
                    c = 5;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c = 5;
                    break;
                case 72:
                    z86Var.b(72, typedArray.getInt(index, b96Var.g0));
                    c = 5;
                    break;
                case 73:
                    z86Var.b(73, typedArray.getDimensionPixelSize(index, b96Var.h0));
                    c = 5;
                    break;
                case 74:
                    z86Var.c(74, typedArray.getString(index));
                    c = 5;
                    break;
                case 75:
                    z86Var.d(75, typedArray.getBoolean(index, b96Var.o0));
                    c = 5;
                    break;
                case 76:
                    z86Var.b(76, typedArray.getInt(index, c96Var.e));
                    c = 5;
                    break;
                case 77:
                    z86Var.c(77, typedArray.getString(index));
                    c = 5;
                    break;
                case 78:
                    z86Var.b(78, typedArray.getInt(index, d96Var.c));
                    c = 5;
                    break;
                case 79:
                    z86Var.a(79, typedArray.getFloat(index, c96Var.g));
                    c = 5;
                    break;
                case SlidingBehavior.WIDE_EXPANDED_PERCENTAGE /* 80 */:
                    z86Var.d(80, typedArray.getBoolean(index, b96Var.m0));
                    c = 5;
                    break;
                case 81:
                    z86Var.d(81, typedArray.getBoolean(index, b96Var.n0));
                    c = 5;
                    break;
                case 82:
                    z86Var.b(82, typedArray.getInteger(index, c96Var.c));
                    c = 5;
                    break;
                case 83:
                    z86Var.b(83, o(typedArray, index, e96Var.i));
                    c = 5;
                    break;
                case 84:
                    z86Var.b(84, typedArray.getInteger(index, c96Var.j));
                    c = 5;
                    break;
                case 85:
                    z86Var.a(85, typedArray.getFloat(index, c96Var.i));
                    c = 5;
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        c96Var.m = resourceId2;
                        z86Var.b(89, resourceId2);
                        if (c96Var.m != -1) {
                            c96Var.l = -2;
                            z86Var.b(88, -2);
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        c96Var.k = string;
                        z86Var.c(90, string);
                        if (c96Var.k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            c96Var.m = resourceId3;
                            z86Var.b(89, resourceId3);
                            c96Var.l = -2;
                            z86Var.b(88, -2);
                        } else {
                            c96Var.l = -1;
                            z86Var.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, c96Var.m);
                        c96Var.l = integer;
                        z86Var.b(88, integer);
                    }
                    c = 5;
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c = 5;
                    break;
                case 93:
                    z86Var.b(93, typedArray.getDimensionPixelSize(index, b96Var.M));
                    c = 5;
                    break;
                case 94:
                    z86Var.b(94, typedArray.getDimensionPixelSize(index, b96Var.T));
                    c = 5;
                    break;
                case 95:
                    p(z86Var, typedArray, index, 0);
                    c = 5;
                    break;
                case 96:
                    p(z86Var, typedArray, index, 1);
                    c = 5;
                    break;
                case 97:
                    z86Var.b(97, typedArray.getInt(index, b96Var.p0));
                    c = 5;
                    break;
                case 98:
                    if (rei.k1) {
                        int resourceId4 = typedArray.getResourceId(index, a96Var.a);
                        a96Var.a = resourceId4;
                        if (resourceId4 == -1) {
                            a96Var.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        a96Var.b = typedArray.getString(index);
                    } else {
                        a96Var.a = typedArray.getResourceId(index, a96Var.a);
                    }
                    c = 5;
                    break;
                case 99:
                    z86Var.d(99, typedArray.getBoolean(index, b96Var.h));
                    c = 5;
                    break;
            }
        }
    }

    public static String u(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return StringUtils.UNDEFINED;
        }
    }

    public final void a(rei reiVar) {
        a96 a96Var;
        int childCount = reiVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = reiVar.getChildAt(i2);
            int id = childAt.getId();
            Integer valueOf = Integer.valueOf(id);
            HashMap hashMap = this.g;
            if (!hashMap.containsKey(valueOf)) {
                Log.w("ConstraintSet", "id unknown " + irf.P(childAt));
            } else if (this.f && id == -1) {
                wvs.p("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (hashMap.containsKey(Integer.valueOf(id)) && (a96Var = (a96) hashMap.get(Integer.valueOf(id))) != null) {
                p86.e(childAt, a96Var.g);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.g;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + irf.P(childAt));
            } else {
                if (this.f && id == -1) {
                    wvs.p("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a96 a96Var = (a96) hashMap.get(Integer.valueOf(id));
                        if (a96Var != null) {
                            d96 d96Var = a96Var.c;
                            b96 b96Var = a96Var.e;
                            e96 e96Var = a96Var.f;
                            if (childAt instanceof Barrier) {
                                b96Var.i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(b96Var.g0);
                                barrier.setMargin(b96Var.h0);
                                barrier.setAllowsGoneWidget(b96Var.o0);
                                int[] iArr = b96Var.j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = b96Var.k0;
                                    if (str != null) {
                                        int[] i3 = i(barrier, str);
                                        b96Var.j0 = i3;
                                        barrier.setReferencedIds(i3);
                                    }
                                }
                            }
                            t86 t86Var = (t86) childAt.getLayoutParams();
                            t86Var.a();
                            a96Var.a(t86Var);
                            p86.e(childAt, a96Var.g);
                            childAt.setLayoutParams(t86Var);
                            if (d96Var.c == 0) {
                                childAt.setVisibility(d96Var.b);
                            }
                            childAt.setAlpha(d96Var.d);
                            childAt.setRotation(e96Var.b);
                            childAt.setRotationX(e96Var.c);
                            childAt.setRotationY(e96Var.d);
                            childAt.setScaleX(e96Var.e);
                            childAt.setScaleY(e96Var.f);
                            if (e96Var.i != -1) {
                                if (((View) childAt.getParent()).findViewById(e96Var.i) != null) {
                                    float bottom = (r5.getBottom() + r5.getTop()) / 2.0f;
                                    float right = (r5.getRight() + r5.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(e96Var.g)) {
                                    childAt.setPivotX(e96Var.g);
                                }
                                if (!Float.isNaN(e96Var.h)) {
                                    childAt.setPivotY(e96Var.h);
                                }
                            }
                            childAt.setTranslationX(e96Var.j);
                            childAt.setTranslationY(e96Var.k);
                            childAt.setTranslationZ(e96Var.l);
                            if (e96Var.m) {
                                childAt.setElevation(e96Var.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a96 a96Var2 = (a96) hashMap.get(num);
            if (a96Var2 != null) {
                b96 b96Var2 = a96Var2.e;
                if (b96Var2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = b96Var2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = b96Var2.k0;
                        if (str2 != null) {
                            int[] i4 = i(barrier2, str2);
                            b96Var2.j0 = i4;
                            barrier2.setReferencedIds(i4);
                        }
                    }
                    barrier2.setType(b96Var2.g0);
                    barrier2.setMargin(b96Var2.h0);
                    t86 generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.k();
                    a96Var2.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (b96Var2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    t86 generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    a96Var2.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof r86) {
                ((r86) childAt2).e(constraintLayout);
            }
        }
    }

    public final void e(int i2, int i3) {
        a96 a96Var;
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf) || (a96Var = (a96) hashMap.get(Integer.valueOf(i2))) == null) {
            return;
        }
        b96 b96Var = a96Var.e;
        switch (i3) {
            case 1:
                b96Var.j = -1;
                b96Var.i = -1;
                b96Var.G = -1;
                b96Var.N = Integer.MIN_VALUE;
                break;
            case 2:
                b96Var.l = -1;
                b96Var.k = -1;
                b96Var.H = -1;
                b96Var.P = Integer.MIN_VALUE;
                break;
            case 3:
                b96Var.n = -1;
                b96Var.m = -1;
                b96Var.I = 0;
                b96Var.O = Integer.MIN_VALUE;
                break;
            case 4:
                b96Var.o = -1;
                b96Var.p = -1;
                b96Var.J = 0;
                b96Var.Q = Integer.MIN_VALUE;
                break;
            case 5:
                b96Var.q = -1;
                b96Var.r = -1;
                b96Var.s = -1;
                b96Var.M = 0;
                b96Var.T = Integer.MIN_VALUE;
                break;
            case 6:
                b96Var.t = -1;
                b96Var.u = -1;
                b96Var.L = 0;
                b96Var.S = Integer.MIN_VALUE;
                break;
            case 7:
                b96Var.v = -1;
                b96Var.w = -1;
                b96Var.K = 0;
                b96Var.R = Integer.MIN_VALUE;
                break;
            case 8:
                b96Var.C = -1.0f;
                b96Var.B = -1;
                b96Var.A = -1;
                break;
            default:
                xq0.x("unknown constraint");
                break;
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int i2;
        HashMap hashMap;
        int i3;
        f96 f96Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = f96Var.g;
        hashMap2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            t86 t86Var = (t86) childAt.getLayoutParams();
            int id = childAt.getId();
            if (f96Var.f && id == -1) {
                wvs.p("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new a96());
            }
            a96 a96Var = (a96) hashMap2.get(Integer.valueOf(id));
            if (a96Var == null) {
                i2 = childCount;
                hashMap = hashMap2;
                i3 = i4;
            } else {
                d96 d96Var = a96Var.c;
                b96 b96Var = a96Var.e;
                e96 e96Var = a96Var.f;
                i2 = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i3 = i4;
                HashMap hashMap4 = f96Var.e;
                for (String str : hashMap4.keySet()) {
                    p86 p86Var = (p86) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new p86(p86Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new p86(p86Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder u = ouj.u(" Custom Attribute \"", str, "\" not found on ");
                        u.append(cls.getName());
                        Log.e("TransitionLayout", u.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder u2 = ouj.u(" Custom Attribute \"", str, "\" not found on ");
                        u2.append(cls.getName());
                        Log.e("TransitionLayout", u2.toString(), e3);
                    }
                    hashMap4 = hashMap5;
                }
                a96Var.g = hashMap3;
                a96Var.c(id, t86Var);
                d96Var.b = childAt.getVisibility();
                d96Var.d = childAt.getAlpha();
                e96Var.b = childAt.getRotation();
                e96Var.c = childAt.getRotationX();
                e96Var.d = childAt.getRotationY();
                e96Var.e = childAt.getScaleX();
                e96Var.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e96Var.g = pivotX;
                    e96Var.h = pivotY;
                }
                e96Var.j = childAt.getTranslationX();
                e96Var.k = childAt.getTranslationY();
                e96Var.l = childAt.getTranslationZ();
                if (e96Var.m) {
                    e96Var.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    b96Var.o0 = barrier.getAllowsGoneWidget();
                    b96Var.j0 = barrier.getReferencedIds();
                    b96Var.g0 = barrier.getType();
                    b96Var.h0 = barrier.getMargin();
                }
            }
            i4 = i3 + 1;
            f96Var = this;
            childCount = i2;
            hashMap2 = hashMap;
        }
    }

    public final void g(int i2, int i3, int i4, int i5) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a96());
        }
        a96 a96Var = (a96) hashMap.get(Integer.valueOf(i2));
        if (a96Var == null) {
            return;
        }
        b96 b96Var = a96Var.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b96Var.i = i4;
                    b96Var.j = -1;
                    return;
                } else if (i5 != 2) {
                    b6e.v(u(i5), " undefined", "left to ");
                    return;
                } else {
                    b96Var.j = i4;
                    b96Var.i = -1;
                    return;
                }
            case 2:
                if (i5 == 1) {
                    b96Var.k = i4;
                    b96Var.l = -1;
                    return;
                } else if (i5 != 2) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                } else {
                    b96Var.l = i4;
                    b96Var.k = -1;
                    return;
                }
            case 3:
                if (i5 == 3) {
                    b96Var.m = i4;
                    b96Var.n = -1;
                    b96Var.q = -1;
                    b96Var.r = -1;
                    b96Var.s = -1;
                    return;
                }
                if (i5 != 4) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                }
                b96Var.n = i4;
                b96Var.m = -1;
                b96Var.q = -1;
                b96Var.r = -1;
                b96Var.s = -1;
                return;
            case 4:
                if (i5 == 4) {
                    b96Var.p = i4;
                    b96Var.o = -1;
                    b96Var.q = -1;
                    b96Var.r = -1;
                    b96Var.s = -1;
                    return;
                }
                if (i5 != 3) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                }
                b96Var.o = i4;
                b96Var.p = -1;
                b96Var.q = -1;
                b96Var.r = -1;
                b96Var.s = -1;
                return;
            case 5:
                if (i5 == 5) {
                    b96Var.q = i4;
                    b96Var.p = -1;
                    b96Var.o = -1;
                    b96Var.m = -1;
                    b96Var.n = -1;
                    return;
                }
                if (i5 == 3) {
                    b96Var.r = i4;
                    b96Var.p = -1;
                    b96Var.o = -1;
                    b96Var.m = -1;
                    b96Var.n = -1;
                    return;
                }
                if (i5 != 4) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                }
                b96Var.s = i4;
                b96Var.p = -1;
                b96Var.o = -1;
                b96Var.m = -1;
                b96Var.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    b96Var.u = i4;
                    b96Var.t = -1;
                    return;
                } else if (i5 != 7) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                } else {
                    b96Var.t = i4;
                    b96Var.u = -1;
                    return;
                }
            case 7:
                if (i5 == 7) {
                    b96Var.w = i4;
                    b96Var.v = -1;
                    return;
                } else if (i5 != 6) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                } else {
                    b96Var.v = i4;
                    b96Var.w = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(u(i3) + " to " + u(i5) + " unknown");
        }
    }

    public final void h(int i2, int i3, int i4, int i5, int i6) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a96());
        }
        a96 a96Var = (a96) hashMap.get(Integer.valueOf(i2));
        if (a96Var == null) {
            return;
        }
        b96 b96Var = a96Var.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b96Var.i = i4;
                    b96Var.j = -1;
                } else if (i5 != 2) {
                    b6e.v(u(i5), " undefined", "Left to ");
                    return;
                } else {
                    b96Var.j = i4;
                    b96Var.i = -1;
                }
                b96Var.G = i6;
                return;
            case 2:
                if (i5 == 1) {
                    b96Var.k = i4;
                    b96Var.l = -1;
                } else if (i5 != 2) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                } else {
                    b96Var.l = i4;
                    b96Var.k = -1;
                }
                b96Var.H = i6;
                return;
            case 3:
                if (i5 == 3) {
                    b96Var.m = i4;
                    b96Var.n = -1;
                    b96Var.q = -1;
                    b96Var.r = -1;
                    b96Var.s = -1;
                } else {
                    if (i5 != 4) {
                        b6e.v(u(i5), " undefined", "right to ");
                        return;
                    }
                    b96Var.n = i4;
                    b96Var.m = -1;
                    b96Var.q = -1;
                    b96Var.r = -1;
                    b96Var.s = -1;
                }
                b96Var.I = i6;
                return;
            case 4:
                if (i5 == 4) {
                    b96Var.p = i4;
                    b96Var.o = -1;
                    b96Var.q = -1;
                    b96Var.r = -1;
                    b96Var.s = -1;
                } else {
                    if (i5 != 3) {
                        b6e.v(u(i5), " undefined", "right to ");
                        return;
                    }
                    b96Var.o = i4;
                    b96Var.p = -1;
                    b96Var.q = -1;
                    b96Var.r = -1;
                    b96Var.s = -1;
                }
                b96Var.J = i6;
                return;
            case 5:
                if (i5 == 5) {
                    b96Var.q = i4;
                    b96Var.p = -1;
                    b96Var.o = -1;
                    b96Var.m = -1;
                    b96Var.n = -1;
                    return;
                }
                if (i5 == 3) {
                    b96Var.r = i4;
                    b96Var.p = -1;
                    b96Var.o = -1;
                    b96Var.m = -1;
                    b96Var.n = -1;
                    return;
                }
                if (i5 != 4) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                }
                b96Var.s = i4;
                b96Var.p = -1;
                b96Var.o = -1;
                b96Var.m = -1;
                b96Var.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    b96Var.u = i4;
                    b96Var.t = -1;
                } else if (i5 != 7) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                } else {
                    b96Var.t = i4;
                    b96Var.u = -1;
                }
                b96Var.L = i6;
                return;
            case 7:
                if (i5 == 7) {
                    b96Var.w = i4;
                    b96Var.v = -1;
                } else if (i5 != 6) {
                    b6e.v(u(i5), " undefined", "right to ");
                    return;
                } else {
                    b96Var.v = i4;
                    b96Var.w = -1;
                }
                b96Var.K = i6;
                return;
            default:
                throw new IllegalArgumentException(u(i3) + " to " + u(i5) + " unknown");
        }
    }

    public final a96 k(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a96());
        }
        return (a96) hashMap.get(Integer.valueOf(i2));
    }

    public final a96 l(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (hashMap.containsKey(valueOf)) {
            return (a96) hashMap.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void m(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a96 j2 = j(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        j2.e.a = true;
                    }
                    this.g.put(Integer.valueOf(j2.a), j2);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01af, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            a96 a96Var = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (a96Var == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                a96Var.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            }
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (a96Var == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                a96Var.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            }
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                a96Var = j(context, Xml.asAttributeSet(xmlResourceParser), true);
                                break;
                            } else {
                                continue;
                            }
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (a96Var == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                a96Var.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            }
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (a96Var == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                a96Var.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            }
                        case -71750448:
                            if (name.equals("Guideline")) {
                                a96Var = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                                b96 b96Var = a96Var.e;
                                b96Var.a = true;
                                b96Var.b = true;
                                break;
                            } else {
                                continue;
                            }
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (name.equals("Barrier")) {
                                a96Var = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                                a96Var.e.i0 = 1;
                                break;
                            } else {
                                continue;
                            }
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                break;
                            } else {
                                continue;
                            }
                        case 1803088381:
                            if (name.equals("Constraint")) {
                                a96Var = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                                break;
                            } else {
                                continue;
                            }
                    }
                    if (a96Var == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    p86.d(context, xmlResourceParser, a96Var.g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                                break;
                            } else {
                                break;
                            }
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                                break;
                            } else {
                                break;
                            }
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                                return;
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                    this.g.put(Integer.valueOf(a96Var.a), a96Var);
                    a96Var = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }

    public final void s(int i2, int i3, int i4) {
        a96 k = k(i2);
        switch (i3) {
            case 1:
                k.e.G = i4;
                break;
            case 2:
                k.e.H = i4;
                break;
            case 3:
                k.e.I = i4;
                break;
            case 4:
                k.e.J = i4;
                break;
            case 5:
                k.e.M = i4;
                break;
            case 6:
                k.e.L = i4;
                break;
            case 7:
                k.e.K = i4;
                break;
            default:
                xq0.x("unknown constraint");
                break;
        }
    }

    public final void t(int i2, int i3) {
        k(i2).c.b = i3;
    }
}
