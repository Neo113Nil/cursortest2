package com.anythink.basead.f.b.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.x;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.f.c.d f9675a;

    public e(Context context, bj bjVar, x xVar, com.anythink.basead.f.c.d dVar, boolean z6) {
        super(context, bjVar, xVar, z6);
        this.f9675a = dVar;
        if (dVar != null) {
            dVar.b();
        }
        this.f9674z = this.f9675a.c();
    }

    @Override // com.anythink.basead.f.b.a.d
    public final View H() {
        return this.f9675a.d();
    }

    @Override // com.anythink.basead.f.a
    public final void a(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
    }

    @Override // com.anythink.basead.f.a
    public final ViewGroup b() {
        return null;
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final boolean p() {
        return true;
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void r() {
        super.r();
        try {
            com.anythink.basead.f.c.d dVar = this.f9675a;
            if (dVar != null) {
                dVar.i();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void s() {
        super.s();
        com.anythink.basead.f.c.d dVar = this.f9675a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void t() {
        super.t();
        com.anythink.basead.f.c.d dVar = this.f9675a;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // com.anythink.basead.f.a
    public final View a(Context context, boolean z6, BaseMediaATView.a aVar) {
        com.anythink.basead.f.c.d dVar = this.f9675a;
        if (dVar == null) {
            return null;
        }
        dVar.a(z6 ? 1 : 0);
        return this.f9675a.d();
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void a(int i, int i4) {
        super.a(i, i4);
        if (this.f9662B <= 0) {
            this.f9662B = (int) ((this.f9661A * 3.0f) / 4.0f);
        }
        com.anythink.basead.f.c.d dVar = this.f9675a;
        if (dVar != null) {
            dVar.a(i4, i);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void a(com.anythink.basead.g.a aVar) {
        super.a(aVar);
        com.anythink.basead.f.c.d dVar = this.f9675a;
        if (dVar != null) {
            dVar.a(aVar);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void a(boolean z6) {
        super.a(z6);
        com.anythink.basead.f.c.d dVar = this.f9675a;
        if (dVar != null) {
            dVar.b(z6 ? 1 : 2);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void a(String str) {
        super.a(str);
        if (this.f9675a != null) {
            if (!TextUtils.isEmpty(this.f9673y)) {
                String str2 = this.f9673y;
                str2.getClass();
                switch (str2) {
                    case "1":
                        this.f9675a.c(3);
                        break;
                    case "2":
                        this.f9675a.c(1);
                        break;
                    case "3":
                        this.f9675a.c(2);
                        break;
                }
                return;
            }
            this.f9675a.c(3);
        }
    }
}
