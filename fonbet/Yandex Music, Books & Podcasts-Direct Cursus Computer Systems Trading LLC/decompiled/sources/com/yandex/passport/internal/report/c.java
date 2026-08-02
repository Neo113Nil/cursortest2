package com.yandex.passport.internal.report;

import android.net.Uri;
import com.connectsdk.service.config.ServiceDescription;
import defpackage.f1d;
import defpackage.uah;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class c implements ze {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b2, code lost:
    
        if (r9 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(com.yandex.passport.internal.properties.l lVar, boolean z) {
        String str;
        this.a = 2;
        this.b = z ? "updated_login_properties" : "login_properties";
        if (lVar != null) {
            com.yandex.passport.internal.entities.k kVar = lVar.d;
            Pair pair = new Pair(ServiceDescription.KEY_FILTER, uah.e(new Pair("internal_filter_rules", kVar.e), new Pair("primary_environment", kVar.a), new Pair("secondary_team_environment", kVar.b), new Pair("flag_holder", kVar.j())));
            Pair pair2 = new Pair("is_addition_only_required", Boolean.valueOf(lVar.h));
            Pair pair3 = new Pair("is_registration_only_required", Boolean.valueOf(lVar.i));
            Pair pair4 = new Pair("source", lVar.r);
            com.yandex.passport.internal.properties.m0 m0Var = lVar.u;
            str = uah.e(pair, pair2, pair3, pair4, new Pair("web_am_properties", uah.e(new Pair("test_id", m0Var != null ? m0Var.e : null), new Pair("is_clear_cookies_before_authorization", m0Var != null ? Boolean.valueOf(m0Var.f) : null))), new Pair("set_as_current", Boolean.valueOf(lVar.v))).toString();
        }
        str = "null";
        this.c = str;
    }

    @Override // com.yandex.passport.internal.report.ze
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getName() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // com.yandex.passport.internal.report.ze
    public final String getValue() {
        switch (this.a) {
        }
        return this.c;
    }

    public c(Object obj, String str) {
        this.a = 1;
        str.getClass();
        this.b = f1d.g("experiments_", str);
        this.c = String.valueOf(obj);
    }

    public c(String str, int i) {
        this.a = i;
        switch (i) {
            case 5:
                str.getClass();
                this.b = "url";
                this.c = str;
                break;
            default:
                str.getClass();
                this.b = "uid";
                this.c = str;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Long l) {
        this(String.valueOf(l), 3);
        this.a = 3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(Uri uri) {
        this(r2, 5);
        this.a = 5;
        uri.getClass();
        com.yandex.passport.common.url.b.Companion.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
    }

    public c(String str, String str2) {
        this.a = 0;
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
    }

    public c(String str, List list) {
        this.a = 4;
        str.getClass();
        list.getClass();
        this.b = f1d.g("uid_", str);
        this.c = com.yandex.plus.core.locale.b.e(list);
    }
}
