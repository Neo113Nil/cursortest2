package com.yandex.passport.internal.ui.bouncer.error;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class a extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = bVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.k, continuation, 0);
            default:
                return new a(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        b bVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                bVar.m.a(y1.b);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.clipboard.a aVar = bVar.p;
                q qVar = bVar.l;
                k kVar = qVar.d;
                StringBuilder sb = new StringBuilder();
                sb.append((Object) kVar.f.getText());
                sb.append('\n');
                sb.append((Object) kVar.g.getText());
                sb.append('\n');
                sb.append((Object) kVar.h.getText());
                sb.append('\n');
                sb.append((Object) kVar.i.getText());
                String sb2 = sb.toString();
                aVar.getClass();
                ClipData newPlainText = ClipData.newPlainText("errorInfo", sb2);
                ClipboardManager clipboardManager = aVar.a;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                Context context = qVar.a;
                String string = context.getString(R.string.passport_error_slab_toast_text);
                string.getClass();
                Toast.makeText(context, string, 0).show();
                break;
        }
        return Unit.a;
    }
}
