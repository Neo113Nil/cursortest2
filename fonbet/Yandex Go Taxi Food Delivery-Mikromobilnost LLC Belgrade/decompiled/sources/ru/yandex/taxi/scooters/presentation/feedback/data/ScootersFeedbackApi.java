package ru.yandex.taxi.scooters.presentation.feedback.data;

import defpackage.avq;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.utq;
import defpackage.xuq;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\u0007j\u0002`\u000e2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/data/ScootersFeedbackApi;", "", "", "", "headers", "Lxuq;", "feedbackSettingsParams", "Lcmt;", "Lavq;", "a", "(Ljava/util/Map;Lxuq;)Lcmt;", "Lutq;", "feedbackParams", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Ljava/util/Map;Lutq;)Lcmt;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScootersFeedbackApi {
    @s490("scooters/v1/feedback/settings")
    cmt<avq> a(@uau Map<String, String> headers, @q76 xuq feedbackSettingsParams);

    @s490("scooters/v1/feedback")
    cmt<zy11> b(@uau Map<String, String> headers, @q76 utq feedbackParams);
}
