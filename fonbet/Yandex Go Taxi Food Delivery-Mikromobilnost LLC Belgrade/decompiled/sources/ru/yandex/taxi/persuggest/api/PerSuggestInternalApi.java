package ru.yandex.taxi.persuggest.api;

import defpackage.a1o;
import defpackage.cmt;
import defpackage.dzb;
import defpackage.gzb;
import defpackage.j3z;
import defpackage.m6x0;
import defpackage.n851;
import defpackage.nc61;
import defpackage.p7v0;
import defpackage.q3e;
import defpackage.q6r;
import defpackage.q76;
import defpackage.rc61;
import defpackage.s490;
import defpackage.u6r;
import defpackage.u7v0;
import defpackage.uc61;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J?\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00122\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00122\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0017\u0010\u0015J-\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00190\nj\u0002`\u001a2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH'¢\u0006\u0004\b!\u0010\u0011¨\u0006\"À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/persuggest/api/PerSuggestInternalApi;", "", "", MetaDataField.DATE_FIELD, "Lq6r;", "params", "La1o;", "tag", "Lj3z;", "localId", "Lcmt;", "Lu6r;", "e", "(Ljava/lang/String;Lq6r;La1o;Lj3z;)Lcmt;", "Lnc61;", "Lrc61;", "g", "(Ljava/lang/String;Lnc61;)Lcmt;", "Lp7v0;", "Lu7v0;", "a", "(Ljava/lang/String;Lp7v0;La1o;)Lcmt;", "Luc61;", "f", "Lq3e;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Ljava/lang/String;Lq3e;)Lcmt;", "Ldzb;", "Lgzb;", "d", "(Ljava/lang/String;Ldzb;)Lcmt;", "c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface PerSuggestInternalApi {
    @s490("persuggest/v1/suggest")
    cmt<u7v0> a(@z8u("Date") String date, @q76 p7v0 params, @m6x0 a1o tag);

    @s490("persuggest/v1/confirm")
    cmt<zy11> b(@z8u("Date") String date, @q76 q3e params);

    @s490("persuggest/v2/zerosuggest")
    cmt<uc61> c(@z8u("Date") String date, @q76 nc61 params);

    @s490("persuggest/v1/clarify-points")
    cmt<gzb> d(@z8u("Date") String date, @q76 dzb params);

    @n851
    @s490("persuggest/v1/finalsuggest")
    cmt<u6r> e(@z8u("Date") String date, @q76 q6r params, @m6x0 a1o tag, @m6x0 j3z localId);

    @s490("persuggest/v2/suggest")
    cmt<uc61> f(@z8u("Date") String date, @q76 p7v0 params, @m6x0 a1o tag);

    @s490("persuggest/v1/zerosuggest")
    cmt<rc61> g(@z8u("Date") String date, @q76 nc61 params);
}
