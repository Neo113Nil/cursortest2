package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s8 {
    public static final int[] MdtA4re8 = {0, 4, 8};
    public static final SparseIntArray VgvYg0wo;
    public static final SparseIntArray wxUZMvaN;
    public final HashMap qoPGr6Ce = new HashMap();
    public final HashMap NCTxEWno = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        wxUZMvaN = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        VgvYg0wo = sparseIntArray2;
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
        sparseIntArray.append(116, 82);
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

    public static n8 MdtA4re8(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        n8 n8Var = new n8();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? r00.MdtA4re8 : r00.qoPGr6Ce);
        String[] strArr = w30.wxUZMvaN;
        q8 q8Var = n8Var.NCTxEWno;
        r8 r8Var = n8Var.VgvYg0wo;
        p8 p8Var = n8Var.MdtA4re8;
        o8 o8Var = n8Var.wxUZMvaN;
        int[] iArr = MdtA4re8;
        SparseIntArray sparseIntArray = wxUZMvaN;
        if (z) {
            m8 m8Var = new m8();
            m8Var.qoPGr6Ce = new int[10];
            m8Var.NCTxEWno = new int[10];
            m8Var.MdtA4re8 = 0;
            m8Var.wxUZMvaN = new int[10];
            m8Var.VgvYg0wo = new float[10];
            m8Var.P7K7Inc8 = 0;
            m8Var.b2ZJblxo = new int[5];
            m8Var.Qr9iLBAD = new String[5];
            m8Var.jb9XjC4I = 0;
            m8Var.eVhOlqcC = new int[4];
            m8Var.k3x7lurq = new boolean[4];
            m8Var.ow5vqvCr = 0;
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (VgvYg0wo.get(index)) {
                    case 2:
                        i2 = indexCount;
                        m8Var.NCTxEWno(2, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.pRiPUEwG));
                        continue;
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
                    case 5:
                        i2 = indexCount;
                        m8Var.wxUZMvaN(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i2 = indexCount;
                        m8Var.NCTxEWno(6, obtainStyledAttributes.getDimensionPixelOffset(index, o8Var.i7xS8jrb));
                        break;
                    case 7:
                        i2 = indexCount;
                        m8Var.NCTxEWno(7, obtainStyledAttributes.getDimensionPixelOffset(index, o8Var.Mq3SeTnW));
                        break;
                    case 8:
                        i2 = indexCount;
                        m8Var.NCTxEWno(8, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.VhgXwMj9));
                        break;
                    case 11:
                        i2 = indexCount;
                        m8Var.NCTxEWno(11, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.FXJmAAN1));
                        break;
                    case 12:
                        i2 = indexCount;
                        m8Var.NCTxEWno(12, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.nSmgoSB5));
                        break;
                    case 13:
                        i2 = indexCount;
                        m8Var.NCTxEWno(13, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.fVMzMhyS));
                        break;
                    case 14:
                        i2 = indexCount;
                        m8Var.NCTxEWno(14, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.zCflySGU));
                        break;
                    case 15:
                        i2 = indexCount;
                        m8Var.NCTxEWno(15, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.N8VPGzVC));
                        break;
                    case 16:
                        i2 = indexCount;
                        m8Var.NCTxEWno(16, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.hzgxAD8d));
                        break;
                    case 17:
                        i2 = indexCount;
                        m8Var.NCTxEWno(17, obtainStyledAttributes.getDimensionPixelOffset(index, o8Var.wxUZMvaN));
                        break;
                    case 18:
                        i2 = indexCount;
                        m8Var.NCTxEWno(18, obtainStyledAttributes.getDimensionPixelOffset(index, o8Var.VgvYg0wo));
                        break;
                    case 19:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(19, obtainStyledAttributes.getFloat(index, o8Var.P7K7Inc8));
                        break;
                    case 20:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(20, obtainStyledAttributes.getFloat(index, o8Var.FySoLYna));
                        break;
                    case 21:
                        i2 = indexCount;
                        m8Var.NCTxEWno(21, obtainStyledAttributes.getLayoutDimension(index, o8Var.MdtA4re8));
                        break;
                    case 22:
                        i2 = indexCount;
                        m8Var.NCTxEWno(22, iArr[obtainStyledAttributes.getInt(index, q8Var.qoPGr6Ce)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        m8Var.NCTxEWno(23, obtainStyledAttributes.getLayoutDimension(index, o8Var.NCTxEWno));
                        break;
                    case 24:
                        i2 = indexCount;
                        m8Var.NCTxEWno(24, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.SgZGMMPL));
                        break;
                    case 27:
                        i2 = indexCount;
                        m8Var.NCTxEWno(27, obtainStyledAttributes.getInt(index, o8Var.euDDoUNr));
                        break;
                    case 28:
                        i2 = indexCount;
                        m8Var.NCTxEWno(28, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.ytu5o6f4));
                        break;
                    case 31:
                        i2 = indexCount;
                        m8Var.NCTxEWno(31, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.aZz0PFXp));
                        break;
                    case 34:
                        i2 = indexCount;
                        m8Var.NCTxEWno(34, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.eIA6dogk));
                        break;
                    case 37:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(37, obtainStyledAttributes.getFloat(index, o8Var.gjV1z5T1));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, n8Var.qoPGr6Ce);
                        n8Var.qoPGr6Ce = resourceId;
                        m8Var.NCTxEWno(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(39, obtainStyledAttributes.getFloat(index, o8Var.bvfAo0eO));
                        break;
                    case 40:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(40, obtainStyledAttributes.getFloat(index, o8Var.ZyZthT5G));
                        break;
                    case 41:
                        i2 = indexCount;
                        m8Var.NCTxEWno(41, obtainStyledAttributes.getInt(index, o8Var.KRabZ4CU));
                        break;
                    case 42:
                        i2 = indexCount;
                        m8Var.NCTxEWno(42, obtainStyledAttributes.getInt(index, o8Var.gmkaJpmS));
                        break;
                    case 43:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(43, obtainStyledAttributes.getFloat(index, q8Var.MdtA4re8));
                        break;
                    case 44:
                        i2 = indexCount;
                        m8Var.MdtA4re8(44, true);
                        m8Var.qoPGr6Ce(44, obtainStyledAttributes.getDimension(index, r8Var.OnDfzHZD));
                        break;
                    case 45:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(45, obtainStyledAttributes.getFloat(index, r8Var.NCTxEWno));
                        break;
                    case 46:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(46, obtainStyledAttributes.getFloat(index, r8Var.MdtA4re8));
                        break;
                    case 47:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(47, obtainStyledAttributes.getFloat(index, r8Var.wxUZMvaN));
                        break;
                    case 48:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(48, obtainStyledAttributes.getFloat(index, r8Var.VgvYg0wo));
                        break;
                    case 49:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(49, obtainStyledAttributes.getDimension(index, r8Var.P7K7Inc8));
                        break;
                    case 50:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(50, obtainStyledAttributes.getDimension(index, r8Var.b2ZJblxo));
                        break;
                    case 51:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(51, obtainStyledAttributes.getDimension(index, r8Var.jb9XjC4I));
                        break;
                    case 52:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(52, obtainStyledAttributes.getDimension(index, r8Var.eVhOlqcC));
                        break;
                    case 53:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(53, obtainStyledAttributes.getDimension(index, r8Var.k3x7lurq));
                        break;
                    case 54:
                        i2 = indexCount;
                        m8Var.NCTxEWno(54, obtainStyledAttributes.getInt(index, o8Var.TrssYQ34));
                        break;
                    case 55:
                        i2 = indexCount;
                        m8Var.NCTxEWno(55, obtainStyledAttributes.getInt(index, o8Var.g2aRJUAd));
                        break;
                    case 56:
                        i2 = indexCount;
                        m8Var.NCTxEWno(56, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.ESscZ9M1));
                        break;
                    case 57:
                        i2 = indexCount;
                        m8Var.NCTxEWno(57, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.VGmz0ccI));
                        break;
                    case 58:
                        i2 = indexCount;
                        m8Var.NCTxEWno(58, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.LfKQckgD));
                        break;
                    case 59:
                        i2 = indexCount;
                        m8Var.NCTxEWno(59, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.pP9Y2m6O));
                        break;
                    case 60:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(60, obtainStyledAttributes.getFloat(index, r8Var.qoPGr6Ce));
                        break;
                    case 62:
                        i2 = indexCount;
                        m8Var.NCTxEWno(62, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.lwWCatUu));
                        break;
                    case 63:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(63, obtainStyledAttributes.getFloat(index, o8Var.U0LaHZX7));
                        break;
                    case 64:
                        i2 = indexCount;
                        m8Var.NCTxEWno(64, VgvYg0wo(obtainStyledAttributes, index, p8Var.qoPGr6Ce));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            m8Var.wxUZMvaN(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            m8Var.wxUZMvaN(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        m8Var.NCTxEWno(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(67, obtainStyledAttributes.getFloat(index, p8Var.VgvYg0wo));
                        break;
                    case 68:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(68, obtainStyledAttributes.getFloat(index, q8Var.wxUZMvaN));
                        break;
                    case 69:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        m8Var.NCTxEWno(72, obtainStyledAttributes.getInt(index, o8Var.LvHlPNBd));
                        break;
                    case 73:
                        i2 = indexCount;
                        m8Var.NCTxEWno(73, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.hGvurcGl));
                        break;
                    case 74:
                        i2 = indexCount;
                        m8Var.wxUZMvaN(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        m8Var.MdtA4re8(75, obtainStyledAttributes.getBoolean(index, o8Var.XrPeKzBk));
                        break;
                    case 76:
                        i2 = indexCount;
                        m8Var.NCTxEWno(76, obtainStyledAttributes.getInt(index, p8Var.MdtA4re8));
                        break;
                    case 77:
                        i2 = indexCount;
                        m8Var.wxUZMvaN(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        m8Var.NCTxEWno(78, obtainStyledAttributes.getInt(index, q8Var.NCTxEWno));
                        break;
                    case 79:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(79, obtainStyledAttributes.getFloat(index, p8Var.wxUZMvaN));
                        break;
                    case 80:
                        i2 = indexCount;
                        m8Var.MdtA4re8(80, obtainStyledAttributes.getBoolean(index, o8Var.f7oeun2L));
                        break;
                    case 81:
                        i2 = indexCount;
                        m8Var.MdtA4re8(81, obtainStyledAttributes.getBoolean(index, o8Var.uQ3KJUK5));
                        break;
                    case 82:
                        i2 = indexCount;
                        m8Var.NCTxEWno(82, obtainStyledAttributes.getInteger(index, p8Var.NCTxEWno));
                        break;
                    case 83:
                        i2 = indexCount;
                        m8Var.NCTxEWno(83, VgvYg0wo(obtainStyledAttributes, index, r8Var.Qr9iLBAD));
                        break;
                    case 84:
                        i2 = indexCount;
                        m8Var.NCTxEWno(84, obtainStyledAttributes.getInteger(index, p8Var.b2ZJblxo));
                        break;
                    case 85:
                        i2 = indexCount;
                        m8Var.qoPGr6Ce(85, obtainStyledAttributes.getFloat(index, p8Var.P7K7Inc8));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            p8Var.jb9XjC4I = resourceId2;
                            m8Var.NCTxEWno(89, resourceId2);
                            if (p8Var.jb9XjC4I != -1) {
                                m8Var.NCTxEWno(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            p8Var.Qr9iLBAD = string;
                            m8Var.wxUZMvaN(string, 90);
                            if (p8Var.Qr9iLBAD.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                p8Var.jb9XjC4I = resourceId3;
                                m8Var.NCTxEWno(89, resourceId3);
                                m8Var.NCTxEWno(88, -2);
                                break;
                            } else {
                                m8Var.NCTxEWno(88, -1);
                                break;
                            }
                        } else {
                            m8Var.NCTxEWno(88, obtainStyledAttributes.getInteger(index, p8Var.jb9XjC4I));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        m8Var.NCTxEWno(93, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.Xkz7p5xa));
                        break;
                    case 94:
                        i2 = indexCount;
                        m8Var.NCTxEWno(94, obtainStyledAttributes.getDimensionPixelSize(index, o8Var.HdOGZAzC));
                        break;
                    case 95:
                        i2 = indexCount;
                        P7K7Inc8(m8Var, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        P7K7Inc8(m8Var, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        m8Var.NCTxEWno(97, obtainStyledAttributes.getInt(index, o8Var.N2kLh4D5));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = ft.amk52bBQ;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            n8Var.qoPGr6Ce = obtainStyledAttributes.getResourceId(index, n8Var.qoPGr6Ce);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        m8Var.MdtA4re8(99, obtainStyledAttributes.getBoolean(index, o8Var.b2ZJblxo));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i7);
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        o8Var.sjUBp5pO = VgvYg0wo(obtainStyledAttributes, index2, o8Var.sjUBp5pO);
                        continue;
                    case 2:
                        i = indexCount2;
                        o8Var.pRiPUEwG = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.pRiPUEwG);
                        continue;
                    case 3:
                        i = indexCount2;
                        o8Var.lDXGDhIF = VgvYg0wo(obtainStyledAttributes, index2, o8Var.lDXGDhIF);
                        continue;
                    case 4:
                        i = indexCount2;
                        o8Var.ygLcUYwZ = VgvYg0wo(obtainStyledAttributes, index2, o8Var.ygLcUYwZ);
                        continue;
                    case 5:
                        i = indexCount2;
                        o8Var.WYNAV5pd = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        o8Var.i7xS8jrb = obtainStyledAttributes.getDimensionPixelOffset(index2, o8Var.i7xS8jrb);
                        continue;
                    case 7:
                        i = indexCount2;
                        o8Var.Mq3SeTnW = obtainStyledAttributes.getDimensionPixelOffset(index2, o8Var.Mq3SeTnW);
                        continue;
                    case 8:
                        i = indexCount2;
                        o8Var.VhgXwMj9 = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.VhgXwMj9);
                        continue;
                    case 9:
                        i = indexCount2;
                        o8Var.RXQxj5Oe = VgvYg0wo(obtainStyledAttributes, index2, o8Var.RXQxj5Oe);
                        continue;
                    case 10:
                        i = indexCount2;
                        o8Var.I5GHvsYW = VgvYg0wo(obtainStyledAttributes, index2, o8Var.I5GHvsYW);
                        continue;
                    case 11:
                        i = indexCount2;
                        o8Var.FXJmAAN1 = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.FXJmAAN1);
                        continue;
                    case 12:
                        i = indexCount2;
                        o8Var.nSmgoSB5 = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.nSmgoSB5);
                        continue;
                    case 13:
                        i = indexCount2;
                        o8Var.fVMzMhyS = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.fVMzMhyS);
                        continue;
                    case 14:
                        i = indexCount2;
                        o8Var.zCflySGU = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.zCflySGU);
                        continue;
                    case 15:
                        i = indexCount2;
                        o8Var.N8VPGzVC = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.N8VPGzVC);
                        continue;
                    case 16:
                        i = indexCount2;
                        o8Var.hzgxAD8d = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.hzgxAD8d);
                        continue;
                    case 17:
                        i = indexCount2;
                        o8Var.wxUZMvaN = obtainStyledAttributes.getDimensionPixelOffset(index2, o8Var.wxUZMvaN);
                        continue;
                    case 18:
                        i = indexCount2;
                        o8Var.VgvYg0wo = obtainStyledAttributes.getDimensionPixelOffset(index2, o8Var.VgvYg0wo);
                        continue;
                    case 19:
                        i = indexCount2;
                        o8Var.P7K7Inc8 = obtainStyledAttributes.getFloat(index2, o8Var.P7K7Inc8);
                        continue;
                    case 20:
                        i = indexCount2;
                        o8Var.FySoLYna = obtainStyledAttributes.getFloat(index2, o8Var.FySoLYna);
                        continue;
                    case 21:
                        i = indexCount2;
                        o8Var.MdtA4re8 = obtainStyledAttributes.getLayoutDimension(index2, o8Var.MdtA4re8);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, q8Var.qoPGr6Ce);
                        q8Var.qoPGr6Ce = i8;
                        q8Var.qoPGr6Ce = iArr[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        o8Var.NCTxEWno = obtainStyledAttributes.getLayoutDimension(index2, o8Var.NCTxEWno);
                        continue;
                    case 24:
                        i = indexCount2;
                        o8Var.SgZGMMPL = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.SgZGMMPL);
                        continue;
                    case 25:
                        i = indexCount2;
                        o8Var.Qr9iLBAD = VgvYg0wo(obtainStyledAttributes, index2, o8Var.Qr9iLBAD);
                        continue;
                    case 26:
                        i = indexCount2;
                        o8Var.jb9XjC4I = VgvYg0wo(obtainStyledAttributes, index2, o8Var.jb9XjC4I);
                        continue;
                    case 27:
                        i = indexCount2;
                        o8Var.euDDoUNr = obtainStyledAttributes.getInt(index2, o8Var.euDDoUNr);
                        continue;
                    case 28:
                        i = indexCount2;
                        o8Var.ytu5o6f4 = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.ytu5o6f4);
                        continue;
                    case 29:
                        i = indexCount2;
                        o8Var.eVhOlqcC = VgvYg0wo(obtainStyledAttributes, index2, o8Var.eVhOlqcC);
                        continue;
                    case 30:
                        i = indexCount2;
                        o8Var.k3x7lurq = VgvYg0wo(obtainStyledAttributes, index2, o8Var.k3x7lurq);
                        continue;
                    case 31:
                        i = indexCount2;
                        o8Var.aZz0PFXp = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.aZz0PFXp);
                        continue;
                    case 32:
                        i = indexCount2;
                        o8Var.KlHjfFWx = VgvYg0wo(obtainStyledAttributes, index2, o8Var.KlHjfFWx);
                        continue;
                    case 33:
                        i = indexCount2;
                        o8Var.Ey6iv0m0 = VgvYg0wo(obtainStyledAttributes, index2, o8Var.Ey6iv0m0);
                        continue;
                    case 34:
                        i = indexCount2;
                        o8Var.eIA6dogk = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.eIA6dogk);
                        continue;
                    case 35:
                        i = indexCount2;
                        o8Var.OnDfzHZD = VgvYg0wo(obtainStyledAttributes, index2, o8Var.OnDfzHZD);
                        continue;
                    case 36:
                        i = indexCount2;
                        o8Var.ow5vqvCr = VgvYg0wo(obtainStyledAttributes, index2, o8Var.ow5vqvCr);
                        continue;
                    case 37:
                        i = indexCount2;
                        o8Var.gjV1z5T1 = obtainStyledAttributes.getFloat(index2, o8Var.gjV1z5T1);
                        continue;
                    case 38:
                        i = indexCount2;
                        n8Var.qoPGr6Ce = obtainStyledAttributes.getResourceId(index2, n8Var.qoPGr6Ce);
                        continue;
                    case 39:
                        i = indexCount2;
                        o8Var.bvfAo0eO = obtainStyledAttributes.getFloat(index2, o8Var.bvfAo0eO);
                        continue;
                    case 40:
                        i = indexCount2;
                        o8Var.ZyZthT5G = obtainStyledAttributes.getFloat(index2, o8Var.ZyZthT5G);
                        continue;
                    case 41:
                        i = indexCount2;
                        o8Var.KRabZ4CU = obtainStyledAttributes.getInt(index2, o8Var.KRabZ4CU);
                        continue;
                    case 42:
                        i = indexCount2;
                        o8Var.gmkaJpmS = obtainStyledAttributes.getInt(index2, o8Var.gmkaJpmS);
                        continue;
                    case 43:
                        i = indexCount2;
                        q8Var.MdtA4re8 = obtainStyledAttributes.getFloat(index2, q8Var.MdtA4re8);
                        continue;
                    case 44:
                        i = indexCount2;
                        r8Var.ow5vqvCr = true;
                        r8Var.OnDfzHZD = obtainStyledAttributes.getDimension(index2, r8Var.OnDfzHZD);
                        continue;
                    case 45:
                        i = indexCount2;
                        r8Var.NCTxEWno = obtainStyledAttributes.getFloat(index2, r8Var.NCTxEWno);
                        continue;
                    case 46:
                        i = indexCount2;
                        r8Var.MdtA4re8 = obtainStyledAttributes.getFloat(index2, r8Var.MdtA4re8);
                        continue;
                    case 47:
                        i = indexCount2;
                        r8Var.wxUZMvaN = obtainStyledAttributes.getFloat(index2, r8Var.wxUZMvaN);
                        continue;
                    case 48:
                        i = indexCount2;
                        r8Var.VgvYg0wo = obtainStyledAttributes.getFloat(index2, r8Var.VgvYg0wo);
                        continue;
                    case 49:
                        i = indexCount2;
                        r8Var.P7K7Inc8 = obtainStyledAttributes.getDimension(index2, r8Var.P7K7Inc8);
                        continue;
                    case 50:
                        i = indexCount2;
                        r8Var.b2ZJblxo = obtainStyledAttributes.getDimension(index2, r8Var.b2ZJblxo);
                        continue;
                    case 51:
                        i = indexCount2;
                        r8Var.jb9XjC4I = obtainStyledAttributes.getDimension(index2, r8Var.jb9XjC4I);
                        continue;
                    case 52:
                        i = indexCount2;
                        r8Var.eVhOlqcC = obtainStyledAttributes.getDimension(index2, r8Var.eVhOlqcC);
                        continue;
                    case 53:
                        i = indexCount2;
                        r8Var.k3x7lurq = obtainStyledAttributes.getDimension(index2, r8Var.k3x7lurq);
                        continue;
                    case 54:
                        i = indexCount2;
                        o8Var.TrssYQ34 = obtainStyledAttributes.getInt(index2, o8Var.TrssYQ34);
                        continue;
                    case 55:
                        i = indexCount2;
                        o8Var.g2aRJUAd = obtainStyledAttributes.getInt(index2, o8Var.g2aRJUAd);
                        continue;
                    case 56:
                        i = indexCount2;
                        o8Var.ESscZ9M1 = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.ESscZ9M1);
                        continue;
                    case 57:
                        i = indexCount2;
                        o8Var.VGmz0ccI = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.VGmz0ccI);
                        continue;
                    case 58:
                        i = indexCount2;
                        o8Var.LfKQckgD = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.LfKQckgD);
                        continue;
                    case 59:
                        i = indexCount2;
                        o8Var.pP9Y2m6O = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.pP9Y2m6O);
                        continue;
                    case 60:
                        i = indexCount2;
                        r8Var.qoPGr6Ce = obtainStyledAttributes.getFloat(index2, r8Var.qoPGr6Ce);
                        continue;
                    case 61:
                        i = indexCount2;
                        o8Var.DK9slbsy = VgvYg0wo(obtainStyledAttributes, index2, o8Var.DK9slbsy);
                        continue;
                    case 62:
                        i = indexCount2;
                        o8Var.lwWCatUu = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.lwWCatUu);
                        continue;
                    case 63:
                        i = indexCount2;
                        o8Var.U0LaHZX7 = obtainStyledAttributes.getFloat(index2, o8Var.U0LaHZX7);
                        continue;
                    case 64:
                        i = indexCount2;
                        p8Var.qoPGr6Ce = VgvYg0wo(obtainStyledAttributes, index2, p8Var.qoPGr6Ce);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        continue;
                    case 67:
                        i = indexCount2;
                        p8Var.VgvYg0wo = obtainStyledAttributes.getFloat(index2, p8Var.VgvYg0wo);
                        break;
                    case 68:
                        i = indexCount2;
                        q8Var.wxUZMvaN = obtainStyledAttributes.getFloat(index2, q8Var.wxUZMvaN);
                        break;
                    case 69:
                        i = indexCount2;
                        o8Var.tef3qNMP = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        o8Var.Sjrx9cEN = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        o8Var.LvHlPNBd = obtainStyledAttributes.getInt(index2, o8Var.LvHlPNBd);
                        break;
                    case 73:
                        i = indexCount2;
                        o8Var.hGvurcGl = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.hGvurcGl);
                        break;
                    case 74:
                        i = indexCount2;
                        o8Var.orhfF2Ya = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        o8Var.XrPeKzBk = obtainStyledAttributes.getBoolean(index2, o8Var.XrPeKzBk);
                        break;
                    case 76:
                        i = indexCount2;
                        p8Var.MdtA4re8 = obtainStyledAttributes.getInt(index2, p8Var.MdtA4re8);
                        break;
                    case 77:
                        i = indexCount2;
                        o8Var.dHozS53r = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        q8Var.NCTxEWno = obtainStyledAttributes.getInt(index2, q8Var.NCTxEWno);
                        break;
                    case 79:
                        i = indexCount2;
                        p8Var.wxUZMvaN = obtainStyledAttributes.getFloat(index2, p8Var.wxUZMvaN);
                        break;
                    case 80:
                        i = indexCount2;
                        o8Var.f7oeun2L = obtainStyledAttributes.getBoolean(index2, o8Var.f7oeun2L);
                        break;
                    case 81:
                        i = indexCount2;
                        o8Var.uQ3KJUK5 = obtainStyledAttributes.getBoolean(index2, o8Var.uQ3KJUK5);
                        break;
                    case 82:
                        i = indexCount2;
                        p8Var.NCTxEWno = obtainStyledAttributes.getInteger(index2, p8Var.NCTxEWno);
                        break;
                    case 83:
                        i = indexCount2;
                        r8Var.Qr9iLBAD = VgvYg0wo(obtainStyledAttributes, index2, r8Var.Qr9iLBAD);
                        break;
                    case 84:
                        i = indexCount2;
                        p8Var.b2ZJblxo = obtainStyledAttributes.getInteger(index2, p8Var.b2ZJblxo);
                        break;
                    case 85:
                        i = indexCount2;
                        p8Var.P7K7Inc8 = obtainStyledAttributes.getFloat(index2, p8Var.P7K7Inc8);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            p8Var.jb9XjC4I = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            p8Var.Qr9iLBAD = string2;
                            if (string2.indexOf("/") > 0) {
                                p8Var.jb9XjC4I = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, p8Var.jb9XjC4I);
                            break;
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
                        o8Var.OxcuoDLp = VgvYg0wo(obtainStyledAttributes, index2, o8Var.OxcuoDLp);
                        break;
                    case 92:
                        i = indexCount2;
                        o8Var.amk52bBQ = VgvYg0wo(obtainStyledAttributes, index2, o8Var.amk52bBQ);
                        break;
                    case 93:
                        i = indexCount2;
                        o8Var.Xkz7p5xa = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.Xkz7p5xa);
                        break;
                    case 94:
                        i = indexCount2;
                        o8Var.HdOGZAzC = obtainStyledAttributes.getDimensionPixelSize(index2, o8Var.HdOGZAzC);
                        break;
                    case 95:
                        i = indexCount2;
                        P7K7Inc8(o8Var, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        P7K7Inc8(o8Var, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        o8Var.N2kLh4D5 = obtainStyledAttributes.getInt(index2, o8Var.N2kLh4D5);
                        break;
                }
                i7++;
            }
            if (o8Var.orhfF2Ya != null) {
                o8Var.QT4Tf9Dt = null;
            }
        }
        obtainStyledAttributes.recycle();
        return n8Var;
    }

    public static int[] NCTxEWno(x1 x1Var, String str) {
        int i;
        String[] split = str.split(",");
        Context context = x1Var.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = p00.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && x1Var.isInEditMode() && (x1Var.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) x1Var.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.ygLcUYwZ;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.ygLcUYwZ.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void P7K7Inc8(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
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
                    if (obj instanceof i8) {
                        i8 i8Var = (i8) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) i8Var).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) i8Var).height = 0;
                        }
                        b2ZJblxo(i8Var, trim2);
                        return;
                    }
                    if (obj instanceof o8) {
                        ((o8) obj).WYNAV5pd = trim2;
                        return;
                    } else {
                        if (obj instanceof m8) {
                            ((m8) obj).wxUZMvaN(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof i8) {
                            i8 i8Var2 = (i8) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) i8Var2).width = 0;
                                i8Var2.eIA6dogk = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) i8Var2).height = 0;
                                i8Var2.pRiPUEwG = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof o8) {
                            o8 o8Var = (o8) obj;
                            if (i2 == 0) {
                                o8Var.NCTxEWno = 0;
                                o8Var.bvfAo0eO = parseFloat;
                                return;
                            } else {
                                o8Var.MdtA4re8 = 0;
                                o8Var.ZyZthT5G = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof m8) {
                            m8 m8Var = (m8) obj;
                            if (i2 == 0) {
                                m8Var.NCTxEWno(23, 0);
                                m8Var.qoPGr6Ce(39, parseFloat);
                                return;
                            } else {
                                m8Var.NCTxEWno(21, 0);
                                m8Var.qoPGr6Ce(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof i8) {
                            i8 i8Var3 = (i8) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) i8Var3).width = 0;
                                i8Var3.N8VPGzVC = max;
                                i8Var3.Xkz7p5xa = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) i8Var3).height = 0;
                                i8Var3.HdOGZAzC = max;
                                i8Var3.fVMzMhyS = 2;
                                return;
                            }
                        }
                        if (obj instanceof o8) {
                            o8 o8Var2 = (o8) obj;
                            if (i2 == 0) {
                                o8Var2.NCTxEWno = 0;
                                o8Var2.tef3qNMP = max;
                                o8Var2.TrssYQ34 = 2;
                                return;
                            } else {
                                o8Var2.MdtA4re8 = 0;
                                o8Var2.Sjrx9cEN = max;
                                o8Var2.g2aRJUAd = 2;
                                return;
                            }
                        }
                        if (obj instanceof m8) {
                            m8 m8Var2 = (m8) obj;
                            if (i2 == 0) {
                                m8Var2.NCTxEWno(23, 0);
                                m8Var2.NCTxEWno(54, 2);
                                return;
                            } else {
                                m8Var2.NCTxEWno(21, 0);
                                m8Var2.NCTxEWno(55, 2);
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
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof i8)) {
                i8 i8Var4 = (i8) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) i8Var4).width = i4;
                    i8Var4.gmkaJpmS = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) i8Var4).height = i4;
                    i8Var4.TrssYQ34 = z;
                    return;
                }
            }
            if (obj instanceof o8) {
                o8 o8Var3 = (o8) obj;
                if (i2 == 0) {
                    o8Var3.NCTxEWno = i4;
                    o8Var3.f7oeun2L = z;
                    return;
                } else {
                    o8Var3.MdtA4re8 = i4;
                    o8Var3.uQ3KJUK5 = z;
                    return;
                }
            }
            if (obj instanceof m8) {
                m8 m8Var3 = (m8) obj;
                if (i2 == 0) {
                    m8Var3.NCTxEWno(23, i4);
                    m8Var3.MdtA4re8(80, z);
                    return;
                } else {
                    m8Var3.NCTxEWno(21, i4);
                    m8Var3.MdtA4re8(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof i8)) {
        }
    }

    public static int VgvYg0wo(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static void b2ZJblxo(i8 i8Var, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
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
                            if (i == 1) {
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
        i8Var.ytu5o6f4 = str;
    }

    public final void qoPGr6Ce(Context context, int i) {
        ConstraintLayout constraintLayout;
        int i2;
        HashMap hashMap;
        int i3;
        int i4;
        s8 s8Var = this;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap2 = s8Var.NCTxEWno;
        hashMap2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout2.getChildAt(i5);
            i8 i8Var = (i8) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new n8());
            }
            n8 n8Var = (n8) hashMap2.get(Integer.valueOf(id));
            if (n8Var == null) {
                constraintLayout = constraintLayout2;
                i2 = childCount;
                hashMap = hashMap2;
                i3 = i5;
            } else {
                q8 q8Var = n8Var.NCTxEWno;
                o8 o8Var = n8Var.wxUZMvaN;
                r8 r8Var = n8Var.VgvYg0wo;
                constraintLayout = constraintLayout2;
                HashMap hashMap3 = new HashMap();
                i2 = childCount;
                Class<?> cls = childAt.getClass();
                hashMap = hashMap2;
                HashMap hashMap4 = s8Var.qoPGr6Ce;
                for (String str : hashMap4.keySet()) {
                    f8 f8Var = (f8) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i4 = i5;
                            try {
                                hashMap3.put(str, new f8(f8Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                StringBuilder b2ZJblxo = q70.b2ZJblxo(" Custom Attribute \"", str, "\" not found on ");
                                b2ZJblxo.append(cls.getName());
                                Log.e("TransitionLayout", b2ZJblxo.toString(), e);
                                hashMap4 = hashMap5;
                                i5 = i4;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                hashMap4 = hashMap5;
                                i5 = i4;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                StringBuilder b2ZJblxo2 = q70.b2ZJblxo(" Custom Attribute \"", str, "\" not found on ");
                                b2ZJblxo2.append(cls.getName());
                                Log.e("TransitionLayout", b2ZJblxo2.toString(), e);
                                hashMap4 = hashMap5;
                                i5 = i4;
                            }
                        } else {
                            i4 = i5;
                            hashMap3.put(str, new f8(f8Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        i4 = i5;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        i4 = i5;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        i4 = i5;
                    }
                    hashMap4 = hashMap5;
                    i5 = i4;
                }
                i3 = i5;
                n8Var.P7K7Inc8 = hashMap3;
                n8Var.qoPGr6Ce = id;
                o8Var.Qr9iLBAD = i8Var.VgvYg0wo;
                o8Var.jb9XjC4I = i8Var.P7K7Inc8;
                o8Var.eVhOlqcC = i8Var.b2ZJblxo;
                o8Var.k3x7lurq = i8Var.Qr9iLBAD;
                o8Var.ow5vqvCr = i8Var.jb9XjC4I;
                o8Var.OnDfzHZD = i8Var.eVhOlqcC;
                o8Var.ygLcUYwZ = i8Var.k3x7lurq;
                o8Var.lDXGDhIF = i8Var.ow5vqvCr;
                o8Var.sjUBp5pO = i8Var.OnDfzHZD;
                o8Var.OxcuoDLp = i8Var.ygLcUYwZ;
                o8Var.amk52bBQ = i8Var.lDXGDhIF;
                o8Var.KlHjfFWx = i8Var.KlHjfFWx;
                o8Var.Ey6iv0m0 = i8Var.Ey6iv0m0;
                o8Var.I5GHvsYW = i8Var.I5GHvsYW;
                o8Var.RXQxj5Oe = i8Var.RXQxj5Oe;
                o8Var.FySoLYna = i8Var.euDDoUNr;
                o8Var.gjV1z5T1 = i8Var.SgZGMMPL;
                o8Var.WYNAV5pd = i8Var.ytu5o6f4;
                o8Var.DK9slbsy = i8Var.sjUBp5pO;
                o8Var.lwWCatUu = i8Var.OxcuoDLp;
                o8Var.U0LaHZX7 = i8Var.amk52bBQ;
                o8Var.i7xS8jrb = i8Var.ZyZthT5G;
                o8Var.Mq3SeTnW = i8Var.bvfAo0eO;
                o8Var.euDDoUNr = i8Var.KRabZ4CU;
                o8Var.P7K7Inc8 = i8Var.MdtA4re8;
                o8Var.wxUZMvaN = i8Var.qoPGr6Ce;
                o8Var.VgvYg0wo = i8Var.NCTxEWno;
                o8Var.NCTxEWno = ((ViewGroup.MarginLayoutParams) i8Var).width;
                o8Var.MdtA4re8 = ((ViewGroup.MarginLayoutParams) i8Var).height;
                o8Var.SgZGMMPL = ((ViewGroup.MarginLayoutParams) i8Var).leftMargin;
                o8Var.ytu5o6f4 = ((ViewGroup.MarginLayoutParams) i8Var).rightMargin;
                o8Var.eIA6dogk = ((ViewGroup.MarginLayoutParams) i8Var).topMargin;
                o8Var.pRiPUEwG = ((ViewGroup.MarginLayoutParams) i8Var).bottomMargin;
                o8Var.Xkz7p5xa = i8Var.Mq3SeTnW;
                o8Var.ZyZthT5G = i8Var.pRiPUEwG;
                o8Var.bvfAo0eO = i8Var.eIA6dogk;
                o8Var.gmkaJpmS = i8Var.aZz0PFXp;
                o8Var.KRabZ4CU = i8Var.VhgXwMj9;
                o8Var.f7oeun2L = i8Var.gmkaJpmS;
                o8Var.uQ3KJUK5 = i8Var.TrssYQ34;
                o8Var.TrssYQ34 = i8Var.Xkz7p5xa;
                o8Var.g2aRJUAd = i8Var.fVMzMhyS;
                o8Var.ESscZ9M1 = i8Var.FXJmAAN1;
                o8Var.VGmz0ccI = i8Var.nSmgoSB5;
                o8Var.LfKQckgD = i8Var.hzgxAD8d;
                o8Var.pP9Y2m6O = i8Var.zCflySGU;
                o8Var.tef3qNMP = i8Var.N8VPGzVC;
                o8Var.Sjrx9cEN = i8Var.HdOGZAzC;
                o8Var.dHozS53r = i8Var.g2aRJUAd;
                o8Var.hzgxAD8d = i8Var.gjV1z5T1;
                o8Var.FXJmAAN1 = i8Var.DK9slbsy;
                o8Var.fVMzMhyS = i8Var.FySoLYna;
                o8Var.zCflySGU = i8Var.WYNAV5pd;
                o8Var.N8VPGzVC = i8Var.lwWCatUu;
                o8Var.nSmgoSB5 = i8Var.U0LaHZX7;
                o8Var.HdOGZAzC = i8Var.i7xS8jrb;
                o8Var.N2kLh4D5 = i8Var.ESscZ9M1;
                o8Var.VhgXwMj9 = i8Var.getMarginEnd();
                o8Var.aZz0PFXp = i8Var.getMarginStart();
                q8Var.qoPGr6Ce = childAt.getVisibility();
                q8Var.MdtA4re8 = childAt.getAlpha();
                r8Var.qoPGr6Ce = childAt.getRotation();
                r8Var.NCTxEWno = childAt.getRotationX();
                r8Var.MdtA4re8 = childAt.getRotationY();
                r8Var.wxUZMvaN = childAt.getScaleX();
                r8Var.VgvYg0wo = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    r8Var.P7K7Inc8 = pivotX;
                    r8Var.b2ZJblxo = pivotY;
                }
                r8Var.jb9XjC4I = childAt.getTranslationX();
                r8Var.eVhOlqcC = childAt.getTranslationY();
                r8Var.k3x7lurq = childAt.getTranslationZ();
                if (r8Var.ow5vqvCr) {
                    r8Var.OnDfzHZD = childAt.getElevation();
                }
                if (childAt instanceof x1) {
                    x1 x1Var = (x1) childAt;
                    o8Var.XrPeKzBk = x1Var.getAllowsGoneWidget();
                    o8Var.QT4Tf9Dt = x1Var.getReferencedIds();
                    o8Var.LvHlPNBd = x1Var.getType();
                    o8Var.hGvurcGl = x1Var.getMargin();
                }
            }
            i5 = i3 + 1;
            s8Var = this;
            constraintLayout2 = constraintLayout;
            childCount = i2;
            hashMap2 = hashMap;
        }
    }

    public final void wxUZMvaN(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    n8 MdtA4re82 = MdtA4re8(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        MdtA4re82.wxUZMvaN.qoPGr6Ce = true;
                    }
                    this.NCTxEWno.put(Integer.valueOf(MdtA4re82.qoPGr6Ce), MdtA4re82);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }
}
