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
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u.AbstractC5049e;
import v.AbstractC5102a;
import w.C5136a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f42205d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f42206e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f42207f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f42208a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42209b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f42210c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42206e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f42207f = sparseIntArray2;
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
        sparseIntArray.append(com.anythink.expressad.video.module.a.a.f21756z, 16);
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

    public static int[] c(C5244a c5244a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c5244a.getContext();
        int[] iArr = new int[split.length];
        int i6 = 0;
        int i9 = 0;
        while (i6 < split.length) {
            String trim = split[i6].trim();
            Object obj = null;
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c5244a.isInEditMode() && (c5244a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c5244a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f4649F;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f4649F.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i9] = i;
            i6++;
            i9++;
        }
        return i9 != split.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x05fc. Please report as an issue. */
    public static i d(Context context, AttributeSet attributeSet, boolean z3) {
        int i;
        String str;
        String str2;
        int i6;
        int i9;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3 ? r.f42214c : r.f42212a);
        int[] iArr = f42205d;
        String[] strArr = AbstractC5102a.f41357a;
        SparseIntArray sparseIntArray = f42206e;
        l lVar = iVar.f42110b;
        m mVar = iVar.f42113e;
        k kVar = iVar.f42111c;
        j jVar = iVar.f42112d;
        String str3 = "ConstraintSet";
        if (z3) {
            h hVar = new h();
            hVar.f42098a = new int[10];
            hVar.f42099b = new int[10];
            hVar.f42100c = 0;
            hVar.f42101d = new int[10];
            hVar.f42102e = new float[10];
            hVar.f42103f = 0;
            hVar.f42104g = new int[5];
            hVar.f42105h = new String[5];
            hVar.i = 0;
            hVar.f42106j = new int[4];
            hVar.f42107k = new boolean[4];
            hVar.f42108l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i10 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i10 < indexCount; indexCount = i9) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = i10;
                switch (f42207f.get(index)) {
                    case 2:
                        i9 = indexCount;
                        hVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42124I));
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
                    case j.v.f12577H /* 92 */:
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
                        hVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42118C));
                        break;
                    case 7:
                        i9 = indexCount;
                        hVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42119D));
                        break;
                    case 8:
                        i9 = indexCount;
                        hVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        i9 = indexCount;
                        hVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42130P));
                        break;
                    case 12:
                        i9 = indexCount;
                        hVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42131Q));
                        break;
                    case 13:
                        i9 = indexCount;
                        hVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42127M));
                        break;
                    case 14:
                        i9 = indexCount;
                        hVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42129O));
                        break;
                    case 15:
                        i9 = indexCount;
                        hVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42132R));
                        break;
                    case 16:
                        i9 = indexCount;
                        hVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42128N));
                        break;
                    case 17:
                        i9 = indexCount;
                        hVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42146d));
                        break;
                    case 18:
                        i9 = indexCount;
                        hVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f42148e));
                        break;
                    case 19:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42150f), 19);
                        break;
                    case 20:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42175w), 20);
                        break;
                    case 21:
                        i9 = indexCount;
                        hVar.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f42144c));
                        break;
                    case 22:
                        i9 = indexCount;
                        hVar.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f42188a)]);
                        break;
                    case 23:
                        i9 = indexCount;
                        hVar.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f42142b));
                        break;
                    case 24:
                        i9 = indexCount;
                        hVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42121F));
                        break;
                    case 27:
                        i9 = indexCount;
                        hVar.b(27, obtainStyledAttributes.getInt(index, jVar.f42120E));
                        break;
                    case 28:
                        i9 = indexCount;
                        hVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42122G));
                        break;
                    case 31:
                        i9 = indexCount;
                        hVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42125K));
                        break;
                    case 34:
                        i9 = indexCount;
                        hVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42123H));
                        break;
                    case 37:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42176x), 37);
                        break;
                    case com.anythink.basead.b.b.j.f5806M /* 38 */:
                        i9 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f42109a);
                        iVar.f42109a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case 39:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42135U), 39);
                        break;
                    case com.anythink.basead.b.b.j.f5808O /* 40 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42134T), 40);
                        break;
                    case 41:
                        i9 = indexCount;
                        hVar.b(41, obtainStyledAttributes.getInt(index, jVar.f42136V));
                        break;
                    case 42:
                        i9 = indexCount;
                        hVar.b(42, obtainStyledAttributes.getInt(index, jVar.f42137W));
                        break;
                    case com.anythink.basead.b.b.j.f5811R /* 43 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, lVar.f42190c), 43);
                        break;
                    case com.anythink.basead.b.b.j.f5812S /* 44 */:
                        i9 = indexCount;
                        hVar.d(44, true);
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42204m), 44);
                        break;
                    case com.anythink.basead.b.b.j.f5813T /* 45 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42194b), 45);
                        break;
                    case 46:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42195c), 46);
                        break;
                    case 47:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42196d), 47);
                        break;
                    case com.anythink.basead.b.b.j.f5816W /* 48 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42197e), 48);
                        break;
                    case com.anythink.basead.b.b.j.f5817X /* 49 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42198f), 49);
                        break;
                    case 50:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42199g), 50);
                        break;
                    case 51:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.i), 51);
                        break;
                    case 52:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42201j), 52);
                        break;
                    case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getDimension(index, mVar.f42202k), 53);
                        break;
                    case 54:
                        i9 = indexCount;
                        hVar.b(54, obtainStyledAttributes.getInt(index, jVar.f42138X));
                        break;
                    case 55:
                        i9 = indexCount;
                        hVar.b(55, obtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case p.a.f19679e /* 56 */:
                        i9 = indexCount;
                        hVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42139Z));
                        break;
                    case 57:
                        i9 = indexCount;
                        hVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42141a0));
                        break;
                    case 58:
                        i9 = indexCount;
                        hVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42143b0));
                        break;
                    case j.v.f12591n /* 59 */:
                        i9 = indexCount;
                        hVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42145c0));
                        break;
                    case 60:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, mVar.f42193a), 60);
                        break;
                    case 62:
                        i9 = indexCount;
                        hVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42116A));
                        break;
                    case 63:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, jVar.f42117B), 63);
                        break;
                    case 64:
                        i9 = indexCount;
                        hVar.b(64, f(obtainStyledAttributes, index, kVar.f42180a));
                        break;
                    case j.v.f12576G /* 65 */:
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
                    case j.v.f12582d /* 67 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42184e), 67);
                        break;
                    case 68:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, lVar.f42191d), 68);
                        break;
                    case j.v.f12573D /* 69 */:
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
                        hVar.b(72, obtainStyledAttributes.getInt(index, jVar.f42151f0));
                        break;
                    case 73:
                        i9 = indexCount;
                        hVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42153g0));
                        break;
                    case j.v.f12598u /* 74 */:
                        i9 = indexCount;
                        hVar.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case j.v.f12599v /* 75 */:
                        i9 = indexCount;
                        hVar.d(75, obtainStyledAttributes.getBoolean(index, jVar.f42165n0));
                        break;
                    case j.v.f12603z /* 76 */:
                        i9 = indexCount;
                        hVar.b(76, obtainStyledAttributes.getInt(index, kVar.f42182c));
                        break;
                    case j.v.f12571B /* 77 */:
                        i9 = indexCount;
                        hVar.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i9 = indexCount;
                        hVar.b(78, obtainStyledAttributes.getInt(index, lVar.f42189b));
                        break;
                    case j.v.f12570A /* 79 */:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42183d), 79);
                        break;
                    case j.v.f12572C /* 80 */:
                        i9 = indexCount;
                        hVar.d(80, obtainStyledAttributes.getBoolean(index, jVar.f42162l0));
                        break;
                    case j.v.f12574E /* 81 */:
                        i9 = indexCount;
                        hVar.d(81, obtainStyledAttributes.getBoolean(index, jVar.m0));
                        break;
                    case 82:
                        i9 = indexCount;
                        hVar.b(82, obtainStyledAttributes.getInteger(index, kVar.f42181b));
                        break;
                    case 83:
                        i9 = indexCount;
                        hVar.b(83, f(obtainStyledAttributes, index, mVar.f42200h));
                        break;
                    case 84:
                        i9 = indexCount;
                        hVar.b(84, obtainStyledAttributes.getInteger(index, kVar.f42186g));
                        break;
                    case 85:
                        i9 = indexCount;
                        hVar.a(obtainStyledAttributes.getFloat(index, kVar.f42185f), 85);
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
                            kVar.f42187h = string;
                            hVar.c(90, string);
                            if (kVar.f42187h.indexOf("/") > 0) {
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
                    case j.v.f12578I /* 93 */:
                        i9 = indexCount;
                        hVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42126L));
                        break;
                    case 94:
                        i9 = indexCount;
                        hVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f42133S));
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
                        hVar.b(97, obtainStyledAttributes.getInt(index, jVar.f42167o0));
                        break;
                    case 98:
                        i9 = indexCount;
                        int i13 = y.a.J;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            iVar.f42109a = obtainStyledAttributes.getResourceId(index, iVar.f42109a);
                        }
                        break;
                    case 99:
                        i9 = indexCount;
                        hVar.d(99, obtainStyledAttributes.getBoolean(index, jVar.f42152g));
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
                        jVar.f42168p = f(obtainStyledAttributes, index2, jVar.f42168p);
                        i6 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42124I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42124I);
                        i6 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42166o = f(obtainStyledAttributes, index2, jVar.f42166o);
                        i6 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42164n = f(obtainStyledAttributes, index2, jVar.f42164n);
                        i6 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42177y = obtainStyledAttributes.getString(index2);
                        i6 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42118C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42118C);
                        i6 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42119D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42119D);
                        i6 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        i6 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42174v = f(obtainStyledAttributes, index2, jVar.f42174v);
                        i6 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42173u = f(obtainStyledAttributes, index2, jVar.f42173u);
                        i6 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42130P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42130P);
                        i6 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42131Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42131Q);
                        i6 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42127M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42127M);
                        i6 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42129O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42129O);
                        i6 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42132R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42132R);
                        i6 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42128N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42128N);
                        i6 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42146d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42146d);
                        i6 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42148e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f42148e);
                        i6 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42150f = obtainStyledAttributes.getFloat(index2, jVar.f42150f);
                        i6 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42175w = obtainStyledAttributes.getFloat(index2, jVar.f42175w);
                        i6 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42144c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f42144c);
                        i6 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        int i16 = obtainStyledAttributes.getInt(index2, lVar.f42188a);
                        lVar.f42188a = i16;
                        lVar.f42188a = iArr[i16];
                        i6 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42142b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f42142b);
                        i6 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42121F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42121F);
                        i6 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42154h = f(obtainStyledAttributes, index2, jVar.f42154h);
                        i6 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.i = f(obtainStyledAttributes, index2, jVar.i);
                        i6 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42120E = obtainStyledAttributes.getInt(index2, jVar.f42120E);
                        i6 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42122G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42122G);
                        i6 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42157j = f(obtainStyledAttributes, index2, jVar.f42157j);
                        i6 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42159k = f(obtainStyledAttributes, index2, jVar.f42159k);
                        i6 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42125K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42125K);
                        i6 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42171s = f(obtainStyledAttributes, index2, jVar.f42171s);
                        i6 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42172t = f(obtainStyledAttributes, index2, jVar.f42172t);
                        i6 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42123H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42123H);
                        i6 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42163m = f(obtainStyledAttributes, index2, jVar.f42163m);
                        i6 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42161l = f(obtainStyledAttributes, index2, jVar.f42161l);
                        i6 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42176x = obtainStyledAttributes.getFloat(index2, jVar.f42176x);
                        i6 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5806M /* 38 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        iVar.f42109a = obtainStyledAttributes.getResourceId(index2, iVar.f42109a);
                        i6 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42135U = obtainStyledAttributes.getFloat(index2, jVar.f42135U);
                        i6 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5808O /* 40 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42134T = obtainStyledAttributes.getFloat(index2, jVar.f42134T);
                        i6 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42136V = obtainStyledAttributes.getInt(index2, jVar.f42136V);
                        i6 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42137W = obtainStyledAttributes.getInt(index2, jVar.f42137W);
                        i6 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5811R /* 43 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        lVar.f42190c = obtainStyledAttributes.getFloat(index2, lVar.f42190c);
                        i6 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5812S /* 44 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42203l = true;
                        mVar.f42204m = obtainStyledAttributes.getDimension(index2, mVar.f42204m);
                        i6 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5813T /* 45 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42194b = obtainStyledAttributes.getFloat(index2, mVar.f42194b);
                        i6 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42195c = obtainStyledAttributes.getFloat(index2, mVar.f42195c);
                        i6 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42196d = obtainStyledAttributes.getFloat(index2, mVar.f42196d);
                        i6 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5816W /* 48 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42197e = obtainStyledAttributes.getFloat(index2, mVar.f42197e);
                        i6 = 1;
                        break;
                    case com.anythink.basead.b.b.j.f5817X /* 49 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42198f = obtainStyledAttributes.getDimension(index2, mVar.f42198f);
                        i6 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42199g = obtainStyledAttributes.getDimension(index2, mVar.f42199g);
                        i6 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.i = obtainStyledAttributes.getDimension(index2, mVar.i);
                        i6 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42201j = obtainStyledAttributes.getDimension(index2, mVar.f42201j);
                        i6 = 1;
                        break;
                    case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42202k = obtainStyledAttributes.getDimension(index2, mVar.f42202k);
                        i6 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42138X = obtainStyledAttributes.getInt(index2, jVar.f42138X);
                        i6 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.Y = obtainStyledAttributes.getInt(index2, jVar.Y);
                        i6 = 1;
                        break;
                    case p.a.f19679e /* 56 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42139Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42139Z);
                        i6 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42141a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42141a0);
                        i6 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42143b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42143b0);
                        i6 = 1;
                        break;
                    case j.v.f12591n /* 59 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42145c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42145c0);
                        i6 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        mVar.f42193a = obtainStyledAttributes.getFloat(index2, mVar.f42193a);
                        i6 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42178z = f(obtainStyledAttributes, index2, jVar.f42178z);
                        i6 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42116A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42116A);
                        i6 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        jVar.f42117B = obtainStyledAttributes.getFloat(index2, jVar.f42117B);
                        i6 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        kVar.f42180a = f(obtainStyledAttributes, index2, kVar.f42180a);
                        i6 = 1;
                        break;
                    case j.v.f12576G /* 65 */:
                        i = indexCount2;
                        str = str4;
                        str2 = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            i6 = 1;
                            break;
                        } else {
                            String str5 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i6 = 1;
                        }
                    case 66:
                        i = indexCount2;
                        str = str4;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        str2 = str3;
                        i6 = 1;
                        break;
                    case j.v.f12582d /* 67 */:
                        i = indexCount2;
                        str = str4;
                        kVar.f42184e = obtainStyledAttributes.getFloat(index2, kVar.f42184e);
                        str2 = str3;
                        i6 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str4;
                        lVar.f42191d = obtainStyledAttributes.getFloat(index2, lVar.f42191d);
                        str2 = str3;
                        i6 = 1;
                        break;
                    case j.v.f12573D /* 69 */:
                        i = indexCount2;
                        str = str4;
                        jVar.f42147d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i6 = 1;
                        break;
                    case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                        i = indexCount2;
                        str = str4;
                        jVar.f42149e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i6 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str4;
                        Log.e(str3, str);
                        str2 = str3;
                        i6 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        jVar.f42151f0 = obtainStyledAttributes.getInt(index2, jVar.f42151f0);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 73:
                        i = indexCount2;
                        jVar.f42153g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42153g0);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12598u /* 74 */:
                        i = indexCount2;
                        jVar.f42158j0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12599v /* 75 */:
                        i = indexCount2;
                        jVar.f42165n0 = obtainStyledAttributes.getBoolean(index2, jVar.f42165n0);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12603z /* 76 */:
                        i = indexCount2;
                        kVar.f42182c = obtainStyledAttributes.getInt(index2, kVar.f42182c);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12571B /* 77 */:
                        i = indexCount2;
                        jVar.f42160k0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 78:
                        i = indexCount2;
                        lVar.f42189b = obtainStyledAttributes.getInt(index2, lVar.f42189b);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12570A /* 79 */:
                        i = indexCount2;
                        kVar.f42183d = obtainStyledAttributes.getFloat(index2, kVar.f42183d);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12572C /* 80 */:
                        i = indexCount2;
                        jVar.f42162l0 = obtainStyledAttributes.getBoolean(index2, jVar.f42162l0);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12574E /* 81 */:
                        i = indexCount2;
                        jVar.m0 = obtainStyledAttributes.getBoolean(index2, jVar.m0);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 82:
                        i = indexCount2;
                        kVar.f42181b = obtainStyledAttributes.getInteger(index2, kVar.f42181b);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 83:
                        i = indexCount2;
                        mVar.f42200h = f(obtainStyledAttributes, index2, mVar.f42200h);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 84:
                        i = indexCount2;
                        kVar.f42186g = obtainStyledAttributes.getInteger(index2, kVar.f42186g);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 85:
                        i = indexCount2;
                        kVar.f42185f = obtainStyledAttributes.getFloat(index2, kVar.f42185f);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 86:
                        i = indexCount2;
                        int i17 = obtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i17 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.f42187h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.i);
                        }
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str4;
                        i6 = 1;
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
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 91:
                        i = indexCount2;
                        jVar.f42169q = f(obtainStyledAttributes, index2, jVar.f42169q);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12577H /* 92 */:
                        i = indexCount2;
                        jVar.f42170r = f(obtainStyledAttributes, index2, jVar.f42170r);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case j.v.f12578I /* 93 */:
                        i = indexCount2;
                        jVar.f42126L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42126L);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 94:
                        i = indexCount2;
                        jVar.f42133S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f42133S);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 95:
                        i = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                    case 96:
                        i = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        i6 = 1;
                        str = str4;
                        str2 = str3;
                        break;
                    case 97:
                        i = indexCount2;
                        jVar.f42167o0 = obtainStyledAttributes.getInt(index2, jVar.f42167o0);
                        str = str4;
                        i6 = 1;
                        str2 = str3;
                        break;
                }
                i15++;
                i14 = i6;
                str3 = str2;
                str4 = str;
            }
            if (jVar.f42158j0 != null) {
                jVar.f42156i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i, int i6) {
        int resourceId = typedArray.getResourceId(i, i6);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i6) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i9 = typedArray.peekValue(i).type;
        boolean z3 = true;
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
                        if (i6 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, trim2);
                        return;
                    }
                    if (obj instanceof j) {
                        ((j) obj).f42177y = trim2;
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
                            if (i6 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.f42028H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.f42029I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i6 == 0) {
                                jVar.f42142b = 0;
                                jVar.f42135U = parseFloat;
                                return;
                            } else {
                                jVar.f42144c = 0;
                                jVar.f42134T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof h) {
                            h hVar = (h) obj;
                            if (i6 == 0) {
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
                            if (i6 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.f42037R = max;
                                eVar3.f42031L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.f42038S = max;
                                eVar3.f42032M = 2;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i6 == 0) {
                                jVar2.f42142b = 0;
                                jVar2.f42147d0 = max;
                                jVar2.f42138X = 2;
                                return;
                            } else {
                                jVar2.f42144c = 0;
                                jVar2.f42149e0 = max;
                                jVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof h) {
                            h hVar2 = (h) obj;
                            if (i6 == 0) {
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
                z3 = false;
            }
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i6 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i10;
                    eVar4.f42042W = z3;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i10;
                    eVar4.f42043X = z3;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i6 == 0) {
                    jVar3.f42142b = i10;
                    jVar3.f42162l0 = z3;
                    return;
                } else {
                    jVar3.f42144c = i10;
                    jVar3.m0 = z3;
                    return;
                }
            }
            if (obj instanceof h) {
                h hVar3 = (h) obj;
                if (i6 == 0) {
                    hVar3.b(23, i10);
                    hVar3.d(80, z3);
                    return;
                } else {
                    hVar3.b(21, i10);
                    hVar3.d(81, z3);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z3 = false;
        i10 = dimensionPixelSize;
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
        eVar.f42027G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i6;
        String str;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f42210c;
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
                if (nVar.f42209b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap.get(Integer.valueOf(id));
                        if (iVar != null) {
                            if (childAt instanceof C5244a) {
                                j jVar = iVar.f42112d;
                                jVar.f42155h0 = 1;
                                C5244a c5244a = (C5244a) childAt;
                                c5244a.setId(id);
                                c5244a.setType(jVar.f42151f0);
                                c5244a.setMargin(jVar.f42153g0);
                                c5244a.setAllowsGoneWidget(jVar.f42165n0);
                                int[] iArr = jVar.f42156i0;
                                if (iArr != null) {
                                    c5244a.setReferencedIds(iArr);
                                } else {
                                    String str2 = jVar.f42158j0;
                                    if (str2 != null) {
                                        int[] c9 = c(c5244a, str2);
                                        jVar.f42156i0 = c9;
                                        c5244a.setReferencedIds(c9);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap2 = iVar.f42114f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : hashMap2.keySet()) {
                                b bVar = (b) hashMap2.get(str3);
                                String f3 = !bVar.f42006a ? u1.h.f("set", str3) : str3;
                                HashSet hashSet3 = hashSet2;
                                try {
                                    int d2 = AbstractC5049e.d(bVar.f42007b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (d2) {
                                        case 0:
                                            i6 = i9;
                                            cls.getMethod(f3, cls3).invoke(childAt, Integer.valueOf(bVar.f42008c));
                                            break;
                                        case 1:
                                            i6 = i9;
                                            cls.getMethod(f3, cls2).invoke(childAt, Float.valueOf(bVar.f42009d));
                                            break;
                                        case 2:
                                            i6 = i9;
                                            cls.getMethod(f3, cls3).invoke(childAt, Integer.valueOf(bVar.f42012g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(f3, Drawable.class);
                                            i6 = i9;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f42012g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e9) {
                                                e = e9;
                                                StringBuilder j6 = AbstractC4404f.j(" Custom Attribute \"", str3, "\" not found on ");
                                                j6.append(cls.getName());
                                                Log.e("TransitionLayout", j6.toString(), e);
                                                hashSet2 = hashSet3;
                                                i9 = i6;
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + f3, e);
                                                hashSet2 = hashSet3;
                                                i9 = i6;
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder j9 = AbstractC4404f.j(" Custom Attribute \"", str3, "\" not found on ");
                                                j9.append(cls.getName());
                                                Log.e("TransitionLayout", j9.toString(), e);
                                                hashSet2 = hashSet3;
                                                i9 = i6;
                                            }
                                        case 4:
                                            cls.getMethod(f3, CharSequence.class).invoke(childAt, bVar.f42010e);
                                            i6 = i9;
                                            break;
                                        case 5:
                                            cls.getMethod(f3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f42011f));
                                            i6 = i9;
                                            break;
                                        case 6:
                                            cls.getMethod(f3, cls2).invoke(childAt, Float.valueOf(bVar.f42009d));
                                            i6 = i9;
                                            break;
                                        case 7:
                                            cls.getMethod(f3, cls3).invoke(childAt, Integer.valueOf(bVar.f42008c));
                                            i6 = i9;
                                            break;
                                        default:
                                            i6 = i9;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    i6 = i9;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    i6 = i9;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    i6 = i9;
                                }
                                hashSet2 = hashSet3;
                                i9 = i6;
                            }
                            hashSet = hashSet2;
                            i = i9;
                            childAt.setLayoutParams(eVar);
                            l lVar = iVar.f42110b;
                            if (lVar.f42189b == 0) {
                                childAt.setVisibility(lVar.f42188a);
                            }
                            childAt.setAlpha(lVar.f42190c);
                            m mVar = iVar.f42113e;
                            childAt.setRotation(mVar.f42193a);
                            childAt.setRotationX(mVar.f42194b);
                            childAt.setRotationY(mVar.f42195c);
                            childAt.setScaleX(mVar.f42196d);
                            childAt.setScaleY(mVar.f42197e);
                            if (mVar.f42200h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f42200h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f42198f)) {
                                    childAt.setPivotX(mVar.f42198f);
                                }
                                if (!Float.isNaN(mVar.f42199g)) {
                                    childAt.setPivotY(mVar.f42199g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f42201j);
                            childAt.setTranslationZ(mVar.f42202k);
                            if (mVar.f42203l) {
                                childAt.setElevation(mVar.f42204m);
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
                j jVar2 = iVar2.f42112d;
                if (jVar2.f42155h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C5244a c5244a2 = new C5244a(context);
                    c5244a2.f42013n = new int[32];
                    c5244a2.f42019z = new HashMap();
                    c5244a2.f42015v = context;
                    C5136a c5136a = new C5136a();
                    c5136a.f41451s0 = 0;
                    c5136a.f41452t0 = true;
                    c5136a.f41453u0 = 0;
                    c5136a.f41454v0 = false;
                    c5244a2.f42005C = c5136a;
                    c5244a2.f42016w = c5136a;
                    c5244a2.i();
                    c5244a2.setVisibility(8);
                    c5244a2.setId(num.intValue());
                    int[] iArr2 = jVar2.f42156i0;
                    if (iArr2 != null) {
                        c5244a2.setReferencedIds(iArr2);
                    } else {
                        String str4 = jVar2.f42158j0;
                        if (str4 != null) {
                            int[] c10 = c(c5244a2, str4);
                            jVar2.f42156i0 = c10;
                            c5244a2.setReferencedIds(c10);
                        }
                    }
                    c5244a2.setType(jVar2.f42151f0);
                    c5244a2.setMargin(jVar2.f42153g0);
                    e g4 = ConstraintLayout.g();
                    c5244a2.i();
                    iVar2.a(g4);
                    constraintLayout.addView(c5244a2, g4);
                }
                if (jVar2.f42140a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e g9 = ConstraintLayout.g();
                    iVar2.a(g9);
                    constraintLayout.addView(pVar, g9);
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
        int i6;
        HashMap hashMap2;
        int i9;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = nVar.f42210c;
        hashMap3.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f42209b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id))) {
                hashMap3.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap3.get(Integer.valueOf(id));
            if (iVar == null) {
                i = childCount;
                hashMap = hashMap3;
                i6 = i10;
            } else {
                HashMap hashMap4 = nVar.f42208a;
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
                            } catch (IllegalAccessException e9) {
                                e = e9;
                                i9 = i10;
                                StringBuilder j6 = AbstractC4404f.j(" Custom Attribute \"", str, "\" not found on ");
                                j6.append(cls.getName());
                                Log.e("TransitionLayout", j6.toString(), e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                i9 = i10;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e11) {
                                e = e11;
                                i9 = i10;
                                StringBuilder j9 = AbstractC4404f.j(" Custom Attribute \"", str, "\" not found on ");
                                j9.append(cls.getName());
                                Log.e("TransitionLayout", j9.toString(), e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            i9 = i10;
                            try {
                                hashMap5.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e12) {
                                e = e12;
                                StringBuilder j62 = AbstractC4404f.j(" Custom Attribute \"", str, "\" not found on ");
                                j62.append(cls.getName());
                                Log.e("TransitionLayout", j62.toString(), e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e13) {
                                e = e13;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                i10 = i9;
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e14) {
                                e = e14;
                                StringBuilder j92 = AbstractC4404f.j(" Custom Attribute \"", str, "\" not found on ");
                                j92.append(cls.getName());
                                Log.e("TransitionLayout", j92.toString(), e);
                                i10 = i9;
                                childCount = i11;
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
                    i10 = i9;
                    childCount = i11;
                    hashMap3 = hashMap2;
                }
                i = childCount;
                hashMap = hashMap3;
                i6 = i10;
                iVar.f42114f = hashMap5;
                iVar.f42109a = id;
                int i12 = eVar.f42053e;
                j jVar = iVar.f42112d;
                jVar.f42154h = i12;
                jVar.i = eVar.f42055f;
                jVar.f42157j = eVar.f42057g;
                jVar.f42159k = eVar.f42059h;
                jVar.f42161l = eVar.i;
                jVar.f42163m = eVar.f42062j;
                jVar.f42164n = eVar.f42064k;
                jVar.f42166o = eVar.f42066l;
                jVar.f42168p = eVar.f42068m;
                jVar.f42169q = eVar.f42069n;
                jVar.f42170r = eVar.f42071o;
                jVar.f42171s = eVar.f42077s;
                jVar.f42172t = eVar.f42078t;
                jVar.f42173u = eVar.f42079u;
                jVar.f42174v = eVar.f42080v;
                jVar.f42175w = eVar.f42025E;
                jVar.f42176x = eVar.f42026F;
                jVar.f42177y = eVar.f42027G;
                jVar.f42178z = eVar.f42073p;
                jVar.f42116A = eVar.f42075q;
                jVar.f42117B = eVar.f42076r;
                jVar.f42118C = eVar.f42039T;
                jVar.f42119D = eVar.f42040U;
                jVar.f42120E = eVar.f42041V;
                jVar.f42150f = eVar.f42049c;
                jVar.f42146d = eVar.f42045a;
                jVar.f42148e = eVar.f42047b;
                jVar.f42142b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f42144c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.f42121F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.f42122G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.f42123H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.f42124I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.f42126L = eVar.f42024D;
                jVar.f42134T = eVar.f42029I;
                jVar.f42135U = eVar.f42028H;
                jVar.f42137W = eVar.f42030K;
                jVar.f42136V = eVar.J;
                jVar.f42162l0 = eVar.f42042W;
                jVar.m0 = eVar.f42043X;
                jVar.f42138X = eVar.f42031L;
                jVar.Y = eVar.f42032M;
                jVar.f42139Z = eVar.f42035P;
                jVar.f42141a0 = eVar.f42036Q;
                jVar.f42143b0 = eVar.f42033N;
                jVar.f42145c0 = eVar.f42034O;
                jVar.f42147d0 = eVar.f42037R;
                jVar.f42149e0 = eVar.f42038S;
                jVar.f42160k0 = eVar.Y;
                jVar.f42128N = eVar.f42082x;
                jVar.f42130P = eVar.f42084z;
                jVar.f42127M = eVar.f42081w;
                jVar.f42129O = eVar.f42083y;
                jVar.f42132R = eVar.f42021A;
                jVar.f42131Q = eVar.f42022B;
                jVar.f42133S = eVar.f42023C;
                jVar.f42167o0 = eVar.f42044Z;
                jVar.J = eVar.getMarginEnd();
                jVar.f42125K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f42110b;
                lVar.f42188a = visibility;
                lVar.f42190c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f42113e;
                mVar.f42193a = rotation;
                mVar.f42194b = childAt.getRotationX();
                mVar.f42195c = childAt.getRotationY();
                mVar.f42196d = childAt.getScaleX();
                mVar.f42197e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f42198f = pivotX;
                    mVar.f42199g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f42201j = childAt.getTranslationY();
                mVar.f42202k = childAt.getTranslationZ();
                if (mVar.f42203l) {
                    mVar.f42204m = childAt.getElevation();
                }
                if (childAt instanceof C5244a) {
                    C5244a c5244a = (C5244a) childAt;
                    jVar.f42165n0 = c5244a.getAllowsGoneWidget();
                    jVar.f42156i0 = c5244a.getReferencedIds();
                    jVar.f42151f0 = c5244a.getType();
                    jVar.f42153g0 = c5244a.getMargin();
                }
            }
            i10 = i6 + 1;
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
                        d2.f42112d.f42140a = true;
                    }
                    this.f42210c.put(Integer.valueOf(d2.f42109a), d2);
                }
            }
        } catch (IOException e9) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e9);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e10);
        }
    }
}
