package ru.yandex.logistics.cargo_form.send_event.impl.job;

import defpackage.cpc;
import defpackage.dpc;
import defpackage.epc;
import defpackage.fpc;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.n8x;
import defpackage.ny61;
import defpackage.o8x;
import defpackage.w511;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.FormEventType;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.cargo_form.send_event.impl.data.a a;

    public a(ru.yandex.logistics.cargo_form.send_event.impl.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Map map, ContinuationImpl continuationImpl) {
        FormSendEventJob$doWork$1 formSendEventJob$doWork$1;
        int i;
        FormEventType formEventType;
        FormEventType formEventType2;
        String obj;
        Object obj2;
        fpc fpcVar;
        if (continuationImpl instanceof FormSendEventJob$doWork$1) {
            formSendEventJob$doWork$1 = (FormSendEventJob$doWork$1) continuationImpl;
            int i2 = formSendEventJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formSendEventJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                FormSendEventJob$doWork$1 formSendEventJob$doWork$12 = formSendEventJob$doWork$1;
                Object obj3 = formSendEventJob$doWork$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formSendEventJob$doWork$12.label;
                if (i != 0) {
                    b.b(obj3);
                    Object obj4 = map.get("mode");
                    String obj5 = obj4 != null ? obj4.toString() : null;
                    Object obj6 = map.get("state_json");
                    String obj7 = obj6 != null ? obj6.toString() : null;
                    Object obj8 = map.get("event_type");
                    if (obj8 == null || (obj = obj8.toString()) == null) {
                        formEventType = null;
                    } else {
                        FormEventType.Companion.getClass();
                        Iterator<E> it = FormEventType.a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((FormEventType) obj2).getKey(), obj)) {
                                break;
                            }
                        }
                        formEventType = (FormEventType) obj2;
                    }
                    if (obj7 == null || obj5 == null || formEventType == null) {
                        String str = obj5;
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required arguments were not provided");
                        jgz.a.h("FormSendEventJob");
                        jgz.d(illegalArgumentException, "Missing arguments: stateJson=" + obj7 + ", mode=" + str + ", eventType =" + formEventType, new Object[0]);
                        return new n8x(illegalArgumentException);
                    }
                    Object obj9 = map.get("meta_json");
                    String obj10 = obj9 != null ? obj9.toString() : null;
                    Object obj11 = map.get("scenario");
                    String obj12 = obj11 != null ? obj11.toString() : null;
                    formSendEventJob$doWork$12.L$0 = null;
                    formSendEventJob$doWork$12.L$1 = null;
                    formSendEventJob$doWork$12.L$2 = null;
                    formSendEventJob$doWork$12.L$3 = formEventType;
                    formSendEventJob$doWork$12.L$4 = null;
                    formSendEventJob$doWork$12.L$5 = null;
                    formSendEventJob$doWork$12.label = 1;
                    obj3 = this.a.b(obj5, obj12, obj7, formEventType, obj10, formSendEventJob$doWork$12);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    formEventType2 = formEventType;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    formEventType2 = (FormEventType) formSendEventJob$doWork$12.L$3;
                    b.b(obj3);
                }
                fpcVar = (fpc) obj3;
                if (!(fpcVar instanceof dpc)) {
                    jgz.a.h("FormSendEventJob");
                    jgz.a("Form send event sent successfully, eventType=" + formEventType2, new Object[0]);
                    return o8x.a;
                }
                if (!(fpcVar instanceof cpc)) {
                    if (!(fpcVar instanceof epc)) {
                        w511.b();
                        return null;
                    }
                    IOException iOException = new IOException("Unknown network error occurred");
                    jgz.a.h("FormSendEventJob");
                    jgz.d(iOException, "Form send event request failed with unknown error, eventType=" + formEventType2, new Object[0]);
                    return new n8x(iOException);
                }
                Integer num = ((cpc) fpcVar).b;
                IOException iOException2 = new IOException("HTTP error " + num);
                jgz.a.h("FormSendEventJob");
                jgz.d(iOException2, "Form send event request failed, eventType=" + formEventType2 + ", httpCode=" + num, new Object[0]);
                return new n8x(iOException2);
            }
        }
        formSendEventJob$doWork$1 = new FormSendEventJob$doWork$1(this, continuationImpl);
        FormSendEventJob$doWork$1 formSendEventJob$doWork$122 = formSendEventJob$doWork$1;
        Object obj32 = formSendEventJob$doWork$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formSendEventJob$doWork$122.label;
        if (i != 0) {
        }
        fpcVar = (fpc) obj32;
        if (!(fpcVar instanceof dpc)) {
        }
    }
}
