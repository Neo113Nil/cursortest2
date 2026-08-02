package com.plaid.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.protobuf.Timestamp;
import com.plaid.internal.D6;
import com.plaid.internal.N2;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
public final class n8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final PackageManager f;
    public final String g;
    public final C0102b3 h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;

    public n8(String str, String str2, String str3, String str4, String str5, String str6, String str7, PackageManager packageManager, String str8, C0102b3 c0102b3) {
        O4.a.getClass();
        str2.getClass();
        str6.getClass();
        str7.getClass();
        packageManager.getClass();
        c0102b3.getClass();
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = str5;
        this.e = str6;
        this.f = packageManager;
        this.g = str8;
        this.h = c0102b3;
        this.i = LazyKt.lazy(j8.a);
        this.j = LazyKt.lazy(new l8(str));
        this.k = LazyKt.lazy(new k8(this));
        this.l = LazyKt.lazy(new m8(this));
    }

    public final Workflow$LinkWorkflowStartRequest a(N2.a aVar) {
        aVar.getClass();
        M0 m0 = aVar.b;
        m0.getClass();
        Configuration$LinkTokenConfiguration.a a = Configuration$LinkTokenConfiguration.newBuilder().e(m0.a).c(m0.b).d(m0.c).b(m0.d).f(m0.e).a(m0.f).a(m0.g);
        L0 l0 = m0.h;
        if (l0 != null) {
            Configuration$EmbeddedOpenLinkConfiguration.a a2 = Configuration$EmbeddedOpenLinkConfiguration.newBuilder().a(l0.a).a(l0.e);
            if (l0.b != null) {
                a2.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.newBuilder().build());
            } else if (l0.d != null) {
                a2.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.newBuilder().build());
            } else if (l0.c != null) {
                a2.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.newBuilder().a(l0.c.a).build());
            }
            Configuration$EmbeddedOpenLinkConfiguration build = a2.build();
            build.getClass();
            a.a(build);
        }
        a.getClass();
        Configuration$LinkTokenConfiguration build2 = a.a((Configuration$PlatformIdentifierConfiguration) this.j.getValue()).build();
        build2.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Timestamp build3 = Timestamp.newBuilder().setSeconds(currentTimeMillis / 1000).setNanos((int) ((currentTimeMillis % 1000) * 1000000)).build();
        build3.getClass();
        PackageManager packageManager = this.f;
        packageManager.getClass();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        queryIntentServices.getClass();
        Workflow$LinkWorkflowStartRequest build4 = a().a(build3).a(build2).a(Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).build()).build();
        build4.getClass();
        return build4;
    }

    public final Workflow$LinkWorkflowStartRequest a(N2.b bVar, boolean z) {
        bVar.getClass();
        Configuration$LinkTokenConfiguration.a e = Configuration$LinkTokenConfiguration.newBuilder().c(bVar.b).e(bVar.c.getToken());
        String str = this.d;
        if (str == null) {
            str = "";
        }
        Configuration$LinkTokenConfiguration.a a = e.d(str).a((Configuration$PlatformIdentifierConfiguration) this.j.getValue());
        long currentTimeMillis = System.currentTimeMillis();
        Timestamp build = Timestamp.newBuilder().setSeconds(currentTimeMillis / 1000).setNanos((int) ((currentTimeMillis % 1000) * 1000000)).build();
        build.getClass();
        PackageManager packageManager = this.f;
        packageManager.getClass();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        queryIntentServices.getClass();
        Workflow$LinkWorkflowStartRequest build2 = a().a(build).a(a).a(Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).b(z).build()).build();
        build2.getClass();
        return build2;
    }

    public final Workflow$LinkWorkflowStartRequest.a a() {
        Workflow$LinkWorkflowStartRequest.a a = Workflow$LinkWorkflowStartRequest.newBuilder().a((Configuration$SDKMetadata) this.l.getValue()).a((Configuration$DeviceMetadata) this.k.getValue());
        this.h.invoke();
        return a.a("");
    }

    public final Workflow$LinkWorkflowStartRequest a(String str) {
        str.getClass();
        Configuration$EmbeddedLinkTokenConfiguration.a c = Configuration$EmbeddedLinkTokenConfiguration.newBuilder().a(UUID.randomUUID().toString()).c(str);
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        Configuration$EmbeddedLinkTokenConfiguration.a a = c.b(str2).a((Configuration$PlatformIdentifierConfiguration) this.j.getValue());
        long currentTimeMillis = System.currentTimeMillis();
        Timestamp build = Timestamp.newBuilder().setSeconds(currentTimeMillis / 1000).setNanos((int) ((currentTimeMillis % 1000) * 1000000)).build();
        build.getClass();
        PackageManager packageManager = this.f;
        packageManager.getClass();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        queryIntentServices.getClass();
        Workflow$LinkWorkflowStartRequest build2 = a().a(build).a(a).a(Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).build()).build();
        build2.getClass();
        return build2;
    }

    public final Workflow$LinkWorkflowStartRequest a(N2.k kVar, D6.a aVar) {
        kVar.getClass();
        aVar.getClass();
        String str = kVar.f;
        str.getClass();
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str2 = null;
        builder.parse$okhttp(null, str);
        String queryParameter = builder.build().queryParameter("token");
        String str3 = kVar.f;
        str3.getClass();
        HttpUrl.Builder builder2 = new HttpUrl.Builder();
        builder2.parse$okhttp(null, str3);
        String queryParameter2 = builder2.build().queryParameter("oauthNonce");
        if (queryParameter == null || !StringsKt__StringsJVMKt.startsWith(queryParameter, "link-", false)) {
            queryParameter = "";
        }
        Workflow$LinkWorkflowStartRequest.a a = a();
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.a a2 = Workflow$LinkWorkflowStartRequest.OAuthContinuation.newBuilder().b(aVar.a).a(queryParameter);
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a newBuilder = Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.newBuilder();
        try {
            Uri parse = Uri.parse(aVar.a);
            if (parse != null) {
                str2 = parse.getQueryParameter("oauth_state_id");
            }
        } catch (Exception unused) {
        }
        if (str2 == null) {
            str2 = "";
        }
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a b = newBuilder.b(str2);
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        Workflow$LinkWorkflowStartRequest build = a.a(a2.a(b.a(queryParameter2))).build();
        build.getClass();
        return build;
    }
}
