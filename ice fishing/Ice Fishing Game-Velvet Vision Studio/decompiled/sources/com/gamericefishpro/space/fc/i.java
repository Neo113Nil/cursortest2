package com.gamericefishpro.space.fc;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class i implements com.gamericefishpro.space.dc.d {
    private i _parentModel;
    private final String _parentProperty;
    private final com.gamericefishpro.space.dc.b changeNotifier;
    private final Map<String, Object> data;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ j $changeArgs;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$changeArgs = jVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.fc.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.fc.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onChanged(this.$changeArgs, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getAnyProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnyProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getAnyProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getBigDecimalProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean getBooleanProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getBooleanProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ double getDoubleProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoubleProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getDoubleProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float getFloatProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloatProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getFloatProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int getIntProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getIntProperty(str, function0);
    }

    public static /* synthetic */ List getListProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getListProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ long getLongProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLongProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getLongProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h getMapModelProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapModelProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getMapModelProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOptAnyProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptAnyProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptBigDecimalProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Boolean getOptBooleanProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptBooleanProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Double getOptDoubleProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptDoubleProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Float getOptFloatProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptFloatProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Integer getOptIntProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptIntProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptIntProperty(str, function0);
    }

    public static /* synthetic */ List getOptListProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptListProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptListProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Long getOptLongProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptLongProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptLongProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h getOptMapModelProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptMapModelProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getOptStringProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptStringProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptStringProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getStringProperty$default(i iVar, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        return iVar.getStringProperty(str, function0);
    }

    private final void notifyChanged(String str, String str2, String str3, Object obj, Object obj2) {
        this.changeNotifier.fire(new a(new j(this, str, str2, obj, obj2), str3));
        if (this._parentModel != null) {
            String str4 = this._parentProperty + '.' + str;
            i iVar = this._parentModel;
            Intrinsics.b(iVar);
            iVar.notifyChanged(str4, str2, str3, obj, obj2);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnyProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setAnyProperty(str, obj, str2, z);
    }

    public static /* synthetic */ void setBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public static /* synthetic */ void setBooleanProperty$default(i iVar, String str, boolean z, String str2, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        iVar.setBooleanProperty(str, z, str2, z2);
    }

    public static /* synthetic */ void setDoubleProperty$default(i iVar, String str, double d, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDoubleProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setDoubleProperty(str, d, str3, z);
    }

    public static /* synthetic */ void setEnumProperty$default(i iVar, String name, Enum value, String tag, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnumProperty");
        }
        if ((i & 4) != 0) {
            tag = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        iVar.setOptAnyProperty(name, value.toString(), tag, z);
    }

    public static /* synthetic */ void setFloatProperty$default(i iVar, String str, float f, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFloatProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setFloatProperty(str, f, str2, z);
    }

    public static /* synthetic */ void setIntProperty$default(i iVar, String str, int i, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIntProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        iVar.setIntProperty(str, i, str2, z);
    }

    public static /* synthetic */ void setListProperty$default(i iVar, String str, List list, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setListProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setListProperty(str, list, str2, z);
    }

    public static /* synthetic */ void setLongProperty$default(i iVar, String str, long j, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLongProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setLongProperty(str, j, str3, z);
    }

    public static /* synthetic */ void setMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapModelProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setMapModelProperty(str, hVar, str2, z);
    }

    public static /* synthetic */ void setOptAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptAnyProperty(str, obj, str2, z);
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public static /* synthetic */ void setOptBooleanProperty$default(i iVar, String str, Boolean bool, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptBooleanProperty(str, bool, str2, z);
    }

    public static /* synthetic */ void setOptDoubleProperty$default(i iVar, String str, Double d, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptDoubleProperty(str, d, str2, z);
    }

    public static /* synthetic */ void setOptEnumProperty$default(i iVar, String name, Enum r2, String tag, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
        }
        if ((i & 4) != 0) {
            tag = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        iVar.setOptAnyProperty(name, r2 != null ? r2.toString() : null, tag, z);
    }

    public static /* synthetic */ void setOptFloatProperty$default(i iVar, String str, Float f, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptFloatProperty(str, f, str2, z);
    }

    public static /* synthetic */ void setOptIntProperty$default(i iVar, String str, Integer num, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptIntProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptIntProperty(str, num, str2, z);
    }

    public static /* synthetic */ void setOptListProperty$default(i iVar, String str, List list, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptListProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptListProperty(str, list, str2, z);
    }

    public static /* synthetic */ void setOptLongProperty$default(i iVar, String str, Long l, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptLongProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptLongProperty(str, l, str2, z);
    }

    public static /* synthetic */ void setOptMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
        }
        if ((i & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptMapModelProperty(str, hVar, str2, z);
    }

    public static /* synthetic */ void setOptStringProperty$default(i iVar, String str, String str2, String str3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptStringProperty");
        }
        if ((i & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setOptStringProperty(str, str2, str3, z);
    }

    public static /* synthetic */ void setStringProperty$default(i iVar, String str, String str2, String str3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStringProperty");
        }
        if ((i & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        iVar.setStringProperty(str, str2, str3, z);
    }

    public List<?> createListForProperty(String property, JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        return null;
    }

    public i createModelForProperty(String property, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        return null;
    }

    public final Object getAnyProperty(String name, Function0<? extends Object> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, function0);
        Intrinsics.c(optAnyProperty, "null cannot be cast to non-null type kotlin.Any");
        return optAnyProperty;
    }

    public final BigDecimal getBigDecimalProperty(String name, Function0<? extends BigDecimal> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(name, function0);
        Intrinsics.c(optBigDecimalProperty, "null cannot be cast to non-null type java.math.BigDecimal");
        return optBigDecimalProperty;
    }

    public final boolean getBooleanProperty(String name, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Boolean optBooleanProperty = getOptBooleanProperty(name, function0);
        Intrinsics.c(optBooleanProperty, "null cannot be cast to non-null type kotlin.Boolean");
        return optBooleanProperty.booleanValue();
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final double getDoubleProperty(String name, Function0<Double> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Double optDoubleProperty = getOptDoubleProperty(name, function0);
        Intrinsics.c(optDoubleProperty, "null cannot be cast to non-null type kotlin.Double");
        return optDoubleProperty.doubleValue();
    }

    public final /* synthetic */ <T extends Enum<T>> T getEnumProperty(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (getOptAnyProperty$default(this, name, null, 2, null) == null) {
            Intrinsics.f();
            throw null;
        }
        Intrinsics.f();
        throw null;
    }

    public final float getFloatProperty(String name, Function0<Float> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Float optFloatProperty = getOptFloatProperty(name, function0);
        Intrinsics.c(optFloatProperty, "null cannot be cast to non-null type kotlin.Float");
        return optFloatProperty.floatValue();
    }

    @Override // com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    public final String getId() {
        return getStringProperty$default(this, "id", null, 2, null);
    }

    public final int getIntProperty(String name, Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer optIntProperty = getOptIntProperty(name, function0);
        Intrinsics.c(optIntProperty, "null cannot be cast to non-null type kotlin.Int");
        return optIntProperty.intValue();
    }

    public final <T> List<T> getListProperty(String name, Function0<? extends List<? extends T>> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<T> optListProperty = getOptListProperty(name, function0);
        Intrinsics.c(optListProperty, "null cannot be cast to non-null type kotlin.collections.List<T of com.onesignal.common.modeling.Model.getListProperty>");
        return optListProperty;
    }

    public final long getLongProperty(String name, Function0<Long> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Long optLongProperty = getOptLongProperty(name, function0);
        Intrinsics.c(optLongProperty, "null cannot be cast to non-null type kotlin.Long");
        return optLongProperty.longValue();
    }

    public final <T> h getMapModelProperty(String name, Function0<? extends h> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        h optMapModelProperty = getOptMapModelProperty(name, function0);
        Intrinsics.c(optMapModelProperty, "null cannot be cast to non-null type com.onesignal.common.modeling.MapModel<T of com.onesignal.common.modeling.Model.getMapModelProperty>");
        return optMapModelProperty;
    }

    public final Object getOptAnyProperty(String name, Function0<? extends Object> function0) {
        Object objInvoke;
        Intrinsics.checkNotNullParameter(name, "name");
        synchronized (this.data) {
            try {
                if (this.data.containsKey(name) || function0 == null) {
                    objInvoke = this.data.get(name);
                } else {
                    objInvoke = function0.invoke();
                    this.data.put(name, objInvoke);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objInvoke;
    }

    public final BigDecimal getOptBigDecimalProperty(String name, Function0<? extends BigDecimal> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, function0);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Integer) {
            return new BigDecimal(((Number) optAnyProperty).intValue());
        }
        if (optAnyProperty instanceof Long) {
            return new BigDecimal(((Number) optAnyProperty).longValue());
        }
        if (optAnyProperty instanceof Float) {
            return new BigDecimal(((Number) optAnyProperty).floatValue());
        }
        if (optAnyProperty instanceof Double) {
            return new BigDecimal(((Number) optAnyProperty).doubleValue());
        }
        return optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    public final Boolean getOptBooleanProperty(String name, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (Boolean) getOptAnyProperty(name, function0);
    }

    public final Double getOptDoubleProperty(String name, Function0<Double> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, function0);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Double) {
            return (Double) optAnyProperty;
        }
        if (optAnyProperty instanceof Float) {
            return Double.valueOf(((Number) optAnyProperty).floatValue());
        }
        if (optAnyProperty instanceof Integer) {
            return Double.valueOf(((Number) optAnyProperty).intValue());
        }
        return optAnyProperty instanceof Long ? Double.valueOf(((Number) optAnyProperty).longValue()) : (Double) optAnyProperty;
    }

    public final /* synthetic */ <T extends Enum<T>> T getOptEnumProperty(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (getOptAnyProperty$default(this, name, null, 2, null) == null) {
            return null;
        }
        Intrinsics.f();
        throw null;
    }

    public final Float getOptFloatProperty(String name, Function0<Float> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, function0);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Float) {
            return (Float) optAnyProperty;
        }
        if (optAnyProperty instanceof Double) {
            return Float.valueOf((float) ((Number) optAnyProperty).doubleValue());
        }
        if (optAnyProperty instanceof Integer) {
            return Float.valueOf(((Number) optAnyProperty).intValue());
        }
        return optAnyProperty instanceof Long ? Float.valueOf(((Number) optAnyProperty).longValue()) : (Float) optAnyProperty;
    }

    public final Integer getOptIntProperty(String name, Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, function0);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Integer) {
            return (Integer) optAnyProperty;
        }
        if (optAnyProperty instanceof Long) {
            return Integer.valueOf((int) ((Number) optAnyProperty).longValue());
        }
        if (optAnyProperty instanceof Float) {
            return Integer.valueOf((int) ((Number) optAnyProperty).floatValue());
        }
        return optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    public final <T> List<T> getOptListProperty(String name, Function0<? extends List<? extends T>> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (List) getOptAnyProperty(name, function0);
    }

    public final Long getOptLongProperty(String name, Function0<Long> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, function0);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Long) {
            return (Long) optAnyProperty;
        }
        if (optAnyProperty instanceof Integer) {
            return Long.valueOf(((Number) optAnyProperty).intValue());
        }
        if (optAnyProperty instanceof Float) {
            return Long.valueOf((long) ((Number) optAnyProperty).floatValue());
        }
        return optAnyProperty instanceof Double ? Long.valueOf((long) ((Number) optAnyProperty).doubleValue()) : (Long) optAnyProperty;
    }

    public final <T> h getOptMapModelProperty(String name, Function0<? extends h> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (h) getOptAnyProperty(name, function0);
    }

    public final String getOptStringProperty(String name, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (String) getOptAnyProperty(name, function0);
    }

    public final String getStringProperty(String name, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        String optStringProperty = getOptStringProperty(name, function0);
        Intrinsics.c(optStringProperty, "null cannot be cast to non-null type kotlin.String");
        return optStringProperty;
    }

    public final boolean hasProperty(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.data.containsKey(name);
    }

    public final void initializeFromJson(JSONObject jsonObject) {
        boolean zA;
        Method method;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        synchronized (this.data) {
            try {
                this.data.clear();
                Iterator<String> itKeys = jsonObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jsonObject.get(next);
                    if (obj instanceof JSONObject) {
                        Intrinsics.b(next);
                        i iVarCreateModelForProperty = createModelForProperty(next, (JSONObject) obj);
                        if (iVarCreateModelForProperty != null) {
                            this.data.put(next, iVarCreateModelForProperty);
                        }
                    } else if (obj instanceof JSONArray) {
                        Intrinsics.b(next);
                        List<?> listCreateListForProperty = createListForProperty(next, (JSONArray) obj);
                        if (listCreateListForProperty != null) {
                            this.data.put(next, listCreateListForProperty);
                        }
                    } else {
                        Method[] methods = getClass().getMethods();
                        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                        int length = methods.length;
                        int i = 0;
                        while (true) {
                            zA = true;
                            if (i >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i];
                            if (!Intrinsics.a(method.getReturnType(), Void.class)) {
                                if (kotlin.text.d.g(method.getName(), "get" + next, true)) {
                                    break;
                                }
                            }
                            i++;
                        }
                        Class<?> returnType = method != null ? method.getReturnType() : null;
                        if (Intrinsics.a(returnType, Double.TYPE) ? true : Intrinsics.a(returnType, Double.class)) {
                            Map<String, Object> map = this.data;
                            Intrinsics.b(next);
                            map.put(next, Double.valueOf(jsonObject.getDouble(next)));
                        } else {
                            if (Intrinsics.a(returnType, Long.TYPE) ? true : Intrinsics.a(returnType, Long.class)) {
                                Map<String, Object> map2 = this.data;
                                Intrinsics.b(next);
                                map2.put(next, Long.valueOf(jsonObject.getLong(next)));
                            } else {
                                if (Intrinsics.a(returnType, Float.TYPE) ? true : Intrinsics.a(returnType, Float.class)) {
                                    Map<String, Object> map3 = this.data;
                                    Intrinsics.b(next);
                                    map3.put(next, Float.valueOf((float) jsonObject.getDouble(next)));
                                } else {
                                    if (Intrinsics.a(returnType, Integer.TYPE) ? true : Intrinsics.a(returnType, Integer.class)) {
                                        Map<String, Object> map4 = this.data;
                                        Intrinsics.b(next);
                                        map4.put(next, Integer.valueOf(jsonObject.getInt(next)));
                                    } else {
                                        if (Intrinsics.a(returnType, Boolean.TYPE) ? true : Intrinsics.a(returnType, Boolean.class)) {
                                            Map<String, Object> map5 = this.data;
                                            Intrinsics.b(next);
                                            map5.put(next, Boolean.valueOf(jsonObject.getBoolean(next)));
                                        } else {
                                            if (!Intrinsics.a(returnType, String.class)) {
                                                zA = Intrinsics.a(returnType, String.class);
                                            }
                                            if (zA) {
                                                Map<String, Object> map6 = this.data;
                                                Intrinsics.b(next);
                                                map6.put(next, jsonObject.getString(next));
                                            } else {
                                                Map<String, Object> map7 = this.data;
                                                Intrinsics.b(next);
                                                map7.put(next, jsonObject.get(next));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void initializeFromModel(String str, i model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Map<? extends String, ? extends Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        for (Map.Entry<String, Object> entry : model.data.entrySet()) {
            if (entry.getValue() instanceof i) {
                Object value = entry.getValue();
                Intrinsics.c(value, "null cannot be cast to non-null type com.onesignal.common.modeling.Model");
                i iVar = (i) value;
                iVar._parentModel = this;
                Intrinsics.b(mapSynchronizedMap);
                mapSynchronizedMap.put(entry.getKey(), iVar);
            } else {
                Intrinsics.b(mapSynchronizedMap);
                mapSynchronizedMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (str != null) {
            Intrinsics.b(mapSynchronizedMap);
            mapSynchronizedMap.put("id", str);
        }
        synchronized (this.data) {
            this.data.clear();
            Map<String, Object> map = this.data;
            Intrinsics.b(mapSynchronizedMap);
            map.putAll(mapSynchronizedMap);
            Unit unit = Unit.a;
        }
    }

    public final void setAnyProperty(String name, Object value, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value, tag, z);
    }

    public final void setBigDecimalProperty(String name, BigDecimal value, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptBigDecimalProperty(name, value, tag, z);
    }

    public final void setBooleanProperty(String name, boolean z, String tag, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptBooleanProperty(name, Boolean.valueOf(z), tag, z2);
    }

    public final void setDoubleProperty(String name, double d, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptDoubleProperty(name, Double.valueOf(d), tag, z);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String name, T value, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, value.toString(), tag, z);
    }

    public final void setFloatProperty(String name, float f, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptFloatProperty(name, Float.valueOf(f), tag, z);
    }

    public final void setId(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setStringProperty$default(this, "id", value, null, false, 12, null);
    }

    public final void setIntProperty(String name, int i, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptIntProperty(name, Integer.valueOf(i), tag, z);
    }

    public final <T> void setListProperty(String name, List<? extends T> value, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptListProperty(name, value, tag, z);
    }

    public final void setLongProperty(String name, long j, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptLongProperty(name, Long.valueOf(j), tag, z);
    }

    public final <T> void setMapModelProperty(String name, h value, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptMapModelProperty(name, value, tag, z);
    }

    public final void setOptAnyProperty(String name, Object obj, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object obj2 = this.data.get(name);
        synchronized (this.data) {
            try {
                if (!Intrinsics.a(obj2, obj) || z) {
                    if (obj != null) {
                        this.data.put(name, obj);
                    } else if (this.data.containsKey(name)) {
                        this.data.remove(name);
                    }
                    Unit unit = Unit.a;
                    notifyChanged(name, name, tag, obj2, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setOptBigDecimalProperty(String name, BigDecimal bigDecimal, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, bigDecimal != null ? bigDecimal.toString() : null, tag, z);
    }

    public final void setOptBooleanProperty(String name, Boolean bool, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, bool, tag, z);
    }

    public final void setOptDoubleProperty(String name, Double d, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, d, tag, z);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String name, T t, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, t != null ? t.toString() : null, tag, z);
    }

    public final void setOptFloatProperty(String name, Float f, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, f, tag, z);
    }

    public final void setOptIntProperty(String name, Integer num, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, num, tag, z);
    }

    public final <T> void setOptListProperty(String name, List<? extends T> list, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, list, tag, z);
    }

    public final void setOptLongProperty(String name, Long l, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, l, tag, z);
    }

    public final <T> void setOptMapModelProperty(String name, h hVar, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, hVar, tag, z);
    }

    public final void setOptStringProperty(String name, String str, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptAnyProperty(name, str, tag, z);
    }

    public final void setStringProperty(String name, String value, String tag, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        setOptStringProperty(name, value, tag, z);
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
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    public i(i iVar, String str) throws Exception {
        this._parentModel = iVar;
        this._parentProperty = str;
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(...)");
        this.data = mapSynchronizedMap;
        this.changeNotifier = new com.gamericefishpro.space.dc.b();
        i iVar2 = this._parentModel;
        if (iVar2 != null && str == null) {
            throw new Exception("If parent model is set, parent property must also be set.");
        }
        if (iVar2 == null && str != null) {
            throw new Exception("If parent property is set, parent model must also be set.");
        }
    }

    @Override // com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.fc.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeNotifier.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.fc.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeNotifier.unsubscribe(handler);
    }

    public /* synthetic */ i(i iVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iVar, (i & 2) != 0 ? null : str);
    }
}
