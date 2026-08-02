package com.yandex.passport.internal.report;

import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class ue implements ze {
    public final /* synthetic */ int a;
    public final String b;
    public final boolean c;

    public ue(com.yandex.passport.common.core.f fVar) {
        String valueOf;
        this.a = 1;
        if (fVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.a.a);
            sb.append(':');
            sb.append(fVar.b);
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(fVar);
        }
        this.b = valueOf;
        this.c = fVar != null;
    }

    @Override // com.yandex.passport.internal.report.ze
    public final boolean a() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getName() {
        switch (this.a) {
            case 0:
                return "location_id";
            case 1:
                return "muid";
            case 2:
                return "member_uid";
            default:
                return "throwable-message";
        }
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getValue() {
        switch (this.a) {
        }
        return this.b;
    }

    public ue(Throwable th) {
        String message;
        String message2;
        this.a = 3;
        this.b = (th == null || (message2 = th.getMessage()) == null) ? "" : message2;
        this.c = (th == null || (message = th.getMessage()) == null) ? false : !StringsKt.U(message);
    }

    public ue(Long l, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = String.valueOf(l);
                this.c = true;
                break;
            default:
                this.b = String.valueOf(l);
                this.c = l != null;
                break;
        }
    }
}
