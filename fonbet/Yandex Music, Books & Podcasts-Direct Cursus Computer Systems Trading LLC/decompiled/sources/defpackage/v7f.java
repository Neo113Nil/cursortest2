package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.utils.assertions.Assertions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv7f;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class v7f extends x7f {
    public mqs l;
    public w7f m;
    public uu5 n;

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        w7f w7fVar = this.m;
        if (w7fVar != null) {
            ((View) w7fVar.d.a(w7f.f[0])).clearAnimation();
        }
        uu5 uu5Var = this.n;
        if (uu5Var != null) {
            gld.L((tf6) uu5Var.d, null);
            uu5Var.j = null;
            uu5Var.i = null;
            uu5Var.k = null;
            uu5Var.c = null;
            ArrayList arrayList = (ArrayList) uu5Var.e;
            int a = tah.a(v75.o(arrayList, 10));
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(((evl) next).a.e(), next);
            }
            ((e4t) uu5Var.h).b((mqs) uu5Var.a, linkedHashMap, uah.o((HashMap) uu5Var.f));
        }
        this.n = null;
    }

    @Override // defpackage.x7f, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (this.l == null) {
            Assertions.fail("Track should be initialized");
            dismissAllowingStateLoss();
            return;
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        int i = 1;
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_add_to_playlist, (ViewGroup) findViewById, true);
        inflate.getClass();
        int i2 = 0;
        this.m = new w7f(inflate, this.j, new t7f(this, i2), new u7f(this, i2), new t7f(this, i));
        Context requireContext = requireContext();
        requireContext.getClass();
        mqs mqsVar = this.l;
        if (mqsVar != null) {
            this.n = new uu5(requireContext, mqsVar, this, this.m, new u7f(this, i));
        } else {
            Intrinsics.j("track");
            throw null;
        }
    }
}
