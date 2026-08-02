package com.datadog.android.rum.internal.domain.event;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.event.EventMapper;
import com.datadog.android.rum.internal.RumFeature$onReceive$1;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.VitalAppLaunchEvent;
import com.datadog.android.rum.model.VitalOperationStepEvent;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RumEventMapper implements EventMapper {
    public final EventMapper actionEventMapper;
    public final EventMapper errorEventMapper;
    public final InternalLogger internalLogger;
    public final EventMapper longTaskEventMapper;
    public final EventMapper resourceEventMapper;
    public final EventMapper telemetryConfigurationMapper;
    public final EventMapper viewEventMapper;
    public final EventMapper vitalAppLaunchEventMapper;
    public final EventMapper vitalOperationStepEventMapper;

    public RumEventMapper(EventMapper eventMapper, EventMapper eventMapper2, EventMapper eventMapper3, EventMapper eventMapper4, EventMapper eventMapper5, EventMapper eventMapper6, EventMapper eventMapper7, EventMapper eventMapper8, InternalLogger internalLogger) {
        internalLogger.getClass();
        this.viewEventMapper = eventMapper;
        this.errorEventMapper = eventMapper2;
        this.resourceEventMapper = eventMapper3;
        this.actionEventMapper = eventMapper4;
        this.longTaskEventMapper = eventMapper5;
        this.vitalOperationStepEventMapper = eventMapper6;
        this.vitalAppLaunchEventMapper = eventMapper7;
        this.telemetryConfigurationMapper = eventMapper8;
        this.internalLogger = internalLogger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RumEventMapper)) {
            return false;
        }
        RumEventMapper rumEventMapper = (RumEventMapper) obj;
        return this.viewEventMapper.equals(rumEventMapper.viewEventMapper) && this.errorEventMapper.equals(rumEventMapper.errorEventMapper) && this.resourceEventMapper.equals(rumEventMapper.resourceEventMapper) && this.actionEventMapper.equals(rumEventMapper.actionEventMapper) && this.longTaskEventMapper.equals(rumEventMapper.longTaskEventMapper) && this.vitalOperationStepEventMapper.equals(rumEventMapper.vitalOperationStepEventMapper) && this.vitalAppLaunchEventMapper.equals(rumEventMapper.vitalAppLaunchEventMapper) && this.telemetryConfigurationMapper.equals(rumEventMapper.telemetryConfigurationMapper) && Intrinsics.areEqual(this.internalLogger, rumEventMapper.internalLogger);
    }

    public final int hashCode() {
        return this.internalLogger.hashCode() + ((this.telemetryConfigurationMapper.hashCode() + ((this.vitalAppLaunchEventMapper.hashCode() + ((this.vitalOperationStepEventMapper.hashCode() + ((this.longTaskEventMapper.hashCode() + ((this.actionEventMapper.hashCode() + ((this.resourceEventMapper.hashCode() + ((this.errorEventMapper.hashCode() + (this.viewEventMapper.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.datadog.android.event.EventMapper
    public final Object map(Object obj) {
        Object obj2;
        obj.getClass();
        boolean z = obj instanceof ViewEvent;
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (z) {
            obj2 = this.viewEventMapper.map(obj);
        } else if (obj instanceof ActionEvent) {
            obj2 = this.actionEventMapper.map(obj);
        } else if (obj instanceof ErrorEvent) {
            ErrorEvent errorEvent = (ErrorEvent) obj;
            boolean areEqual = Intrinsics.areEqual(errorEvent.error.isCrash, Boolean.TRUE);
            EventMapper eventMapper = this.errorEventMapper;
            if (areEqual) {
                obj2 = (ErrorEvent) eventMapper.map(obj);
                if (obj2 == null) {
                    DBUtil.log$default(this.internalLogger, 4, target, RumEventMapper$mapRumEvent$1.INSTANCE, null, false, 56);
                    obj2 = errorEvent;
                }
            } else {
                obj2 = (ErrorEvent) eventMapper.map(obj);
            }
        } else if (obj instanceof ResourceEvent) {
            obj2 = this.resourceEventMapper.map(obj);
        } else if (obj instanceof LongTaskEvent) {
            obj2 = this.longTaskEventMapper.map(obj);
        } else if (obj instanceof VitalOperationStepEvent) {
            obj2 = this.vitalOperationStepEventMapper.map(obj);
        } else if (obj instanceof VitalAppLaunchEvent) {
            obj2 = this.vitalAppLaunchEventMapper.map(obj);
        } else if (obj instanceof TelemetryConfigurationEvent) {
            obj2 = this.telemetryConfigurationMapper.map(obj);
        } else {
            if (!(obj instanceof TelemetryDebugEvent ? true : obj instanceof TelemetryUsageEvent ? true : obj instanceof TelemetryErrorEvent)) {
                DBUtil.log$default(this.internalLogger, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new RumFeature$onReceive$1(obj, 2), null, 56);
            }
            obj2 = obj;
        }
        if (z && (obj2 == null || obj2 != obj)) {
            DBUtil.log$default(this.internalLogger, 5, target, new RumFeature$onReceive$1(obj, 3), null, false, 56);
            return obj;
        }
        if (obj2 == null) {
            DBUtil.log$default(this.internalLogger, 3, target, new RumFeature$onReceive$1(obj, 4), null, false, 56);
            return null;
        }
        if (obj2 == obj) {
            return obj;
        }
        DBUtil.log$default(this.internalLogger, 4, target, new RumFeature$onReceive$1(obj, 5), null, false, 56);
        return null;
    }

    public final String toString() {
        return "RumEventMapper(viewEventMapper=" + this.viewEventMapper + ", errorEventMapper=" + this.errorEventMapper + ", resourceEventMapper=" + this.resourceEventMapper + ", actionEventMapper=" + this.actionEventMapper + ", longTaskEventMapper=" + this.longTaskEventMapper + ", vitalOperationStepEventMapper=" + this.vitalOperationStepEventMapper + ", vitalAppLaunchEventMapper=" + this.vitalAppLaunchEventMapper + ", telemetryConfigurationMapper=" + this.telemetryConfigurationMapper + ", internalLogger=" + this.internalLogger + ")";
    }
}
