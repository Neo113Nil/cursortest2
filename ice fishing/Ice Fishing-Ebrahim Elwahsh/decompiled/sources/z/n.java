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
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
import com.google.android.gms.internal.ads.CL;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import t0.AbstractC5051n;
import u.AbstractC5088e;
import v.AbstractC5115a;
import w.C5141a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f42087d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f42088e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f42089f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f42090a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42091b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f42092c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42088e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f42089f = sparseIntArray2;
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
        sparseIntArray.append(com.anythink.expressad.video.module.a.a.f21914z, 16);
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

    public static int[] c(C5257a c5257a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c5257a.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        int i9 = 0;
        while (i4 < split.length) {
            String trim = split[i4].trim();
            Object obj = null;
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c5257a.isInEditMode() && (c5257a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c5257a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f4764F;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f4764F.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i9] = i;
            i4++;
            i9++;
        }
        return i9 != split.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x05fc. Please report as an issue. */
    public static i d(Context context, AttributeSet attributeSet, boolean z8) {
        int i;
        String str;
        String str2;
        int i4;
        int i9;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z8 ? r.f42096c : r.f42094a);
        int[] iArr = f42087d;
        String[] strArr = AbstractC5115a.f41327a;
        SparseIntArray sparseIntArray = f42088e;
        l lVar = iVar.f41992b;
        m mVar = iVar.f41995e;
        k kVar = iVar.f41993c;
        j jVar = iVar.f41994d;
        String str3 = "ConstraintSet";
        if (z8) {
            h hVar = new h();
            hVar.f41980a = new int[10];
            hVar.f41981b = new int[10];
            hVar.f41982c = 0;
            hVar.f41983d = new int[10];
            hVar.f41984e = new float[10];
            hVar.f41985f = 0;
            hVar.f41986g = new int[5];
            hVar.f41987h = new String[5];
            hVar.i = 0;
            hVar.f41988j = new int[4];
            hVar.f41989k = new boolean[4];
            hVar.f41990l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i10 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i10 < indexCount; indexCount = i9) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = i10;
                switch (f42089f.get(index)) {
                    case 2:
                        i9 = indexCount;
                        hVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42006I));
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
                    case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                    case 91:
                    case j.v.f12734H /* 92 */:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i9 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i9 = indexCount;
                        hVar.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        i9 = indexCount;
                        hVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42000C));
                        break;
                    case 7:
                        i9 = indexCount;
                        hVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42001D));
                        break;
                    case 8:
                        i9 = indexCount;
                        hVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        i9 = indexCount;
                        hVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42012P));
                        break;
                    case 12:
                        i9 = indexCount;
                        hVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42013Q));
                        break;
                    case 13:
                        i9 = indexCount;
                        hVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42009M));
                        break;
                    case 14:
                        i9 = indexCount;
                        hVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42011O));
                        break;
                    case 15:
                        i9 = indexCount;
                        hVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42014R));
                        break;
                    case 16:
                        i9 = indexCount;
                        hVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42010N));
                        break;
                    case 17:
                        i9 = indexCount;
                        hVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42028d));
                        break;
                    case 18:
                        i9 = indexCount;
                        hVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42030e));
                        break;
                    case 19:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42032f), 19);
                        break;
                    case 20:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42057w), 20);
                        break;
                    case 21:
                        i9 = indexCount;
                        hVar.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f42026c));
                        break;
                    case 22:
                        i9 = indexCount;
                        hVar.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f42070a)]);
                        break;
                    case 23:
                        i9 = indexCount;
                        hVar.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f42024b));
                        break;
                    case 24:
                        i9 = indexCount;
                        hVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42003F));
                        break;
                    case 27:
                        i9 = indexCount;
                        hVar.b(27, obtainStyledAttributes.getInt(index, jVar.f42002E));
                        break;
                    case 28:
                        i9 = indexCount;
                        hVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42004G));
                        break;
                    case 31:
                        i9 = indexCount;
                        hVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42007K));
                        break;
                    case 34:
                        i9 = indexCount;
                        hVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42005H));
                        break;
                    case 37:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42058x), 37);
                        break;
                    case com.anythink.basead.b.b.j.f5963M /* 38 */:
                        i9 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f41991a);
                        iVar.f41991a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case 39:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42017U), 39);
                        break;
                    case com.anythink.basead.b.b.j.f5965O /* 40 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42016T), 40);
                        break;
                    case 41:
                        i9 = indexCount;
                        hVar.b(41, obtainStyledAttributes.getInt(index, jVar.f42018V));
                        break;
                    case 42:
                        i9 = indexCount;
                        hVar.b(42, obtainStyledAttributes.getInt(index, jVar.f42019W));
                        break;
                    case com.anythink.basead.b.b.j.f5968R /* 43 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, lVar.f42072c), 43);
                        break;
                    case com.anythink.basead.b.b.j.f5969S /* 44 */:
                        i9 = indexCount;
                        hVar.d(44, true);
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42086m), 44);
                        break;
                    case com.anythink.basead.b.b.j.f5970T /* 45 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42076b), 45);
                        break;
                    case 46:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42077c), 46);
                        break;
                    case 47:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42078d), 47);
                        break;
                    case com.anythink.basead.b.b.j.f5973W /* 48 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42079e), 48);
                        break;
                    case com.anythink.basead.b.b.j.f5974X /* 49 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42080f), 49);
                        break;
                    case 50:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42081g), 50);
                        break;
                    case 51:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.i), 51);
                        break;
                    case 52:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42083j), 52);
                        break;
                    case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42084k), 53);
                        break;
                    case 54:
                        i9 = indexCount;
                        hVar.b(54, obtainStyledAttributes.getInt(index, jVar.f42020X));
                        break;
                    case 55:
                        i9 = indexCount;
                        hVar.b(55, obtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case p.a.f19837e /* 56 */:
                        i9 = indexCount;
                        hVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42021Z));
                        break;
                    case 57:
                        i9 = indexCount;
                        hVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42023a0));
                        break;
                    case 58:
                        i9 = indexCount;
                        hVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42025b0));
                        break;
                    case j.v.f12748n /* 59 */:
                        i9 = indexCount;
                        hVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42027c0));
                        break;
                    case 60:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42075a), 60);
                        break;
                    case 62:
                        i9 = indexCount;
                        hVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f41998A));
                        break;
                    case 63:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f41999B), 63);
                        break;
                    case 64:
                        i9 = indexCount;
                        hVar.b(64, f(obtainStyledAttributes, index, kVar.f42062a));
                        break;
                    case j.v.f12733G /* 65 */:
                        i9 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.c(65, obtainStyledAttributes.getString(index));
                        } else {
                            hVar.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i9 = indexCount;
                        hVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case j.v.f12739d /* 67 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42066e), 67);
                        break;
                    case 68:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, lVar.f42073d), 68);
                        break;
                    case j.v.f12730D /* 69 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i9 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i9 = indexCount;
                        hVar.b(72, obtainStyledAttributes.getInt(index, jVar.f42033f0));
                        break;
                    case 73:
                        i9 = indexCount;
                        hVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42035g0));
                        break;
                    case j.v.f12755u /* 74 */:
                        i9 = indexCount;
                        hVar.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case j.v.f12756v /* 75 */:
                        i9 = indexCount;
                        hVar.d(75, obtainStyledAttributes.getBoolean(index, jVar.f42047n0));
                        break;
                    case j.v.f12760z /* 76 */:
                        i9 = indexCount;
                        hVar.b(76, obtainStyledAttributes.getInt(index, kVar.f42064c));
                        break;
                    case j.v.f12728B /* 77 */:
                        i9 = indexCount;
                        hVar.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i9 = indexCount;
                        hVar.b(78, obtainStyledAttributes.getInt(index, lVar.f42071b));
                        break;
                    case j.v.f12727A /* 79 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42065d), 79);
                        break;
                    case j.v.f12729C /* 80 */:
                        i9 = indexCount;
                        hVar.d(80, obtainStyledAttributes.getBoolean(index, jVar.f42044l0));
                        break;
                    case j.v.f12731E /* 81 */:
                        i9 = indexCount;
                        hVar.d(81, obtainStyledAttributes.getBoolean(index, jVar.m0));
                        break;
                    case 82:
                        i9 = indexCount;
                        hVar.b(82, obtainStyledAttributes.getInteger(index, kVar.f42063b));
                        break;
                    case 83:
                        i9 = indexCount;
                        hVar.b(83, f(obtainStyledAttributes, index, mVar.f42082h));
                        break;
                    case 84:
                        i9 = indexCount;
                        hVar.b(84, obtainStyledAttributes.getInteger(index, kVar.f42068g));
                        break;
                    case 85:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42067f), 85);
                        break;
                    case 86:
                        i9 = indexCount;
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.i != -1) {
                                hVar.b(88, -2);
                            }
                        } else if (i12 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.f42069h = string;
                            hVar.c(90, string);
                            if (kVar.f42069h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                            } else {
                                hVar.b(88, -1);
                            }
                        } else {
                            hVar.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
                        }
                        break;
                    case 87:
                        i9 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case j.v.f12735I /* 93 */:
                        i9 = indexCount;
                        hVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42008L));
                        break;
                    case 94:
                        i9 = indexCount;
                        hVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42015S));
                        break;
                    case 95:
                        i9 = indexCount;
                        g(hVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i9 = indexCount;
                        g(hVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i9 = indexCount;
                        hVar.b(97, obtainStyledAttributes.getInt(index, jVar.f42049o0));
                        break;
                    case 98:
                        i9 = indexCount;
                        int i13 = y.a.J;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            iVar.f41991a = obtainStyledAttributes.getResourceId(index, iVar.f41991a);
                        }
                        break;
                    case 99:
                        i9 = indexCount;
                        hVar.d(99, obtainStyledAttributes.getBoolean(index, jVar.f42034g));
                        break;
                }
                i10 = i11 + 1;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            int i14 = 1;
            int i15 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i15 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i15);
                if (index2 != i14 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42050p = f(obtainStyledAttributes, index2, jVar.f42050p);
                        i4 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42006I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42006I);
                        i4 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42048o = f(obtainStyledAttributes, index2, jVar.f42048o);
                        i4 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42046n = f(obtainStyledAttributes, index2, jVar.f42046n);
                        i4 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42059y = obtainStyledAttributes.getString(index2);
                        i4 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42000C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42000C);
                        i4 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42001D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42001D);
                        i4 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        i4 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42056v = f(obtainStyledAttributes, index2, jVar.f42056v);
                        i4 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42055u = f(obtainStyledAttributes, index2, jVar.f42055u);
                        i4 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42012P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42012P);
                        i4 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42013Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42013Q);
                        i4 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42009M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42009M);
                        i4 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42011O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42011O);
                        i4 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42014R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42014R);
                        i4 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42010N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42010N);
                        i4 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42028d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42028d);
                        i4 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42030e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42030e);
                        i4 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42032f = obtainStyledAttributes.getFloat(index2, jVar.f42032f);
                        i4 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42057w = obtainStyledAttributes.getFloat(index2, jVar.f42057w);
                        i4 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42026c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f42026c);
                        i4 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        int i16 = obtainStyledAttributes.getInt(index2, lVar.f42070a);
                        lVar.f42070a = i16;
                        lVar.f42070a = iArr[i16];
                        i4 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42024b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f42024b);
                        i4 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42003F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42003F);
                        i4 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42036h = f(obtainStyledAttributes, index2, jVar.f42036h);
                        i4 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.i = f(obtainStyledAttributes, index2, jVar.i);
                        i4 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42002E = obtainStyledAttributes.getInt(index2, jVar.f42002E);
                        i4 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42004G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42004G);
                        i4 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42039j = f(obtainStyledAttributes, index2, jVar.f42039j);
                        i4 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42041k = f(obtainStyledAttributes, index2, jVar.f42041k);
                        i4 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42007K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42007K);
                        i4 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42053s = f(obtainStyledAttributes, index2, jVar.f42053s);
                        i4 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42054t = f(obtainStyledAttributes, index2, jVar.f42054t);
                        i4 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42005H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42005H);
                        i4 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42045m = f(obtainStyledAttributes, index2, jVar.f42045m);
                        i4 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42043l = f(obtainStyledAttributes, index2, jVar.f42043l);
                        i4 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42058x = obtainStyledAttributes.getFloat(index2, jVar.f42058x);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5963M /* 38 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f41991a = obtainStyledAttributes.getResourceId(index2, iVar.f41991a);
                        i4 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42017U = obtainStyledAttributes.getFloat(index2, jVar.f42017U);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5965O /* 40 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42016T = obtainStyledAttributes.getFloat(index2, jVar.f42016T);
                        i4 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42018V = obtainStyledAttributes.getInt(index2, jVar.f42018V);
                        i4 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42019W = obtainStyledAttributes.getInt(index2, jVar.f42019W);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5968R /* 43 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f42072c = obtainStyledAttributes.getFloat(index2, lVar.f42072c);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5969S /* 44 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42085l = true;
                        mVar.f42086m = obtainStyledAttributes.getDimension(index2, mVar.f42086m);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5970T /* 45 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42076b = obtainStyledAttributes.getFloat(index2, mVar.f42076b);
                        i4 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42077c = obtainStyledAttributes.getFloat(index2, mVar.f42077c);
                        i4 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42078d = obtainStyledAttributes.getFloat(index2, mVar.f42078d);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5973W /* 48 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42079e = obtainStyledAttributes.getFloat(index2, mVar.f42079e);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5974X /* 49 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42080f = obtainStyledAttributes.getDimension(index2, mVar.f42080f);
                        i4 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42081g = obtainStyledAttributes.getDimension(index2, mVar.f42081g);
                        i4 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.i = obtainStyledAttributes.getDimension(index2, mVar.i);
                        i4 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42083j = obtainStyledAttributes.getDimension(index2, mVar.f42083j);
                        i4 = 1;
                        break;
                    case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42084k = obtainStyledAttributes.getDimension(index2, mVar.f42084k);
                        i4 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42020X = obtainStyledAttributes.getInt(index2, jVar.f42020X);
                        i4 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.Y = obtainStyledAttributes.getInt(index2, jVar.Y);
                        i4 = 1;
                        break;
                    case p.a.f19837e /* 56 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42021Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42021Z);
                        i4 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42023a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42023a0);
                        i4 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42025b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42025b0);
                        i4 = 1;
                        break;
                    case j.v.f12748n /* 59 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42027c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42027c0);
                        i4 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42075a = obtainStyledAttributes.getFloat(index2, mVar.f42075a);
                        i4 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42060z = f(obtainStyledAttributes, index2, jVar.f42060z);
                        i4 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f41998A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f41998A);
                        i4 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f41999B = obtainStyledAttributes.getFloat(index2, jVar.f41999B);
                        i4 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        kVar.f42062a = f(obtainStyledAttributes, index2, kVar.f42062a);
                        i4 = 1;
                        break;
                    case j.v.f12733G /* 65 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            i4 = 1;
                            break;
                        } else {
                            String str5 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i4 = 1;
                        }
                    case 66:
                        i = indexCount2;
                        str = str4;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        str2 = str3;
                        i4 = 1;
                        break;
                    case j.v.f12739d /* 67 */:
                        i = indexCount2;
                        str = str4;
                        kVar.f42066e = obtainStyledAttributes.getFloat(index2, kVar.f42066e);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str4;
                        lVar.f42073d = obtainStyledAttributes.getFloat(index2, lVar.f42073d);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case j.v.f12730D /* 69 */:
                        i = indexCount2;
                        str = str4;
                        jVar.f42029d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                        i = indexCount2;
                        str = str4;
                        jVar.f42031e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str4;
                        Log.e(str3, str);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        jVar.f42033f0 = obtainStyledAttributes.getInt(index2, jVar.f42033f0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 73:
                        i = indexCount2;
                        jVar.f42035g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42035g0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12755u /* 74 */:
                        i = indexCount2;
                        jVar.f42040j0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12756v /* 75 */:
                        i = indexCount2;
                        jVar.f42047n0 = obtainStyledAttributes.getBoolean(index2, jVar.f42047n0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12760z /* 76 */:
                        i = indexCount2;
                        kVar.f42064c = obtainStyledAttributes.getInt(index2, kVar.f42064c);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12728B /* 77 */:
                        i = indexCount2;
                        jVar.f42042k0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 78:
                        i = indexCount2;
                        lVar.f42071b = obtainStyledAttributes.getInt(index2, lVar.f42071b);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12727A /* 79 */:
                        i = indexCount2;
                        kVar.f42065d = obtainStyledAttributes.getFloat(index2, kVar.f42065d);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12729C /* 80 */:
                        i = indexCount2;
                        jVar.f42044l0 = obtainStyledAttributes.getBoolean(index2, jVar.f42044l0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12731E /* 81 */:
                        i = indexCount2;
                        jVar.m0 = obtainStyledAttributes.getBoolean(index2, jVar.m0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 82:
                        i = indexCount2;
                        kVar.f42063b = obtainStyledAttributes.getInteger(index2, kVar.f42063b);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 83:
                        i = indexCount2;
                        mVar.f42082h = f(obtainStyledAttributes, index2, mVar.f42082h);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 84:
                        i = indexCount2;
                        kVar.f42068g = obtainStyledAttributes.getInteger(index2, kVar.f42068g);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 85:
                        i = indexCount2;
                        kVar.f42067f = obtainStyledAttributes.getFloat(index2, kVar.f42067f);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 86:
                        i = indexCount2;
                        int i17 = obtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i17 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.f42069h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.i);
                        }
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 88:
                    case 89:
                    case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str3, sb2.toString());
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 91:
                        i = indexCount2;
                        jVar.f42051q = f(obtainStyledAttributes, index2, jVar.f42051q);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12734H /* 92 */:
                        i = indexCount2;
                        jVar.f42052r = f(obtainStyledAttributes, index2, jVar.f42052r);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12735I /* 93 */:
                        i = indexCount2;
                        jVar.f42008L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42008L);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 94:
                        i = indexCount2;
                        jVar.f42015S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42015S);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 95:
                        i = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 96:
                        i = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        i4 = 1;
                        str = str4;
                        str2 = str3;
                        break;
                    case 97:
                        i = indexCount2;
                        jVar.f42049o0 = obtainStyledAttributes.getInt(index2, jVar.f42049o0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                }
                i15++;
                i14 = i4;
                str3 = str2;
                str4 = str;
            }
            if (jVar.f42040j0 != null) {
                jVar.f42038i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i, int i4) {
        int resourceId = typedArray.getResourceId(i, i4);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i4) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i9 = typedArray.peekValue(i).type;
        boolean z8 = true;
        int i10 = 0;
        if (i9 == 3) {
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
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if (i4 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, trim2);
                        return;
                    }
                    if (obj instanceof j) {
                        ((j) obj).f42059y = trim2;
                        return;
                    } else {
                        if (obj instanceof h) {
                            ((h) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof e) {
                            e eVar2 = (e) obj;
                            if (i4 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.f41910H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.f41911I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i4 == 0) {
                                jVar.f42024b = 0;
                                jVar.f42017U = parseFloat;
                                return;
                            } else {
                                jVar.f42026c = 0;
                                jVar.f42016T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof h) {
                            h hVar = (h) obj;
                            if (i4 == 0) {
                                hVar.b(23, 0);
                                hVar.a(parseFloat, 39);
                                return;
                            } else {
                                hVar.b(21, 0);
                                hVar.a(parseFloat, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i4 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.f41919R = max;
                                eVar3.f41913L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.f41920S = max;
                                eVar3.f41914M = 2;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i4 == 0) {
                                jVar2.f42024b = 0;
                                jVar2.f42029d0 = max;
                                jVar2.f42020X = 2;
                                return;
                            } else {
                                jVar2.f42026c = 0;
                                jVar2.f42031e0 = max;
                                jVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof h) {
                            h hVar2 = (h) obj;
                            if (i4 == 0) {
                                hVar2.b(23, 0);
                                hVar2.b(54, 2);
                                return;
                            } else {
                                hVar2.b(21, 0);
                                hVar2.b(55, 2);
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
        if (i9 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i10 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z8 = false;
            }
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i4 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i10;
                    eVar4.f41924W = z8;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i10;
                    eVar4.f41925X = z8;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i4 == 0) {
                    jVar3.f42024b = i10;
                    jVar3.f42044l0 = z8;
                    return;
                } else {
                    jVar3.f42026c = i10;
                    jVar3.m0 = z8;
                    return;
                }
            }
            if (obj instanceof h) {
                h hVar3 = (h) obj;
                if (i4 == 0) {
                    hVar3.b(23, i10);
                    hVar3.d(80, z8);
                    return;
                } else {
                    hVar3.b(21, i10);
                    hVar3.d(81, z8);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z8 = false;
        i10 = dimensionPixelSize;
        if (!(obj instanceof e)) {
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c4 = 65535;
            int i = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c4 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c4 = 1;
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
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c4 == 1) {
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
        eVar.f41909G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i4;
        String str;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f42092c;
        HashSet hashSet2 = new HashSet(hashMap.keySet());
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f42091b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap.get(Integer.valueOf(id));
                        if (iVar != null) {
                            if (childAt instanceof C5257a) {
                                j jVar = iVar.f41994d;
                                jVar.f42037h0 = 1;
                                C5257a c5257a = (C5257a) childAt;
                                c5257a.setId(id);
                                c5257a.setType(jVar.f42033f0);
                                c5257a.setMargin(jVar.f42035g0);
                                c5257a.setAllowsGoneWidget(jVar.f42047n0);
                                int[] iArr = jVar.f42038i0;
                                if (iArr != null) {
                                    c5257a.setReferencedIds(iArr);
                                } else {
                                    String str2 = jVar.f42040j0;
                                    if (str2 != null) {
                                        int[] c4 = c(c5257a, str2);
                                        jVar.f42038i0 = c4;
                                        c5257a.setReferencedIds(c4);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap2 = iVar.f41996f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : hashMap2.keySet()) {
                                b bVar = (b) hashMap2.get(str3);
                                String f6 = !bVar.f41888a ? AbstractC5051n.f("set", str3) : str3;
                                HashSet hashSet3 = hashSet2;
                                try {
                                    int d2 = AbstractC5088e.d(bVar.f41889b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (d2) {
                                        case 0:
                                            i4 = i9;
                                            cls.getMethod(f6, cls3).invoke(childAt, Integer.valueOf(bVar.f41890c));
                                            break;
                                        case 1:
                                            i4 = i9;
                                            cls.getMethod(f6, cls2).invoke(childAt, Float.valueOf(bVar.f41891d));
                                            break;
                                        case 2:
                                            i4 = i9;
                                            cls.getMethod(f6, cls3).invoke(childAt, Integer.valueOf(bVar.f41894g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(f6, Drawable.class);
                                            i4 = i9;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f41894g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e6) {
                                                e = e6;
                                                StringBuilder m8 = CL.m(" Custom Attribute \"", str3, "\" not found on ");
                                                m8.append(cls.getName());
                                                Log.e("TransitionLayout", m8.toString(), e);
                                                hashSet2 = hashSet3;
                                                i9 = i4;
                                            } catch (NoSuchMethodException e9) {
                                                e = e9;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + f6, e);
                                                hashSet2 = hashSet3;
                                                i9 = i4;
                                            } catch (InvocationTargetException e10) {
                                                e = e10;
                                                StringBuilder m9 = CL.m(" Custom Attribute \"", str3, "\" not found on ");
                                                m9.append(cls.getName());
                                                Log.e("TransitionLayout", m9.toString(), e);
                                                hashSet2 = hashSet3;
                                                i9 = i4;
                                            }
                                        case 4:
                                            cls.getMethod(f6, CharSequence.class).invoke(childAt, bVar.f41892e);
                                            i4 = i9;
                                            break;
                                        case 5:
                                            cls.getMethod(f6, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f41893f));
                                            i4 = i9;
                                            break;
                                        case 6:
                                            cls.getMethod(f6, cls2).invoke(childAt, Float.valueOf(bVar.f41891d));
                                            i4 = i9;
                                            break;
                                        case 7:
                                            cls.getMethod(f6, cls3).invoke(childAt, Integer.valueOf(bVar.f41890c));
                                            i4 = i9;
                                            break;
                                        default:
                                            i4 = i9;
                                            break;
                                    }
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    i4 = i9;
                                } catch (NoSuchMethodException e12) {
                                    e = e12;
                                    i4 = i9;
                                } catch (InvocationTargetException e13) {
                                    e = e13;
                                    i4 = i9;
                                }
                                hashSet2 = hashSet3;
                                i9 = i4;
                            }
                            hashSet = hashSet2;
                            i = i9;
                            childAt.setLayoutParams(eVar);
                            l lVar = iVar.f41992b;
                            if (lVar.f42071b == 0) {
                                childAt.setVisibility(lVar.f42070a);
                            }
                            childAt.setAlpha(lVar.f42072c);
                            m mVar = iVar.f41995e;
                            childAt.setRotation(mVar.f42075a);
                            childAt.setRotationX(mVar.f42076b);
                            childAt.setRotationY(mVar.f42077c);
                            childAt.setScaleX(mVar.f42078d);
                            childAt.setScaleY(mVar.f42079e);
                            if (mVar.f42082h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f42082h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f42080f)) {
                                    childAt.setPivotX(mVar.f42080f);
                                }
                                if (!Float.isNaN(mVar.f42081g)) {
                                    childAt.setPivotY(mVar.f42081g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f42083j);
                            childAt.setTranslationZ(mVar.f42084k);
                            if (mVar.f42085l) {
                                childAt.setElevation(mVar.f42086m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i9;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i9 = i + 1;
                    nVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i9;
            i9 = i + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f41994d;
                if (jVar2.f42037h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C5257a c5257a2 = new C5257a(context);
                    c5257a2.f41895n = new int[32];
                    c5257a2.f41901z = new HashMap();
                    c5257a2.f41897v = context;
                    C5141a c5141a = new C5141a();
                    c5141a.f41386s0 = 0;
                    c5141a.f41387t0 = true;
                    c5141a.f41388u0 = 0;
                    c5141a.f41389v0 = false;
                    c5257a2.f41887C = c5141a;
                    c5257a2.f41898w = c5141a;
                    c5257a2.i();
                    c5257a2.setVisibility(8);
                    c5257a2.setId(num.intValue());
                    int[] iArr2 = jVar2.f42038i0;
                    if (iArr2 != null) {
                        c5257a2.setReferencedIds(iArr2);
                    } else {
                        String str4 = jVar2.f42040j0;
                        if (str4 != null) {
                            int[] c9 = c(c5257a2, str4);
                            jVar2.f42038i0 = c9;
                            c5257a2.setReferencedIds(c9);
                        }
                    }
                    c5257a2.setType(jVar2.f42033f0);
                    c5257a2.setMargin(jVar2.f42035g0);
                    e g9 = ConstraintLayout.g();
                    c5257a2.i();
                    iVar2.a(g9);
                    constraintLayout.addView(c5257a2, g9);
                }
                if (jVar2.f42022a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e g10 = ConstraintLayout.g();
                    iVar2.a(g10);
                    constraintLayout.addView(pVar, g10);
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = constraintLayout.getChildAt(i10);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i4;
        HashMap hashMap2;
        int i9;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = nVar.f42092c;
        hashMap3.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f42091b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id))) {
                hashMap3.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap3.get(Integer.valueOf(id));
            if (iVar == null) {
                i = childCount;
                hashMap = hashMap3;
                i4 = i10;
            } else {
                HashMap hashMap4 = nVar.f42090a;
                HashMap hashMap5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    int i11 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap5.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                i9 = i10;
                            } catch (IllegalAccessException e6) {
                                e = e6;
                                i9 = i10;
                                StringBuilder m8 = CL.m(" Custom Attribute \"", str, "\" not found on ");
                                m8.append(cls.getName());
                                Log.e("TransitionLayout", m8.toString(), e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e9) {
                                e = e9;
                                i9 = i10;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e10) {
                                e = e10;
                                i9 = i10;
                                StringBuilder m9 = CL.m(" Custom Attribute \"", str, "\" not found on ");
                                m9.append(cls.getName());
                                Log.e("TransitionLayout", m9.toString(), e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            i9 = i10;
                            try {
                                hashMap5.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e11) {
                                e = e11;
                                StringBuilder m82 = CL.m(" Custom Attribute \"", str, "\" not found on ");
                                m82.append(cls.getName());
                                Log.e("TransitionLayout", m82.toString(), e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e12) {
                                e = e12;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e13) {
                                e = e13;
                                StringBuilder m92 = CL.m(" Custom Attribute \"", str, "\" not found on ");
                                m92.append(cls.getName());
                                Log.e("TransitionLayout", m92.toString(), e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            }
                        }
                    } catch (IllegalAccessException e14) {
                        e = e14;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e16) {
                        e = e16;
                        hashMap2 = hashMap3;
                    }
                    i10 = i9;
                    childCount = i11;
                    hashMap3 = hashMap2;
                }
                i = childCount;
                hashMap = hashMap3;
                i4 = i10;
                iVar.f41996f = hashMap5;
                iVar.f41991a = id;
                int i12 = eVar.f41935e;
                j jVar = iVar.f41994d;
                jVar.f42036h = i12;
                jVar.i = eVar.f41937f;
                jVar.f42039j = eVar.f41939g;
                jVar.f42041k = eVar.f41941h;
                jVar.f42043l = eVar.i;
                jVar.f42045m = eVar.f41944j;
                jVar.f42046n = eVar.f41946k;
                jVar.f42048o = eVar.f41948l;
                jVar.f42050p = eVar.f41950m;
                jVar.f42051q = eVar.f41951n;
                jVar.f42052r = eVar.f41953o;
                jVar.f42053s = eVar.f41959s;
                jVar.f42054t = eVar.f41960t;
                jVar.f42055u = eVar.f41961u;
                jVar.f42056v = eVar.f41962v;
                jVar.f42057w = eVar.f41907E;
                jVar.f42058x = eVar.f41908F;
                jVar.f42059y = eVar.f41909G;
                jVar.f42060z = eVar.f41955p;
                jVar.f41998A = eVar.f41957q;
                jVar.f41999B = eVar.f41958r;
                jVar.f42000C = eVar.f41921T;
                jVar.f42001D = eVar.f41922U;
                jVar.f42002E = eVar.f41923V;
                jVar.f42032f = eVar.f41931c;
                jVar.f42028d = eVar.f41927a;
                jVar.f42030e = eVar.f41929b;
                jVar.f42024b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f42026c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.f42003F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.f42004G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.f42005H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.f42006I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.f42008L = eVar.f41906D;
                jVar.f42016T = eVar.f41911I;
                jVar.f42017U = eVar.f41910H;
                jVar.f42019W = eVar.f41912K;
                jVar.f42018V = eVar.J;
                jVar.f42044l0 = eVar.f41924W;
                jVar.m0 = eVar.f41925X;
                jVar.f42020X = eVar.f41913L;
                jVar.Y = eVar.f41914M;
                jVar.f42021Z = eVar.f41917P;
                jVar.f42023a0 = eVar.f41918Q;
                jVar.f42025b0 = eVar.f41915N;
                jVar.f42027c0 = eVar.f41916O;
                jVar.f42029d0 = eVar.f41919R;
                jVar.f42031e0 = eVar.f41920S;
                jVar.f42042k0 = eVar.Y;
                jVar.f42010N = eVar.f41964x;
                jVar.f42012P = eVar.f41966z;
                jVar.f42009M = eVar.f41963w;
                jVar.f42011O = eVar.f41965y;
                jVar.f42014R = eVar.f41903A;
                jVar.f42013Q = eVar.f41904B;
                jVar.f42015S = eVar.f41905C;
                jVar.f42049o0 = eVar.f41926Z;
                jVar.J = eVar.getMarginEnd();
                jVar.f42007K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f41992b;
                lVar.f42070a = visibility;
                lVar.f42072c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f41995e;
                mVar.f42075a = rotation;
                mVar.f42076b = childAt.getRotationX();
                mVar.f42077c = childAt.getRotationY();
                mVar.f42078d = childAt.getScaleX();
                mVar.f42079e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f42080f = pivotX;
                    mVar.f42081g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f42083j = childAt.getTranslationY();
                mVar.f42084k = childAt.getTranslationZ();
                if (mVar.f42085l) {
                    mVar.f42086m = childAt.getElevation();
                }
                if (childAt instanceof C5257a) {
                    C5257a c5257a = (C5257a) childAt;
                    jVar.f42047n0 = c5257a.getAllowsGoneWidget();
                    jVar.f42038i0 = c5257a.getReferencedIds();
                    jVar.f42033f0 = c5257a.getType();
                    jVar.f42035g0 = c5257a.getMargin();
                }
            }
            i10 = i4 + 1;
            nVar = this;
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
                    i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f41994d.f42022a = true;
                    }
                    this.f42092c.put(Integer.valueOf(d2.f41991a), d2);
                }
            }
        } catch (IOException e6) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e6);
        } catch (XmlPullParserException e9) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e9);
        }
    }
}
