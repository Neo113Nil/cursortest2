package ru.yandex.tankerapp.go.models;

import defpackage.jl40;
import defpackage.xvz;
import defpackage.ysq0;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/tankerapp/go/models/ReporterEventModel;", "Ljava/io/Serializable;", "", "name", "", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReporterEventModel implements Serializable {

    @ysq0("name")
    private final String name;

    @ysq0("params")
    private final Map<String, Object> params;

    public ReporterEventModel(String str, Map<String, ? extends Object> map) {
        this.name = str;
        this.params = map;
    }

    /* renamed from: a, reason: from getter */
    public final Map getParams() {
        return this.params;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReporterEventModel)) {
            return false;
        }
        ReporterEventModel reporterEventModel = (ReporterEventModel) obj;
        return jl40.l(this.name, reporterEventModel.name) && jl40.l(this.params, reporterEventModel.params);
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.params.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("ReporterEventModel(name=", this.name, ", params=", Extension.C_BRAKE, this.params);
    }
}
