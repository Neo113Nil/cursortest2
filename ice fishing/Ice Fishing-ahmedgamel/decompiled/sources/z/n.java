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
import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u.AbstractC5050e;
import v.AbstractC5094a;
import w.AbstractC5128c;
import w.C5126a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f42176d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f42177e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f42178f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f42179a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42180b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f42181c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42177e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f42178f = sparseIntArray2;
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
        sparseIntArray.append(com.anythink.expressad.video.module.a.a.f22543z, 16);
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

    public static int[] c(C5211a c5211a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c5211a.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        int i6 = 0;
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
            if (i == 0 && c5211a.isInEditMode() && (c5211a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c5211a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f4617F;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f4617F.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i6] = i;
            i4++;
            i6++;
        }
        return i6 != split.length ? Arrays.copyOf(iArr, i6) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x05fc. Please report as an issue. */
    public static i d(Context context, AttributeSet attributeSet, boolean z6) {
        int i;
        String str;
        String str2;
        int i4;
        int i6;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z6 ? r.f42185c : r.f42183a);
        int[] iArr = f42176d;
        String[] strArr = AbstractC5094a.f41077a;
        SparseIntArray sparseIntArray = f42177e;
        l lVar = iVar.f42081b;
        m mVar = iVar.f42084e;
        k kVar = iVar.f42082c;
        j jVar = iVar.f42083d;
        String str3 = "ConstraintSet";
        if (z6) {
            h hVar = new h();
            hVar.f42069a = new int[10];
            hVar.f42070b = new int[10];
            hVar.f42071c = 0;
            hVar.f42072d = new int[10];
            hVar.f42073e = new float[10];
            hVar.f42074f = 0;
            hVar.f42075g = new int[5];
            hVar.f42076h = new String[5];
            hVar.i = 0;
            hVar.f42077j = new int[4];
            hVar.f42078k = new boolean[4];
            hVar.f42079l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i9 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i9 < indexCount; indexCount = i6) {
                int index = obtainStyledAttributes.getIndex(i9);
                int i10 = i9;
                switch (f42178f.get(index)) {
                    case 2:
                        i6 = indexCount;
                        hVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42095I));
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
                    case j.v.f13363H /* 92 */:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i6 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i6 = indexCount;
                        hVar.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        i6 = indexCount;
                        hVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42089C));
                        break;
                    case 7:
                        i6 = indexCount;
                        hVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42090D));
                        break;
                    case 8:
                        i6 = indexCount;
                        hVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        i6 = indexCount;
                        hVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42101P));
                        break;
                    case 12:
                        i6 = indexCount;
                        hVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42102Q));
                        break;
                    case 13:
                        i6 = indexCount;
                        hVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42098M));
                        break;
                    case 14:
                        i6 = indexCount;
                        hVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42100O));
                        break;
                    case 15:
                        i6 = indexCount;
                        hVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42103R));
                        break;
                    case 16:
                        i6 = indexCount;
                        hVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42099N));
                        break;
                    case 17:
                        i6 = indexCount;
                        hVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42117d));
                        break;
                    case 18:
                        i6 = indexCount;
                        hVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42119e));
                        break;
                    case 19:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42121f), 19);
                        break;
                    case 20:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42146w), 20);
                        break;
                    case 21:
                        i6 = indexCount;
                        hVar.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f42115c));
                        break;
                    case 22:
                        i6 = indexCount;
                        hVar.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f42159a)]);
                        break;
                    case 23:
                        i6 = indexCount;
                        hVar.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f42113b));
                        break;
                    case 24:
                        i6 = indexCount;
                        hVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42092F));
                        break;
                    case 27:
                        i6 = indexCount;
                        hVar.b(27, obtainStyledAttributes.getInt(index, jVar.f42091E));
                        break;
                    case 28:
                        i6 = indexCount;
                        hVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42093G));
                        break;
                    case 31:
                        i6 = indexCount;
                        hVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42096K));
                        break;
                    case 34:
                        i6 = indexCount;
                        hVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42094H));
                        break;
                    case 37:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42147x), 37);
                        break;
                    case com.anythink.basead.b.b.j.f6592M /* 38 */:
                        i6 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f42080a);
                        iVar.f42080a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case 39:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42106U), 39);
                        break;
                    case com.anythink.basead.b.b.j.f6594O /* 40 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42105T), 40);
                        break;
                    case 41:
                        i6 = indexCount;
                        hVar.b(41, obtainStyledAttributes.getInt(index, jVar.f42107V));
                        break;
                    case 42:
                        i6 = indexCount;
                        hVar.b(42, obtainStyledAttributes.getInt(index, jVar.f42108W));
                        break;
                    case com.anythink.basead.b.b.j.f6597R /* 43 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, lVar.f42161c), 43);
                        break;
                    case com.anythink.basead.b.b.j.f6598S /* 44 */:
                        i6 = indexCount;
                        hVar.d(44, true);
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42175m), 44);
                        break;
                    case com.anythink.basead.b.b.j.f6599T /* 45 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42165b), 45);
                        break;
                    case 46:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42166c), 46);
                        break;
                    case 47:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42167d), 47);
                        break;
                    case com.anythink.basead.b.b.j.f6602W /* 48 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42168e), 48);
                        break;
                    case com.anythink.basead.b.b.j.f6603X /* 49 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42169f), 49);
                        break;
                    case 50:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42170g), 50);
                        break;
                    case 51:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.i), 51);
                        break;
                    case 52:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42172j), 52);
                        break;
                    case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42173k), 53);
                        break;
                    case 54:
                        i6 = indexCount;
                        hVar.b(54, obtainStyledAttributes.getInt(index, jVar.f42109X));
                        break;
                    case 55:
                        i6 = indexCount;
                        hVar.b(55, obtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case p.a.f20466e /* 56 */:
                        i6 = indexCount;
                        hVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42110Z));
                        break;
                    case 57:
                        i6 = indexCount;
                        hVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42112a0));
                        break;
                    case 58:
                        i6 = indexCount;
                        hVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42114b0));
                        break;
                    case j.v.f13377n /* 59 */:
                        i6 = indexCount;
                        hVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42116c0));
                        break;
                    case 60:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42164a), 60);
                        break;
                    case 62:
                        i6 = indexCount;
                        hVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42087A));
                        break;
                    case 63:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42088B), 63);
                        break;
                    case 64:
                        i6 = indexCount;
                        hVar.b(64, f(obtainStyledAttributes, index, kVar.f42151a));
                        break;
                    case j.v.f13362G /* 65 */:
                        i6 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.c(65, obtainStyledAttributes.getString(index));
                        } else {
                            hVar.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i6 = indexCount;
                        hVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case j.v.f13368d /* 67 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42155e), 67);
                        break;
                    case 68:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, lVar.f42162d), 68);
                        break;
                    case j.v.f13359D /* 69 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i6 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i6 = indexCount;
                        hVar.b(72, obtainStyledAttributes.getInt(index, jVar.f42122f0));
                        break;
                    case 73:
                        i6 = indexCount;
                        hVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42124g0));
                        break;
                    case j.v.f13384u /* 74 */:
                        i6 = indexCount;
                        hVar.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case j.v.f13385v /* 75 */:
                        i6 = indexCount;
                        hVar.d(75, obtainStyledAttributes.getBoolean(index, jVar.f42136n0));
                        break;
                    case j.v.f13389z /* 76 */:
                        i6 = indexCount;
                        hVar.b(76, obtainStyledAttributes.getInt(index, kVar.f42153c));
                        break;
                    case j.v.f13357B /* 77 */:
                        i6 = indexCount;
                        hVar.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i6 = indexCount;
                        hVar.b(78, obtainStyledAttributes.getInt(index, lVar.f42160b));
                        break;
                    case j.v.f13356A /* 79 */:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42154d), 79);
                        break;
                    case j.v.f13358C /* 80 */:
                        i6 = indexCount;
                        hVar.d(80, obtainStyledAttributes.getBoolean(index, jVar.f42133l0));
                        break;
                    case j.v.f13360E /* 81 */:
                        i6 = indexCount;
                        hVar.d(81, obtainStyledAttributes.getBoolean(index, jVar.m0));
                        break;
                    case 82:
                        i6 = indexCount;
                        hVar.b(82, obtainStyledAttributes.getInteger(index, kVar.f42152b));
                        break;
                    case 83:
                        i6 = indexCount;
                        hVar.b(83, f(obtainStyledAttributes, index, mVar.f42171h));
                        break;
                    case 84:
                        i6 = indexCount;
                        hVar.b(84, obtainStyledAttributes.getInteger(index, kVar.f42157g));
                        break;
                    case 85:
                        i6 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42156f), 85);
                        break;
                    case 86:
                        i6 = indexCount;
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.i != -1) {
                                hVar.b(88, -2);
                            }
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.f42158h = string;
                            hVar.c(90, string);
                            if (kVar.f42158h.indexOf("/") > 0) {
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
                        i6 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case j.v.f13364I /* 93 */:
                        i6 = indexCount;
                        hVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42097L));
                        break;
                    case 94:
                        i6 = indexCount;
                        hVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42104S));
                        break;
                    case 95:
                        i6 = indexCount;
                        g(hVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i6 = indexCount;
                        g(hVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i6 = indexCount;
                        hVar.b(97, obtainStyledAttributes.getInt(index, jVar.f42138o0));
                        break;
                    case 98:
                        i6 = indexCount;
                        int i12 = y.a.J;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            iVar.f42080a = obtainStyledAttributes.getResourceId(index, iVar.f42080a);
                        }
                        break;
                    case 99:
                        i6 = indexCount;
                        hVar.d(99, obtainStyledAttributes.getBoolean(index, jVar.f42123g));
                        break;
                }
                i9 = i10 + 1;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            int i13 = 1;
            int i14 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i14 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i14);
                if (index2 != i13 && 23 != index2) {
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
                        jVar.f42139p = f(obtainStyledAttributes, index2, jVar.f42139p);
                        i4 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42095I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42095I);
                        i4 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42137o = f(obtainStyledAttributes, index2, jVar.f42137o);
                        i4 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42135n = f(obtainStyledAttributes, index2, jVar.f42135n);
                        i4 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42148y = obtainStyledAttributes.getString(index2);
                        i4 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42089C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42089C);
                        i4 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42090D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42090D);
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
                        jVar.f42145v = f(obtainStyledAttributes, index2, jVar.f42145v);
                        i4 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42144u = f(obtainStyledAttributes, index2, jVar.f42144u);
                        i4 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42101P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42101P);
                        i4 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42102Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42102Q);
                        i4 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42098M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42098M);
                        i4 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42100O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42100O);
                        i4 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42103R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42103R);
                        i4 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42099N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42099N);
                        i4 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42117d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42117d);
                        i4 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42119e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42119e);
                        i4 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42121f = obtainStyledAttributes.getFloat(index2, jVar.f42121f);
                        i4 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42146w = obtainStyledAttributes.getFloat(index2, jVar.f42146w);
                        i4 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42115c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f42115c);
                        i4 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        int i15 = obtainStyledAttributes.getInt(index2, lVar.f42159a);
                        lVar.f42159a = i15;
                        lVar.f42159a = iArr[i15];
                        i4 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42113b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f42113b);
                        i4 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42092F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42092F);
                        i4 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42125h = f(obtainStyledAttributes, index2, jVar.f42125h);
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
                        jVar.f42091E = obtainStyledAttributes.getInt(index2, jVar.f42091E);
                        i4 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42093G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42093G);
                        i4 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42128j = f(obtainStyledAttributes, index2, jVar.f42128j);
                        i4 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42130k = f(obtainStyledAttributes, index2, jVar.f42130k);
                        i4 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42096K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42096K);
                        i4 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42142s = f(obtainStyledAttributes, index2, jVar.f42142s);
                        i4 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42143t = f(obtainStyledAttributes, index2, jVar.f42143t);
                        i4 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42094H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42094H);
                        i4 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42134m = f(obtainStyledAttributes, index2, jVar.f42134m);
                        i4 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42132l = f(obtainStyledAttributes, index2, jVar.f42132l);
                        i4 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42147x = obtainStyledAttributes.getFloat(index2, jVar.f42147x);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f6592M /* 38 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f42080a = obtainStyledAttributes.getResourceId(index2, iVar.f42080a);
                        i4 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42106U = obtainStyledAttributes.getFloat(index2, jVar.f42106U);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f6594O /* 40 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42105T = obtainStyledAttributes.getFloat(index2, jVar.f42105T);
                        i4 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42107V = obtainStyledAttributes.getInt(index2, jVar.f42107V);
                        i4 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42108W = obtainStyledAttributes.getInt(index2, jVar.f42108W);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f6597R /* 43 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f42161c = obtainStyledAttributes.getFloat(index2, lVar.f42161c);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f6598S /* 44 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42174l = true;
                        mVar.f42175m = obtainStyledAttributes.getDimension(index2, mVar.f42175m);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f6599T /* 45 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42165b = obtainStyledAttributes.getFloat(index2, mVar.f42165b);
                        i4 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42166c = obtainStyledAttributes.getFloat(index2, mVar.f42166c);
                        i4 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42167d = obtainStyledAttributes.getFloat(index2, mVar.f42167d);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f6602W /* 48 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42168e = obtainStyledAttributes.getFloat(index2, mVar.f42168e);
                        i4 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f6603X /* 49 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42169f = obtainStyledAttributes.getDimension(index2, mVar.f42169f);
                        i4 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42170g = obtainStyledAttributes.getDimension(index2, mVar.f42170g);
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
                        mVar.f42172j = obtainStyledAttributes.getDimension(index2, mVar.f42172j);
                        i4 = 1;
                        break;
                    case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42173k = obtainStyledAttributes.getDimension(index2, mVar.f42173k);
                        i4 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42109X = obtainStyledAttributes.getInt(index2, jVar.f42109X);
                        i4 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.Y = obtainStyledAttributes.getInt(index2, jVar.Y);
                        i4 = 1;
                        break;
                    case p.a.f20466e /* 56 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42110Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42110Z);
                        i4 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42112a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42112a0);
                        i4 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42114b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42114b0);
                        i4 = 1;
                        break;
                    case j.v.f13377n /* 59 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42116c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42116c0);
                        i4 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42164a = obtainStyledAttributes.getFloat(index2, mVar.f42164a);
                        i4 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42149z = f(obtainStyledAttributes, index2, jVar.f42149z);
                        i4 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42087A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42087A);
                        i4 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42088B = obtainStyledAttributes.getFloat(index2, jVar.f42088B);
                        i4 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        kVar.f42151a = f(obtainStyledAttributes, index2, kVar.f42151a);
                        i4 = 1;
                        break;
                    case j.v.f13362G /* 65 */:
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
                    case j.v.f13368d /* 67 */:
                        i = indexCount2;
                        str = str4;
                        kVar.f42155e = obtainStyledAttributes.getFloat(index2, kVar.f42155e);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str4;
                        lVar.f42162d = obtainStyledAttributes.getFloat(index2, lVar.f42162d);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case j.v.f13359D /* 69 */:
                        i = indexCount2;
                        str = str4;
                        jVar.f42118d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i4 = 1;
                        break;
                    case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                        i = indexCount2;
                        str = str4;
                        jVar.f42120e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        jVar.f42122f0 = obtainStyledAttributes.getInt(index2, jVar.f42122f0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 73:
                        i = indexCount2;
                        jVar.f42124g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42124g0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13384u /* 74 */:
                        i = indexCount2;
                        jVar.f42129j0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13385v /* 75 */:
                        i = indexCount2;
                        jVar.f42136n0 = obtainStyledAttributes.getBoolean(index2, jVar.f42136n0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13389z /* 76 */:
                        i = indexCount2;
                        kVar.f42153c = obtainStyledAttributes.getInt(index2, kVar.f42153c);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13357B /* 77 */:
                        i = indexCount2;
                        jVar.f42131k0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 78:
                        i = indexCount2;
                        lVar.f42160b = obtainStyledAttributes.getInt(index2, lVar.f42160b);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13356A /* 79 */:
                        i = indexCount2;
                        kVar.f42154d = obtainStyledAttributes.getFloat(index2, kVar.f42154d);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13358C /* 80 */:
                        i = indexCount2;
                        jVar.f42133l0 = obtainStyledAttributes.getBoolean(index2, jVar.f42133l0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13360E /* 81 */:
                        i = indexCount2;
                        jVar.m0 = obtainStyledAttributes.getBoolean(index2, jVar.m0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 82:
                        i = indexCount2;
                        kVar.f42152b = obtainStyledAttributes.getInteger(index2, kVar.f42152b);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 83:
                        i = indexCount2;
                        mVar.f42171h = f(obtainStyledAttributes, index2, mVar.f42171h);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 84:
                        i = indexCount2;
                        kVar.f42157g = obtainStyledAttributes.getInteger(index2, kVar.f42157g);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 85:
                        i = indexCount2;
                        kVar.f42156f = obtainStyledAttributes.getFloat(index2, kVar.f42156f);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 86:
                        i = indexCount2;
                        int i16 = obtainStyledAttributes.peekValue(index2).type;
                        if (i16 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i16 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.f42158h = string2;
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
                        jVar.f42140q = f(obtainStyledAttributes, index2, jVar.f42140q);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13363H /* 92 */:
                        i = indexCount2;
                        jVar.f42141r = f(obtainStyledAttributes, index2, jVar.f42141r);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case j.v.f13364I /* 93 */:
                        i = indexCount2;
                        jVar.f42097L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42097L);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                    case 94:
                        i = indexCount2;
                        jVar.f42104S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42104S);
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
                        jVar.f42138o0 = obtainStyledAttributes.getInt(index2, jVar.f42138o0);
                        str = str4;
                        i4 = 1;
                        str2 = str3;
                        break;
                }
                i14++;
                i13 = i4;
                str3 = str2;
                str4 = str;
            }
            if (jVar.f42129j0 != null) {
                jVar.f42127i0 = null;
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
        int i6 = typedArray.peekValue(i).type;
        boolean z6 = true;
        int i9 = 0;
        if (i6 == 3) {
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
                        ((j) obj).f42148y = trim2;
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
                                eVar2.f41999H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.f42000I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i4 == 0) {
                                jVar.f42113b = 0;
                                jVar.f42106U = parseFloat;
                                return;
                            } else {
                                jVar.f42115c = 0;
                                jVar.f42105T = parseFloat;
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
                                eVar3.f42008R = max;
                                eVar3.f42002L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.f42009S = max;
                                eVar3.f42003M = 2;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i4 == 0) {
                                jVar2.f42113b = 0;
                                jVar2.f42118d0 = max;
                                jVar2.f42109X = 2;
                                return;
                            } else {
                                jVar2.f42115c = 0;
                                jVar2.f42120e0 = max;
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
        if (i6 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i9 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z6 = false;
            }
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i4 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i9;
                    eVar4.f42013W = z6;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i9;
                    eVar4.f42014X = z6;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i4 == 0) {
                    jVar3.f42113b = i9;
                    jVar3.f42133l0 = z6;
                    return;
                } else {
                    jVar3.f42115c = i9;
                    jVar3.m0 = z6;
                    return;
                }
            }
            if (obj instanceof h) {
                h hVar3 = (h) obj;
                if (i4 == 0) {
                    hVar3.b(23, i9);
                    hVar3.d(80, z6);
                    return;
                } else {
                    hVar3.b(21, i9);
                    hVar3.d(81, z6);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z6 = false;
        i9 = dimensionPixelSize;
        if (!(obj instanceof e)) {
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c9 = 65535;
            int i = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c9 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c9 = 1;
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
                            if (c9 == 1) {
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
        eVar.f41998G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i4;
        String str;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f42181c;
        HashSet hashSet2 = new HashSet(hashMap.keySet());
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout.getChildAt(i6);
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
                if (nVar.f42180b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap.get(Integer.valueOf(id));
                        if (iVar != null) {
                            if (childAt instanceof C5211a) {
                                j jVar = iVar.f42083d;
                                jVar.f42126h0 = 1;
                                C5211a c5211a = (C5211a) childAt;
                                c5211a.setId(id);
                                c5211a.setType(jVar.f42122f0);
                                c5211a.setMargin(jVar.f42124g0);
                                c5211a.setAllowsGoneWidget(jVar.f42136n0);
                                int[] iArr = jVar.f42127i0;
                                if (iArr != null) {
                                    c5211a.setReferencedIds(iArr);
                                } else {
                                    String str2 = jVar.f42129j0;
                                    if (str2 != null) {
                                        int[] c9 = c(c5211a, str2);
                                        jVar.f42127i0 = c9;
                                        c5211a.setReferencedIds(c9);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap2 = iVar.f42085f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : hashMap2.keySet()) {
                                b bVar = (b) hashMap2.get(str3);
                                String f2 = !bVar.f41977a ? AbstractC5128c.f("set", str3) : str3;
                                HashSet hashSet3 = hashSet2;
                                try {
                                    int d9 = AbstractC5050e.d(bVar.f41978b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (d9) {
                                        case 0:
                                            i4 = i6;
                                            cls.getMethod(f2, cls3).invoke(childAt, Integer.valueOf(bVar.f41979c));
                                            break;
                                        case 1:
                                            i4 = i6;
                                            cls.getMethod(f2, cls2).invoke(childAt, Float.valueOf(bVar.f41980d));
                                            break;
                                        case 2:
                                            i4 = i6;
                                            cls.getMethod(f2, cls3).invoke(childAt, Integer.valueOf(bVar.f41983g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(f2, Drawable.class);
                                            i4 = i6;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f41983g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e9) {
                                                e = e9;
                                                StringBuilder l9 = Wv.l(" Custom Attribute \"", str3, "\" not found on ");
                                                l9.append(cls.getName());
                                                Log.e("TransitionLayout", l9.toString(), e);
                                                hashSet2 = hashSet3;
                                                i6 = i4;
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + f2, e);
                                                hashSet2 = hashSet3;
                                                i6 = i4;
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder l10 = Wv.l(" Custom Attribute \"", str3, "\" not found on ");
                                                l10.append(cls.getName());
                                                Log.e("TransitionLayout", l10.toString(), e);
                                                hashSet2 = hashSet3;
                                                i6 = i4;
                                            }
                                        case 4:
                                            cls.getMethod(f2, CharSequence.class).invoke(childAt, bVar.f41981e);
                                            i4 = i6;
                                            break;
                                        case 5:
                                            cls.getMethod(f2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f41982f));
                                            i4 = i6;
                                            break;
                                        case 6:
                                            cls.getMethod(f2, cls2).invoke(childAt, Float.valueOf(bVar.f41980d));
                                            i4 = i6;
                                            break;
                                        case 7:
                                            cls.getMethod(f2, cls3).invoke(childAt, Integer.valueOf(bVar.f41979c));
                                            i4 = i6;
                                            break;
                                        default:
                                            i4 = i6;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    i4 = i6;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    i4 = i6;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    i4 = i6;
                                }
                                hashSet2 = hashSet3;
                                i6 = i4;
                            }
                            hashSet = hashSet2;
                            i = i6;
                            childAt.setLayoutParams(eVar);
                            l lVar = iVar.f42081b;
                            if (lVar.f42160b == 0) {
                                childAt.setVisibility(lVar.f42159a);
                            }
                            childAt.setAlpha(lVar.f42161c);
                            m mVar = iVar.f42084e;
                            childAt.setRotation(mVar.f42164a);
                            childAt.setRotationX(mVar.f42165b);
                            childAt.setRotationY(mVar.f42166c);
                            childAt.setScaleX(mVar.f42167d);
                            childAt.setScaleY(mVar.f42168e);
                            if (mVar.f42171h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f42171h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f42169f)) {
                                    childAt.setPivotX(mVar.f42169f);
                                }
                                if (!Float.isNaN(mVar.f42170g)) {
                                    childAt.setPivotY(mVar.f42170g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f42172j);
                            childAt.setTranslationZ(mVar.f42173k);
                            if (mVar.f42174l) {
                                childAt.setElevation(mVar.f42175m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i6;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i6 = i + 1;
                    nVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i6;
            i6 = i + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f42083d;
                if (jVar2.f42126h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C5211a c5211a2 = new C5211a(context);
                    c5211a2.f41984n = new int[32];
                    c5211a2.f41990z = new HashMap();
                    c5211a2.f41986v = context;
                    C5126a c5126a = new C5126a();
                    c5126a.f41230s0 = 0;
                    c5126a.f41231t0 = true;
                    c5126a.f41232u0 = 0;
                    c5126a.f41233v0 = false;
                    c5211a2.f41976C = c5126a;
                    c5211a2.f41987w = c5126a;
                    c5211a2.i();
                    c5211a2.setVisibility(8);
                    c5211a2.setId(num.intValue());
                    int[] iArr2 = jVar2.f42127i0;
                    if (iArr2 != null) {
                        c5211a2.setReferencedIds(iArr2);
                    } else {
                        String str4 = jVar2.f42129j0;
                        if (str4 != null) {
                            int[] c10 = c(c5211a2, str4);
                            jVar2.f42127i0 = c10;
                            c5211a2.setReferencedIds(c10);
                        }
                    }
                    c5211a2.setType(jVar2.f42122f0);
                    c5211a2.setMargin(jVar2.f42124g0);
                    e g9 = ConstraintLayout.g();
                    c5211a2.i();
                    iVar2.a(g9);
                    constraintLayout.addView(c5211a2, g9);
                }
                if (jVar2.f42111a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e g10 = ConstraintLayout.g();
                    iVar2.a(g10);
                    constraintLayout.addView(pVar, g10);
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = constraintLayout.getChildAt(i9);
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
        int i6;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = nVar.f42181c;
        hashMap3.clear();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f42180b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id))) {
                hashMap3.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap3.get(Integer.valueOf(id));
            if (iVar == null) {
                i = childCount;
                hashMap = hashMap3;
                i4 = i9;
            } else {
                HashMap hashMap4 = nVar.f42179a;
                HashMap hashMap5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    int i10 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap5.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                i6 = i9;
                            } catch (IllegalAccessException e9) {
                                e = e9;
                                i6 = i9;
                                StringBuilder l9 = Wv.l(" Custom Attribute \"", str, "\" not found on ");
                                l9.append(cls.getName());
                                Log.e("TransitionLayout", l9.toString(), e);
                                i9 = i6;
                                childCount = i10;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                i6 = i9;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                i9 = i6;
                                childCount = i10;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e11) {
                                e = e11;
                                i6 = i9;
                                StringBuilder l10 = Wv.l(" Custom Attribute \"", str, "\" not found on ");
                                l10.append(cls.getName());
                                Log.e("TransitionLayout", l10.toString(), e);
                                i9 = i6;
                                childCount = i10;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            i6 = i9;
                            try {
                                hashMap5.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e12) {
                                e = e12;
                                StringBuilder l92 = Wv.l(" Custom Attribute \"", str, "\" not found on ");
                                l92.append(cls.getName());
                                Log.e("TransitionLayout", l92.toString(), e);
                                i9 = i6;
                                childCount = i10;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e13) {
                                e = e13;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                i9 = i6;
                                childCount = i10;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e14) {
                                e = e14;
                                StringBuilder l102 = Wv.l(" Custom Attribute \"", str, "\" not found on ");
                                l102.append(cls.getName());
                                Log.e("TransitionLayout", l102.toString(), e);
                                i9 = i6;
                                childCount = i10;
                                hashMap3 = hashMap2;
                            }
                        }
                    } catch (IllegalAccessException e15) {
                        e = e15;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e16) {
                        e = e16;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e17) {
                        e = e17;
                        hashMap2 = hashMap3;
                    }
                    i9 = i6;
                    childCount = i10;
                    hashMap3 = hashMap2;
                }
                i = childCount;
                hashMap = hashMap3;
                i4 = i9;
                iVar.f42085f = hashMap5;
                iVar.f42080a = id;
                int i11 = eVar.f42024e;
                j jVar = iVar.f42083d;
                jVar.f42125h = i11;
                jVar.i = eVar.f42026f;
                jVar.f42128j = eVar.f42028g;
                jVar.f42130k = eVar.f42030h;
                jVar.f42132l = eVar.i;
                jVar.f42134m = eVar.f42033j;
                jVar.f42135n = eVar.f42035k;
                jVar.f42137o = eVar.f42037l;
                jVar.f42139p = eVar.f42039m;
                jVar.f42140q = eVar.f42040n;
                jVar.f42141r = eVar.f42042o;
                jVar.f42142s = eVar.f42048s;
                jVar.f42143t = eVar.f42049t;
                jVar.f42144u = eVar.f42050u;
                jVar.f42145v = eVar.f42051v;
                jVar.f42146w = eVar.f41996E;
                jVar.f42147x = eVar.f41997F;
                jVar.f42148y = eVar.f41998G;
                jVar.f42149z = eVar.f42044p;
                jVar.f42087A = eVar.f42046q;
                jVar.f42088B = eVar.f42047r;
                jVar.f42089C = eVar.f42010T;
                jVar.f42090D = eVar.f42011U;
                jVar.f42091E = eVar.f42012V;
                jVar.f42121f = eVar.f42020c;
                jVar.f42117d = eVar.f42016a;
                jVar.f42119e = eVar.f42018b;
                jVar.f42113b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f42115c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.f42092F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.f42093G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.f42094H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.f42095I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.f42097L = eVar.f41995D;
                jVar.f42105T = eVar.f42000I;
                jVar.f42106U = eVar.f41999H;
                jVar.f42108W = eVar.f42001K;
                jVar.f42107V = eVar.J;
                jVar.f42133l0 = eVar.f42013W;
                jVar.m0 = eVar.f42014X;
                jVar.f42109X = eVar.f42002L;
                jVar.Y = eVar.f42003M;
                jVar.f42110Z = eVar.f42006P;
                jVar.f42112a0 = eVar.f42007Q;
                jVar.f42114b0 = eVar.f42004N;
                jVar.f42116c0 = eVar.f42005O;
                jVar.f42118d0 = eVar.f42008R;
                jVar.f42120e0 = eVar.f42009S;
                jVar.f42131k0 = eVar.Y;
                jVar.f42099N = eVar.f42053x;
                jVar.f42101P = eVar.f42055z;
                jVar.f42098M = eVar.f42052w;
                jVar.f42100O = eVar.f42054y;
                jVar.f42103R = eVar.f41992A;
                jVar.f42102Q = eVar.f41993B;
                jVar.f42104S = eVar.f41994C;
                jVar.f42138o0 = eVar.f42015Z;
                jVar.J = eVar.getMarginEnd();
                jVar.f42096K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f42081b;
                lVar.f42159a = visibility;
                lVar.f42161c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f42084e;
                mVar.f42164a = rotation;
                mVar.f42165b = childAt.getRotationX();
                mVar.f42166c = childAt.getRotationY();
                mVar.f42167d = childAt.getScaleX();
                mVar.f42168e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f42169f = pivotX;
                    mVar.f42170g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f42172j = childAt.getTranslationY();
                mVar.f42173k = childAt.getTranslationZ();
                if (mVar.f42174l) {
                    mVar.f42175m = childAt.getElevation();
                }
                if (childAt instanceof C5211a) {
                    C5211a c5211a = (C5211a) childAt;
                    jVar.f42136n0 = c5211a.getAllowsGoneWidget();
                    jVar.f42127i0 = c5211a.getReferencedIds();
                    jVar.f42122f0 = c5211a.getType();
                    jVar.f42124g0 = c5211a.getMargin();
                }
            }
            i9 = i4 + 1;
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
                    i d9 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d9.f42083d.f42111a = true;
                    }
                    this.f42181c.put(Integer.valueOf(d9.f42080a), d9);
                }
            }
        } catch (IOException e9) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e9);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e10);
        }
    }
}
