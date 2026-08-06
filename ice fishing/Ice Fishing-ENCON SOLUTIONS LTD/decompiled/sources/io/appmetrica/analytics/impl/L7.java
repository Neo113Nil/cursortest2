package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class L7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4685a;

    /* renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f4686b;

    /* renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f4687c;

    /* renamed from: d, reason: collision with root package name */
    public J7 f4688d;

    public L7(boolean z2) {
        this.f4685a = z2;
    }

    public final void a(int i2) {
        J7 j7 = this.f4688d;
        String str = j7 == null ? null : j7.f4581c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f4686b;
        if (deferredDeeplinkListener != null) {
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            deferredDeeplinkListener.onError(i3 != 0 ? i3 != 1 ? i3 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f4686b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f4687c;
        if (deferredDeeplinkParametersListener != null) {
            if (i2 == 0) {
                throw null;
            }
            int i4 = i2 - 1;
            deferredDeeplinkParametersListener.onError(i4 != 0 ? i4 != 1 ? i4 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f4687c = null;
        }
    }

    public final void a() {
        J7 j7 = this.f4688d;
        if (j7 != null) {
            String str = j7.f4580b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f4686b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f4686b = null;
                }
                if (!AbstractC0572lo.a(this.f4688d.f4579a)) {
                    Map<String, String> map = this.f4688d.f4579a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f4687c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f4687c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f4688d.f4581c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f4687c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f4687c = null;
                    return;
                }
                return;
            }
            if (j7.f4581c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
