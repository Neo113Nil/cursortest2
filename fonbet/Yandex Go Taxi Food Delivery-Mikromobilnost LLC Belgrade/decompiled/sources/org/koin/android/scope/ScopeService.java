package org.koin.android.scope;

import android.app.Service;
import defpackage.dbp0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lorg/koin/android/scope/ScopeService;", "Landroid/app/Service;", "", "", "initialiseScope", "<init>", "(Z)V", "Lzy11;", "onCreate", "()V", "onDestroy", "Z", "Ldbp0;", "scope$delegate", "Li3y;", "getScope", "()Ldbp0;", "scope", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ScopeService extends Service {
    private final boolean initialiseScope;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    private final i3y scope;

    public ScopeService(boolean z) {
        this.initialiseScope = z;
        this.scope = a.a(new sls(this) { // from class: org.koin.android.scope.ServiceExtKt$serviceScope$1
            final /* synthetic */ Service $this_serviceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_serviceScope = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                throw new IllegalStateException("KoinApplication has not been started");
            }
        });
    }

    public dbp0 getScope() {
        return (dbp0) this.scope.getValue();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.initialiseScope) {
            getScope().getClass();
            jl40.M(getScope(), "Open Service Scope: ");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        getScope().getClass();
        jl40.M(getScope(), "Close service scope: ");
        throw null;
    }

    public /* synthetic */ ScopeService(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public ScopeService() {
        this(false, 1, null);
    }
}
