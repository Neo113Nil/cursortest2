package ru.yandex.music.concert.ticket;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import defpackage.b4n;
import defpackage.bdt;
import defpackage.byb;
import defpackage.c4n;
import defpackage.hag;
import defpackage.l18;
import defpackage.ng5;
import defpackage.np2;
import defpackage.qdc;
import ru.yandex.music.R;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes5.dex */
public class PurchaseTicketActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o b4nVar;
        super.onCreate(bundle);
        y supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.D("tag.fragment.tickets") == null) {
            String nonEmpty = Preconditions.nonEmpty(getIntent().getStringExtra("extra.concertId"));
            String nonEmpty2 = Preconditions.nonEmpty(getIntent().getStringExtra("extra.dataSessionId"));
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (((ng5) ((byb) qdcVar.C(I)).b(ng5.class)).h()) {
                nonEmpty.getClass();
                nonEmpty2.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("arg.concertId", nonEmpty);
                bundle2.putString("arg.dataSessionId", nonEmpty2);
                b4nVar = new c4n();
                b4nVar.setArguments(bundle2);
            } else {
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("arg.concertId", nonEmpty);
                bundle3.putString("arg.dataSessionId", nonEmpty2);
                b4nVar = new b4n();
                b4nVar.setArguments(bundle3);
            }
            a aVar = new a(supportFragmentManager);
            aVar.e(R.id.content_frame, b4nVar, "tag.fragment.tickets");
            aVar.j();
        }
    }
}
