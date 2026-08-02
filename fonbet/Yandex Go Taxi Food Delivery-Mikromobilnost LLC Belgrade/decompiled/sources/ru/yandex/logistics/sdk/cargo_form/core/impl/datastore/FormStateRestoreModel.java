package ru.yandex.logistics.sdk.cargo_form.core.impl.datastore;

import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JU\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/core/impl/datastore/FormStateRestoreModel;", "", "mode", "", "scenario", "stateMap", "", "route", "", "Lru/yandex/logistics/sdk/cargo_form/core/impl/datastore/FormRestoreAddressModel;", "pickupPointsRoute", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "getMode", "()Ljava/lang/String;", "getScenario", "getStateMap", "()Ljava/util/Map;", "getRoute", "()Ljava/util/List;", "getPickupPointsRoute", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormStateRestoreModel {
    private final String mode;
    private final List<FormRestoreAddressModel> pickupPointsRoute;
    private final List<FormRestoreAddressModel> route;
    private final String scenario;
    private final Map<String, Object> stateMap;

    public FormStateRestoreModel(String str, String str2, Map<String, ? extends Object> map, List<FormRestoreAddressModel> list, List<FormRestoreAddressModel> list2) {
        this.mode = str;
        this.scenario = str2;
        this.stateMap = map;
        this.route = list;
        this.pickupPointsRoute = list2;
    }

    public static /* synthetic */ FormStateRestoreModel copy$default(FormStateRestoreModel formStateRestoreModel, String str, String str2, Map map, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formStateRestoreModel.mode;
        }
        if ((i & 2) != 0) {
            str2 = formStateRestoreModel.scenario;
        }
        if ((i & 4) != 0) {
            map = formStateRestoreModel.stateMap;
        }
        if ((i & 8) != 0) {
            list = formStateRestoreModel.route;
        }
        if ((i & 16) != 0) {
            list2 = formStateRestoreModel.pickupPointsRoute;
        }
        List list3 = list2;
        Map map2 = map;
        return formStateRestoreModel.copy(str, str2, map2, list, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final Map<String, Object> component3() {
        return this.stateMap;
    }

    public final List<FormRestoreAddressModel> component4() {
        return this.route;
    }

    public final List<FormRestoreAddressModel> component5() {
        return this.pickupPointsRoute;
    }

    public final FormStateRestoreModel copy(String mode, String scenario, Map<String, ? extends Object> stateMap, List<FormRestoreAddressModel> route, List<FormRestoreAddressModel> pickupPointsRoute) {
        return new FormStateRestoreModel(mode, scenario, stateMap, route, pickupPointsRoute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormStateRestoreModel)) {
            return false;
        }
        FormStateRestoreModel formStateRestoreModel = (FormStateRestoreModel) other;
        return jl40.l(this.mode, formStateRestoreModel.mode) && jl40.l(this.scenario, formStateRestoreModel.scenario) && jl40.l(this.stateMap, formStateRestoreModel.stateMap) && jl40.l(this.route, formStateRestoreModel.route) && jl40.l(this.pickupPointsRoute, formStateRestoreModel.pickupPointsRoute);
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<FormRestoreAddressModel> getPickupPointsRoute() {
        return this.pickupPointsRoute;
    }

    public final List<FormRestoreAddressModel> getRoute() {
        return this.route;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final Map<String, Object> getStateMap() {
        return this.stateMap;
    }

    public int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        String str = this.scenario;
        return this.pickupPointsRoute.hashCode() + unr0.c(unr0.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.stateMap), 31, this.route);
    }

    public String toString() {
        String str = this.mode;
        String str2 = this.scenario;
        Map<String, Object> map = this.stateMap;
        List<FormRestoreAddressModel> list = this.route;
        List<FormRestoreAddressModel> list2 = this.pickupPointsRoute;
        StringBuilder v = b64.v("FormStateRestoreModel(mode=", str, ", scenario=", str2, ", stateMap=");
        v.append(map);
        v.append(", route=");
        v.append(list);
        v.append(", pickupPointsRoute=");
        return ly3.s(v, list2, Extension.C_BRAKE);
    }
}
