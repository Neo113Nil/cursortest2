package ru.yandex.taxi.widget.due_timetable;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class DueTimetableView$throttle$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((DueTimetableView) this.receiver).onTimeSlotClick(((Number) obj).intValue());
        return zy11.a;
    }
}
