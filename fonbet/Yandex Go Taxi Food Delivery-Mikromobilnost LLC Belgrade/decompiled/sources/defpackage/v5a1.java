package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.e;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class v5a1 implements qs61 {
    public static final rvr c = new rvr(13);

    public static u1n a(String[][] strArr, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int[] iArr2 = new int[strArr.length];
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = i;
            arrayList.add(new ntn(i2, null, true, iArr[i2]));
            i++;
            for (String str : strArr[i2]) {
                arrayList.add(new ntn(i2, str, false, 0));
                i++;
            }
        }
        return new u1n(5, (ntn[]) arrayList.toArray(new ntn[0]), iArr2);
    }

    public static ActionMenuView b(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static o89 c(Context context) {
        euy euyVar;
        rdy rdyVar = i5f0.b.a;
        synchronized (rdyVar.a) {
            euyVar = rdyVar.b;
            if (euyVar == null) {
                e eVar = new e(context, null);
                rdyVar.i = eVar.r;
                o89 n = ni91.n(jqs.a(rdyVar.c), new uhx(1, new ptw(13, eVar)), geb1.b());
                rdyVar.b = n;
                ni91.a(n, new r1s(24, rdyVar, eVar, context), geb1.b());
                euyVar = ni91.g(n);
            }
        }
        h490 h490Var = new h490(26, new vld0(29));
        return ni91.n(euyVar, new gym(h490Var), geb1.b());
    }

    public static ImageButton d(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList e(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
