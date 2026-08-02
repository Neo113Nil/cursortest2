package ru.yandex.alice.cuttlefish.services.features_limiter.proto.api.quark.webchat;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.k4o;
import defpackage.nan;
import defpackage.oan;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/yandex/alice/cuttlefish/services/features_limiter/proto/api/quark/webchat/EDecision;", "Lcom/squareup/wire/WireEnum;", "", "", "value", CA20Status.STATUS_USER_I, "getValue", "()I", "Companion", "oan", "D_UNKNOWN", "D_ALLOW", "D_TOO_MANY_REQUESTS", "D_NOT_AWAILABLE_FOR_USER", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EDecision implements WireEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EDecision[] $VALUES;
    public static final ProtoAdapter<EDecision> ADAPTER;
    public static final oan Companion;
    public static final EDecision D_ALLOW;
    public static final EDecision D_NOT_AWAILABLE_FOR_USER;
    public static final EDecision D_TOO_MANY_REQUESTS;
    public static final EDecision D_UNKNOWN;
    private final int value;

    static {
        EDecision eDecision = new EDecision("D_UNKNOWN", 0, 0);
        D_UNKNOWN = eDecision;
        EDecision eDecision2 = new EDecision("D_ALLOW", 1, 1);
        D_ALLOW = eDecision2;
        EDecision eDecision3 = new EDecision("D_TOO_MANY_REQUESTS", 2, 2);
        D_TOO_MANY_REQUESTS = eDecision3;
        EDecision eDecision4 = new EDecision("D_NOT_AWAILABLE_FOR_USER", 3, 3);
        D_NOT_AWAILABLE_FOR_USER = eDecision4;
        EDecision[] eDecisionArr = {eDecision, eDecision2, eDecision3, eDecision4};
        $VALUES = eDecisionArr;
        $ENTRIES = a.a(eDecisionArr);
        Companion = new oan();
        ADAPTER = new nan(qoi0.a(EDecision.class), Syntax.PROTO_3, eDecision);
    }

    public EDecision(String str, int i, int i2) {
        this.value = i2;
    }

    public static EDecision valueOf(String str) {
        return (EDecision) Enum.valueOf(EDecision.class, str);
    }

    public static EDecision[] values() {
        return (EDecision[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
