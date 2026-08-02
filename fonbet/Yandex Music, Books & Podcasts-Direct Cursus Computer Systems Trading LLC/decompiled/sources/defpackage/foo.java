package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class foo extends View {
    public final orq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foo(@NotNull Context context, @NotNull orq orqVar) {
        super(context);
        context.getClass();
        orqVar.getClass();
        this.a = orqVar;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof eoo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eoo eooVar = (eoo) parcelable;
        String str = eooVar.a;
        orq orqVar = this.a;
        if (Intrinsics.d(str, orqVar.getClass().getName())) {
            String str2 = eooVar.b;
            Bundle bundle = eooVar.c;
            str2.getClass();
            bundle.getClass();
            String str3 = orqVar.f;
            if (str3 != null) {
                str3.equals(str2);
            }
            orqVar.f = str2;
            orqVar.d = bundle;
        }
        super.onRestoreInstanceState(eooVar.getSuperState());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        orq orqVar = this.a;
        orqVar.l(bundle);
        String str = orqVar.f;
        if (str == null) {
            str = eta.e();
            orqVar.f = str;
        }
        return new eoo(super.onSaveInstanceState(), orqVar.getClass().getName(), str, bundle);
    }
}
