package com.braze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a1;
import bo.app.a4;
import bo.app.a9;
import bo.app.ah;
import bo.app.b2$$ExternalSyntheticLambda0;
import bo.app.bc;
import bo.app.c5;
import bo.app.d0;
import bo.app.e2;
import bo.app.e2$$ExternalSyntheticLambda29;
import bo.app.f;
import bo.app.f5;
import bo.app.fb;
import bo.app.g;
import bo.app.g6$$ExternalSyntheticLambda11;
import bo.app.g8;
import bo.app.g9;
import bo.app.gg;
import bo.app.h;
import bo.app.h9;
import bo.app.hc;
import bo.app.he;
import bo.app.i8;
import bo.app.j1;
import bo.app.j1$$ExternalSyntheticLambda4;
import bo.app.j1$$ExternalSyntheticLambda7;
import bo.app.j2;
import bo.app.jg$$ExternalSyntheticLambda2;
import bo.app.k1;
import bo.app.k4;
import bo.app.kb;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.m9;
import bo.app.mc$$ExternalSyntheticLambda0;
import bo.app.n8;
import bo.app.ne;
import bo.app.o6;
import bo.app.p9;
import bo.app.q$$ExternalSyntheticLambda1;
import bo.app.qc;
import bo.app.r7;
import bo.app.r7$$ExternalSyntheticLambda0;
import bo.app.s0;
import bo.app.t4;
import bo.app.t7$$ExternalSyntheticLambda4;
import bo.app.tc;
import bo.app.u3;
import bo.app.u4;
import bo.app.u4$$ExternalSyntheticLambda0;
import bo.app.u4$$ExternalSyntheticLambda1;
import bo.app.u4$$ExternalSyntheticLambda2;
import bo.app.u7;
import bo.app.v7;
import bo.app.w7;
import bo.app.wb;
import bo.app.x0;
import bo.app.x3;
import bo.app.x3$$ExternalSyntheticLambda2;
import bo.app.xg;
import bo.app.y8;
import bo.app.yb;
import bo.app.z0;
import bo.app.z4;
import bo.app.z9;
import bo.app.zg;
import bo.app.zg$$ExternalSyntheticLambda0;
import com.appsflyer.AppsFlyerProperties;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ß\u00012\u00020\u0001:\u0002ß\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0018\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010!\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010'J\u001d\u0010.\u001a\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u0002000+H\u0016¢\u0006\u0004\b1\u0010/J\u001d\u00103\u001a\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u0002020+H\u0016¢\u0006\u0004\b3\u0010/J1\u00107\u001a\u00020\b\"\u0004\b\u0000\u001042\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000+2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016¢\u0006\u0004\b7\u00108J3\u00109\u001a\u00020\b\"\u0004\b\u0000\u001042\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010+2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016¢\u0006\u0004\b9\u00108J\u0019\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b;\u0010<J#\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\f2\b\u0010=\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b;\u0010%J\u001d\u0010A\u001a\u00020\b2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010G\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0000¢\u0006\u0004\bE\u0010FJ!\u0010J\u001a\u00020\b2\u0006\u0010H\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\bI\u0010%J\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\bK\u0010\u001dJ\u000f\u0010N\u001a\u00020\bH\u0000¢\u0006\u0004\bM\u0010'J\u000f\u0010P\u001a\u00020\bH\u0000¢\u0006\u0004\bO\u0010'J\u0017\u0010T\u001a\u00020\b2\u0006\u0010Q\u001a\u00020,H\u0000¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\b2\u0006\u0010Q\u001a\u00020,H\u0000¢\u0006\u0004\bU\u0010SJ\u001f\u0010]\u001a\u00020\b2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b[\u0010\\J\u001f\u0010b\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010_\u001a\u00020^H\u0000¢\u0006\u0004\b`\u0010aJ\u0017\u0010e\u001a\u00020\b2\u0006\u0010_\u001a\u00020^H\u0000¢\u0006\u0004\bc\u0010dJ\u000f\u0010g\u001a\u00020\bH\u0000¢\u0006\u0004\bf\u0010'J\u0017\u0010j\u001a\u00020\b2\u0006\u0010h\u001a\u00020\fH\u0000¢\u0006\u0004\bi\u0010<J\u0017\u0010n\u001a\u00020C2\u0006\u0010k\u001a\u00020\fH\u0000¢\u0006\u0004\bl\u0010mJm\u0010{\u001a\u00028\u0000\"\u0004\b\u0000\u001042\u0006\u0010o\u001a\u00028\u00002\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\f0p2\b\b\u0002\u0010r\u001a\u00020C2\b\b\u0002\u0010s\u001a\u00020C2\b\b\u0002\u0010t\u001a\u00020C2\"\u0010x\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020v\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000w\u0012\u0006\u0012\u0004\u0018\u00010\u00010uH\u0001¢\u0006\u0004\by\u0010zJI\u0010~\u001a\u00020\b2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\f0p2\b\b\u0002\u0010r\u001a\u00020C2\b\b\u0002\u0010s\u001a\u00020C2\b\b\u0002\u0010t\u001a\u00020C2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\b0pH\u0001¢\u0006\u0004\b|\u0010}J\u001a\u0010\u0082\u0001\u001a\u00020\u007f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0013\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0087\u0001\u001a\u00020\b2\u0007\u0010\u0086\u0001\u001a\u00020CH\u0002¢\u0006\u0005\b\u0087\u0001\u0010FJ\u001c\u0010\u008a\u0001\u001a\u00020\b2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u008c\u0001\u0010'J\u001c\u0010\u008f\u0001\u001a\u00020\b2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0092\u0001\u001a\u00020C2\u0007\u0010\u0091\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0092\u0001\u0010mJ\u0011\u0010\u0093\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0093\u0001\u0010'R4\u0010\u0096\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001a\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¡\u0001\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R2\u0010£\u0001\u001a\u0004\u0018\u00010C8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b£\u0001\u0010¤\u0001\u0012\u0005\b©\u0001\u0010'\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010ª\u0001\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R1\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u00ad\u0001\u0010®\u0001\u0012\u0005\b³\u0001\u0010'\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R1\u0010µ\u0001\u001a\u00030´\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bµ\u0001\u0010¶\u0001\u0012\u0005\b»\u0001\u0010'\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R1\u0010½\u0001\u001a\u00030¼\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b½\u0001\u0010¾\u0001\u0012\u0005\bÃ\u0001\u0010'\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R0\u0010Ä\u0001\u001a\u00020\u007f8\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bÄ\u0001\u0010Å\u0001\u0012\u0005\bÊ\u0001\u0010'\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R1\u0010Ì\u0001\u001a\u00030Ë\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bÌ\u0001\u0010Í\u0001\u0012\u0005\bÒ\u0001\u0010'\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R1\u0010Ô\u0001\u001a\u00030Ó\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bÔ\u0001\u0010Õ\u0001\u0012\u0005\bÚ\u0001\u0010'\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R-\u0010Þ\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0005\bÝ\u0001\u0010<¨\u0006à\u0001"}, d2 = {"Lcom/braze/Braze;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "", "openSession", "(Landroid/app/Activity;)V", "closeSession", "", "eventName", "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "logCustomEvent", "(Ljava/lang/String;Lcom/braze/models/outgoing/BrazeProperties;)V", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", "price", "", "quantity", "logPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/models/outgoing/BrazeProperties;)V", "Landroid/content/Intent;", "intent", "logPushNotificationOpened", "(Landroid/content/Intent;)V", "campaignId", "actionId", "actionType", "logPushNotificationActionClicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pageId", "logPushStoryPageClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "requestContentCardsRefresh", "()V", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "subscriber", "subscribeToNewInAppMessages", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToContentCardsUpdates", "Lcom/braze/events/BrazeUserChangeEvent;", "subscribeToChangeUserEvents", "T", "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "(Lcom/braze/events/IEventSubscriber;Ljava/lang/Class;)V", "removeSingleSubscription", "userId", "changeUser", "(Ljava/lang/String;)V", "sdkAuthSignature", "Lcom/braze/events/IValueCallback;", "Lcom/braze/BrazeUser;", "completionCallback", "getCurrentUser", "(Lcom/braze/events/IValueCallback;)V", "", "ignoreRateLimit", "requestGeofenceRefresh$android_sdk_base_release", "(Z)V", "requestGeofenceRefresh", "serializedCardJson", "addSerializedCardJsonToStorage$android_sdk_base_release", "addSerializedCardJsonToStorage", "handleInAppMessageTestPush$android_sdk_base_release", "handleInAppMessageTestPush", "handleInternalBannerRefresh$android_sdk_base_release", "handleInternalBannerRefresh", "applyPendingRuntimeConfiguration$android_sdk_base_release", "applyPendingRuntimeConfiguration", BreadcrumbHelper.Category.EVENT, "retryInAppMessage$android_sdk_base_release", "(Lcom/braze/events/InAppMessageEvent;)V", "retryInAppMessage", "reenqueueInAppMessage$android_sdk_base_release", "reenqueueInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction$android_sdk_base_release", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "publishBrazePushAction", "", "timeInMs", "logPushDelivery$android_sdk_base_release", "(Ljava/lang/String;J)V", "logPushDelivery", "schedulePushDelivery$android_sdk_base_release", "(J)V", "schedulePushDelivery", "performPushDeliveryFlush$android_sdk_base_release", "performPushDeliveryFlush", "campaign", "logPushMaxCampaign$android_sdk_base_release", "logPushMaxCampaign", "pushId", "validateAndStorePushId$android_sdk_base_release", "(Ljava/lang/String;)Z", "validateAndStorePushId", "defaultValueOnException", "Lkotlin/Function0;", "errorLog", "earlyReturnIfDisabled", "earlyReturnIfDelayedInitEnabled", "earlyReturnIfUdmUninitialized", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "block", "runGuardedForResult$android_sdk_base_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "runGuardedForResult", "runGuardedAsync$android_sdk_base_release", "(Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function0;)V", "runGuardedAsync", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe", "Lbo/app/g9;", "getDeviceDataProvider", "()Lbo/app/g9;", "isOffline", "setSyncPolicyOfflineStatus", "", "throwable", "publishError", "(Ljava/lang/Throwable;)V", "verifyProperSdkSetup", "Lbo/app/ah;", "dependencyProvider", "setUserSpecificMemberVariablesAndStartDispatch", "(Lbo/app/ah;)V", "key", "isEphemeralEventKey", "safeCallFlushDelayedInitPushAnalyticsQueue", "Lcom/braze/images/IBrazeImageLoader;", "value", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "applicationContext", "Landroid/content/Context;", "Lbo/app/fb;", "offlineUserStorageProvider", "Lbo/app/fb;", "brazeUser", "Lcom/braze/BrazeUser;", "isApiKeyPresent", "Ljava/lang/Boolean;", "isApiKeyPresent$android_sdk_base_release", "()Ljava/lang/Boolean;", "setApiKeyPresent$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "isApiKeyPresent$android_sdk_base_release$annotations", "isInstanceStopped", "Z", "Lbo/app/h9;", "deviceIdProvider", "Lbo/app/h9;", "getDeviceIdProvider$android_sdk_base_release", "()Lbo/app/h9;", "setDeviceIdProvider$android_sdk_base_release", "(Lbo/app/h9;)V", "getDeviceIdProvider$android_sdk_base_release$annotations", "Lbo/app/m9;", "externalIEventMessenger", "Lbo/app/m9;", "getExternalIEventMessenger$android_sdk_base_release", "()Lbo/app/m9;", "setExternalIEventMessenger$android_sdk_base_release", "(Lbo/app/m9;)V", "getExternalIEventMessenger$android_sdk_base_release$annotations", "Lbo/app/p9;", "registrationDataProvider", "Lbo/app/p9;", "getRegistrationDataProvider$android_sdk_base_release", "()Lbo/app/p9;", "setRegistrationDataProvider$android_sdk_base_release", "(Lbo/app/p9;)V", "getRegistrationDataProvider$android_sdk_base_release$annotations", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider$android_sdk_base_release", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider$android_sdk_base_release", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider$android_sdk_base_release$annotations", "Lbo/app/hc;", "pushDeliveryManager", "Lbo/app/hc;", "getPushDeliveryManager$android_sdk_base_release", "()Lbo/app/hc;", "setPushDeliveryManager$android_sdk_base_release", "(Lbo/app/hc;)V", "getPushDeliveryManager$android_sdk_base_release$annotations", "Lbo/app/z9;", "udm", "Lbo/app/z9;", "getUdm$android_sdk_base_release", "()Lbo/app/z9;", "setUdm$android_sdk_base_release", "(Lbo/app/z9;)V", "getUdm$android_sdk_base_release$annotations", "getRegisteredPushToken", "()Ljava/lang/String;", "setRegisteredPushToken", "registeredPushToken", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Braze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static u4 delayedInitializationProvider;
    private static g9 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static he sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private static m9 staticExternalIEventMessenger;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public h9 deviceIdProvider;
    private m9 externalIEventMessenger;
    private IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private fb offlineUserStorageProvider;
    public hc pushDeliveryManager;
    public p9 registrationDataProvider;
    public z9 udm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = SetsKt__SetsJVMKt.setOf("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = ArraysKt___ArraysKt.toSet(new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static boolean shouldRequestFrameworkListenToNetworkUpdates = true;
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    /* JADX WARN: Removed duplicated region for block: B:8:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Braze(Context context) {
        BrazeLogger brazeLogger;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.imageLoader = new DefaultBrazeImageLoader(applicationContext);
        long nanoTime = System.nanoTime();
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(13), 7, (Object) null);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        this.applicationContext = applicationContext2;
        String str = Build.MODEL;
        if (str != null) {
            Set<String> set = KNOWN_APP_CRAWLER_DEVICE_MODELS;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (set.contains(lowerCase)) {
                BrazeLogger.brazelog$default(brazeLogger2, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(), 6, (Object) null);
                brazeLogger = brazeLogger2;
                INSTANCE.enableMockNetworkRequestsAndDropEventsMode();
                m9 m9Var = staticExternalIEventMessenger;
                this.externalIEventMessenger = m9Var == null ? new r7(new he(this.applicationContext), new u4(this.applicationContext), false) : m9Var;
                runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda1(11), false, false, false, new t7$$ExternalSyntheticLambda4(10, this, context));
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda2(1, System.nanoTime(), nanoTime), 7, (Object) null);
            }
        }
        brazeLogger = brazeLogger2;
        m9 m9Var2 = staticExternalIEventMessenger;
        this.externalIEventMessenger = m9Var2 == null ? new r7(new he(this.applicationContext), new u4(this.applicationContext), false) : m9Var2;
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda1(11), false, false, false, new t7$$ExternalSyntheticLambda4(10, this, context));
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda2(1, System.nanoTime(), nanoTime), 7, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "Braze SDK Initializing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$2() {
        return "Failed to perform initial Braze singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(Braze braze, Context context) {
        Braze braze2;
        Context context2;
        fb fbVar;
        Braze braze3;
        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
        braze.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(braze.applicationContext));
        Companion companion = INSTANCE;
        String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
        int i = 1;
        braze.isApiKeyPresent = Boolean.valueOf(!(configuredApiKey == null || StringsKt.isBlank(configuredApiKey)));
        u4 delayedInitializationProvider$android_sdk_base_release = companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext);
        BrazeConfigurationProvider configurationProvider$android_sdk_base_release = braze.getConfigurationProvider$android_sdk_base_release();
        delayedInitializationProvider$android_sdk_base_release.getClass();
        configurationProvider$android_sdk_base_release.getClass();
        t4 t4Var = delayedInitializationProvider$android_sdk_base_release.a;
        DataStoreKey dataStoreKey = DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG;
        Boolean bool = Boolean.FALSE;
        Boolean readBoolean = t4Var.readBoolean(dataStoreKey, bool);
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(readBoolean, bool2) && configurationProvider$android_sdk_base_release.isDelayedInitializationEnabled()) {
            delayedInitializationProvider$android_sdk_base_release.b(true);
        }
        if (!Intrinsics.areEqual(delayedInitializationProvider$android_sdk_base_release.a.readBoolean(dataStoreKey, bool), bool2)) {
            delayedInitializationProvider$android_sdk_base_release.c(configurationProvider$android_sdk_base_release.getDelayedInitializationAnalyticsBehavior());
        }
        BrazeLogger.setInitialLogLevelFromConfiguration(braze.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
        BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
        if (companion.getSdkEnablementProvider(context).a() || companion.isDelayedInitializationEnabled()) {
            companion.setOutboundNetworkRequestsOffline(true);
        }
        String str = braze.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().a;
        braze.setPushDeliveryManager$android_sdk_base_release(new hc(braze.applicationContext, str));
        braze.setDeviceIdProvider$android_sdk_base_release(new f5(braze.applicationContext, str));
        braze.offlineUserStorageProvider = new fb(braze.applicationContext);
        braze.setRegistrationDataProvider$android_sdk_base_release(new tc(braze.applicationContext, braze.getConfigurationProvider$android_sdk_base_release()));
        String customEndpoint = braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
        if (customEndpoint != null && !StringsKt.isBlank(customEndpoint)) {
            if (ValidationUtils.isInvalidCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint())) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(20), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(3), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(6), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(7), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(8), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(9), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(10), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(11), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(12), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(13), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(21), 6, (Object) null);
            }
            companion.setConfiguredCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
        }
        try {
            if (braze.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                n8 n8Var = new n8(context, braze.getRegistrationDataProvider$android_sdk_base_release());
                if (n8Var.a()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(22), 6, (Object) null);
                    String firebaseCloudMessagingSenderIdKey = braze.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        n8Var.a(firebaseCloudMessagingSenderIdKey);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(23), 6, (Object) null);
                }
                braze3 = braze;
            } else {
                braze3 = braze;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(24), 6, (Object) null);
            }
            if (braze3.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                g gVar = h.c;
                Context context3 = braze3.applicationContext;
                context3.getClass();
                if (gVar.a() && gVar.a(context3)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(25), 6, (Object) null);
                    new h(braze3.applicationContext, braze3.getRegistrationDataProvider$android_sdk_base_release()).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(26), 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(27), 6, (Object) null);
            }
            braze.verifyProperSdkSetup();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda1(28), 4, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority2 = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(i), 6, (Object) null);
        try {
            context2 = braze.applicationContext;
            fbVar = braze.offlineUserStorageProvider;
        } catch (Exception e2) {
            braze2 = braze;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Braze$$ExternalSyntheticLambda6(4), 4, (Object) null);
            braze2.publishError(e2);
        }
        if (fbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
            throw null;
        }
        braze.setUserSpecificMemberVariablesAndStartDispatch(new ah(context2, fbVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
        BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(2), 6, (Object) null);
        braze2 = braze;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(5), 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$4(long j, long j2) {
        long j3 = j - j2;
        return CameraState$Type$EnumUnboxingLocalUtility.m(j3, " nanos", Boxes$$ExternalSyntheticOutline1.m1149m(j3 / 1000000, "Braze SDK loaded in ", " ms / "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set the push token ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_registeredPushToken_$lambda$1(Braze braze, String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 29), 6, (Object) null);
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(16), 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(((tc) braze.getRegistrationDataProvider$android_sdk_base_release()).b(), str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(str, 0), 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((tc) braze.getRegistrationDataProvider$android_sdk_base_release()).a(str);
        z4 z4Var = ((ah) braze.getUdm$android_sdk_base_release()).h;
        if (z4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            throw null;
        }
        z4Var.e();
        braze.requestImmediateDataFlush();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Push token registered: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$1() {
        return "Push token must not be null or blank. Not registering for push with Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$1$2(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Push token ", str, " is the same as the previous token. Not calling sendFullDeviceObjectOnNextExport or requesting data flush");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$0(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Failed to update ContentCard storage provider with single card update. User id: ", str, " Serialized json: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSerializedCardJsonToStorage$lambda$1(String str, Braze braze, String str2) {
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(str2, str, 22), 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((ah) braze.getUdm$android_sdk_base_release()).y.a(new u3(str), str2);
        ((r7) braze.externalIEventMessenger).b(((ah) braze.getUdm$android_sdk_base_release()).y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$1$0(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Cannot add null or blank card json to storage. Returning. User id: ", str, " Serialized json: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSingleSynchronousSubscription$lambda$0(Class cls) {
        return Boxes$$ExternalSyntheticOutline1.m(cls, "Failed to add synchronous subscriber for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSingleSynchronousSubscription$lambda$1(Braze braze, Class cls, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).c(cls, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$0() {
        return "Applying any pending runtime configuration values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$1() {
        return "Clearing config values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$0$2(BrazeConfig brazeConfig) {
        return "Setting pending config object: " + brazeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set external id to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeUser$lambda$1(String str, Braze braze, String str2) {
        if (str == null || str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(15), 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 19), 6, (Object) null);
            return Unit.INSTANCE;
        }
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            throw null;
        }
        String userId = brazeUser.getUserId();
        int i = 20;
        if (Intrinsics.areEqual(userId, str)) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, i), 6, (Object) null);
            if (str2 != null && !StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str2, 21), 7, (Object) null);
                ((ah) braze.getUdm$android_sdk_base_release()).q.b(str2);
            }
        } else {
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(userId, str, i), 6, (Object) null);
            r7 r7Var = ((ah) braze.getUdm$android_sdk_base_release()).i;
            ReentrantLock reentrantLock = r7Var.h;
            reentrantLock.lock();
            try {
                reentrantLock.unlock();
                qc qcVar = ((ah) braze.getUdm$android_sdk_base_release()).p;
                qcVar.b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                qcVar.b.clearData(DataStoreKey.PUSH_MAX_LAST_UPDATE);
                ((ah) braze.getUdm$android_sdk_base_release()).t.d();
                ((ah) braze.getUdm$android_sdk_base_release()).k.a();
                fb fbVar = braze.offlineUserStorageProvider;
                if (fbVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    throw null;
                }
                fbVar.b(str);
                z9 udm$android_sdk_base_release = braze.getUdm$android_sdk_base_release();
                Context context = braze.applicationContext;
                fb fbVar2 = braze.offlineUserStorageProvider;
                if (fbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    throw null;
                }
                braze.setUserSpecificMemberVariablesAndStartDispatch(new ah(context, fbVar2, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str2, 22), 7, (Object) null);
                    ((ah) braze.getUdm$android_sdk_base_release()).q.b(str2);
                }
                ((ah) braze.getUdm$android_sdk_base_release()).a().j();
                ((ah) braze.getUdm$android_sdk_base_release()).t.l();
                ah ahVar = (ah) udm$android_sdk_base_release;
                ahVar.getClass();
                JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new zg(ahVar, null), 3);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$0() {
        return "userId passed to changeUser was null or empty. The current user will remain the active user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Rejected user id with byte length longer than 997. Not changing user. Input user id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$2(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Received request to change current user ", str, " to the same user id. Not changing user.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Set sdk auth signature on changeUser call: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$4(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Changing current user '", str, "' to new user '", str2, ".'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$1$5(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Set sdk auth signature on changeUser call: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$0() {
        return "Cannot close session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$1() {
        return "Failed to close session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeSession$lambda$2(Braze braze, f fVar) {
        ((ah) braze.getUdm$android_sdk_base_release()).t.a(fVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getConfigurationProviderSafe$lambda$0() {
        return "ConfigurationProvider has not been initialized. Constructing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCurrentUser$lambda$0() {
        return "Failed to retrieve the current user.";
    }

    private final g9 getDeviceDataProvider() {
        g9 g9Var = deviceDataProvider;
        if (g9Var == null) {
            g9Var = new c5(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = g9Var;
        return g9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInAppMessageTestPush$lambda$0() {
        return "Error handling test in-app message push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInAppMessageTestPush$lambda$1(Intent intent, Braze braze) {
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((ah) braze.getUdm$android_sdk_base_release()).t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInternalBannerRefresh$lambda$0() {
        return "Error handling banner push refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInternalBannerRefresh$lambda$1(Braze braze) {
        ((ah) braze.getUdm$android_sdk_base_release()).x.a();
        return Unit.INSTANCE;
    }

    private final boolean isEphemeralEventKey(String key) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        int i = 3;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(i), 6, (Object) null);
        Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        boolean contains = ephemeralEventKeys.contains(key);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new g6$$ExternalSyntheticLambda11(key, ephemeralEventKeys, contains, i), 6, (Object) null);
        return contains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$0() {
        return "Ephemeral events enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$1(String str, Set set, boolean z) {
        return "Checking event key [" + str + "] against ephemeral event list " + set + " and got match?: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$1$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Device build model matches a known crawler. Enabling mock network request mode. Device it: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$0() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$1() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$10() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$11() {
        return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$13() {
        return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$14() {
        return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$15() {
        return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$16() {
        return "ADM manifest requirements not met. Braze will not register for ADM.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$17() {
        return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$18() {
        return "Failed to setup pre SDK tasks";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$19() {
        return "Starting up a new user dependency manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$2() {
        return "**                                   !! WARNING !!                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$20() {
        return "Finished UserDependencyManager creation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$21() {
        return "Failed to startup user dependency manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$22() {
        return "Finished singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$3() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$4() {
        return "**                       You are using a Braze REST API endpoint                     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$5() {
        return "**                             instead of an SDK endpoint                            **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$6() {
        return "**                Replace \"rest\" with \"sdk\" in your configuration                    **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$7() {
        return "**                                        See                                        **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$8() {
        return "**  https://www.braze.com/docs/user_guide/administrative/access_braze/sdk_endpoints  **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$3$9() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to log custom event: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logCustomEvent$lambda$1(Braze braze, String str, BrazeProperties brazeProperties, BrazeProperties brazeProperties2) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda4(str, brazeProperties2, 1), 6, (Object) null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = str;
        if (!ValidationUtils.isValidLogCustomEventInput(str, ((ah) braze.getUdm$android_sdk_base_release()).j)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(6, ref$ObjectRef), 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(7, ref$ObjectRef), 6, (Object) null);
            return Unit.INSTANCE;
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) ref$ObjectRef.element);
        ref$ObjectRef.element = ensureBrazeFieldLength;
        y8 a = k1.g.a(ensureBrazeFieldLength, brazeProperties);
        if (a == null) {
            return Unit.INSTANCE;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda4(str, brazeProperties2, 2), 6, (Object) null);
        if (braze.isEphemeralEventKey((String) ref$ObjectRef.element) ? ((ah) braze.getUdm$android_sdk_base_release()).j.H() : ((ah) braze.getUdm$android_sdk_base_release()).t.a(a)) {
            ((ah) braze.getUdm$android_sdk_base_release()).B.a((gg) new a4((String) ref$ObjectRef.element, brazeProperties, a));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new b2$$ExternalSyntheticLambda0(8, ref$ObjectRef), 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$0(String str, BrazeProperties brazeProperties) {
        return "Called logCustomEvent for custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$1(Ref$ObjectRef ref$ObjectRef) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Logged custom event with name ", " was invalid. Not logging custom event to Braze.", ref$ObjectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$2(Ref$ObjectRef ref$ObjectRef) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Custom event with name ", " logged with invalid properties. Not logging custom event to Braze.", ref$ObjectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$3(String str, BrazeProperties brazeProperties) {
        return "Logging custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$1$4(Ref$ObjectRef ref$ObjectRef) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Not passing event with name ", " to trigger manager", ref$ObjectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to log purchase event of: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPurchase$lambda$1(String str, String str2, BigDecimal bigDecimal, int i, Braze braze, BrazeProperties brazeProperties) {
        if (!ValidationUtils.isValidLogPurchaseInput(str, str2, bigDecimal, i, ((ah) braze.getUdm$android_sdk_base_release()).j)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(29), 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (brazeProperties != null) {
            int i2 = 1;
            if (brazeProperties.isInvalid()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(i2), 6, (Object) null);
                return Unit.INSTANCE;
            }
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        j1 j1Var = k1.g;
        str2.getClass();
        bigDecimal.getClass();
        y8 a = j1Var.a(ensureBrazeFieldLength, str2, bigDecimal, i, brazeProperties);
        if (a == null) {
            return Unit.INSTANCE;
        }
        if (((ah) braze.getUdm$android_sdk_base_release()).t.a(a)) {
            ((ah) braze.getUdm$android_sdk_base_release()).B.a((gg) new wb(ensureBrazeFieldLength, brazeProperties, a));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$1$0() {
        return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$1$1() {
        return "Purchase logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushDelivery$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Error logging Push Delivery ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushDelivery$lambda$1(Braze braze, String str, long j) {
        ((ah) braze.getUdm$android_sdk_base_release()).t.a(str);
        braze.schedulePushDelivery$android_sdk_base_release(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushMaxCampaign$lambda$0() {
        return "Failed to log push max campaign";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushMaxCampaign$lambda$1(Braze braze, String str) {
        ((ah) braze.getUdm$android_sdk_base_release()).t.c(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$0() {
        return "Failed to log push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationActionClicked$lambda$1(String str, Braze braze, String str2, String str3) {
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(22), 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(21), 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (str3 == null || StringsKt.isBlank(str3)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(20), 6, (Object) null);
            return Unit.INSTANCE;
        }
        int i = yb.$r8$clinit;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", str);
        jSONObject.put("a", str2);
        v7 v7Var = w7.b;
        yb ybVar = new yb(jSONObject, str3);
        Companion companion = INSTANCE;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(ybVar);
            return Unit.INSTANCE;
        }
        ((ah) braze.getUdm$android_sdk_base_release()).t.a(ybVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$0() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$1() {
        return "Action ID cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$1$2() {
        return "Action Type cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$2(Intent intent) {
        return "Error logging push notification with intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationOpened$lambda$3(Intent intent, Braze braze) {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(24), 6, (Object) null);
            return Unit.INSTANCE;
        }
        String stringExtra = intent.getStringExtra("cid");
        if (stringExtra == null || StringsKt.isBlank(stringExtra)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(25), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(stringExtra, 23), 6, (Object) null);
            int i = bc.$r8$clinit;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", stringExtra);
            v7 v7Var = w7.b;
            bc bcVar = new bc(jSONObject);
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(bcVar);
                return Unit.INSTANCE;
            }
            ((ah) braze.getUdm$android_sdk_base_release()).t.a(bcVar);
        }
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((ah) braze.getUdm$android_sdk_base_release()).t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$0() {
        return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Logging push click. Campaign Id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$3$2() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$0(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Failed to log push story page clicked for pageId: ", str, " campaignId: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushStoryPageClicked$lambda$1(String str, String str2, Braze braze) {
        if (!ValidationUtils.isValidPushStoryClickInput(str, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(18), 6, (Object) null);
            return Unit.INSTANCE;
        }
        j1 j1Var = k1.g;
        str.getClass();
        str2.getClass();
        y8 o = j1Var.o(str, str2);
        if (o != null) {
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(19), 7, (Object) null);
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(o);
                return Unit.INSTANCE;
            }
            ((ah) braze.getUdm$android_sdk_base_release()).t.a(o);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$1$0() {
        return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$1$1() {
        return "Enqueuing push story page click to delayed init provider";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$0() {
        return "Cannot open session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$1() {
        return "Failed to open session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openSession$lambda$2(Braze braze, f fVar) {
        ((ah) braze.getUdm$android_sdk_base_release()).t.b(fVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performPushDeliveryFlush$lambda$0() {
        return "Failed to flush push delivery events";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performPushDeliveryFlush$lambda$1(Braze braze) {
        ((ah) braze.getUdm$android_sdk_base_release()).t.a(0L);
        return Unit.INSTANCE;
    }

    private final void publishError(Throwable throwable) {
        if (this.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, throwable, false, (Function0) new Braze$$ExternalSyntheticLambda1(18), 4, (Object) null);
            return;
        }
        try {
            ((ah) getUdm$android_sdk_base_release()).i.b(throwable, Throwable.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new e2$$ExternalSyntheticLambda29(throwable, 1), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$0() {
        return "User dependency manager is uninitialized. Not publishing error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$1(Throwable th) {
        return "Failed to log throwable: " + th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reenqueueInAppMessage$lambda$0(InAppMessageEvent inAppMessageEvent) {
        return "Error reenqueueing In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reenqueueInAppMessage$lambda$1(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((ah) braze.getUdm$android_sdk_base_release()).B.b(inAppMessageEvent.getTriggerAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$0() {
        return "Failed to refresh feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshFeatureFlags$lambda$1(Braze braze) {
        if (((ah) braze.getUdm$android_sdk_base_release()).j.I()) {
            g8 g8Var = ((ah) braze.getUdm$android_sdk_base_release()).w;
            j2 j2Var = j2.SESSION_START;
            g8Var.e();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(2), 6, (Object) null);
            ((ah) braze.getUdm$android_sdk_base_release()).i.b(new i8(), i8.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$1$0() {
        return "Feature flags not enabled. Not refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$0(Class cls) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to remove ", cls.getName(), " subscriber.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeSingleSubscription$lambda$1(final IEventSubscriber iEventSubscriber, Braze braze, final Class cls) {
        if (iEventSubscriber != null) {
            final boolean a = ((r7) braze.externalIEventMessenger).a(cls, iEventSubscriber);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            final int i = 0;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeSingleSubscription$lambda$1$0$0;
                    String removeSingleSubscription$lambda$1$0$1;
                    int i2 = i;
                    boolean z = a;
                    IEventSubscriber iEventSubscriber2 = iEventSubscriber;
                    Class cls2 = cls;
                    switch (i2) {
                        case 0:
                            removeSingleSubscription$lambda$1$0$0 = Braze.removeSingleSubscription$lambda$1$0$0(cls2, iEventSubscriber2, z);
                            return removeSingleSubscription$lambda$1$0$0;
                        default:
                            removeSingleSubscription$lambda$1$0$1 = Braze.removeSingleSubscription$lambda$1$0$1(cls2, iEventSubscriber2, z);
                            return removeSingleSubscription$lambda$1$0$1;
                    }
                }
            }, 6, (Object) null);
            final boolean b = ((r7) braze.externalIEventMessenger).b(cls, iEventSubscriber);
            final int i2 = 1;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.Braze$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeSingleSubscription$lambda$1$0$0;
                    String removeSingleSubscription$lambda$1$0$1;
                    int i22 = i2;
                    boolean z = b;
                    IEventSubscriber iEventSubscriber2 = iEventSubscriber;
                    Class cls2 = cls;
                    switch (i22) {
                        case 0:
                            removeSingleSubscription$lambda$1$0$0 = Braze.removeSingleSubscription$lambda$1$0$0(cls2, iEventSubscriber2, z);
                            return removeSingleSubscription$lambda$1$0$0;
                        default:
                            removeSingleSubscription$lambda$1$0$1 = Braze.removeSingleSubscription$lambda$1$0$1(cls2, iEventSubscriber2, z);
                            return removeSingleSubscription$lambda$1$0$1;
                    }
                }
            }, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$1$0$0(Class cls, IEventSubscriber iEventSubscriber, boolean z) {
        return "Did remove the background " + cls + " " + iEventSubscriber + "? " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$1$0$1(Class cls, IEventSubscriber iEventSubscriber, boolean z) {
        return "Did remove the synchronous " + cls + " " + iEventSubscriber + "? " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$0() {
        return "Failed to request Content Cards refresh from Braze servers.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefresh$lambda$1(Braze braze) {
        if (((ah) braze.getUdm$android_sdk_base_release()).j.F()) {
            if (((ah) braze.getUdm$android_sdk_base_release()).j.E()) {
                o6 o6Var = ((ah) braze.getUdm$android_sdk_base_release()).k.c;
                long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                long j = o6Var.c.get();
                long j2 = nowInMilliseconds - j;
                Job job = o6Var.a;
                if (job != null && job.isActive() && o6Var.b.get() && j != 0 && j2 > 3000) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(14), 6, (Object) null);
                    m9 m9Var = braze.externalIEventMessenger;
                    x3 x3Var = ((ah) braze.getUdm$android_sdk_base_release()).y;
                    x3Var.getClass();
                    ((r7) m9Var).b(x3Var.a(true, Long.valueOf(DateTimeUtils.nowInSeconds())), ContentCardsUpdatedEvent.class);
                    return Unit.INSTANCE;
                }
            }
            ((ah) braze.getUdm$android_sdk_base_release()).t.a(((ah) braze.getUdm$android_sdk_base_release()).y.d, ((ah) braze.getUdm$android_sdk_base_release()).y.e, j2.CLIENT_INITIATED);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(15), 7, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$1$0() {
        return "DUST is enabled and blocking Content Cards refreshes during active connections. Returning cached Content Cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$1$1() {
        return "Content Cards is not enabled, skipping API call to refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefreshFromCache$lambda$0() {
        return "Failed to request Content Cards refresh from the cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefreshFromCache$lambda$1(Braze braze) {
        ((r7) braze.externalIEventMessenger).b(((ah) braze.getUdm$android_sdk_base_release()).y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$2(boolean z) {
        return "Failed to request geofence refresh with rate limit ignore: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofenceRefresh$lambda$3(Braze braze, boolean z) {
        ((ah) braze.getUdm$android_sdk_base_release()).u.requestGeofenceRefresh(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$0() {
        return "Failed to request data flush.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestImmediateDataFlush$lambda$1(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(16), 6, (Object) null);
        e2 e2Var = ((ah) braze.getUdm$android_sdk_base_release()).t;
        e2Var.getClass();
        e2Var.a(new kb());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$1$0() {
        return "requestImmediateDataFlush() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retryInAppMessage$lambda$0(InAppMessageEvent inAppMessageEvent) {
        return "Error retrying In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryInAppMessage$lambda$1(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((ah) braze.getUdm$android_sdk_base_release()).B.a(inAppMessageEvent.getTriggerEvent(), inAppMessageEvent.getTriggerAction());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void runGuardedAsync$android_sdk_base_release$default(Braze braze, Function0 function0, boolean z, boolean z2, boolean z3, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        braze.runGuardedAsync$android_sdk_base_release(function0, z, z2, z3, function02);
    }

    public static /* synthetic */ Object runGuardedForResult$android_sdk_base_release$default(Braze braze, Object obj, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function2, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            z3 = true;
        }
        return braze.runGuardedForResult$android_sdk_base_release(obj, function0, z, z2, z3, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeCallFlushDelayedInitPushAnalyticsQueue() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda1(19), false, false, false, new Braze$$ExternalSyntheticLambda9(this, 8), 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0() {
        return "Error calling flushPushAnalyticsQueue on instance";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1(Braze braze) {
        INSTANCE.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(((ah) braze.getUdm$android_sdk_base_release()).t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String schedulePushDelivery$lambda$0() {
        return "Error scheduling push delivery";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit schedulePushDelivery$lambda$1(Braze braze, long j) {
        ((ah) braze.getUdm$android_sdk_base_release()).t.a(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(boolean isOffline) {
        int i = 0;
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda34(isOffline, i), false, false, false, new Braze$$ExternalSyntheticLambda35(this, isOffline, i), 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$0(boolean z) {
        return "Failed to set sync policy offline to " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSyncPolicyOfflineStatus$lambda$1(Braze braze, boolean z) {
        ((ah) braze.getUdm$android_sdk_base_release()).t.getClass();
        k4 k4Var = ((ah) braze.getUdm$android_sdk_base_release()).m;
        synchronized (k4Var) {
            try {
                k4Var.l = z;
                k4Var.b();
                if (z) {
                    k4Var.f();
                } else {
                    k4Var.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda34(z, 5), 7, (Object) null);
        braze.getImageLoader().setOffline(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$1$0(boolean z) {
        return "Setting the image loader deny network downloads to " + z;
    }

    private final void setUserSpecificMemberVariablesAndStartDispatch(ah dependencyProvider) {
        setUdm$android_sdk_base_release(dependencyProvider);
        ne neVar = ne.a;
        ne.b = ((ah) getUdm$android_sdk_base_release()).i;
        DataStoreProvider.INSTANCE.setEventPublisher$android_sdk_base_release(((ah) getUdm$android_sdk_base_release()).i);
        xg a = ((ah) getUdm$android_sdk_base_release()).a();
        e2 e2Var = ((ah) getUdm$android_sdk_base_release()).t;
        fb fbVar = this.offlineUserStorageProvider;
        if (fbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
            throw null;
        }
        this.brazeUser = new BrazeUser(a, e2Var, fbVar.a(), ((ah) getUdm$android_sdk_base_release()).v, ((ah) getUdm$android_sdk_base_release()).j);
        ((ah) getUdm$android_sdk_base_release()).l.a(((ah) getUdm$android_sdk_base_release()).i);
        ((ah) getUdm$android_sdk_base_release()).i.a();
        ((ah) getUdm$android_sdk_base_release()).o.a(((ah) getUdm$android_sdk_base_release()).i);
        ((ah) getUdm$android_sdk_base_release()).A.g();
        m9 m9Var = this.externalIEventMessenger;
        BrazeUser brazeUser = this.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            throw null;
        }
        ((r7) m9Var).b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
        r7 r7Var = ((ah) getUdm$android_sdk_base_release()).i;
        BrazeUser brazeUser2 = this.brazeUser;
        if (brazeUser2 != null) {
            r7Var.b(new BrazeUserChangeEvent(brazeUser2.getUserId()), BrazeUserChangeEvent.class);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$0() {
        return "Failed to subscribe to BrazeUserChangeEvent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToChangeUserEvents$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).c(BrazeUserChangeEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$2() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToChangeUserEvents$lambda$3(Braze braze) {
        m9 m9Var;
        BrazeUser brazeUser;
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(17), 7, (Object) null);
            m9Var = braze.externalIEventMessenger;
            brazeUser = braze.brazeUser;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda6(18), 4, (Object) null);
            braze.publishError(e);
        }
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            throw null;
        }
        ((r7) m9Var).b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$3$0() {
        return "Sending initial BrazeUserChangeEvent upon subscribeToChangeUserEvents";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$3$1() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$0() {
        return "Failed to subscribe to Content Cards updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToContentCardsUpdates$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).d(ContentCardsUpdatedEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$2() {
        return "Failed to send cached Content Cards updates upon subscription.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToContentCardsUpdates$lambda$3(Braze braze) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(14), 7, (Object) null);
            if (((ah) braze.getUdm$android_sdk_base_release()).j.F()) {
                ((r7) braze.externalIEventMessenger).b(((ah) braze.getUdm$android_sdk_base_release()).y.a(true, (Long) null), ContentCardsUpdatedEvent.class);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda1(15), 4, (Object) null);
            braze.publishError(e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$3$0() {
        return "Sending cached update upon content card subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$3$1() {
        return "Failed to send cached content cards upon subscribeToContentCardsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNewInAppMessages$lambda$0() {
        return "Failed to add subscriber to new in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToNewInAppMessages$lambda$1(Braze braze, IEventSubscriber iEventSubscriber) {
        ((r7) braze.externalIEventMessenger).d(InAppMessageEvent.class, iEventSubscriber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String validateAndStorePushId$lambda$0() {
        return "Failed to validate and store push identifier";
    }

    private final void verifyProperSdkSetup() {
        int i = 1;
        boolean z = true;
        for (String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(str, i), 6, (Object) null);
                z = false;
            }
        }
        if (StringsKt.isBlank(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(20), 6, (Object) null);
            z = false;
        }
        if (z) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(22), 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The Braze SDK requires the permission ", str, ". Check your AndroidManifest.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$1() {
        return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$2() {
        return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(String serializedCardJson, String userId) {
        serializedCardJson.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new j1$$ExternalSyntheticLambda7(userId, serializedCardJson, 21), false, false, false, new Braze$$ExternalSyntheticLambda33(serializedCardJson, this, userId, 1), 14, null);
    }

    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        subscriber.getClass();
        eventClass.getClass();
        runGuardedAsync$android_sdk_base_release(new r7$$ExternalSyntheticLambda0(eventClass, 4), false, false, false, new Braze$$ExternalSyntheticLambda17(this, eventClass, subscriber));
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(16), 7, (Object) null);
            Braze braze = this;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(braze.applicationContext);
            for (BrazeConfig brazeConfig : pendingConfigurations) {
                if (Intrinsics.areEqual(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(17), 6, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda44(brazeConfig, 0), 6, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
                braze = this;
            }
            pendingConfigurations.clear();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void changeUser(String userId, String sdkAuthSignature) {
        runGuardedAsync$android_sdk_base_release$default(this, new x3$$ExternalSyntheticLambda2(userId, 26), false, false, false, new Braze$$ExternalSyntheticLambda33(userId, this, sdkAuthSignature, 0), 14, null);
    }

    public void closeSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zg$$ExternalSyntheticLambda0(17), 6, (Object) null);
        } else {
            runGuardedAsync$android_sdk_base_release$default(this, new zg$$ExternalSyntheticLambda0(23), false, false, false, new Braze$$ExternalSyntheticLambda12(this, new f(activity.getClass()), 0), 14, null);
        }
    }

    public final BrazeConfigurationProvider getConfigurationProvider$android_sdk_base_release() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configurationProvider");
        throw null;
    }

    public final BrazeConfigurationProvider getConfigurationProviderSafe$android_sdk_base_release(Context context) {
        context.getClass();
        if (this.configurationProvider != null) {
            return getConfigurationProvider$android_sdk_base_release();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(29), 7, (Object) null);
        return new BrazeConfigurationProvider(context);
    }

    public void getCurrentUser(IValueCallback<BrazeUser> completionCallback) {
        completionCallback.getClass();
        try {
            JobKt.launch$default(ne.a, null, null, new s0(completionCallback, this, null), 3);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda1(4), 4, (Object) null);
            completionCallback.onError();
            publishError(e);
        }
    }

    public final h9 getDeviceIdProvider$android_sdk_base_release() {
        h9 h9Var = this.deviceIdProvider;
        if (h9Var != null) {
            return h9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceIdProvider");
        throw null;
    }

    /* renamed from: getExternalIEventMessenger$android_sdk_base_release, reason: from getter */
    public final m9 getExternalIEventMessenger() {
        return this.externalIEventMessenger;
    }

    public IBrazeImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public final hc getPushDeliveryManager$android_sdk_base_release() {
        hc hcVar = this.pushDeliveryManager;
        if (hcVar != null) {
            return hcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushDeliveryManager");
        throw null;
    }

    public final p9 getRegistrationDataProvider$android_sdk_base_release() {
        p9 p9Var = this.registrationDataProvider;
        if (p9Var != null) {
            return p9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
        throw null;
    }

    public final z9 getUdm$android_sdk_base_release() {
        z9 z9Var = this.udm;
        if (z9Var != null) {
            return z9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("udm");
        throw null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(Intent intent) {
        intent.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda6(19), false, false, false, new Braze$$ExternalSyntheticLambda87(intent, this, 0), 14, null);
    }

    public final /* synthetic */ void handleInternalBannerRefresh$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new zg$$ExternalSyntheticLambda0(26), false, false, false, new Braze$$ExternalSyntheticLambda9(this, 2), 14, null);
    }

    /* renamed from: isApiKeyPresent$android_sdk_base_release, reason: from getter */
    public final Boolean getIsApiKeyPresent() {
        return this.isApiKeyPresent;
    }

    public void logCustomEvent(String eventName, BrazeProperties properties) {
        runGuardedAsync$android_sdk_base_release$default(this, new x3$$ExternalSyntheticLambda2(eventName, 27), false, false, false, new l2$$ExternalSyntheticLambda7(this, eventName, properties != null ? properties.clone() : null, properties, 13), 14, null);
    }

    public void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity, BrazeProperties properties) {
        runGuardedAsync$android_sdk_base_release$default(this, new x3$$ExternalSyntheticLambda2(productId, 24), false, false, false, new Braze$$ExternalSyntheticLambda132(productId, currencyCode, price, quantity, this, properties != null ? properties.clone() : null), 14, null);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(String campaignId, long timeInMs) {
        campaignId.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new x3$$ExternalSyntheticLambda2(campaignId, 28), false, false, false, new q$$ExternalSyntheticLambda1(this, campaignId, timeInMs, 5), 14, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(String campaign) {
        campaign.getClass();
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda6(25), false, false, false, new Braze$$ExternalSyntheticLambda29(this, campaign, 1), 14, null);
    }

    public void logPushNotificationActionClicked(String campaignId, String actionId, String actionType) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda6(24), false, false, false, new l2$$ExternalSyntheticLambda7(campaignId, this, actionId, actionType, 14), 10, null);
    }

    public void logPushNotificationOpened(Intent intent) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda93(0, intent), false, false, false, new Braze$$ExternalSyntheticLambda87(intent, this, 1), 10, null);
    }

    public void logPushStoryPageClicked(String campaignId, String pageId) {
        runGuardedAsync$android_sdk_base_release$default(this, new j1$$ExternalSyntheticLambda7(pageId, campaignId, 23), false, false, false, new Braze$$ExternalSyntheticLambda33(campaignId, this, pageId), 10, null);
    }

    public void openSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda1(5), 6, (Object) null);
        } else {
            runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda1(6), false, false, false, new Braze$$ExternalSyntheticLambda12(this, new f(activity.getClass()), 1), 14, null);
        }
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda1(9), false, false, false, new Braze$$ExternalSyntheticLambda9(this, 6), 14, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        pushActionType.getClass();
        payload.getClass();
        ((r7) this.externalIEventMessenger).b(new BrazePushEvent(pushActionType, payload), BrazePushEvent.class);
    }

    public final void reenqueueInAppMessage$android_sdk_base_release(InAppMessageEvent event) {
        event.getClass();
        int i = 0;
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda49(event, i), false, false, false, new Braze$$ExternalSyntheticLambda50(this, event, i), 14, null);
    }

    public void refreshFeatureFlags() {
        runGuardedAsync$android_sdk_base_release$default(this, new zg$$ExternalSyntheticLambda0(27), false, false, false, new Braze$$ExternalSyntheticLambda9(this, 3), 14, null);
    }

    public <T> void removeSingleSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        eventClass.getClass();
        runGuardedAsync$android_sdk_base_release(new r7$$ExternalSyntheticLambda0(eventClass, 3), false, false, false, new Braze$$ExternalSyntheticLambda17(subscriber, this, eventClass));
    }

    public void requestContentCardsRefresh() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda1(7), false, false, false, new Braze$$ExternalSyntheticLambda9(this, 4), 14, null);
    }

    public void requestContentCardsRefreshFromCache() {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda1(8), false, false, false, new Braze$$ExternalSyntheticLambda9(this, 5), 14, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(boolean ignoreRateLimit) {
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda34(ignoreRateLimit, 4), false, false, false, new Braze$$ExternalSyntheticLambda35(this, ignoreRateLimit, 1), 14, null);
    }

    public void requestImmediateDataFlush() {
        runGuardedAsync$android_sdk_base_release$default(this, new zg$$ExternalSyntheticLambda0(14), false, false, false, new Braze$$ExternalSyntheticLambda9(this, 1), 14, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(InAppMessageEvent event) {
        event.getClass();
        int i = 1;
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda49(event, i), false, false, false, new Braze$$ExternalSyntheticLambda50(this, event, i), 14, null);
    }

    public final /* synthetic */ void runGuardedAsync$android_sdk_base_release(Function0 errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, Function0 block) {
        errorLog.getClass();
        block.getClass();
        try {
            JobKt.launch$default(ne.a, null, null, new x0(earlyReturnIfDisabled, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 3);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, errorLog, 4, (Object) null);
            publishError(e);
        }
    }

    public final <T> T runGuardedForResult$android_sdk_base_release(T defaultValueOnException, Function0<String> errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        errorLog.getClass();
        block.getClass();
        try {
            return (T) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new z0(earlyReturnIfDisabled, defaultValueOnException, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) errorLog, 4, (Object) null);
            publishError(e);
            return defaultValueOnException;
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(long timeInMs) {
        runGuardedAsync$android_sdk_base_release$default(this, new zg$$ExternalSyntheticLambda0(28), false, false, false, new mc$$ExternalSyntheticLambda0(this, timeInMs, 1), 14, null);
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        brazeConfigurationProvider.getClass();
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(h9 h9Var) {
        h9Var.getClass();
        this.deviceIdProvider = h9Var;
    }

    public final void setPushDeliveryManager$android_sdk_base_release(hc hcVar) {
        hcVar.getClass();
        this.pushDeliveryManager = hcVar;
    }

    public void setRegisteredPushToken(String str) {
        runGuardedAsync$android_sdk_base_release$default(this, new x3$$ExternalSyntheticLambda2(str, 25), false, false, false, new Braze$$ExternalSyntheticLambda29(this, str, 0), 14, null);
    }

    public final void setRegistrationDataProvider$android_sdk_base_release(p9 p9Var) {
        p9Var.getClass();
        this.registrationDataProvider = p9Var;
    }

    public final void setUdm$android_sdk_base_release(z9 z9Var) {
        z9Var.getClass();
        this.udm = z9Var;
    }

    public void subscribeToChangeUserEvents(IEventSubscriber<BrazeUserChangeEvent> subscriber) {
        subscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda1(12), false, false, false, new Braze$$ExternalSyntheticLambda7(this, subscriber, 2));
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda1(13), false, false, false, new Braze$$ExternalSyntheticLambda9(this, 7), 14, null);
    }

    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber) {
        subscriber.getClass();
        int i = 0;
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda6(i), false, false, false, new Braze$$ExternalSyntheticLambda7(this, subscriber, i));
        runGuardedAsync$android_sdk_base_release$default(this, new Braze$$ExternalSyntheticLambda6(21), false, false, false, new Braze$$ExternalSyntheticLambda9(this, i), 14, null);
    }

    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber) {
        subscriber.getClass();
        runGuardedAsync$android_sdk_base_release(new Braze$$ExternalSyntheticLambda1(10), false, false, false, new Braze$$ExternalSyntheticLambda7(this, subscriber, 1));
    }

    public final /* synthetic */ boolean validateAndStorePushId$android_sdk_base_release(String pushId) {
        pushId.getClass();
        return ((Boolean) runGuardedForResult$android_sdk_base_release$default(this, Boolean.TRUE, new Braze$$ExternalSyntheticLambda6(23), false, false, false, new a1(this, pushId, null), 28, null)).booleanValue();
    }

    @Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010'\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b%\u0010&J\u0017\u0010+\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b)\u0010*J\u001f\u00102\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b0\u00101J\u0017\u00106\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0019H\u0001¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0019H\u0002¢\u0006\u0004\b:\u0010\u001dR*\u0010;\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\bA\u0010\u0003\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010B\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bG\u0010\u0003\u001a\u0004\b)\u0010D\"\u0004\bE\u0010FR*\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bO\u0010\u0003\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010Q\u001a\u0004\u0018\u00010P8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010\u0003\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010\\\u001a\u00020\u00192\u0006\u0010X\u001a\u00020\u00198F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b[\u0010\u0003\u001a\u0004\bY\u0010\u001d\"\u0004\bZ\u00105R\u001a\u0010]\u001a\u00020\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010\u0003\u001a\u0004\b]\u0010\u001dR\u001a\u0010_\u001a\u00020\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010\u0003\u001a\u0004\b_\u0010\u001dR\u001a\u0010a\u001a\u00020\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010\u0003\u001a\u0004\ba\u0010\u001dR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u000b0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000b0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010mR\u0016\u0010n\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00170q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010t\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006v"}, d2 = {"Lcom/braze/Braze$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/braze/Braze;", "getInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getConfiguredApiKey", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Ljava/lang/String;", "Lcom/braze/IBrazeEndpointProvider;", "endpointProvider", "", "setEndpointProvider", "(Lcom/braze/IBrazeEndpointProvider;)V", "Landroid/net/Uri;", "brazeEndpoint", "getApiEndpoint", "(Landroid/net/Uri;)Landroid/net/Uri;", "Lcom/braze/configuration/BrazeConfig;", "config", "", "configure", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfig;)Z", "enableMockNetworkRequestsAndDropEventsMode", "()Z", "disableDelayedInitialization", "(Landroid/content/Context;)V", "Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "analyticsBehavior", "enableDelayedInitialization", "(Landroid/content/Context;Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;)V", "configuredCustomEndpoint", "setConfiguredCustomEndpoint$android_sdk_base_release", "(Ljava/lang/String;)V", "setConfiguredCustomEndpoint", "Lbo/app/u4;", "getDelayedInitializationProvider$android_sdk_base_release", "(Landroid/content/Context;)Lbo/app/u4;", "getDelayedInitializationProvider", "Landroid/content/Intent;", "intent", "Lbo/app/a9;", "brazeManager", "requestTriggersIfInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;Lbo/app/a9;)V", "requestTriggersIfInAppMessageTestPush", "clearStorage", "stopInstance$android_sdk_base_release", "(Z)V", "stopInstance", "Lbo/app/he;", "getSdkEnablementProvider", "(Landroid/content/Context;)Lbo/app/he;", "shouldAllowSingletonInitialization", "sdkEnablementProvider", "Lbo/app/he;", "getSdkEnablementProvider$android_sdk_base_release", "()Lbo/app/he;", "setSdkEnablementProvider$android_sdk_base_release", "(Lbo/app/he;)V", "getSdkEnablementProvider$android_sdk_base_release$annotations", "delayedInitializationProvider", "Lbo/app/u4;", "()Lbo/app/u4;", "setDelayedInitializationProvider$android_sdk_base_release", "(Lbo/app/u4;)V", "getDelayedInitializationProvider$android_sdk_base_release$annotations", "Lcom/braze/IBrazeNotificationFactory;", "customBrazeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getCustomBrazeNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "setCustomBrazeNotificationFactory", "(Lcom/braze/IBrazeNotificationFactory;)V", "getCustomBrazeNotificationFactory$annotations", "Lbo/app/m9;", "staticExternalIEventMessenger", "Lbo/app/m9;", "getStaticExternalIEventMessenger$android_sdk_base_release", "()Lbo/app/m9;", "setStaticExternalIEventMessenger$android_sdk_base_release", "(Lbo/app/m9;)V", "getStaticExternalIEventMessenger$android_sdk_base_release$annotations", "isOffline", "getOutboundNetworkRequestsOffline", "setOutboundNetworkRequestsOffline", "getOutboundNetworkRequestsOffline$annotations", "outboundNetworkRequestsOffline", "isDisabled", "isDisabled$annotations", "isDelayedInitializationEnabled", "isDelayedInitializationEnabled$annotations", "isSdkDisabledOrDelayed", "isSdkDisabledOrDelayed$annotations", "Ljava/util/concurrent/locks/ReentrantLock;", "brazeClassLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "KNOWN_APP_CRAWLER_DEVICE_MODELS", "Ljava/util/Set;", "NECESSARY_BRAZE_SDK_PERMISSIONS", "instance", "Lcom/braze/Braze;", "endpointProviderLock", "Lcom/braze/IBrazeEndpointProvider;", "shouldMockNetworkRequestsAndDropEvents", "Z", "areOutboundNetworkRequestsOffline", "", "pendingConfigurations", "Ljava/util/List;", "clearConfigSentinel", "Lcom/braze/configuration/BrazeConfig;", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$0() {
            return "DelayedInitializationProvider was null. Returning delayed initialization as disabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$1() {
            return "Delayed initialization mode is enabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$0() {
            return "SDK enablement provider was null. Returning SDK as enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$1() {
            return "API key not present. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$2() {
            return "SDK is disabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _set_outboundNetworkRequestsOffline_$lambda$0(boolean z) {
            return "Braze SDK outbound network requests are now ".concat(z ? "disabled" : "enabled");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$0(BrazeConfig brazeConfig) {
            return "Braze.configure() called with configuration: " + brazeConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$1$0() {
            return "Braze.configure() cannot be called while the singleton is still live.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$1$1() {
            return "Braze.configure() called with a null config; Clearing all configuration values.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$0() {
            return "Disabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$1() {
            return "Enabling all network requests";
        }

        public static /* synthetic */ void enableDelayedInitialization$default(Companion companion, Context context, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, int i, Object obj) {
            if ((i & 2) != 0) {
                delayedInitializationAnalyticsBehavior = DelayedInitializationAnalyticsBehavior.QUEUE;
            }
            companion.enableDelayedInitialization(context, delayedInitializationAnalyticsBehavior);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$0() {
            return "Enabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$1() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$2() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$3(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
            return "Failed to enable delayed initialization for behavior " + delayedInitializationAnalyticsBehavior;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$0$0() {
            return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$0$1() {
            return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$1() {
            return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getApiEndpoint$lambda$0$0$0() {
            return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConfiguredApiKey$lambda$0() {
            return "Caught exception while retrieving API key.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInstance$lambda$0$0() {
            return "Created external messenger " + Braze.INSTANCE.getStaticExternalIEventMessenger$android_sdk_base_release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final he getSdkEnablementProvider(Context context) {
            he sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            he heVar = new he(context);
            setSdkEnablementProvider$android_sdk_base_release(heVar);
            return heVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String requestTriggersIfInAppMessageTestPush$lambda$0() {
            return "Push contained key for fetching test triggers, fetching triggers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$0$0(String str, Uri uri) {
            String authority;
            uri.getClass();
            Uri parse = str != null ? Uri.parse(str) : null;
            String scheme = parse != null ? parse.getScheme() : null;
            boolean z = scheme == null || StringsKt.isBlank(scheme) || (authority = parse.getAuthority()) == null || StringsKt.isBlank(authority);
            Uri.Builder builder = new Uri.Builder();
            if (z) {
                builder.scheme(uri.getScheme());
            } else if (parse.getScheme() != null) {
                builder.scheme(parse.getScheme());
            } else {
                builder.scheme(uri.getScheme());
            }
            if (z) {
                builder.encodedAuthority(str);
            } else if (parse.getEncodedAuthority() != null) {
                builder.encodedAuthority(parse.getEncodedAuthority());
            } else {
                builder.encodedAuthority(uri.getEncodedAuthority());
            }
            if (z) {
                builder.path(uri.getPath());
            } else if (parse.getPath() != null) {
                builder.path(parse.getPath() + uri.getPath());
            } else {
                builder.path(uri.getPath());
            }
            return builder.build();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            int i = 1;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(28), 6, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(29), 7, (Object) null);
                return true;
            }
            if (!Boolean.FALSE.equals(braze.getIsApiKeyPresent())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(i), 7, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$0() {
            return "The instance is null. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$1() {
            return "The instance was stopped. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$2() {
            return "No API key was found previously. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$0() {
            return "Shutting down all queued work on the Braze SDK";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$1$0() {
            return "Sending sdk data wipe event to external subscribers";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$1$1() {
            return "Shutting down the singleton work queue";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$2() {
            return "Failed to shutdown queued work on the Braze SDK.";
        }

        public final boolean configure(Context context, BrazeConfig config) {
            context.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda44(config, 1), 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && Boolean.TRUE.equals(braze.getIsApiKeyPresent())) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(26), 6, (Object) null);
                    reentrantLock.unlock();
                    return false;
                }
                if (config != null) {
                    Braze.pendingConfigurations.add(config);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda6(27), 6, (Object) null);
                    Braze.pendingConfigurations.add(Braze.clearConfigSentinel);
                }
                reentrantLock.unlock();
                return true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void disableDelayedInitialization(Context context) {
            context.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(2), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(3), 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
            u4 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release(context);
            delayedInitializationProvider$android_sdk_base_release.b(false);
            delayedInitializationProvider$android_sdk_base_release.a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
            Braze braze = Braze.instance;
            if (braze != null) {
                braze.safeCallFlushDelayedInitPushAnalyticsQueue();
            }
        }

        public final void enableDelayedInitialization(Context context, DelayedInitializationAnalyticsBehavior analyticsBehavior) {
            context.getClass();
            analyticsBehavior.getClass();
            int i = 1;
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda0(22), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda0(23), 6, (Object) null);
                stopInstance$android_sdk_base_release(false);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda0(24), 6, (Object) null);
                setOutboundNetworkRequestsOffline(true);
                getDelayedInitializationProvider$android_sdk_base_release(context).b(analyticsBehavior);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new u4$$ExternalSyntheticLambda2(analyticsBehavior, i), 4, (Object) null);
            }
        }

        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(4), 6, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(5), 6, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        reentrantLock.unlock();
                        return true;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(6), 6, (Object) null);
            return false;
        }

        public final Uri getApiEndpoint(Uri brazeEndpoint) {
            brazeEndpoint.getClass();
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                IBrazeEndpointProvider iBrazeEndpointProvider = Braze.endpointProvider;
                if (iBrazeEndpointProvider != null) {
                    try {
                        Uri apiEndpoint = ((Braze$Companion$$ExternalSyntheticLambda21) iBrazeEndpointProvider).getApiEndpoint(brazeEndpoint);
                        if (apiEndpoint != null) {
                            reentrantLock.unlock();
                            return apiEndpoint;
                        }
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(14), 4, (Object) null);
                    }
                }
                reentrantLock.unlock();
                return brazeEndpoint;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final String getConfiguredApiKey(BrazeConfigurationProvider configurationProvider) {
            configurationProvider.getClass();
            try {
                return configurationProvider.getBrazeApiKey().a;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(12), 4, (Object) null);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        public final u4 getDelayedInitializationProvider$android_sdk_base_release(Context context) {
            context.getClass();
            u4 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release != null) {
                return delayedInitializationProvider$android_sdk_base_release;
            }
            u4 u4Var = new u4(context);
            setDelayedInitializationProvider$android_sdk_base_release(u4Var);
            return u4Var;
        }

        public final Braze getInstance(Context context) {
            context.getClass();
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    Companion companion = Braze.INSTANCE;
                    if (companion.shouldAllowSingletonInitialization()) {
                        if (companion.getStaticExternalIEventMessenger$android_sdk_base_release() == null) {
                            companion.setStaticExternalIEventMessenger$android_sdk_base_release(new r7(new he(context), new u4(context), false));
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(15), 6, (Object) null);
                        }
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        reentrantLock.unlock();
                        return braze;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            Braze braze2 = Braze.instance;
            braze2.getClass();
            return braze2;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final he getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final m9 getStaticExternalIEventMessenger$android_sdk_base_release() {
            return Braze.staticExternalIEventMessenger;
        }

        public final boolean isDelayedInitializationEnabled() {
            u4 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(7), 7, (Object) null);
                return false;
            }
            boolean c = delayedInitializationProvider$android_sdk_base_release.c();
            if (c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(8), 6, (Object) null);
            }
            return c;
        }

        public final boolean isDisabled() {
            he sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(9), 7, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && Boolean.FALSE.equals(braze.getIsApiKeyPresent())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(10), 6, (Object) null);
                return true;
            }
            boolean a = sdkEnablementProvider$android_sdk_base_release.a();
            if (a) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(11), 6, (Object) null);
            }
            return a;
        }

        public final boolean isSdkDisabledOrDelayed() {
            return isDisabled() || isDelayedInitializationEnabled();
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, a9 brazeManager) {
            intent.getClass();
            brazeManager.getClass();
            String stringExtra = intent.getStringExtra("ab_push_fetch_test_triggers_key");
            if (stringExtra == null || !stringExtra.equals("true")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(13), 6, (Object) null);
            kb kbVar = new kb();
            kbVar.b = Boolean.TRUE;
            ((e2) brazeManager).a(kbVar);
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(String configuredCustomEndpoint) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.INSTANCE.setEndpointProvider(new Braze$Companion$$ExternalSyntheticLambda21(configuredCustomEndpoint, 0));
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setDelayedInitializationProvider$android_sdk_base_release(u4 u4Var) {
            Braze.delayedInitializationProvider = u4Var;
        }

        public final void setEndpointProvider(IBrazeEndpointProvider endpointProvider) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = endpointProvider;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setOutboundNetworkRequestsOffline(boolean z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda1(z, 2), 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(he heVar) {
            Braze.sdkEnablementProvider = heVar;
        }

        public final void setStaticExternalIEventMessenger$android_sdk_base_release(m9 m9Var) {
            Braze.staticExternalIEventMessenger = m9Var;
        }

        public final void stopInstance$android_sdk_base_release(boolean clearStorage) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda0(25), 6, (Object) null);
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda0(26), 6, (Object) null);
                        ((r7) braze.getExternalIEventMessenger()).b(new SdkDataWipeEvent(), SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new u4$$ExternalSyntheticLambda0(27), 7, (Object) null);
                        ne.a.a();
                        if (braze.udm != null) {
                            if (clearStorage) {
                                x3 x3Var = ((ah) braze.getUdm$android_sdk_base_release()).y;
                                x3Var.i.clear();
                                x3Var.h.clear();
                                g8 g8Var = ((ah) braze.getUdm$android_sdk_base_release()).w;
                                g8Var.getClass();
                                EmptyList emptyList = EmptyList.INSTANCE;
                                g8Var.f = emptyList;
                                d0 d0Var = ((ah) braze.getUdm$android_sdk_base_release()).x;
                                d0Var.getClass();
                                d0Var.f = emptyList;
                            }
                            k4 k4Var = ((ah) braze.getUdm$android_sdk_base_release()).m;
                            synchronized (k4Var) {
                                k4Var.l = true;
                                k4Var.b();
                                k4Var.f();
                            }
                            u7 u7Var = ((ah) braze.getUdm$android_sdk_base_release()).o;
                            u7Var.b = true;
                            u7Var.a.c = true;
                            ((ah) braze.getUdm$android_sdk_base_release()).u.unregisterGeofences();
                        }
                        braze.getImageLoader().shutdown();
                        braze.isInstanceStopped = true;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new u4$$ExternalSyntheticLambda0(28), 4, (Object) null);
            }
        }

        private Companion() {
        }

        public final u4 getDelayedInitializationProvider$android_sdk_base_release() {
            return Braze.delayedInitializationProvider;
        }
    }

    public void changeUser(String userId) {
        changeUser(userId, null);
    }
}
