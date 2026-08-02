package com.yandex.plus.home.feature.panel.internal.sections;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.repository.api.model.panel.b0;
import com.yandex.plus.home.repository.api.model.panel.d0;
import com.yandex.plus.home.repository.api.model.panel.o;
import com.yandex.plus.home.repository.api.model.panel.p;
import com.yandex.plus.home.repository.api.model.panel.z;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ com.yandex.plus.home.repository.api.model.panel.i c;
    public final /* synthetic */ b0 d;
    public final /* synthetic */ h e;
    public final /* synthetic */ z f;
    public final /* synthetic */ ViewGroup g;

    public /* synthetic */ d(d0 d0Var, com.yandex.plus.home.repository.api.model.panel.i iVar, b0 b0Var, z zVar, h hVar, ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = d0Var;
        this.c = iVar;
        this.d = b0Var;
        this.f = zVar;
        this.e = hVar;
        this.g = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ViewGroup viewGroup = this.g;
        h hVar = this.e;
        z zVar = this.f;
        b0 b0Var = this.d;
        com.yandex.plus.home.repository.api.model.panel.i iVar = this.c;
        d0 d0Var = this.b;
        switch (i) {
            case 0:
                com.yandex.plus.home.feature.panel.internalapi.analytics.a u = hVar.u(viewGroup);
                com.yandex.plus.home.feature.panel.internalapi.analytics.g gVar = com.yandex.plus.home.feature.panel.internalapi.analytics.g.b;
                iVar.getClass();
                b0Var.getClass();
                String str = iVar.a;
                String str2 = iVar.b;
                String str3 = b0Var.a;
                String str4 = b0Var.b;
                String id = zVar.getId();
                String name = zVar.getName();
                if (u == null) {
                    jyr jyrVar = com.yandex.plus.home.feature.panel.internalapi.analytics.a.e;
                    u = r1.o();
                }
                com.yandex.plus.home.feature.panel.internalapi.analytics.d dVar = new com.yandex.plus.home.feature.panel.internalapi.analytics.d(str, str2, str3, str4, id, name, u, d0Var.e, gVar, d0Var.c);
                com.yandex.plus.log.api.b bVar = hVar.K;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusPanelPlusCardSectionView", "shortcut clicked " + zVar);
                }
                hVar.w0.invoke(dVar);
                hVar.L.invoke(d0Var);
                break;
            case 1:
                o oVar = (o) zVar;
                com.yandex.plus.home.feature.panel.internalapi.analytics.a u2 = hVar.u((com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a) viewGroup);
                com.yandex.plus.home.feature.panel.internalapi.analytics.g gVar2 = com.yandex.plus.home.feature.panel.internalapi.analytics.g.b;
                iVar.getClass();
                b0Var.getClass();
                d0Var.getClass();
                String str5 = iVar.a;
                String str6 = iVar.b;
                String str7 = b0Var.a;
                String str8 = b0Var.b;
                String str9 = oVar.a;
                String str10 = oVar.b;
                if (u2 == null) {
                    jyr jyrVar2 = com.yandex.plus.home.feature.panel.internalapi.analytics.a.e;
                    u2 = r1.o();
                }
                hVar.w0.invoke(new com.yandex.plus.home.feature.panel.internalapi.analytics.d(str5, str6, str7, str8, str9, str10, u2, d0Var.e, gVar2, d0Var.c));
                hVar.v0.invoke(d0Var, Boolean.valueOf(oVar.k));
                break;
            default:
                p pVar = (p) zVar;
                com.yandex.plus.home.feature.panel.internalapi.analytics.a u3 = hVar.u((com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.b) viewGroup);
                com.yandex.plus.home.feature.panel.internalapi.analytics.g gVar3 = com.yandex.plus.home.feature.panel.internalapi.analytics.g.a;
                iVar.getClass();
                b0Var.getClass();
                d0Var.getClass();
                String str11 = iVar.a;
                String str12 = iVar.b;
                String str13 = b0Var.a;
                String str14 = b0Var.b;
                String str15 = pVar.a;
                String str16 = pVar.b;
                if (u3 == null) {
                    jyr jyrVar3 = com.yandex.plus.home.feature.panel.internalapi.analytics.a.e;
                    u3 = r1.o();
                }
                hVar.w0.invoke(new com.yandex.plus.home.feature.panel.internalapi.analytics.d(str11, str12, str13, str14, str15, str16, u3, d0Var.e, gVar3, d0Var.c));
                hVar.L.invoke(d0Var);
                break;
        }
    }
}
