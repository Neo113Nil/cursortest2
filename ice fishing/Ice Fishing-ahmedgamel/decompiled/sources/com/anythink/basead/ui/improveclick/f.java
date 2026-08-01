package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: a, reason: collision with root package name */
    boolean f11155a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f11156b = false;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.basead.ui.guidetoclickv2.a f11157c;

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        this.f11157c = new com.anythink.basead.ui.guidetoclickv2.a(context, wVar, xVar, i, relativeLayout, view, aVar);
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        int i6;
        int i9;
        if (i == 107 || i == 108) {
            if (this.f11142h != 1) {
                return;
            }
        } else {
            if (i == 110) {
                com.anythink.basead.ui.guidetoclickv2.a aVar = this.f11157c;
                if (aVar != null) {
                    if (this.f11156b || (i6 = this.f11142h) == 1 || i6 == 2) {
                        aVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 111) {
                com.anythink.basead.ui.guidetoclickv2.a aVar2 = this.f11157c;
                if (aVar2 != null) {
                    if (this.f11156b || (i9 = this.f11142h) == 1 || i9 == 2) {
                        aVar2.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 113) {
                this.f11155a = true;
            } else {
                if (i == 114) {
                    this.f11156b = true;
                    com.anythink.basead.ui.guidetoclickv2.a aVar3 = this.f11157c;
                    if (aVar3 != null) {
                        aVar3.a(map);
                        this.f11157c.a();
                        return;
                    }
                    return;
                }
                if (i != 119) {
                    return;
                }
            }
        }
        a();
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
        com.anythink.basead.ui.guidetoclickv2.a aVar = this.f11157c;
        if (aVar != null) {
            aVar.c();
            this.f11157c = null;
        }
    }
}
