package com.yandex.passport.internal.ui.domik.common;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import defpackage.sre;
import defpackage.zh;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                zh zhVar = this.b.E;
                IntentSender intentSender = pendingIntent.getIntentSender();
                intentSender.getClass();
                zhVar.a(new sre(intentSender, null, 0, 0));
                return Unit.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                b bVar = this.b;
                boolean z = (booleanValue || bVar.C || !bVar.D) ? false : true;
                View view = bVar.v;
                if (view == null) {
                    Intrinsics.j("imageLogo");
                    throw null;
                }
                view.setVisibility(z ? 0 : 8);
                Space space = bVar.z;
                if (space != null) {
                    space.setVisibility(z ? 8 : 0);
                }
                Space space2 = bVar.A;
                if (space2 != null) {
                    space2.setVisibility(z ? 8 : 0);
                }
                TextView textView = bVar.u;
                if (textView != null) {
                    textView.setVisibility(z ? 8 : 0);
                    return Unit.a;
                }
                Intrinsics.j("textLegal");
                throw null;
        }
    }
}
