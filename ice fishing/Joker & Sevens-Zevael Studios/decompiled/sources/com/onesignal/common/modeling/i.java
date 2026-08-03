package com.onesignal.common.modeling;

import ac.o;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class i implements com.onesignal.common.events.d {
    private i _parentModel;
    private final String _parentProperty;
    private final com.onesignal.common.events.b changeNotifier;
    private final Map<String, Object> data;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends pc.k implements oc.c {
        final /* synthetic */ j $changeArgs;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$changeArgs = jVar;
            this.$tag = str;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.a) obj);
            return o.f277a;
        }

        public final void invoke(com.onesignal.common.modeling.a aVar) {
            pc.j.e(aVar, "it");
            aVar.onChanged(this.$changeArgs, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Object getAnyProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnyProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getAnyProperty(str, aVar);
    }

    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getBigDecimalProperty(str, aVar);
    }

    public static /* synthetic */ boolean getBooleanProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getBooleanProperty(str, aVar);
    }

    public static /* synthetic */ double getDoubleProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoubleProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getDoubleProperty(str, aVar);
    }

    public static /* synthetic */ float getFloatProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloatProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getFloatProperty(str, aVar);
    }

    public static /* synthetic */ int getIntProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getIntProperty(str, aVar);
    }

    public static /* synthetic */ List getListProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getListProperty(str, aVar);
    }

    public static /* synthetic */ long getLongProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLongProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getLongProperty(str, aVar);
    }

    public static /* synthetic */ h getMapModelProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapModelProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getMapModelProperty(str, aVar);
    }

    public static /* synthetic */ Object getOptAnyProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptAnyProperty(str, aVar);
    }

    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptBigDecimalProperty(str, aVar);
    }

    public static /* synthetic */ Boolean getOptBooleanProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptBooleanProperty(str, aVar);
    }

    public static /* synthetic */ Double getOptDoubleProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptDoubleProperty(str, aVar);
    }

    public static /* synthetic */ Float getOptFloatProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptFloatProperty(str, aVar);
    }

    public static /* synthetic */ Integer getOptIntProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptIntProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptIntProperty(str, aVar);
    }

    public static /* synthetic */ List getOptListProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptListProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptListProperty(str, aVar);
    }

    public static /* synthetic */ Long getOptLongProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptLongProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptLongProperty(str, aVar);
    }

    public static /* synthetic */ h getOptMapModelProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptMapModelProperty(str, aVar);
    }

    public static /* synthetic */ String getOptStringProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptStringProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptStringProperty(str, aVar);
    }

    public static /* synthetic */ String getStringProperty$default(i iVar, String str, oc.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getStringProperty(str, aVar);
    }

    private final void notifyChanged(String str, String str2, String str3, Object obj, Object obj2) {
        this.changeNotifier.fire(new a(new j(this, str, str2, obj, obj2), str3));
        if (this._parentModel != null) {
            String str4 = this._parentProperty + '.' + str;
            i iVar = this._parentModel;
            pc.j.b(iVar);
            iVar.notifyChanged(str4, str2, str3, obj, obj2);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z10, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnyProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setAnyProperty(str, obj, str2, z10);
    }

    public static /* synthetic */ void setBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setBigDecimalProperty(str, bigDecimal, str2, z10);
    }

    public static /* synthetic */ void setBooleanProperty$default(i iVar, String str, boolean z10, String str2, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        iVar.setBooleanProperty(str, z10, str2, z11);
    }

    public static /* synthetic */ void setDoubleProperty$default(i iVar, String str, double d10, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDoubleProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setDoubleProperty(str, d10, str3, z10);
    }

    public static /* synthetic */ void setEnumProperty$default(i iVar, String str, Enum r22, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnumProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        pc.j.e(str, "name");
        pc.j.e(r22, "value");
        pc.j.e(str2, "tag");
        iVar.setOptAnyProperty(str, r22.toString(), str2, z10);
    }

    public static /* synthetic */ void setFloatProperty$default(i iVar, String str, float f10, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFloatProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setFloatProperty(str, f10, str2, z10);
    }

    public static /* synthetic */ void setIntProperty$default(i iVar, String str, int i10, String str2, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIntProperty");
        }
        if ((i11 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        iVar.setIntProperty(str, i10, str2, z10);
    }

    public static /* synthetic */ void setListProperty$default(i iVar, String str, List list, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setListProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setListProperty(str, list, str2, z10);
    }

    public static /* synthetic */ void setLongProperty$default(i iVar, String str, long j3, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLongProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setLongProperty(str, j3, str3, z10);
    }

    public static /* synthetic */ void setMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapModelProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setMapModelProperty(str, hVar, str2, z10);
    }

    public static /* synthetic */ void setOptAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z10, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptAnyProperty(str, obj, str2, z10);
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptBigDecimalProperty(str, bigDecimal, str2, z10);
    }

    public static /* synthetic */ void setOptBooleanProperty$default(i iVar, String str, Boolean bool, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptBooleanProperty(str, bool, str2, z10);
    }

    public static /* synthetic */ void setOptDoubleProperty$default(i iVar, String str, Double d10, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptDoubleProperty(str, d10, str2, z10);
    }

    public static /* synthetic */ void setOptEnumProperty$default(i iVar, String str, Enum r22, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        iVar.setOptAnyProperty(str, r22 != null ? r22.toString() : null, str2, z10);
    }

    public static /* synthetic */ void setOptFloatProperty$default(i iVar, String str, Float f10, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptFloatProperty(str, f10, str2, z10);
    }

    public static /* synthetic */ void setOptIntProperty$default(i iVar, String str, Integer num, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptIntProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptIntProperty(str, num, str2, z10);
    }

    public static /* synthetic */ void setOptListProperty$default(i iVar, String str, List list, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptListProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptListProperty(str, list, str2, z10);
    }

    public static /* synthetic */ void setOptLongProperty$default(i iVar, String str, Long l10, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptLongProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptLongProperty(str, l10, str2, z10);
    }

    public static /* synthetic */ void setOptMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptMapModelProperty(str, hVar, str2, z10);
    }

    public static /* synthetic */ void setOptStringProperty$default(i iVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptStringProperty");
        }
        if ((i10 & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptStringProperty(str, str2, str3, z10);
    }

    public static /* synthetic */ void setStringProperty$default(i iVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStringProperty");
        }
        if ((i10 & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setStringProperty(str, str2, str3, z10);
    }

    public List<?> createListForProperty(String str, JSONArray jSONArray) {
        pc.j.e(str, "property");
        pc.j.e(jSONArray, "jsonArray");
        return null;
    }

    public i createModelForProperty(String str, JSONObject jSONObject) {
        pc.j.e(str, "property");
        pc.j.e(jSONObject, "jsonObject");
        return null;
    }

    public final Object getAnyProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        pc.j.c(optAnyProperty, "null cannot be cast to non-null type kotlin.Any");
        return optAnyProperty;
    }

    public final BigDecimal getBigDecimalProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(str, aVar);
        pc.j.c(optBigDecimalProperty, "null cannot be cast to non-null type java.math.BigDecimal");
        return optBigDecimalProperty;
    }

    public final boolean getBooleanProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Boolean optBooleanProperty = getOptBooleanProperty(str, aVar);
        pc.j.c(optBooleanProperty, "null cannot be cast to non-null type kotlin.Boolean");
        return optBooleanProperty.booleanValue();
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final double getDoubleProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Double optDoubleProperty = getOptDoubleProperty(str, aVar);
        pc.j.c(optDoubleProperty, "null cannot be cast to non-null type kotlin.Double");
        return optDoubleProperty.doubleValue();
    }

    public final /* synthetic */ <T extends Enum<T>> T getEnumProperty(String str) {
        pc.j.e(str, "name");
        if (getOptAnyProperty$default(this, str, null, 2, null) == null) {
            pc.j.i();
            throw null;
        }
        pc.j.i();
        throw null;
    }

    public final float getFloatProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Float optFloatProperty = getOptFloatProperty(str, aVar);
        pc.j.c(optFloatProperty, "null cannot be cast to non-null type kotlin.Float");
        return optFloatProperty.floatValue();
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    public final String getId() {
        return getStringProperty$default(this, "id", null, 2, null);
    }

    public final int getIntProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Integer optIntProperty = getOptIntProperty(str, aVar);
        pc.j.c(optIntProperty, "null cannot be cast to non-null type kotlin.Int");
        return optIntProperty.intValue();
    }

    public final <T> List<T> getListProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        List<T> optListProperty = getOptListProperty(str, aVar);
        pc.j.c(optListProperty, "null cannot be cast to non-null type kotlin.collections.List<T of com.onesignal.common.modeling.Model.getListProperty>");
        return optListProperty;
    }

    public final long getLongProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Long optLongProperty = getOptLongProperty(str, aVar);
        pc.j.c(optLongProperty, "null cannot be cast to non-null type kotlin.Long");
        return optLongProperty.longValue();
    }

    public final <T> h getMapModelProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        h optMapModelProperty = getOptMapModelProperty(str, aVar);
        pc.j.c(optMapModelProperty, "null cannot be cast to non-null type com.onesignal.common.modeling.MapModel<T of com.onesignal.common.modeling.Model.getMapModelProperty>");
        return optMapModelProperty;
    }

    public final Object getOptAnyProperty(String str, oc.a aVar) {
        Object obj;
        pc.j.e(str, "name");
        synchronized (this.data) {
            try {
                if (!this.data.containsKey(str) && aVar != null) {
                    obj = aVar.invoke();
                    this.data.put(str, obj);
                }
                obj = this.data.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final BigDecimal getOptBigDecimalProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? new BigDecimal(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? new BigDecimal(((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? new BigDecimal(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? new BigDecimal(((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    public final Boolean getOptBooleanProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        return (Boolean) getOptAnyProperty(str, aVar);
    }

    public final Double getOptDoubleProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Double ? (Double) optAnyProperty : optAnyProperty instanceof Float ? Double.valueOf(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Integer ? Double.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Double.valueOf(((Number) optAnyProperty).longValue()) : (Double) optAnyProperty;
    }

    public final /* synthetic */ <T extends Enum<T>> T getOptEnumProperty(String str) {
        pc.j.e(str, "name");
        if (getOptAnyProperty$default(this, str, null, 2, null) == null) {
            return null;
        }
        pc.j.i();
        throw null;
    }

    public final Float getOptFloatProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Float ? (Float) optAnyProperty : optAnyProperty instanceof Double ? Float.valueOf((float) ((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof Integer ? Float.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Float.valueOf(((Number) optAnyProperty).longValue()) : (Float) optAnyProperty;
    }

    public final Integer getOptIntProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? (Integer) optAnyProperty : optAnyProperty instanceof Long ? Integer.valueOf((int) ((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? Integer.valueOf((int) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    public final <T> List<T> getOptListProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        return (List) getOptAnyProperty(str, aVar);
    }

    public final Long getOptLongProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Long ? (Long) optAnyProperty : optAnyProperty instanceof Integer ? Long.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Float ? Long.valueOf((long) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Long.valueOf((long) ((Number) optAnyProperty).doubleValue()) : (Long) optAnyProperty;
    }

    public final <T> h getOptMapModelProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        return (h) getOptAnyProperty(str, aVar);
    }

    public final String getOptStringProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        return (String) getOptAnyProperty(str, aVar);
    }

    public final String getStringProperty(String str, oc.a aVar) {
        pc.j.e(str, "name");
        String optStringProperty = getOptStringProperty(str, aVar);
        pc.j.c(optStringProperty, "null cannot be cast to non-null type kotlin.String");
        return optStringProperty;
    }

    public final boolean hasProperty(String str) {
        pc.j.e(str, "name");
        return this.data.containsKey(str);
    }

    public final void initializeFromJson(JSONObject jSONObject) {
        Method method;
        pc.j.e(jSONObject, "jsonObject");
        synchronized (this.data) {
            try {
                this.data.clear();
                Iterator<String> keys = jSONObject.keys();
                pc.j.d(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONObject) {
                        pc.j.d(next, "property");
                        i createModelForProperty = createModelForProperty(next, (JSONObject) obj);
                        if (createModelForProperty != null) {
                            this.data.put(next, createModelForProperty);
                        }
                    } else if (obj instanceof JSONArray) {
                        pc.j.d(next, "property");
                        List<?> createListForProperty = createListForProperty(next, (JSONArray) obj);
                        if (createListForProperty != null) {
                            this.data.put(next, createListForProperty);
                        }
                    } else {
                        Method[] methods = getClass().getMethods();
                        pc.j.d(methods, "this.javaClass.methods");
                        int length = methods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i10];
                            if (!pc.j.a(method.getReturnType(), Void.class)) {
                                if (xc.h.o(method.getName(), "get" + next)) {
                                    break;
                                }
                            }
                            i10++;
                        }
                        Class<?> returnType = method != null ? method.getReturnType() : null;
                        boolean z10 = true;
                        if (pc.j.a(returnType, Double.TYPE) ? true : pc.j.a(returnType, Double.class)) {
                            Map<String, Object> map = this.data;
                            pc.j.d(next, "property");
                            map.put(next, Double.valueOf(jSONObject.getDouble(next)));
                        } else {
                            if (pc.j.a(returnType, Long.TYPE) ? true : pc.j.a(returnType, Long.class)) {
                                Map<String, Object> map2 = this.data;
                                pc.j.d(next, "property");
                                map2.put(next, Long.valueOf(jSONObject.getLong(next)));
                            } else {
                                if (pc.j.a(returnType, Float.TYPE) ? true : pc.j.a(returnType, Float.class)) {
                                    Map<String, Object> map3 = this.data;
                                    pc.j.d(next, "property");
                                    map3.put(next, Float.valueOf((float) jSONObject.getDouble(next)));
                                } else {
                                    if (pc.j.a(returnType, Integer.TYPE) ? true : pc.j.a(returnType, Integer.class)) {
                                        Map<String, Object> map4 = this.data;
                                        pc.j.d(next, "property");
                                        map4.put(next, Integer.valueOf(jSONObject.getInt(next)));
                                    } else {
                                        if (pc.j.a(returnType, Boolean.TYPE) ? true : pc.j.a(returnType, Boolean.class)) {
                                            Map<String, Object> map5 = this.data;
                                            pc.j.d(next, "property");
                                            map5.put(next, Boolean.valueOf(jSONObject.getBoolean(next)));
                                        } else {
                                            if (!pc.j.a(returnType, String.class)) {
                                                z10 = pc.j.a(returnType, String.class);
                                            }
                                            if (z10) {
                                                Map<String, Object> map6 = this.data;
                                                pc.j.d(next, "property");
                                                map6.put(next, jSONObject.getString(next));
                                            } else {
                                                Map<String, Object> map7 = this.data;
                                                pc.j.d(next, "property");
                                                map7.put(next, jSONObject.get(next));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void initializeFromModel(String str, i iVar) {
        pc.j.e(iVar, "model");
        Map<? extends String, ? extends Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        for (Map.Entry<String, Object> entry : iVar.data.entrySet()) {
            if (entry.getValue() instanceof i) {
                Object value = entry.getValue();
                pc.j.c(value, "null cannot be cast to non-null type com.onesignal.common.modeling.Model");
                i iVar2 = (i) value;
                iVar2._parentModel = this;
                pc.j.d(synchronizedMap, "newData");
                synchronizedMap.put(entry.getKey(), iVar2);
            } else {
                pc.j.d(synchronizedMap, "newData");
                synchronizedMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (str != null) {
            pc.j.d(synchronizedMap, "newData");
            synchronizedMap.put("id", str);
        }
        synchronized (this.data) {
            this.data.clear();
            Map<String, Object> map = this.data;
            pc.j.d(synchronizedMap, "newData");
            map.putAll(synchronizedMap);
        }
    }

    public final void setAnyProperty(String str, Object obj, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(obj, "value");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, obj, str2, z10);
    }

    public final void setBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(bigDecimal, "value");
        pc.j.e(str2, "tag");
        setOptBigDecimalProperty(str, bigDecimal, str2, z10);
    }

    public final void setBooleanProperty(String str, boolean z10, String str2, boolean z11) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptBooleanProperty(str, Boolean.valueOf(z10), str2, z11);
    }

    public final void setDoubleProperty(String str, double d10, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptDoubleProperty(str, Double.valueOf(d10), str2, z10);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String str, T t3, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(t3, "value");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, t3.toString(), str2, z10);
    }

    public final void setFloatProperty(String str, float f10, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptFloatProperty(str, Float.valueOf(f10), str2, z10);
    }

    public final void setId(String str) {
        pc.j.e(str, "value");
        setStringProperty$default(this, "id", str, null, false, 12, null);
    }

    public final void setIntProperty(String str, int i10, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptIntProperty(str, Integer.valueOf(i10), str2, z10);
    }

    public final <T> void setListProperty(String str, List<? extends T> list, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(list, "value");
        pc.j.e(str2, "tag");
        setOptListProperty(str, list, str2, z10);
    }

    public final void setLongProperty(String str, long j3, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptLongProperty(str, Long.valueOf(j3), str2, z10);
    }

    public final <T> void setMapModelProperty(String str, h hVar, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(hVar, "value");
        pc.j.e(str2, "tag");
        setOptMapModelProperty(str, hVar, str2, z10);
    }

    public final void setOptAnyProperty(String str, Object obj, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        Object obj2 = this.data.get(str);
        synchronized (this.data) {
            try {
                if (!pc.j.a(obj2, obj) || z10) {
                    if (obj != null) {
                        this.data.put(str, obj);
                    } else if (this.data.containsKey(str)) {
                        this.data.remove(str);
                    }
                    notifyChanged(str, str, str2, obj2, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setOptBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, bigDecimal != null ? bigDecimal.toString() : null, str2, z10);
    }

    public final void setOptBooleanProperty(String str, Boolean bool, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, bool, str2, z10);
    }

    public final void setOptDoubleProperty(String str, Double d10, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, d10, str2, z10);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String str, T t3, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, t3 != null ? t3.toString() : null, str2, z10);
    }

    public final void setOptFloatProperty(String str, Float f10, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, f10, str2, z10);
    }

    public final void setOptIntProperty(String str, Integer num, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, num, str2, z10);
    }

    public final <T> void setOptListProperty(String str, List<? extends T> list, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, list, str2, z10);
    }

    public final void setOptLongProperty(String str, Long l10, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, l10, str2, z10);
    }

    public final <T> void setOptMapModelProperty(String str, h hVar, String str2, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "tag");
        setOptAnyProperty(str, hVar, str2, z10);
    }

    public final void setOptStringProperty(String str, String str2, String str3, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str3, "tag");
        setOptAnyProperty(str, str2, str3, z10);
    }

    public final void setStringProperty(String str, String str2, String str3, boolean z10) {
        pc.j.e(str, "name");
        pc.j.e(str2, "value");
        pc.j.e(str3, "tag");
        setOptStringProperty(str, str2, str3, z10);
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        synchronized (this.data) {
            try {
                for (Map.Entry<String, Object> entry : this.data.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof i) {
                        jSONObject.put(entry.getKey(), ((i) value).toJSON());
                    } else if (value instanceof List) {
                        JSONArray jSONArray = new JSONArray();
                        for (Object obj : (List) value) {
                            if (obj instanceof i) {
                                jSONArray.put(((i) obj).toJSON());
                            } else {
                                jSONArray.put(obj);
                            }
                        }
                        jSONObject.put(entry.getKey(), jSONArray);
                    } else {
                        jSONObject.put(entry.getKey(), value);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    public i(i iVar, String str) {
        this._parentModel = iVar;
        this._parentProperty = str;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        pc.j.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.data = synchronizedMap;
        this.changeNotifier = new com.onesignal.common.events.b();
        i iVar2 = this._parentModel;
        if (iVar2 != null && str == null) {
            throw new Exception("If parent model is set, parent property must also be set.");
        }
        if (iVar2 == null && str != null) {
            throw new Exception("If parent property is set, parent model must also be set.");
        }
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.common.modeling.a aVar) {
        pc.j.e(aVar, "handler");
        this.changeNotifier.subscribe(aVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.common.modeling.a aVar) {
        pc.j.e(aVar, "handler");
        this.changeNotifier.unsubscribe(aVar);
    }

    public /* synthetic */ i(i iVar, String str, int i10, pc.f fVar) {
        this((i10 & 1) != 0 ? null : iVar, (i10 & 2) != 0 ? null : str);
    }
}
