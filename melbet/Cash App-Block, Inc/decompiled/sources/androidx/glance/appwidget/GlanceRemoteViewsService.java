package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.glance.appwidget.ContentReceiver;
import androidx.glance.session.SessionManagerImpl;
import androidx.glance.session.SessionManagerKt;
import androidx.paging.FlowExtKt$simpleScan$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkHeaders;
import com.squareup.cash.R;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class GlanceRemoteViewsService extends RemoteViewsService {
    public static final NetworkHeaders.Builder InMemoryStore = new NetworkHeaders.Builder();

    public final class GlanceRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
        public final int appWidgetId;
        public final GlanceRemoteViewsService context;
        public final String size;
        public final int viewId;

        public GlanceRemoteViewsFactory(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
            this.context = glanceRemoteViewsService;
            this.appWidgetId = i;
            this.viewId = i2;
            this.size = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
        
            if (r12.join(r0) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (r12 != null) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object access$startSessionIfNeededAndWaitUntilReady(GlanceRemoteViewsFactory glanceRemoteViewsFactory, AppWidgetId appWidgetId, ContinuationImpl continuationImpl) {
            GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1 glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1;
            int i;
            CashQrWidget cashQrWidget;
            ComponentName componentName;
            String className;
            Job job;
            if (continuationImpl instanceof GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1) {
                glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1 = (GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1) continuationImpl;
                int i2 = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(glanceRemoteViewsFactory.context).getAppWidgetInfo(glanceRemoteViewsFactory.appWidgetId);
                        if (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) {
                            cashQrWidget = null;
                        } else {
                            Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                            newInstance.getClass();
                            cashQrWidget = ((CashQrWidgetReceiver) newInstance).glanceAppWidget;
                        }
                        if (cashQrWidget != null) {
                            SessionManagerImpl sessionManagerImpl = SessionManagerKt.GlanceSessionManager;
                            FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(glanceRemoteViewsFactory, appWidgetId, cashQrWidget, continuation, 20);
                            glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.L$0 = glanceRemoteViewsFactory;
                            glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.label = 1;
                            obj = sessionManagerImpl.runWithLock(flowExtKt$simpleScan$1, glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1);
                            if (obj != coroutineSingletons) {
                                glanceRemoteViewsFactory = glanceRemoteViewsFactory;
                            }
                            return coroutineSingletons;
                        }
                        ContentReceiver.Key key = UnmanagedSessionReceiver.Companion;
                        ContentReceiver.Key.getSession(glanceRemoteViewsFactory.appWidgetId);
                        job = null;
                        if (job != null) {
                        }
                    } else if (i == 1) {
                        glanceRemoteViewsFactory = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        job = (Job) obj;
                        if (job != null) {
                            return Unit.INSTANCE;
                        }
                        glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.L$0 = null;
                        glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.label = 3;
                    }
                    job = (Job) obj;
                }
            }
            glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1 = new GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1(glanceRemoteViewsFactory, continuationImpl);
            Object obj2 = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1.label;
            Continuation continuation2 = null;
            if (i != 0) {
            }
            job = (Job) obj2;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getCount() {
            return items().ids.length;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final long getItemId(int i) {
            try {
                return items().ids[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final RemoteViews getViewAt(int i) {
            try {
                return items().views[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.context.getPackageName(), R.layout.glance_invalid_list_item);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getViewTypeCount() {
            return items()._viewTypeCount;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final boolean hasStableIds() {
            items().getClass();
            return false;
        }

        public final RemoteCollectionItems items() {
            RemoteCollectionItems remoteCollectionItems;
            NetworkHeaders.Builder builder = GlanceRemoteViewsService.InMemoryStore;
            int i = this.appWidgetId;
            int i2 = this.viewId;
            String str = this.size;
            NetworkHeaders.Builder builder2 = GlanceRemoteViewsService.InMemoryStore;
            synchronized (builder2) {
                remoteCollectionItems = (RemoteCollectionItems) builder2.data.get(NetworkHeaders.Builder.key(i, i2, str));
                if (remoteCollectionItems == null) {
                    remoteCollectionItems = RemoteCollectionItems.Empty;
                }
            }
            return remoteCollectionItems;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onCreate() {
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDataSetChanged() {
            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new ThumbNode$onAttach$1(this, (Continuation) null, 29));
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDestroy() {
            NetworkHeaders.Builder builder = GlanceRemoteViewsService.InMemoryStore;
            int i = this.appWidgetId;
            int i2 = this.viewId;
            String str = this.size;
            NetworkHeaders.Builder builder2 = GlanceRemoteViewsService.InMemoryStore;
            synchronized (builder2) {
                builder2.data.remove(NetworkHeaders.Builder.key(i, i2, str));
            }
        }
    }

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            a$$ExternalSyntheticBUOutline0.m$1("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            a$$ExternalSyntheticBUOutline0.m$1("No view id was present in the intent");
            return null;
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra != null && stringExtra.length() != 0) {
            return new GlanceRemoteViewsFactory(this, intExtra, intExtra2, stringExtra);
        }
        a$$ExternalSyntheticBUOutline0.m$1("No size info was present in the intent");
        return null;
    }
}
