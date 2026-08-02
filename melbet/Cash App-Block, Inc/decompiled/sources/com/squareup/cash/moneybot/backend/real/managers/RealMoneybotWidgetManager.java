package com.squareup.cash.moneybot.backend.real.managers;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.moneybot.backend.api.model.chat.Widget;
import com.squareup.cash.moneybot.backend.api.model.chat.WidgetConfig$PromptMessageConfig;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.protos.cash.kgoose.api.v3.AddWidgetRequest;
import com.squareup.protos.cash.kgoose.api.v3.DeleteWidgetRequest;
import com.squareup.protos.cash.kgoose.api.v3.ListRenderedWidgetsRequest;
import com.squareup.protos.cash.kgoose.api.v3.ListRenderedWidgetsResponse;
import com.squareup.protos.cash.kgoose.api.v3.MarkWidgetAsUsedRequest;
import com.squareup.protos.cash.kgoose.api.v3.PromptMessageConfig;
import com.squareup.protos.cash.kgoose.api.v3.RenderedWidget;
import com.squareup.protos.cash.kgoose.api.v3.WidgetConfig;
import com.squareup.protos.cash.kgoose.api.v3.WidgetService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import string.ReplaceModeKt;

/* loaded from: classes6.dex */
public final class RealMoneybotWidgetManager implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final ClientRenderablePluginRegistry pluginRegistry;
    public final WidgetService widgetService;

    public RealMoneybotWidgetManager(ErrorReporter errorReporter, SampleStrategy sampleStrategy, WidgetService widgetService, ClientRenderablePluginRegistry clientRenderablePluginRegistry) {
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.widgetService = widgetService;
        this.pluginRegistry = clientRenderablePluginRegistry;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addWidget(WidgetConfig$PromptMessageConfig widgetConfig$PromptMessageConfig, ContinuationImpl continuationImpl) {
        RealMoneybotWidgetManager$addWidget$1 realMoneybotWidgetManager$addWidget$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealMoneybotWidgetManager$addWidget$1) {
            realMoneybotWidgetManager$addWidget$1 = (RealMoneybotWidgetManager$addWidget$1) continuationImpl;
            int i2 = realMoneybotWidgetManager$addWidget$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMoneybotWidgetManager$addWidget$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMoneybotWidgetManager$addWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMoneybotWidgetManager$addWidget$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    widgetConfig$PromptMessageConfig.getClass();
                    String str = widgetConfig$PromptMessageConfig.prompt;
                    ByteString byteString = ByteString.EMPTY;
                    AddWidgetRequest addWidgetRequest = new AddWidgetRequest(new WidgetConfig(new WidgetConfig.Config.PromptMessage(new PromptMessageConfig(str, null, byteString)), ByteString.EMPTY), byteString);
                    realMoneybotWidgetManager$addWidget$1.label = 1;
                    obj = this.widgetService.addWidget(addWidgetRequest, realMoneybotWidgetManager$addWidget$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return apiResult;
                }
                if (apiResult instanceof ApiResult.Success) {
                    return new ApiResult.Success(Unit.INSTANCE);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realMoneybotWidgetManager$addWidget$1 = new RealMoneybotWidgetManager$addWidget$1(this, continuationImpl);
        Object obj2 = realMoneybotWidgetManager$addWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotWidgetManager$addWidget$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteWidget(String str, ContinuationImpl continuationImpl) {
        RealMoneybotWidgetManager$deleteWidget$1 realMoneybotWidgetManager$deleteWidget$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealMoneybotWidgetManager$deleteWidget$1) {
            realMoneybotWidgetManager$deleteWidget$1 = (RealMoneybotWidgetManager$deleteWidget$1) continuationImpl;
            int i2 = realMoneybotWidgetManager$deleteWidget$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMoneybotWidgetManager$deleteWidget$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMoneybotWidgetManager$deleteWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMoneybotWidgetManager$deleteWidget$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeleteWidgetRequest deleteWidgetRequest = new DeleteWidgetRequest(str, ByteString.EMPTY);
                    realMoneybotWidgetManager$deleteWidget$1.label = 1;
                    obj = this.widgetService.deleteWidget(deleteWidgetRequest, realMoneybotWidgetManager$deleteWidget$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return apiResult;
                }
                if (apiResult instanceof ApiResult.Success) {
                    return new ApiResult.Success(Unit.INSTANCE);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realMoneybotWidgetManager$deleteWidget$1 = new RealMoneybotWidgetManager$deleteWidget$1(this, continuationImpl);
        Object obj2 = realMoneybotWidgetManager$deleteWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotWidgetManager$deleteWidget$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object listWidgets(ContinuationImpl continuationImpl) {
        RealMoneybotWidgetManager$listWidgets$1 realMoneybotWidgetManager$listWidgets$1;
        int i;
        ApiResult apiResult;
        Widget widget;
        if (continuationImpl instanceof RealMoneybotWidgetManager$listWidgets$1) {
            realMoneybotWidgetManager$listWidgets$1 = (RealMoneybotWidgetManager$listWidgets$1) continuationImpl;
            int i2 = realMoneybotWidgetManager$listWidgets$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMoneybotWidgetManager$listWidgets$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMoneybotWidgetManager$listWidgets$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMoneybotWidgetManager$listWidgets$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ListRenderedWidgetsRequest listRenderedWidgetsRequest = new ListRenderedWidgetsRequest(ByteString.EMPTY);
                    realMoneybotWidgetManager$listWidgets$1.label = 1;
                    obj = this.widgetService.listRenderedWidgets(listRenderedWidgetsRequest, realMoneybotWidgetManager$listWidgets$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return apiResult;
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List<RenderedWidget> list = ((ListRenderedWidgetsResponse) ((ApiResult.Success) apiResult).response).widgets;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        widget = ReplaceModeKt.toWidget(this, (RenderedWidget) it.next(), this.pluginRegistry.plugins.keySet());
                    } catch (ProtoParsingError e) {
                        this.errorReporter.report(e, this.oneErrorPerAppSessionStrategy);
                        widget = null;
                    }
                    if (widget != null) {
                        arrayList.add(widget);
                    }
                }
                return new ApiResult.Success(arrayList);
            }
        }
        realMoneybotWidgetManager$listWidgets$1 = new RealMoneybotWidgetManager$listWidgets$1(this, continuationImpl);
        Object obj2 = realMoneybotWidgetManager$listWidgets$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotWidgetManager$listWidgets$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markWidgetAsUsed(String str, ContinuationImpl continuationImpl) {
        RealMoneybotWidgetManager$markWidgetAsUsed$1 realMoneybotWidgetManager$markWidgetAsUsed$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealMoneybotWidgetManager$markWidgetAsUsed$1) {
            realMoneybotWidgetManager$markWidgetAsUsed$1 = (RealMoneybotWidgetManager$markWidgetAsUsed$1) continuationImpl;
            int i2 = realMoneybotWidgetManager$markWidgetAsUsed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMoneybotWidgetManager$markWidgetAsUsed$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMoneybotWidgetManager$markWidgetAsUsed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMoneybotWidgetManager$markWidgetAsUsed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MarkWidgetAsUsedRequest markWidgetAsUsedRequest = new MarkWidgetAsUsedRequest(str, null, ByteString.EMPTY);
                    realMoneybotWidgetManager$markWidgetAsUsed$1.label = 1;
                    obj = this.widgetService.markWidgetAsUsed(markWidgetAsUsedRequest, realMoneybotWidgetManager$markWidgetAsUsed$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return apiResult;
                }
                if (apiResult instanceof ApiResult.Success) {
                    return new ApiResult.Success(Unit.INSTANCE);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realMoneybotWidgetManager$markWidgetAsUsed$1 = new RealMoneybotWidgetManager$markWidgetAsUsed$1(this, continuationImpl);
        Object obj2 = realMoneybotWidgetManager$markWidgetAsUsed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotWidgetManager$markWidgetAsUsed$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }
}
