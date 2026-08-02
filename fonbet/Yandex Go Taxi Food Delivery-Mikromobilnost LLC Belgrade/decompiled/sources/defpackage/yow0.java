package defpackage;

import com.yandex.go.zone.dto.objects.OrderButtonStyleDto;
import kotlin.a;
import ru.yandex.taxi.styling.ButtonType;

/* loaded from: classes6.dex */
public final class yow0 {
    public final cj70 a;
    public final i3y b = a.a(new bhw0(10));

    public yow0(cj70 cj70Var) {
        this.a = cj70Var;
    }

    public final bj70 a(OrderButtonStyleDto orderButtonStyleDto, m37 m37Var) {
        bj70 a = this.a.a(orderButtonStyleDto);
        if (a == null) {
            j37 a2 = m37Var.a(ButtonType.SURGE);
            a = a2 != null ? xcb1.b(a2) : null;
            if (a == null) {
                return (bj70) this.b.getValue();
            }
        }
        return a;
    }
}
