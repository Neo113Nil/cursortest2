package z;

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
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u.AbstractC0357e;
import v.AbstractC0359a;
import w.C0363a;
import y.AbstractC0377a;

/* renamed from: z.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4959d = {0, 4, 8};
    public static final SparseIntArray e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4960f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4961a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4962b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4963c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4960f = sparseIntArray2;
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

    public static int[] c(C0379a c0379a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0379a.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = AbstractC0395q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c0379a.isInEditMode() && (c0379a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0379a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1899m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1899m.get(trim);
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

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0600. Please report as an issue. */
    public static C0387i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0387i c0387i = new C0387i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? AbstractC0396r.f4967c : AbstractC0396r.f4965a);
        int[] iArr = f4959d;
        SparseIntArray sparseIntArray = e;
        C0390l c0390l = c0387i.f4869b;
        String[] strArr = AbstractC0359a.f4479a;
        C0391m c0391m = c0387i.e;
        C0389k c0389k = c0387i.f4870c;
        C0388j c0388j = c0387i.f4871d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0386h c0386h = new C0386h();
            c0386h.f4859a = new int[10];
            c0386h.f4860b = new int[10];
            c0386h.f4861c = 0;
            c0386h.f4862d = new int[10];
            c0386h.e = new float[10];
            c0386h.f4863f = 0;
            c0386h.f4864g = new int[5];
            c0386h.f4865h = new String[5];
            c0386h.i = 0;
            c0386h.j = new int[4];
            c0386h.f4866k = new boolean[4];
            c0386h.f4867l = 0;
            c0389k.getClass();
            c0388j.getClass();
            c0391m.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4960f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0386h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4882I));
                        i3 = 1;
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
                        StringBuilder sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i3 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        c0386h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0386h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0388j.f4876C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0386h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0388j.f4877D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0386h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0386h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4888P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0386h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4889Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0386h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4885M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0386h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4887O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0386h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4890R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0386h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4886N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0386h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0388j.f4905d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0386h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0388j.e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0386h.a(19, obtainStyledAttributes.getFloat(index, c0388j.f4908f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0386h.a(20, obtainStyledAttributes.getFloat(index, c0388j.f4933w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0386h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0388j.f4903c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0386h.b(22, iArr[obtainStyledAttributes.getInt(index, c0390l.f4944a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0386h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0388j.f4901b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0386h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4879F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0386h.b(27, obtainStyledAttributes.getInt(index, c0388j.f4878E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0386h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4880G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0386h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4883K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0386h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4881H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0386h.a(37, obtainStyledAttributes.getFloat(index, c0388j.f4934x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0387i.f4868a);
                        c0387i.f4868a = resourceId;
                        c0386h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0386h.a(39, obtainStyledAttributes.getFloat(index, c0388j.f4893U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0386h.a(40, obtainStyledAttributes.getFloat(index, c0388j.f4892T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0386h.b(41, obtainStyledAttributes.getInt(index, c0388j.f4894V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0386h.b(42, obtainStyledAttributes.getInt(index, c0388j.f4895W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0386h.a(43, obtainStyledAttributes.getFloat(index, c0390l.f4946c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0386h.c(44, true);
                        c0386h.a(44, obtainStyledAttributes.getDimension(index, c0391m.f4958m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0386h.a(45, obtainStyledAttributes.getFloat(index, c0391m.f4950b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0386h.a(46, obtainStyledAttributes.getFloat(index, c0391m.f4951c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0386h.a(47, obtainStyledAttributes.getFloat(index, c0391m.f4952d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0386h.a(48, obtainStyledAttributes.getFloat(index, c0391m.e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0386h.a(49, obtainStyledAttributes.getDimension(index, c0391m.f4953f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0386h.a(50, obtainStyledAttributes.getDimension(index, c0391m.f4954g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0386h.a(51, obtainStyledAttributes.getDimension(index, c0391m.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0386h.a(52, obtainStyledAttributes.getDimension(index, c0391m.j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0386h.a(53, obtainStyledAttributes.getDimension(index, c0391m.f4956k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0386h.b(54, obtainStyledAttributes.getInt(index, c0388j.f4896X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0386h.b(55, obtainStyledAttributes.getInt(index, c0388j.f4897Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0386h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4898Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0386h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4900a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0386h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4902b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0386h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4904c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0386h.a(60, obtainStyledAttributes.getFloat(index, c0391m.f4949a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0386h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4874A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0386h.a(63, obtainStyledAttributes.getFloat(index, c0388j.f4875B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0386h.b(64, f(obtainStyledAttributes, index, c0389k.f4937a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0386h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0386h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0386h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0386h.a(67, obtainStyledAttributes.getFloat(index, c0389k.e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0386h.a(68, obtainStyledAttributes.getFloat(index, c0390l.f4947d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0386h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0386h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0386h.b(72, obtainStyledAttributes.getInt(index, c0388j.f4909f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0386h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4911g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0386h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0386h.c(75, obtainStyledAttributes.getBoolean(index, c0388j.f4923n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0386h.b(76, obtainStyledAttributes.getInt(index, c0389k.f4939c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0386h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0386h.b(78, obtainStyledAttributes.getInt(index, c0390l.f4945b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0386h.a(79, obtainStyledAttributes.getFloat(index, c0389k.f4940d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0386h.c(80, obtainStyledAttributes.getBoolean(index, c0388j.f4919l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0386h.c(81, obtainStyledAttributes.getBoolean(index, c0388j.f4921m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0386h.b(82, obtainStyledAttributes.getInteger(index, c0389k.f4938b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0386h.b(83, f(obtainStyledAttributes, index, c0391m.f4955h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0386h.b(84, obtainStyledAttributes.getInteger(index, c0389k.f4942g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0386h.a(85, obtainStyledAttributes.getFloat(index, c0389k.f4941f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            c0389k.i = resourceId2;
                            c0386h.b(89, resourceId2);
                            if (c0389k.i != -1) {
                                c0386h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            c0389k.f4943h = string;
                            c0386h.d(string, 90);
                            if (c0389k.f4943h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                c0389k.i = resourceId3;
                                c0386h.b(89, resourceId3);
                                c0386h.b(88, -2);
                            } else {
                                c0386h.b(88, -1);
                            }
                        } else {
                            c0386h.b(88, obtainStyledAttributes.getInteger(index, c0389k.i));
                        }
                        i3 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i3 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        c0386h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4884L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0386h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0388j.f4891S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0386h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0386h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0386h.b(97, obtainStyledAttributes.getInt(index, c0388j.f4925o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0377a.f4765q;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0387i.f4868a = obtainStyledAttributes.getResourceId(index, c0387i.f4868a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0386h.c(99, obtainStyledAttributes.getBoolean(index, c0388j.f4910g));
                        i3 = 1;
                        break;
                }
                i4 += i3;
                indexCount = i5;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i8 = 1;
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2 && 24 != index2) {
                    c0389k.getClass();
                    c0388j.getClass();
                    c0391m.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4926p = f(obtainStyledAttributes, index2, c0388j.f4926p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4882I = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4882I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4924o = f(obtainStyledAttributes, index2, c0388j.f4924o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4922n = f(obtainStyledAttributes, index2, c0388j.f4922n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4935y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4876C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0388j.f4876C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4877D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0388j.f4877D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.J = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4932v = f(obtainStyledAttributes, index2, c0388j.f4932v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4931u = f(obtainStyledAttributes, index2, c0388j.f4931u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4888P = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4888P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4889Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4889Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4885M = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4885M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4887O = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4887O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4890R = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4890R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4886N = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4886N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4905d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0388j.f4905d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0388j.e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4908f = obtainStyledAttributes.getFloat(index2, c0388j.f4908f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4933w = obtainStyledAttributes.getFloat(index2, c0388j.f4933w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4903c = obtainStyledAttributes.getLayoutDimension(index2, c0388j.f4903c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, c0390l.f4944a);
                        c0390l.f4944a = i10;
                        c0390l.f4944a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4901b = obtainStyledAttributes.getLayoutDimension(index2, c0388j.f4901b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4879F = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4879F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4912h = f(obtainStyledAttributes, index2, c0388j.f4912h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.i = f(obtainStyledAttributes, index2, c0388j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4878E = obtainStyledAttributes.getInt(index2, c0388j.f4878E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4880G = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4880G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.j = f(obtainStyledAttributes, index2, c0388j.j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4916k = f(obtainStyledAttributes, index2, c0388j.f4916k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4883K = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4883K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4929s = f(obtainStyledAttributes, index2, c0388j.f4929s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4930t = f(obtainStyledAttributes, index2, c0388j.f4930t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4881H = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4881H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4920m = f(obtainStyledAttributes, index2, c0388j.f4920m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4918l = f(obtainStyledAttributes, index2, c0388j.f4918l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4934x = obtainStyledAttributes.getFloat(index2, c0388j.f4934x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0387i.f4868a = obtainStyledAttributes.getResourceId(index2, c0387i.f4868a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4893U = obtainStyledAttributes.getFloat(index2, c0388j.f4893U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4892T = obtainStyledAttributes.getFloat(index2, c0388j.f4892T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4894V = obtainStyledAttributes.getInt(index2, c0388j.f4894V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4895W = obtainStyledAttributes.getInt(index2, c0388j.f4895W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0390l.f4946c = obtainStyledAttributes.getFloat(index2, c0390l.f4946c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.f4957l = true;
                        c0391m.f4958m = obtainStyledAttributes.getDimension(index2, c0391m.f4958m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.f4950b = obtainStyledAttributes.getFloat(index2, c0391m.f4950b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.f4951c = obtainStyledAttributes.getFloat(index2, c0391m.f4951c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.f4952d = obtainStyledAttributes.getFloat(index2, c0391m.f4952d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.e = obtainStyledAttributes.getFloat(index2, c0391m.e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.f4953f = obtainStyledAttributes.getDimension(index2, c0391m.f4953f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.f4954g = obtainStyledAttributes.getDimension(index2, c0391m.f4954g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.i = obtainStyledAttributes.getDimension(index2, c0391m.i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.j = obtainStyledAttributes.getDimension(index2, c0391m.j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.f4956k = obtainStyledAttributes.getDimension(index2, c0391m.f4956k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4896X = obtainStyledAttributes.getInt(index2, c0388j.f4896X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4897Y = obtainStyledAttributes.getInt(index2, c0388j.f4897Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4898Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4898Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4900a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4900a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4902b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4902b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4904c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4904c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0391m.f4949a = obtainStyledAttributes.getFloat(index2, c0391m.f4949a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4936z = f(obtainStyledAttributes, index2, c0388j.f4936z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4874A = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4874A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0388j.f4875B = obtainStyledAttributes.getFloat(index2, c0388j.f4875B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0389k.f4937a = f(obtainStyledAttributes, index2, c0389k.f4937a);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            c0389k.getClass();
                            i2 = 1;
                            break;
                        } else {
                            obtainStyledAttributes.getString(index2);
                            c0389k.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        c0389k.getClass();
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0389k.e = obtainStyledAttributes.getFloat(index2, c0389k.e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0390l.f4947d = obtainStyledAttributes.getFloat(index2, c0390l.f4947d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0388j.f4906d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0388j.f4907e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4909f0 = obtainStyledAttributes.getInt(index2, c0388j.f4909f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4911g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4911g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4915j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4923n0 = obtainStyledAttributes.getBoolean(index2, c0388j.f4923n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        c0389k.f4939c = obtainStyledAttributes.getInt(index2, c0389k.f4939c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4917k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        c0390l.f4945b = obtainStyledAttributes.getInt(index2, c0390l.f4945b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        c0389k.f4940d = obtainStyledAttributes.getFloat(index2, c0389k.f4940d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4919l0 = obtainStyledAttributes.getBoolean(index2, c0388j.f4919l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4921m0 = obtainStyledAttributes.getBoolean(index2, c0388j.f4921m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        c0389k.f4938b = obtainStyledAttributes.getInteger(index2, c0389k.f4938b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        c0391m.f4955h = f(obtainStyledAttributes, index2, c0391m.f4955h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        c0389k.f4942g = obtainStyledAttributes.getInteger(index2, c0389k.f4942g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        c0389k.f4941f = obtainStyledAttributes.getFloat(index2, c0389k.f4941f);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str2 = str8;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            c0389k.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            c0389k.f4943h = string2;
                            if (string2.indexOf("/") > 0) {
                                c0389k.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, c0389k.i);
                        }
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str6, sb2.toString());
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4927q = f(obtainStyledAttributes, index2, c0388j.f4927q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4928r = f(obtainStyledAttributes, index2, c0388j.f4928r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4884L = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4884L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4891S = obtainStyledAttributes.getDimensionPixelSize(index2, c0388j.f4891S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0388j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0388j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0388j.f4925o0 = obtainStyledAttributes.getInt(index2, c0388j.f4925o0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                }
                i9 += i2;
                indexCount2 = i;
                str8 = str2;
                String str10 = str;
                i8 = i2;
                str6 = str3;
                str7 = str10;
            }
            if (c0388j.f4915j0 != null) {
                c0388j.f4914i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0387i;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z2 = true;
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
                    if (obj instanceof C0383e) {
                        C0383e c0383e = (C0383e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0383e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0383e).height = 0;
                        }
                        h(c0383e, trim2);
                        return;
                    }
                    if (obj instanceof C0388j) {
                        ((C0388j) obj).f4935y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0386h) {
                            ((C0386h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0383e) {
                            C0383e c0383e2 = (C0383e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0383e2).width = 0;
                                c0383e2.f4791H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0383e2).height = 0;
                                c0383e2.f4792I = parseFloat;
                            }
                        } else if (obj instanceof C0388j) {
                            C0388j c0388j = (C0388j) obj;
                            if (i2 == 0) {
                                c0388j.f4901b = 0;
                                c0388j.f4893U = parseFloat;
                            } else {
                                c0388j.f4903c = 0;
                                c0388j.f4892T = parseFloat;
                            }
                        } else if (obj instanceof C0386h) {
                            C0386h c0386h = (C0386h) obj;
                            if (i2 == 0) {
                                c0386h.b(23, 0);
                                c0386h.a(39, parseFloat);
                            } else {
                                c0386h.b(21, 0);
                                c0386h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(RecyclerView.f2111C0, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0383e) {
                            C0383e c0383e3 = (C0383e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0383e3).width = 0;
                                c0383e3.f4800R = max;
                                c0383e3.f4794L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0383e3).height = 0;
                                c0383e3.f4801S = max;
                                c0383e3.f4795M = 2;
                            }
                        } else if (obj instanceof C0388j) {
                            C0388j c0388j2 = (C0388j) obj;
                            if (i2 == 0) {
                                c0388j2.f4901b = 0;
                                c0388j2.f4906d0 = max;
                                c0388j2.f4896X = 2;
                            } else {
                                c0388j2.f4903c = 0;
                                c0388j2.f4907e0 = max;
                                c0388j2.f4897Y = 2;
                            }
                        } else if (obj instanceof C0386h) {
                            C0386h c0386h2 = (C0386h) obj;
                            if (i2 == 0) {
                                c0386h2.b(23, 0);
                                c0386h2.b(54, 2);
                            } else {
                                c0386h2.b(21, 0);
                                c0386h2.b(55, 2);
                            }
                        }
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
                z2 = false;
            }
            if (!(obj instanceof C0383e)) {
                C0383e c0383e4 = (C0383e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0383e4).width = i4;
                    c0383e4.f4805W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0383e4).height = i4;
                    c0383e4.f4806X = z2;
                    return;
                }
            }
            if (obj instanceof C0388j) {
                C0388j c0388j3 = (C0388j) obj;
                if (i2 == 0) {
                    c0388j3.f4901b = i4;
                    c0388j3.f4919l0 = z2;
                    return;
                } else {
                    c0388j3.f4903c = i4;
                    c0388j3.f4921m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0386h) {
                C0386h c0386h3 = (C0386h) obj;
                if (i2 == 0) {
                    c0386h3.b(23, i4);
                    c0386h3.c(80, z2);
                    return;
                } else {
                    c0386h3.b(21, i4);
                    c0386h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0383e)) {
        }
    }

    public static void h(C0383e c0383e, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c2 = 65535;
            int i = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c2 = 1;
                }
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > RecyclerView.f2111C0 && parseFloat2 > RecyclerView.f2111C0) {
                            if (c2 == 1) {
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
        c0383e.f4790G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        String str;
        int i2;
        String str2;
        C0392n c0392n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = c0392n.f4963c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c0392n.f4962b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0387i c0387i = (C0387i) hashMap2.get(Integer.valueOf(id));
                        if (c0387i != null) {
                            if (childAt instanceof C0379a) {
                                C0388j c0388j = c0387i.f4871d;
                                c0388j.f4913h0 = 1;
                                C0379a c0379a = (C0379a) childAt;
                                c0379a.setId(id);
                                c0379a.setType(c0388j.f4909f0);
                                c0379a.setMargin(c0388j.f4911g0);
                                c0379a.setAllowsGoneWidget(c0388j.f4923n0);
                                int[] iArr = c0388j.f4914i0;
                                if (iArr != null) {
                                    c0379a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0388j.f4915j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0379a, str3);
                                        c0388j.f4914i0 = c2;
                                        c0379a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0383e c0383e = (C0383e) childAt.getLayoutParams();
                            c0383e.a();
                            c0387i.a(c0383e);
                            HashMap hashMap3 = c0387i.f4872f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0380b c0380b = (C0380b) hashMap3.get(str4);
                                if (c0380b.f4771a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0357e.a(c0380b.f4772b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0380b.f4773c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0380b.f4774d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0380b.f4776g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0380b.f4776g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0380b.e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0380b.f4775f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0380b.f4774d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0380b.f4773c));
                                            i2 = childCount;
                                            break;
                                        default:
                                            i2 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i2 = childCount;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i2 = childCount;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i2 = childCount;
                                }
                                hashMap3 = hashMap;
                                childCount = i2;
                            }
                            i = childCount;
                            childAt.setLayoutParams(c0383e);
                            C0390l c0390l = c0387i.f4869b;
                            if (c0390l.f4945b == 0) {
                                childAt.setVisibility(c0390l.f4944a);
                            }
                            childAt.setAlpha(c0390l.f4946c);
                            C0391m c0391m = c0387i.e;
                            childAt.setRotation(c0391m.f4949a);
                            childAt.setRotationX(c0391m.f4950b);
                            childAt.setRotationY(c0391m.f4951c);
                            childAt.setScaleX(c0391m.f4952d);
                            childAt.setScaleY(c0391m.e);
                            if (c0391m.f4955h != -1) {
                                if (((View) childAt.getParent()).findViewById(c0391m.f4955h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0391m.f4953f)) {
                                    childAt.setPivotX(c0391m.f4953f);
                                }
                                if (!Float.isNaN(c0391m.f4954g)) {
                                    childAt.setPivotY(c0391m.f4954g);
                                }
                            }
                            childAt.setTranslationX(c0391m.i);
                            childAt.setTranslationY(c0391m.j);
                            childAt.setTranslationZ(c0391m.f4956k);
                            if (c0391m.f4957l) {
                                childAt.setElevation(c0391m.f4958m);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3++;
                    c0392n = this;
                    childCount = i;
                }
            }
            i = childCount;
            i3++;
            c0392n = this;
            childCount = i;
        }
        int i4 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0387i c0387i2 = (C0387i) hashMap2.get(num);
            if (c0387i2 != null) {
                C0388j c0388j2 = c0387i2.f4871d;
                if (c0388j2.f4913h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0379a c0379a2 = new C0379a(context);
                    c0379a2.f4777a = new int[32];
                    c0379a2.f4782g = new HashMap();
                    c0379a2.f4779c = context;
                    C0363a c0363a = new C0363a();
                    c0363a.s0 = 0;
                    c0363a.f4498t0 = true;
                    c0363a.f4499u0 = 0;
                    c0363a.f4500v0 = false;
                    c0379a2.j = c0363a;
                    c0379a2.f4780d = c0363a;
                    c0379a2.i();
                    c0379a2.setVisibility(8);
                    c0379a2.setId(num.intValue());
                    int[] iArr2 = c0388j2.f4914i0;
                    if (iArr2 != null) {
                        c0379a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0388j2.f4915j0;
                        if (str5 != null) {
                            int[] c3 = c(c0379a2, str5);
                            c0388j2.f4914i0 = c3;
                            c0379a2.setReferencedIds(c3);
                        }
                    }
                    c0379a2.setType(c0388j2.f4909f0);
                    c0379a2.setMargin(c0388j2.f4911g0);
                    C0383e h2 = ConstraintLayout.h();
                    c0379a2.i();
                    c0387i2.a(h2);
                    constraintLayout.addView(c0379a2, h2);
                }
                if (c0388j2.f4899a) {
                    View c0394p = new C0394p(constraintLayout.getContext());
                    c0394p.setId(num.intValue());
                    C0383e h3 = ConstraintLayout.h();
                    c0387i2.a(h3);
                    constraintLayout.addView(c0394p, h3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0381c) {
                ((AbstractC0381c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        C0392n c0392n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = c0392n.f4963c;
        hashMap3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            C0383e c0383e = (C0383e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0392n.f4962b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id))) {
                hashMap3.put(Integer.valueOf(id), new C0387i());
            }
            C0387i c0387i = (C0387i) hashMap3.get(Integer.valueOf(id));
            if (c0387i == null) {
                i = childCount;
                hashMap = hashMap3;
            } else {
                HashMap hashMap4 = c0392n.f4961a;
                HashMap hashMap5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap4.keySet()) {
                    C0380b c0380b = (C0380b) hashMap4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap5.put(str, new C0380b(c0380b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i3;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            hashMap5.put(str, new C0380b(c0380b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        hashMap2 = hashMap3;
                    }
                    childCount = i3;
                    hashMap3 = hashMap2;
                }
                i = childCount;
                hashMap = hashMap3;
                c0387i.f4872f = hashMap5;
                c0387i.f4868a = id;
                int i4 = c0383e.e;
                C0388j c0388j = c0387i.f4871d;
                c0388j.f4912h = i4;
                c0388j.i = c0383e.f4818f;
                c0388j.j = c0383e.f4820g;
                c0388j.f4916k = c0383e.f4822h;
                c0388j.f4918l = c0383e.i;
                c0388j.f4920m = c0383e.j;
                c0388j.f4922n = c0383e.f4826k;
                c0388j.f4924o = c0383e.f4828l;
                c0388j.f4926p = c0383e.f4830m;
                c0388j.f4927q = c0383e.f4832n;
                c0388j.f4928r = c0383e.f4834o;
                c0388j.f4929s = c0383e.f4840s;
                c0388j.f4930t = c0383e.f4841t;
                c0388j.f4931u = c0383e.f4842u;
                c0388j.f4932v = c0383e.f4843v;
                c0388j.f4933w = c0383e.f4788E;
                c0388j.f4934x = c0383e.f4789F;
                c0388j.f4935y = c0383e.f4790G;
                c0388j.f4936z = c0383e.f4836p;
                c0388j.f4874A = c0383e.f4838q;
                c0388j.f4875B = c0383e.f4839r;
                c0388j.f4876C = c0383e.f4802T;
                c0388j.f4877D = c0383e.f4803U;
                c0388j.f4878E = c0383e.f4804V;
                c0388j.f4908f = c0383e.f4813c;
                c0388j.f4905d = c0383e.f4809a;
                c0388j.e = c0383e.f4811b;
                c0388j.f4901b = ((ViewGroup.MarginLayoutParams) c0383e).width;
                c0388j.f4903c = ((ViewGroup.MarginLayoutParams) c0383e).height;
                c0388j.f4879F = ((ViewGroup.MarginLayoutParams) c0383e).leftMargin;
                c0388j.f4880G = ((ViewGroup.MarginLayoutParams) c0383e).rightMargin;
                c0388j.f4881H = ((ViewGroup.MarginLayoutParams) c0383e).topMargin;
                c0388j.f4882I = ((ViewGroup.MarginLayoutParams) c0383e).bottomMargin;
                c0388j.f4884L = c0383e.f4787D;
                c0388j.f4892T = c0383e.f4792I;
                c0388j.f4893U = c0383e.f4791H;
                c0388j.f4895W = c0383e.f4793K;
                c0388j.f4894V = c0383e.J;
                c0388j.f4919l0 = c0383e.f4805W;
                c0388j.f4921m0 = c0383e.f4806X;
                c0388j.f4896X = c0383e.f4794L;
                c0388j.f4897Y = c0383e.f4795M;
                c0388j.f4898Z = c0383e.f4798P;
                c0388j.f4900a0 = c0383e.f4799Q;
                c0388j.f4902b0 = c0383e.f4796N;
                c0388j.f4904c0 = c0383e.f4797O;
                c0388j.f4906d0 = c0383e.f4800R;
                c0388j.f4907e0 = c0383e.f4801S;
                c0388j.f4917k0 = c0383e.f4807Y;
                c0388j.f4886N = c0383e.f4845x;
                c0388j.f4888P = c0383e.f4847z;
                c0388j.f4885M = c0383e.f4844w;
                c0388j.f4887O = c0383e.f4846y;
                c0388j.f4890R = c0383e.f4784A;
                c0388j.f4889Q = c0383e.f4785B;
                c0388j.f4891S = c0383e.f4786C;
                c0388j.f4925o0 = c0383e.f4808Z;
                c0388j.J = c0383e.getMarginEnd();
                c0388j.f4883K = c0383e.getMarginStart();
                int visibility = childAt.getVisibility();
                C0390l c0390l = c0387i.f4869b;
                c0390l.f4944a = visibility;
                c0390l.f4946c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C0391m c0391m = c0387i.e;
                c0391m.f4949a = rotation;
                c0391m.f4950b = childAt.getRotationX();
                c0391m.f4951c = childAt.getRotationY();
                c0391m.f4952d = childAt.getScaleX();
                c0391m.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0391m.f4953f = pivotX;
                    c0391m.f4954g = pivotY;
                }
                c0391m.i = childAt.getTranslationX();
                c0391m.j = childAt.getTranslationY();
                c0391m.f4956k = childAt.getTranslationZ();
                if (c0391m.f4957l) {
                    c0391m.f4958m = childAt.getElevation();
                }
                if (childAt instanceof C0379a) {
                    C0379a c0379a = (C0379a) childAt;
                    c0388j.f4923n0 = c0379a.getAllowsGoneWidget();
                    c0388j.f4914i0 = c0379a.getReferencedIds();
                    c0388j.f4909f0 = c0379a.getType();
                    c0388j.f4911g0 = c0379a.getMargin();
                }
            }
            i2++;
            c0392n = this;
            childCount = i;
            hashMap3 = hashMap;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C0387i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f4871d.f4899a = true;
                    }
                    this.f4963c.put(Integer.valueOf(d2.f4868a), d2);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
