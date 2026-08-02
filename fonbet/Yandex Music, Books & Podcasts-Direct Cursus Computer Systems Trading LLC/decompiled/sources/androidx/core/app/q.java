package androidx.core.app;

import android.adservices.measurement.MeasurementManager;
import android.graphics.BitmapFactory;
import android.view.View;
import com.yandex.passport.internal.ui.AccountNotAuthorizedActivity;
import com.yandex.passport.internal.ui.AutoLoginActivity;
import defpackage.egu;
import defpackage.jpj;
import defpackage.js6;
import defpackage.kqv;
import defpackage.otc;
import defpackage.s9f;
import defpackage.tqj;
import defpackage.zne;
import defpackage.zpj;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements com.yandex.passport.legacy.lx.g, zpj, tqj, com.yandex.passport.legacy.lx.a, jpj, egu, com.yandex.plus.core.config.b, js6 {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ MeasurementManager e(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void i() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void j(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append('\'');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        view.getClass();
        zne g = kqvVar.a.g(647);
        g.getClass();
        int i = com.yandex.passport.internal.ui.base.e.i;
        view.setPadding(i, g.b + i, i, i);
        return kqv.b;
    }

    @Override // com.yandex.plus.core.config.b
    public com.yandex.plus.core.config.a a() {
        return com.yandex.plus.core.config.a.b;
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: b, reason: collision with other method in class */
    public void mo1b(Object obj) {
        switch (this.a) {
            case 12:
                Throwable th = (Throwable) obj;
                int i = AccountNotAuthorizedActivity.m;
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error loading avatar", th);
                    return;
                }
                return;
            case 13:
                Throwable th2 = (Throwable) obj;
                int i2 = AutoLoginActivity.m;
                com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error loading avatar", th2);
                    return;
                }
                return;
            case 14:
                com.yandex.passport.legacy.a.d(new Exception((Throwable) obj));
                return;
            case 15:
                Throwable th3 = (Throwable) obj;
                com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error loading app icon", th3);
                    return;
                }
                return;
            case 16:
                Throwable th4 = (Throwable) obj;
                com.yandex.passport.common.logger.d dVar4 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error loading app icon", th4);
                    return;
                }
                return;
            case 17:
            case 18:
            case 20:
            default:
                throw new IllegalStateException((Throwable) obj);
            case 19:
                com.yandex.passport.legacy.a.c("Failed to get debug information", (Throwable) obj);
                return;
            case 21:
                return;
        }
    }

    @Override // defpackage.egu
    public void c(View view, float f) {
        s9f[] s9fVarArr = com.yandex.plus.home.feature.webviews.internal.stories.list.f.i;
        float abs = 1 - (Math.abs(f) * 0.19999999f);
        view.setScaleX(abs);
        view.setScaleY(abs);
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        switch (this.a) {
            case 10:
                com.yandex.passport.legacy.a.e(6, "Error starting sms retriever", exc);
                break;
            default:
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint failure", exc);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.js6
    public Object h(otc otcVar) {
        switch (this.a) {
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                otcVar.getClass();
                return new com.yandex.plus.pay.ui.core.debug.internal.ui.info.g();
            default:
                otcVar.getClass();
                return new com.yandex.plus.pay.ui.core.debug.internal.ui.log.h();
        }
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        com.yandex.passport.legacy.a.a("Success starting sms retriever");
    }

    public /* synthetic */ q(int i) {
        this.a = i;
    }

    @Override // com.yandex.passport.legacy.lx.g
    public Object b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }
}
