package com.gamericefishpro.space.n3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
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
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
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
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(a aVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = r.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.F;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.F.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static j d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        j jVar = new j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? s.c : s.a);
        m mVar = jVar.b;
        n nVar = jVar.e;
        l lVar = jVar.c;
        k kVar = jVar.d;
        int[] iArr = d;
        String[] strArr = com.gamericefishpro.space.j3.a.a;
        SparseIntArray sparseIntArray = e;
        if (z) {
            i iVar = new i();
            iVar.a = new int[10];
            iVar.b = new int[10];
            iVar.c = 0;
            iVar.d = new int[10];
            iVar.e = new float[10];
            iVar.f = 0;
            iVar.g = new int[5];
            iVar.h = new String[5];
            iVar.i = 0;
            iVar.j = new int[4];
            iVar.k = new boolean[4];
            iVar.l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        iVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.H));
                        continue;
                        i3 = i4 + 1;
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
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        i2 = indexCount;
                        iVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = indexCount;
                        iVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.B));
                        break;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        i2 = indexCount;
                        iVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.C));
                        break;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        i2 = indexCount;
                        iVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.I));
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        i2 = indexCount;
                        iVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.O));
                        break;
                    case 12:
                        i2 = indexCount;
                        iVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.P));
                        break;
                    case 13:
                        i2 = indexCount;
                        iVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.L));
                        break;
                    case 14:
                        i2 = indexCount;
                        iVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.N));
                        break;
                    case 15:
                        i2 = indexCount;
                        iVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Q));
                        break;
                    case 16:
                        i2 = indexCount;
                        iVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.M));
                        break;
                    case 17:
                        i2 = indexCount;
                        iVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        iVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        iVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, kVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        iVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, kVar.v));
                        break;
                    case 21:
                        i2 = indexCount;
                        iVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        iVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, mVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        iVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        iVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.E));
                        break;
                    case 27:
                        i2 = indexCount;
                        iVar.b(27, typedArrayObtainStyledAttributes.getInt(index, kVar.D));
                        break;
                    case 28:
                        i2 = indexCount;
                        iVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.F));
                        break;
                    case 31:
                        i2 = indexCount;
                        iVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.J));
                        break;
                    case 34:
                        i2 = indexCount;
                        iVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.G));
                        break;
                    case 37:
                        i2 = indexCount;
                        iVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, kVar.w));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, jVar.a);
                        jVar.a = resourceId;
                        iVar.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        iVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, kVar.T));
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        i2 = indexCount;
                        iVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, kVar.S));
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        i2 = indexCount;
                        iVar.b(41, typedArrayObtainStyledAttributes.getInt(index, kVar.U));
                        break;
                    case 42:
                        i2 = indexCount;
                        iVar.b(42, typedArrayObtainStyledAttributes.getInt(index, kVar.V));
                        break;
                    case 43:
                        i2 = indexCount;
                        iVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, mVar.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        iVar.d(44, true);
                        iVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, nVar.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        iVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, nVar.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        iVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, nVar.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        iVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, nVar.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        iVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, nVar.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        iVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, nVar.f));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i2 = indexCount;
                        iVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, nVar.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        iVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, nVar.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        iVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, nVar.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        iVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, nVar.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        iVar.b(54, typedArrayObtainStyledAttributes.getInt(index, kVar.W));
                        break;
                    case 55:
                        i2 = indexCount;
                        iVar.b(55, typedArrayObtainStyledAttributes.getInt(index, kVar.X));
                        break;
                    case 56:
                        i2 = indexCount;
                        iVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Y));
                        break;
                    case 57:
                        i2 = indexCount;
                        iVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Z));
                        break;
                    case 58:
                        i2 = indexCount;
                        iVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.a0));
                        break;
                    case 59:
                        i2 = indexCount;
                        iVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.b0));
                        break;
                    case 60:
                        i2 = indexCount;
                        iVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, nVar.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        iVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.z));
                        break;
                    case 63:
                        i2 = indexCount;
                        iVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, kVar.A));
                        break;
                    case 64:
                        i2 = indexCount;
                        iVar.b(64, f(typedArrayObtainStyledAttributes, index, lVar.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            iVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            iVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        iVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        iVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, lVar.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        iVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, mVar.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        iVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        iVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        iVar.b(72, typedArrayObtainStyledAttributes.getInt(index, kVar.e0));
                        break;
                    case 73:
                        i2 = indexCount;
                        iVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f0));
                        break;
                    case 74:
                        i2 = indexCount;
                        iVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        iVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, kVar.m0));
                        break;
                    case 76:
                        i2 = indexCount;
                        iVar.b(76, typedArrayObtainStyledAttributes.getInt(index, lVar.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        iVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        iVar.b(78, typedArrayObtainStyledAttributes.getInt(index, mVar.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        iVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, lVar.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        iVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, kVar.k0));
                        break;
                    case 81:
                        i2 = indexCount;
                        iVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, kVar.l0));
                        break;
                    case 82:
                        i2 = indexCount;
                        iVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, lVar.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        iVar.b(83, f(typedArrayObtainStyledAttributes, index, nVar.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        iVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, lVar.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        iVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, lVar.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            lVar.i = resourceId2;
                            iVar.b(89, resourceId2);
                            if (lVar.i != -1) {
                                iVar.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            lVar.h = string;
                            iVar.c(90, string);
                            if (lVar.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                lVar.i = resourceId3;
                                iVar.b(89, resourceId3);
                                iVar.b(88, -2);
                            } else {
                                iVar.b(88, -1);
                            }
                        } else {
                            iVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, lVar.i));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        iVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.K));
                        break;
                    case 94:
                        i2 = indexCount;
                        iVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.R));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        iVar.b(97, typedArrayObtainStyledAttributes.getInt(index, kVar.n0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = com.gamericefishpro.space.m3.a.L;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            jVar.a = typedArrayObtainStyledAttributes.getResourceId(index, jVar.a);
                        }
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        lVar.getClass();
                        kVar.getClass();
                        nVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        kVar.o = f(typedArrayObtainStyledAttributes, index2, kVar.o);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        kVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.H);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        kVar.n = f(typedArrayObtainStyledAttributes, index2, kVar.n);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        kVar.m = f(typedArrayObtainStyledAttributes, index2, kVar.m);
                        continue;
                        i7++;
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        i = indexCount2;
                        kVar.x = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = indexCount2;
                        kVar.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.B);
                        continue;
                        i7++;
                        break;
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = indexCount2;
                        kVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.C);
                        continue;
                        i7++;
                        break;
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        i = indexCount2;
                        kVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.I);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        kVar.u = f(typedArrayObtainStyledAttributes, index2, kVar.u);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        kVar.t = f(typedArrayObtainStyledAttributes, index2, kVar.t);
                        continue;
                        i7++;
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        i = indexCount2;
                        kVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.O);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        kVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.P);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        kVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.L);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        kVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.N);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        kVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Q);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        kVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.M);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        kVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        kVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.e);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        kVar.f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        kVar.v = typedArrayObtainStyledAttributes.getFloat(index2, kVar.v);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        kVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, mVar.a);
                        mVar.a = i8;
                        mVar.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        kVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        kVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.E);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        kVar.g = f(typedArrayObtainStyledAttributes, index2, kVar.g);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        kVar.h = f(typedArrayObtainStyledAttributes, index2, kVar.h);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        kVar.D = typedArrayObtainStyledAttributes.getInt(index2, kVar.D);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        kVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.F);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        kVar.i = f(typedArrayObtainStyledAttributes, index2, kVar.i);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        kVar.j = f(typedArrayObtainStyledAttributes, index2, kVar.j);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        kVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.J);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        kVar.r = f(typedArrayObtainStyledAttributes, index2, kVar.r);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        kVar.s = f(typedArrayObtainStyledAttributes, index2, kVar.s);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        kVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.G);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        kVar.l = f(typedArrayObtainStyledAttributes, index2, kVar.l);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        kVar.k = f(typedArrayObtainStyledAttributes, index2, kVar.k);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        kVar.w = typedArrayObtainStyledAttributes.getFloat(index2, kVar.w);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        jVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, jVar.a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        kVar.T = typedArrayObtainStyledAttributes.getFloat(index2, kVar.T);
                        continue;
                        i7++;
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        i = indexCount2;
                        kVar.S = typedArrayObtainStyledAttributes.getFloat(index2, kVar.S);
                        continue;
                        i7++;
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        i = indexCount2;
                        kVar.U = typedArrayObtainStyledAttributes.getInt(index2, kVar.U);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        kVar.V = typedArrayObtainStyledAttributes.getInt(index2, kVar.V);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        mVar.c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        nVar.l = true;
                        nVar.m = typedArrayObtainStyledAttributes.getDimension(index2, nVar.m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        nVar.b = typedArrayObtainStyledAttributes.getFloat(index2, nVar.b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        nVar.c = typedArrayObtainStyledAttributes.getFloat(index2, nVar.c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        nVar.d = typedArrayObtainStyledAttributes.getFloat(index2, nVar.d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        nVar.e = typedArrayObtainStyledAttributes.getFloat(index2, nVar.e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        nVar.f = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f);
                        continue;
                        i7++;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i = indexCount2;
                        nVar.g = typedArrayObtainStyledAttributes.getDimension(index2, nVar.g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        nVar.i = typedArrayObtainStyledAttributes.getDimension(index2, nVar.i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        nVar.j = typedArrayObtainStyledAttributes.getDimension(index2, nVar.j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        nVar.k = typedArrayObtainStyledAttributes.getDimension(index2, nVar.k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        kVar.W = typedArrayObtainStyledAttributes.getInt(index2, kVar.W);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        kVar.X = typedArrayObtainStyledAttributes.getInt(index2, kVar.X);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        kVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Y);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        kVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Z);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        kVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.a0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        kVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.b0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        nVar.a = typedArrayObtainStyledAttributes.getFloat(index2, nVar.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        kVar.y = f(typedArrayObtainStyledAttributes, index2, kVar.y);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        kVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.z);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        kVar.A = typedArrayObtainStyledAttributes.getFloat(index2, kVar.A);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        lVar.a = f(typedArrayObtainStyledAttributes, index2, lVar.a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            lVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        lVar.e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        mVar.d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        kVar.c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        kVar.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        kVar.e0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.e0);
                        break;
                    case 73:
                        i = indexCount2;
                        kVar.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f0);
                        break;
                    case 74:
                        i = indexCount2;
                        kVar.i0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        kVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.m0);
                        break;
                    case 76:
                        i = indexCount2;
                        lVar.c = typedArrayObtainStyledAttributes.getInt(index2, lVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        kVar.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        mVar.b = typedArrayObtainStyledAttributes.getInt(index2, mVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        lVar.d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        kVar.k0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.k0);
                        break;
                    case 81:
                        i = indexCount2;
                        kVar.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.l0);
                        break;
                    case 82:
                        i = indexCount2;
                        lVar.b = typedArrayObtainStyledAttributes.getInteger(index2, lVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        nVar.h = f(typedArrayObtainStyledAttributes, index2, nVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        lVar.g = typedArrayObtainStyledAttributes.getInteger(index2, lVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        lVar.f = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            lVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            lVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, lVar.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        kVar.p = f(typedArrayObtainStyledAttributes, index2, kVar.p);
                        break;
                    case 92:
                        i = indexCount2;
                        kVar.q = f(typedArrayObtainStyledAttributes, index2, kVar.q);
                        break;
                    case 93:
                        i = indexCount2;
                        kVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.K);
                        break;
                    case 94:
                        i = indexCount2;
                        kVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.R);
                        break;
                    case 95:
                        i = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        kVar.n0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.n0);
                        break;
                }
                i7++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return jVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        i iVar;
        k kVar;
        e eVar;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof e) {
                    eVar = (e) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = i4;
                        eVar.V = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).height = i4;
                        eVar.W = z;
                        return;
                    }
                }
                if (obj instanceof k) {
                    kVar = (k) obj;
                    if (i2 == 0) {
                        kVar.b = i4;
                        kVar.k0 = z;
                        return;
                    } else {
                        kVar.c = i4;
                        kVar.l0 = z;
                        return;
                    }
                }
                if (obj instanceof i) {
                    iVar = (i) obj;
                    if (i2 == 0) {
                        iVar.b(23, i4);
                        iVar.d(80, z);
                        return;
                    } else {
                        iVar.b(21, i4);
                        iVar.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof e) {
                eVar = (e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).width = i4;
                    eVar.V = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar).height = i4;
                    eVar.W = z;
                    return;
                }
            }
            if (obj instanceof k) {
                kVar = (k) obj;
                if (i2 == 0) {
                    kVar.b = i4;
                    kVar.k0 = z;
                    return;
                } else {
                    kVar.c = i4;
                    kVar.l0 = z;
                    return;
                }
            }
            if (obj instanceof i) {
                iVar = (i) obj;
                if (i2 == 0) {
                    iVar.b(23, i4);
                    iVar.d(80, z);
                    return;
                } else {
                    iVar.b(21, i4);
                    iVar.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof e) {
                    e eVar2 = (e) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                    }
                    h(eVar2, strTrim2);
                    return;
                }
                if (obj instanceof k) {
                    ((k) obj).x = strTrim2;
                    return;
                } else {
                    if (obj instanceof i) {
                        ((i) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof e) {
                        e eVar3 = (e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                            eVar3.G = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                            eVar3.H = f2;
                            return;
                        }
                    }
                    if (obj instanceof k) {
                        k kVar2 = (k) obj;
                        if (i2 == 0) {
                            kVar2.b = 0;
                            kVar2.T = f2;
                            return;
                        } else {
                            kVar2.c = 0;
                            kVar2.S = f2;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar2 = (i) obj;
                        if (i2 == 0) {
                            iVar2.b(23, 0);
                            iVar2.a(39, f2);
                            return;
                        } else {
                            iVar2.b(21, 0);
                            iVar2.a(40, f2);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof e) {
                        e eVar4 = (e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar4).width = 0;
                            eVar4.Q = fMax;
                            eVar4.K = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar4).height = 0;
                            eVar4.R = fMax;
                            eVar4.L = 2;
                            return;
                        }
                    }
                    if (obj instanceof k) {
                        k kVar3 = (k) obj;
                        if (i2 == 0) {
                            kVar3.b = 0;
                            kVar3.c0 = fMax;
                            kVar3.W = 2;
                            return;
                        } else {
                            kVar3.c = 0;
                            kVar3.d0 = fMax;
                            kVar3.X = 2;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar3 = (i) obj;
                        if (i2 == 0) {
                            iVar3.b(23, 0);
                            iVar3.b(54, 2);
                        } else {
                            iVar3.b(21, 0);
                            iVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.F = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = oVar.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (oVar.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map2.containsKey(Integer.valueOf(id))) {
                    hashSet2.remove(Integer.valueOf(id));
                    j jVar = (j) map2.get(Integer.valueOf(id));
                    if (jVar != null) {
                        m mVar = jVar.b;
                        k kVar = jVar.d;
                        n nVar = jVar.e;
                        if (childAt instanceof a) {
                            kVar.g0 = 1;
                            a aVar = (a) childAt;
                            aVar.setId(id);
                            aVar.setType(kVar.e0);
                            aVar.setMargin(kVar.f0);
                            aVar.setAllowsGoneWidget(kVar.m0);
                            int[] iArr = kVar.h0;
                            if (iArr != null) {
                                aVar.setReferencedIds(iArr);
                            } else {
                                String str = kVar.i0;
                                if (str != null) {
                                    int[] iArrC = c(aVar, str);
                                    kVar.h0 = iArrC;
                                    aVar.setReferencedIds(iArrC);
                                }
                            }
                        }
                        e eVar = (e) childAt.getLayoutParams();
                        eVar.a();
                        jVar.a(eVar);
                        HashMap map3 = jVar.f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map3.keySet()) {
                            b bVar = (b) map3.get(str2);
                            HashSet hashSet3 = hashSet2;
                            String strU = !bVar.a ? com.gamericefishpro.space.m5.a.u("set", str2) : str2;
                            int i3 = i2;
                            try {
                                int iB = com.gamericefishpro.space.i3.e.b(bVar.b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (iB) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        map = map3;
                                        cls.getMethod(strU, cls3).invoke(childAt, Integer.valueOf(bVar.c));
                                        break;
                                    case 1:
                                        map = map3;
                                        cls.getMethod(strU, cls2).invoke(childAt, Float.valueOf(bVar.d));
                                        break;
                                    case 2:
                                        map = map3;
                                        cls.getMethod(strU, cls3).invoke(childAt, Integer.valueOf(bVar.g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strU, Drawable.class);
                                        map = map3;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar.g);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e2) {
                                            e = e2;
                                            StringBuilder sbL = com.gamericefishpro.space.m5.a.l(" Custom Attribute \"", str2, "\" not found on ");
                                            sbL.append(cls.getName());
                                            Log.e("TransitionLayout", sbL.toString());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strU);
                                        } catch (InvocationTargetException e4) {
                                            e = e4;
                                            StringBuilder sbL2 = com.gamericefishpro.space.m5.a.l(" Custom Attribute \"", str2, "\" not found on ");
                                            sbL2.append(cls.getName());
                                            Log.e("TransitionLayout", sbL2.toString());
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 4:
                                        cls.getMethod(strU, CharSequence.class).invoke(childAt, bVar.e);
                                        map = map3;
                                        break;
                                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                        cls.getMethod(strU, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f));
                                        map = map3;
                                        break;
                                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                        cls.getMethod(strU, cls2).invoke(childAt, Float.valueOf(bVar.d));
                                        map = map3;
                                        break;
                                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                        cls.getMethod(strU, cls3).invoke(childAt, Integer.valueOf(bVar.c));
                                        map = map3;
                                        break;
                                    default:
                                        map = map3;
                                        break;
                                }
                            } catch (IllegalAccessException e5) {
                                e = e5;
                                map = map3;
                            } catch (NoSuchMethodException e6) {
                                e = e6;
                                map = map3;
                            } catch (InvocationTargetException e7) {
                                e = e7;
                                map = map3;
                            }
                            hashSet2 = hashSet3;
                            i2 = i3;
                            map3 = map;
                        }
                        hashSet = hashSet2;
                        i = i2;
                        childAt.setLayoutParams(eVar);
                        if (mVar.b == 0) {
                            childAt.setVisibility(mVar.a);
                        }
                        childAt.setAlpha(mVar.c);
                        childAt.setRotation(nVar.a);
                        childAt.setRotationX(nVar.b);
                        childAt.setRotationY(nVar.c);
                        childAt.setScaleX(nVar.d);
                        childAt.setScaleY(nVar.e);
                        if (nVar.h != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(nVar.h);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(nVar.f)) {
                                childAt.setPivotX(nVar.f);
                            }
                            if (!Float.isNaN(nVar.g)) {
                                childAt.setPivotY(nVar.g);
                            }
                        }
                        childAt.setTranslationX(nVar.i);
                        childAt.setTranslationY(nVar.j);
                        childAt.setTranslationZ(nVar.k);
                        if (nVar.l) {
                            childAt.setElevation(nVar.m);
                        }
                    }
                }
                i2 = i + 1;
                oVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            oVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            j jVar2 = (j) map2.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.d;
                if (kVar2.g0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.d = new int[32];
                    aVar2.z = new HashMap();
                    aVar2.i = context;
                    com.gamericefishpro.space.k3.a aVar3 = new com.gamericefishpro.space.k3.a();
                    aVar3.r0 = 0;
                    aVar3.s0 = true;
                    aVar3.t0 = 0;
                    aVar3.u0 = false;
                    aVar2.C = aVar3;
                    aVar2.v = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = kVar2.h0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = kVar2.i0;
                        if (str3 != null) {
                            int[] iArrC2 = c(aVar2, str3);
                            kVar2.h0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(kVar2.e0);
                    aVar2.setMargin(kVar2.f0);
                    e eVarD = ConstraintLayout.d();
                    aVar2.i();
                    jVar2.a(eVarD);
                    constraintLayout.addView(aVar2, eVarD);
                }
                if (kVar2.a) {
                    View qVar = new q(constraintLayout.getContext());
                    qVar.setId(num.intValue());
                    e eVarD2 = ConstraintLayout.d();
                    jVar2.a(eVarD2);
                    constraintLayout.addView(qVar, eVarD2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = oVar.c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) map3.get(Integer.valueOf(id));
            if (jVar == null) {
                i = childCount;
                map = map3;
            } else {
                m mVar = jVar.b;
                k kVar = jVar.d;
                n nVar = jVar.e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = oVar.a;
                for (String str : map5.keySet()) {
                    b bVar = (b) map5.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        map2 = map3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                jVar.f = map4;
                jVar.a = id;
                kVar.g = eVar.d;
                kVar.h = eVar.e;
                kVar.i = eVar.f;
                kVar.j = eVar.g;
                kVar.k = eVar.h;
                kVar.l = eVar.i;
                kVar.m = eVar.j;
                kVar.n = eVar.k;
                kVar.o = eVar.l;
                kVar.p = eVar.m;
                kVar.q = eVar.n;
                kVar.r = eVar.r;
                kVar.s = eVar.s;
                kVar.t = eVar.t;
                kVar.u = eVar.u;
                kVar.v = eVar.D;
                kVar.w = eVar.E;
                kVar.x = eVar.F;
                kVar.y = eVar.o;
                kVar.z = eVar.p;
                kVar.A = eVar.q;
                kVar.B = eVar.S;
                kVar.C = eVar.T;
                kVar.D = eVar.U;
                kVar.f = eVar.c;
                kVar.d = eVar.a;
                kVar.e = eVar.b;
                kVar.b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.E = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.F = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.G = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.H = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.K = eVar.C;
                kVar.S = eVar.H;
                kVar.T = eVar.G;
                kVar.V = eVar.J;
                kVar.U = eVar.I;
                kVar.k0 = eVar.V;
                kVar.l0 = eVar.W;
                kVar.W = eVar.K;
                kVar.X = eVar.L;
                kVar.Y = eVar.O;
                kVar.Z = eVar.P;
                kVar.a0 = eVar.M;
                kVar.b0 = eVar.N;
                kVar.c0 = eVar.Q;
                kVar.d0 = eVar.R;
                kVar.j0 = eVar.X;
                kVar.M = eVar.w;
                kVar.O = eVar.y;
                kVar.L = eVar.v;
                kVar.N = eVar.x;
                kVar.Q = eVar.z;
                kVar.P = eVar.A;
                kVar.R = eVar.B;
                kVar.n0 = eVar.Y;
                kVar.I = eVar.getMarginEnd();
                kVar.J = eVar.getMarginStart();
                mVar.a = childAt.getVisibility();
                mVar.c = childAt.getAlpha();
                nVar.a = childAt.getRotation();
                nVar.b = childAt.getRotationX();
                nVar.c = childAt.getRotationY();
                nVar.d = childAt.getScaleX();
                nVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f = pivotX;
                    nVar.g = pivotY;
                }
                nVar.i = childAt.getTranslationX();
                nVar.j = childAt.getTranslationY();
                nVar.k = childAt.getTranslationZ();
                if (nVar.l) {
                    nVar.m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.m0 = aVar.getAllowsGoneWidget();
                    kVar.h0 = aVar.getReferencedIds();
                    kVar.e0 = aVar.getType();
                    kVar.f0 = aVar.getMargin();
                }
            }
            i2++;
            oVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    j jVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        jVarD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(jVarD.a), jVarD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
