package coil3;

import android.content.SharedPreferences;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.AwaiterQueue$Awaiter;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.ParagraphIntrinsicInfo;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import androidx.compose.ui.text.android.LayoutHelper$BidiRun;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.unit.Density;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.api.ApiResult;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import coil3.decode.Decoder;
import coil3.fetch.Fetcher;
import coil3.intercept.Interceptor;
import coil3.map.FileMapper;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.bugsnag.android.ExitInfoKey;
import com.bugsnag.android.ExitInfoPluginStore$PersistentState;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.Logger;
import com.bugsnag.android.Plugin;
import com.datadog.trace.core.util.Matchers;
import com.datadog.trace.util.Strings;
import com.fillr.browsersdk.FillrAuthenticationStore;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.cdf.ContactSkipReason;
import com.squareup.cash.cdf.ContactSyncResult;
import com.squareup.cash.cdf.ContactSyncTriggerReason;
import com.squareup.cash.cdf.ContactSyncType;
import com.squareup.cash.cdf.contact.ContactSyncSendToServer;
import com.squareup.cash.data.contacts.ContactRepository$AliasBySyncState;
import com.squareup.cash.data.contacts.ContactSync$SyncReason;
import com.squareup.cash.data.contacts.ContactsSyncResponse;
import com.squareup.cash.data.contacts.ContactsSyncRoutine;
import com.squareup.cash.data.contacts.ContactsSyncToServerRoutine$fetchSyncRequestDetails$1;
import com.squareup.cash.data.contacts.ContactsSyncToServerRoutine$syncToServer$1;
import com.squareup.cash.data.contacts.ContactsSyncToServerRoutine$writeContactResponseDetails$1;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.contacts.RealContactSyncDetailsRepository;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.Sync_details;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.AliasQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.contacts.AliasQueries$selectForSyncState$2;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.backend.api.PersonalizationRepository;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager$markViewed$1;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SyncContactsRequest;
import com.squareup.protos.franklin.app.SyncContactsResponse;
import com.squareup.protos.franklin.common.SyncedContact;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import papa.SafeTrace;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class ComponentRegistry {
    public final Lazy decoderFactories$delegate;
    public final Lazy fetcherFactories$delegate;
    public final List interceptors;
    public final List keyers;
    public List lazyDecoderFactories;
    public List lazyFetcherFactories;
    public final List mappers;

    public ComponentRegistry(List list, List list2, List list3, List list4, List list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.lazyFetcherFactories = list4;
        this.lazyDecoderFactories = list5;
        final int i = 0;
        this.fetcherFactories$delegate = LazyKt.lazy(new Function0(this) { // from class: coil3.ComponentRegistry$$ExternalSyntheticLambda0
            public final /* synthetic */ ComponentRegistry f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                ComponentRegistry componentRegistry = this.f$0;
                switch (i2) {
                    case 0:
                        List list6 = componentRegistry.lazyFetcherFactories;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            CollectionsKt__MutableCollectionsKt.addAll((List) ((Function0) list6.get(i3)).invoke(), arrayList);
                            i3++;
                        }
                        componentRegistry.lazyFetcherFactories = EmptyList.INSTANCE;
                        return arrayList;
                    default:
                        List list7 = componentRegistry.lazyDecoderFactories;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            CollectionsKt__MutableCollectionsKt.addAll((List) ((Function0) list7.get(i3)).invoke(), arrayList2);
                            i3++;
                        }
                        componentRegistry.lazyDecoderFactories = EmptyList.INSTANCE;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.decoderFactories$delegate = LazyKt.lazy(new Function0(this) { // from class: coil3.ComponentRegistry$$ExternalSyntheticLambda0
            public final /* synthetic */ ComponentRegistry f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                ComponentRegistry componentRegistry = this.f$0;
                switch (i22) {
                    case 0:
                        List list6 = componentRegistry.lazyFetcherFactories;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            CollectionsKt__MutableCollectionsKt.addAll((List) ((Function0) list6.get(i3)).invoke(), arrayList);
                            i3++;
                        }
                        componentRegistry.lazyFetcherFactories = EmptyList.INSTANCE;
                        return arrayList;
                    default:
                        List list7 = componentRegistry.lazyDecoderFactories;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            CollectionsKt__MutableCollectionsKt.addAll((List) ((Function0) list7.get(i3)).invoke(), arrayList2);
                            i3++;
                        }
                        componentRegistry.lazyDecoderFactories = EmptyList.INSTANCE;
                        return arrayList2;
                }
            }
        });
    }

    public final List getDecoderFactories() {
        return (List) this.decoderFactories$delegate.getValue();
    }

    public final List getFetcherFactories() {
        return (List) this.fetcherFactories$delegate.getValue();
    }

    public final class Builder implements ParagraphIntrinsics, ContactsSyncRoutine, PersonalizationRepository {
        public Object interceptors;
        public Object keyers;
        public Object lazyDecoderFactories;
        public Object lazyFetcherFactories;
        public Object mappers;

        public Builder(AnnotatedString annotatedString, TextStyle textStyle, List list, Density density, FontFamilyResolverImpl fontFamilyResolverImpl) {
            int i;
            ArrayList arrayList;
            String str;
            List list2;
            AnnotatedString annotatedString2 = annotatedString;
            TextStyle textStyle2 = textStyle;
            this.mappers = annotatedString2;
            this.keyers = list;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            final int i2 = 0;
            this.lazyFetcherFactories = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$$ExternalSyntheticLambda0
                public final /* synthetic */ ComponentRegistry.Builder f$0;

                {
                    this.f$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v11 */
                /* JADX WARN: Type inference failed for: r0v12 */
                /* JADX WARN: Type inference failed for: r0v15 */
                /* JADX WARN: Type inference failed for: r0v18 */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v9 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i2;
                    float f = RecyclerView.DECELERATION_RATE;
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo = null;
                    int i4 = 1;
                    ComponentRegistry.Builder builder = this.f$0;
                    switch (i3) {
                        case 0:
                            ArrayList arrayList2 = (ArrayList) builder.interceptors;
                            if (!arrayList2.isEmpty()) {
                                ?? r0 = arrayList2.get(0);
                                float minIntrinsicWidth = ((ParagraphIntrinsicInfo) r0).intrinsics.getMinIntrinsicWidth();
                                int size = arrayList2.size() - 1;
                                boolean z = r0;
                                if (1 <= size) {
                                    while (true) {
                                        Object obj = arrayList2.get(i4);
                                        float minIntrinsicWidth2 = ((ParagraphIntrinsicInfo) obj).intrinsics.getMinIntrinsicWidth();
                                        r0 = z;
                                        if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                                            r0 = obj;
                                            minIntrinsicWidth = minIntrinsicWidth2;
                                        }
                                        if (i4 != size) {
                                            i4++;
                                            z = r0;
                                        }
                                    }
                                }
                                paragraphIntrinsicInfo = r0;
                            }
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = paragraphIntrinsicInfo;
                            if (paragraphIntrinsicInfo2 != null) {
                                f = paragraphIntrinsicInfo2.intrinsics.getMinIntrinsicWidth();
                            }
                            return Float.valueOf(f);
                        default:
                            ArrayList arrayList3 = (ArrayList) builder.interceptors;
                            if (!arrayList3.isEmpty()) {
                                ?? r02 = arrayList3.get(0);
                                float maxIntrinsicWidth = ((ParagraphIntrinsicInfo) r02).intrinsics.layoutIntrinsics.getMaxIntrinsicWidth();
                                int size2 = arrayList3.size() - 1;
                                boolean z2 = r02;
                                if (1 <= size2) {
                                    while (true) {
                                        Object obj2 = arrayList3.get(i4);
                                        float maxIntrinsicWidth2 = ((ParagraphIntrinsicInfo) obj2).intrinsics.layoutIntrinsics.getMaxIntrinsicWidth();
                                        r02 = z2;
                                        if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                                            r02 = obj2;
                                            maxIntrinsicWidth = maxIntrinsicWidth2;
                                        }
                                        if (i4 != size2) {
                                            i4++;
                                            z2 = r02;
                                        }
                                    }
                                }
                                paragraphIntrinsicInfo = r02;
                            }
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = paragraphIntrinsicInfo;
                            if (paragraphIntrinsicInfo3 != null) {
                                f = paragraphIntrinsicInfo3.intrinsics.layoutIntrinsics.getMaxIntrinsicWidth();
                            }
                            return Float.valueOf(f);
                    }
                }
            });
            final int i3 = 1;
            this.lazyDecoderFactories = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$$ExternalSyntheticLambda0
                public final /* synthetic */ ComponentRegistry.Builder f$0;

                {
                    this.f$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v11 */
                /* JADX WARN: Type inference failed for: r0v12 */
                /* JADX WARN: Type inference failed for: r0v15 */
                /* JADX WARN: Type inference failed for: r0v18 */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v9 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i3;
                    float f = RecyclerView.DECELERATION_RATE;
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo = null;
                    int i4 = 1;
                    ComponentRegistry.Builder builder = this.f$0;
                    switch (i32) {
                        case 0:
                            ArrayList arrayList2 = (ArrayList) builder.interceptors;
                            if (!arrayList2.isEmpty()) {
                                ?? r0 = arrayList2.get(0);
                                float minIntrinsicWidth = ((ParagraphIntrinsicInfo) r0).intrinsics.getMinIntrinsicWidth();
                                int size = arrayList2.size() - 1;
                                boolean z = r0;
                                if (1 <= size) {
                                    while (true) {
                                        Object obj = arrayList2.get(i4);
                                        float minIntrinsicWidth2 = ((ParagraphIntrinsicInfo) obj).intrinsics.getMinIntrinsicWidth();
                                        r0 = z;
                                        if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                                            r0 = obj;
                                            minIntrinsicWidth = minIntrinsicWidth2;
                                        }
                                        if (i4 != size) {
                                            i4++;
                                            z = r0;
                                        }
                                    }
                                }
                                paragraphIntrinsicInfo = r0;
                            }
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = paragraphIntrinsicInfo;
                            if (paragraphIntrinsicInfo2 != null) {
                                f = paragraphIntrinsicInfo2.intrinsics.getMinIntrinsicWidth();
                            }
                            return Float.valueOf(f);
                        default:
                            ArrayList arrayList3 = (ArrayList) builder.interceptors;
                            if (!arrayList3.isEmpty()) {
                                ?? r02 = arrayList3.get(0);
                                float maxIntrinsicWidth = ((ParagraphIntrinsicInfo) r02).intrinsics.layoutIntrinsics.getMaxIntrinsicWidth();
                                int size2 = arrayList3.size() - 1;
                                boolean z2 = r02;
                                if (1 <= size2) {
                                    while (true) {
                                        Object obj2 = arrayList3.get(i4);
                                        float maxIntrinsicWidth2 = ((ParagraphIntrinsicInfo) obj2).intrinsics.layoutIntrinsics.getMaxIntrinsicWidth();
                                        r02 = z2;
                                        if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                                            r02 = obj2;
                                            maxIntrinsicWidth = maxIntrinsicWidth2;
                                        }
                                        if (i4 != size2) {
                                            i4++;
                                            z2 = r02;
                                        }
                                    }
                                }
                                paragraphIntrinsicInfo = r02;
                            }
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = paragraphIntrinsicInfo;
                            if (paragraphIntrinsicInfo3 != null) {
                                f = paragraphIntrinsicInfo3.intrinsics.layoutIntrinsics.getMaxIntrinsicWidth();
                            }
                            return Float.valueOf(f);
                    }
                }
            });
            ParagraphStyle paragraphStyle = textStyle2.paragraphStyle;
            AnnotatedString annotatedString3 = AnnotatedStringKt.EmptyAnnotatedString;
            ArrayList arrayList2 = annotatedString2.paragraphStylesOrNull;
            String str2 = annotatedString2.text;
            List list3 = (arrayList2 == null || (list3 = CollectionsKt.sortedWith(arrayList2, new AnnotatedString$special$$inlined$sortedBy$1(1))) == null) ? EmptyList.INSTANCE : list3;
            ArrayList arrayList3 = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int size = list3.size();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = 14;
                if (i4 >= size) {
                    while (i5 <= str2.length() && !arrayDeque.isEmpty()) {
                        AnnotatedString.Range range = (AnnotatedString.Range) arrayDeque.last();
                        Object obj = range.item;
                        int i7 = range.end;
                        arrayList3.add(new AnnotatedString.Range(obj, i5, i7));
                        while (!arrayDeque.isEmpty() && i7 == ((AnnotatedString.Range) arrayDeque.last()).end) {
                            arrayDeque.removeLast();
                        }
                        i5 = i7;
                    }
                    if (i5 < str2.length()) {
                        arrayList3.add(new AnnotatedString.Range(paragraphStyle, i5, str2.length()));
                    }
                    if (arrayList3.isEmpty()) {
                        i = 0;
                        arrayList3.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
                    } else {
                        i = 0;
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    int size2 = arrayList3.size();
                    int i8 = i;
                    while (i8 < size2) {
                        AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList3.get(i8);
                        int i9 = range2.start;
                        int i10 = range2.end;
                        String substring = i9 != i10 ? str2.substring(i9, i10) : "";
                        List localAnnotations = AnnotatedStringKt.getLocalAnnotations(annotatedString2, i9, i10, new SaversKt$$ExternalSyntheticLambda2(i6));
                        AnnotatedString annotatedString4 = new AnnotatedString(substring, localAnnotations == null ? EmptyList.INSTANCE : localAnnotations);
                        ParagraphStyle paragraphStyle2 = (ParagraphStyle) range2.item;
                        if (paragraphStyle2.textDirection == 0) {
                            arrayList = arrayList3;
                            str = str2;
                            paragraphStyle2 = new ParagraphStyle(paragraphStyle2.textAlign, paragraphStyle.textDirection, paragraphStyle2.lineHeight, paragraphStyle2.textIndent, paragraphStyle2.platformStyle, paragraphStyle2.lineHeightStyle, paragraphStyle2.lineBreak, paragraphStyle2.hyphens, paragraphStyle2.textMotion);
                        } else {
                            arrayList = arrayList3;
                            str = str2;
                        }
                        TextStyle textStyle3 = new TextStyle(textStyle2.spanStyle, paragraphStyle.merge(paragraphStyle2));
                        List list4 = annotatedString4.annotations;
                        List list5 = list4 == null ? EmptyList.INSTANCE : list4;
                        List list6 = (List) this.keyers;
                        ArrayList arrayList5 = new ArrayList(list6.size());
                        int size3 = list6.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            AnnotatedString.Range range3 = (AnnotatedString.Range) list6.get(i11);
                            int i12 = range3.start;
                            ParagraphStyle paragraphStyle3 = paragraphStyle;
                            int i13 = range3.end;
                            if (AnnotatedStringKt.intersect(i9, i10, i12, i13)) {
                                if (i9 > i12 || i13 > i10) {
                                    InlineClassHelperKt.throwIllegalArgumentException("placeholder can not overlap with paragraph.");
                                }
                                list2 = list6;
                                arrayList5.add(new AnnotatedString.Range(range3.item, i12 - i9, i13 - i9));
                            } else {
                                list2 = list6;
                            }
                            i11++;
                            list6 = list2;
                            paragraphStyle = paragraphStyle3;
                        }
                        arrayList4.add(new ParagraphIntrinsicInfo(new AndroidParagraphIntrinsics(substring, textStyle3, list5, arrayList5, fontFamilyResolverImpl, density), i9, i10));
                        i8++;
                        annotatedString2 = annotatedString;
                        textStyle2 = textStyle;
                        str2 = str;
                        arrayList3 = arrayList;
                        i6 = 14;
                    }
                    this.interceptors = arrayList4;
                    return;
                }
                AnnotatedString.Range range4 = (AnnotatedString.Range) list3.get(i4);
                AnnotatedString.Range copy$default = AnnotatedString.Range.copy$default(range4, paragraphStyle.merge((ParagraphStyle) range4.item), i2, i2, 14);
                Object obj2 = copy$default.item;
                int i14 = copy$default.end;
                int i15 = copy$default.start;
                while (i5 < i15 && !arrayDeque.isEmpty()) {
                    AnnotatedString.Range range5 = (AnnotatedString.Range) arrayDeque.last();
                    int i16 = range5.end;
                    List list7 = list3;
                    Object obj3 = range5.item;
                    if (i15 < i16) {
                        arrayList3.add(new AnnotatedString.Range(obj3, i5, i15));
                        i5 = i15;
                        list3 = list7;
                    } else {
                        int i17 = size;
                        arrayList3.add(new AnnotatedString.Range(obj3, i5, i16));
                        i5 = range5.end;
                        while (!arrayDeque.isEmpty() && i5 == ((AnnotatedString.Range) arrayDeque.last()).end) {
                            arrayDeque.removeLast();
                        }
                        list3 = list7;
                        size = i17;
                    }
                }
                List list8 = list3;
                int i18 = size;
                if (i5 < i15) {
                    arrayList3.add(new AnnotatedString.Range(paragraphStyle, i5, i15));
                    i5 = i15;
                }
                AnnotatedString.Range range6 = (AnnotatedString.Range) arrayDeque.lastOrNull();
                if (range6 != null) {
                    int i19 = range6.end;
                    Object obj4 = range6.item;
                    int i20 = range6.start;
                    if (i20 == i15 && i19 == i14) {
                        arrayDeque.removeLast();
                        arrayDeque.addLast(new AnnotatedString.Range(((ParagraphStyle) obj4).merge((ParagraphStyle) obj2), i15, i14));
                    } else if (i20 == i19) {
                        arrayList3.add(new AnnotatedString.Range(obj4, i20, i19));
                        arrayDeque.removeLast();
                        arrayDeque.addLast(new AnnotatedString.Range(obj2, i15, i14));
                    } else {
                        if (i19 < i14) {
                            Path$$ExternalSyntheticBUOutline0.m$3();
                            throw null;
                        }
                        arrayDeque.addLast(new AnnotatedString.Range(((ParagraphStyle) obj4).merge((ParagraphStyle) obj2), i15, i14));
                    }
                } else {
                    arrayDeque.addLast(new AnnotatedString.Range(obj2, i15, i14));
                }
                i4++;
                list3 = list8;
                size = i18;
                i2 = 0;
            }
        }

        public static Builder createInstance(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            Builder builder = new Builder();
            builder.lazyFetcherFactories = new java.util.ArrayDeque();
            builder.interceptors = sharedPreferences;
            builder.mappers = "topic_operation_queue";
            builder.keyers = ",";
            builder.lazyDecoderFactories = scheduledThreadPoolExecutor;
            synchronized (((java.util.ArrayDeque) builder.lazyFetcherFactories)) {
                try {
                    ((java.util.ArrayDeque) builder.lazyFetcherFactories).clear();
                    String string2 = ((SharedPreferences) builder.interceptors).getString((String) builder.mappers, "");
                    if (!TextUtils.isEmpty(string2) && string2.contains((String) builder.keyers)) {
                        String[] split = string2.split((String) builder.keyers, -1);
                        if (split.length == 0) {
                            Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                        }
                        for (String str : split) {
                            if (!TextUtils.isEmpty(str)) {
                                ((java.util.ArrayDeque) builder.lazyFetcherFactories).add(str);
                            }
                        }
                        return builder;
                    }
                    return builder;
                } finally {
                }
            }
        }

        public static ExitInfoPluginStore$PersistentState parsePersistentState(JSONObject jSONObject) {
            int i = jSONObject.getInt("pid");
            Long longOrNull = StringsKt.toLongOrNull(jSONObject.optString("timestamp"));
            long longValue = longOrNull != null ? longOrNull.longValue() : System.currentTimeMillis();
            JSONArray jSONArray = jSONObject.getJSONArray("exitInfoKeys");
            HashSet hashSet = new HashSet(jSONArray.length());
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                hashSet.add(new ExitInfoKey(Integer.parseInt(jSONObject2.getString("pid")), Long.parseLong(jSONObject2.getString("timestamp"))));
            }
            return new ExitInfoPluginStore$PersistentState(i, longValue, hashSet);
        }

        public static ArrayList toByteStringList(Collection collection) {
            Collection<String> collection2 = collection;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
            for (String str : collection2) {
                ByteString.Companion companion = ByteString.Companion;
                arrayList.add(ByteString.Companion.decodeHex(str));
            }
            return arrayList;
        }

        public void add(Fetcher.Factory factory, KClass kClass) {
            ((ArrayList) this.lazyFetcherFactories).add(new ComponentRegistry$Builder$$ExternalSyntheticLambda3(0, factory, kClass));
        }

        public CancellationHandle addAwaiter(AwaiterQueue$Awaiter awaiterQueue$Awaiter, Function0 function0) {
            int i;
            int i2;
            int i3;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = -1;
            synchronized (this.interceptors) {
                Throwable th = (Throwable) this.mappers;
                if (th != null) {
                    awaiterQueue$Awaiter.resumeWithException(th);
                    return CancellationHandle.Companion.Empty;
                }
                AtomicInt atomicInt = (AtomicInt) this.keyers;
                do {
                    i = atomicInt.get();
                    i2 = i + 1;
                } while (!atomicInt.compareAndSet(i, i2));
                boolean z = (134217727 & i2) == 1;
                ref$IntRef.element = (i2 >>> 27) & 15;
                ((MutableObjectList) this.lazyFetcherFactories).add(awaiterQueue$Awaiter);
                if (z && function0 != null) {
                    try {
                        function0.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.interceptors) {
                            try {
                                if (((Throwable) this.mappers) == null) {
                                    this.mappers = th2;
                                    MutableObjectList mutableObjectList = (MutableObjectList) this.lazyFetcherFactories;
                                    Object[] objArr = mutableObjectList.content;
                                    int i4 = mutableObjectList._size;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        ((AwaiterQueue$Awaiter) objArr[i5]).resumeWithException(th2);
                                    }
                                    ((MutableObjectList) this.lazyFetcherFactories).clear();
                                    AtomicInt atomicInt2 = (AtomicInt) this.keyers;
                                    do {
                                        i3 = atomicInt2.get();
                                    } while (!atomicInt2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
                return new WorkLauncherImpl(new LaunchTracker$$ExternalSyntheticLambda0(2, awaiterQueue$Awaiter, this, ref$IntRef));
            }
        }

        public void addExitInfoKey(ExitInfoKey exitInfoKey) {
            ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState = (ExitInfoPluginStore$PersistentState) this.lazyDecoderFactories;
            this.lazyDecoderFactories = new ExitInfoPluginStore$PersistentState(exitInfoPluginStore$PersistentState.pid, exitInfoPluginStore$PersistentState.timestamp, SetsKt___SetsKt.plus(exitInfoPluginStore$PersistentState.processedExitInfoKeys, exitInfoKey));
            persist();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
        
            if (r6.getRunCount() == 1) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Bidi analyzeBidi(int i) {
            Bidi bidi;
            Layout layout = (Layout) this.keyers;
            ArrayList arrayList = (ArrayList) this.interceptors;
            ArrayList arrayList2 = (ArrayList) this.mappers;
            boolean[] zArr = (boolean[]) this.lazyFetcherFactories;
            if (zArr[i]) {
                return (Bidi) arrayList2.get(i);
            }
            int intValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
            int intValue2 = ((Number) arrayList.get(i)).intValue();
            int i2 = intValue2 - intValue;
            char[] cArr = (char[]) this.lazyDecoderFactories;
            if (cArr == null || cArr.length < i2) {
                cArr = new char[i2];
            }
            char[] cArr2 = cArr;
            TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
            if (Bidi.requiresBidi(cArr2, 0, i2)) {
                bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(getParagraphStart(i))) == -1 ? 1 : 0);
            }
            bidi = null;
            arrayList2.set(i, bidi);
            zArr[i] = true;
            if (bidi != null) {
                char[] cArr3 = (char[]) this.lazyDecoderFactories;
                cArr2 = cArr2 == cArr3 ? null : cArr3;
            }
            this.lazyDecoderFactories = cArr2;
            return bidi;
        }

        public ComponentRegistry build() {
            return new ComponentRegistry(BundleKt.toImmutableList((ArrayList) this.interceptors), BundleKt.toImmutableList((ArrayList) this.mappers), BundleKt.toImmutableList((ArrayList) this.keyers), BundleKt.toImmutableList((ArrayList) this.lazyFetcherFactories), BundleKt.toImmutableList((ArrayList) this.lazyDecoderFactories));
        }

        @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
        public Object cacheTopResources(ReleaseState releaseState, MusicPresenter$models$3$1 musicPresenter$models$3$1) {
            Object cacheTopResources = ((RealPersonalizationRepository) this.interceptors).cacheTopResources(releaseState, musicPresenter$models$3$1);
            return cacheTopResources == CoroutineSingletons.COROUTINE_SUSPENDED ? cacheTopResources : Unit.INSTANCE;
        }

        @Override // com.squareup.cash.data.contacts.ContactsSyncRoutine
        public Object contactsSync(List list, ContactSync$SyncReason contactSync$SyncReason, ContinuationImpl continuationImpl) {
            return syncToServer(contactSync$SyncReason, continuationImpl);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Serializable fetchSyncRequestDetails(ContinuationImpl continuationImpl) {
            ContactsSyncToServerRoutine$fetchSyncRequestDetails$1 contactsSyncToServerRoutine$fetchSyncRequestDetails$1;
            int i;
            ContactRepository$AliasBySyncState contactRepository$AliasBySyncState;
            if (continuationImpl instanceof ContactsSyncToServerRoutine$fetchSyncRequestDetails$1) {
                contactsSyncToServerRoutine$fetchSyncRequestDetails$1 = (ContactsSyncToServerRoutine$fetchSyncRequestDetails$1) continuationImpl;
                int i2 = contactsSyncToServerRoutine$fetchSyncRequestDetails$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    contactsSyncToServerRoutine$fetchSyncRequestDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = contactsSyncToServerRoutine$fetchSyncRequestDetails$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = contactsSyncToServerRoutine$fetchSyncRequestDetails$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        InstrumentQueries instrumentQueries = ((RealContactRepository) this.interceptors).aliasQueries;
                        AliasSyncState aliasSyncState = AliasSyncState.NEW;
                        AliasSyncState aliasSyncState2 = AliasSyncState.REMOVED;
                        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AliasSyncState[]{aliasSyncState, aliasSyncState2});
                        instrumentQueries.getClass();
                        listOf.getClass();
                        AliasQueries$selectForSyncState$2 aliasQueries$selectForSyncState$2 = AliasQueries$selectForSyncState$2.INSTANCE;
                        List executeAsList = new PinsQueries.Get_pinQuery(instrumentQueries, listOf, new AliasQueries$$ExternalSyntheticLambda0(instrumentQueries, 0)).executeAsList();
                        ContactRepository$AliasBySyncState contactRepository$AliasBySyncState2 = new ContactRepository$AliasBySyncState(RealContactRepository.hashedListBy(executeAsList, aliasSyncState), RealContactRepository.hashedListBy(executeAsList, aliasSyncState2));
                        RealContactSyncDetailsRepository realContactSyncDetailsRepository = (RealContactSyncDetailsRepository) this.mappers;
                        contactsSyncToServerRoutine$fetchSyncRequestDetails$1.L$0 = contactRepository$AliasBySyncState2;
                        contactsSyncToServerRoutine$fetchSyncRequestDetails$1.label = 1;
                        Sync_details fetchDetails = realContactSyncDetailsRepository.fetchDetails();
                        obj = fetchDetails != null ? fetchDetails.getSync_token() : null;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        contactRepository$AliasBySyncState = contactRepository$AliasBySyncState2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        contactRepository$AliasBySyncState = contactsSyncToServerRoutine$fetchSyncRequestDetails$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return new Pair(contactRepository$AliasBySyncState, obj);
                }
            }
            contactsSyncToServerRoutine$fetchSyncRequestDetails$1 = new ContactsSyncToServerRoutine$fetchSyncRequestDetails$1(this, continuationImpl);
            Object obj2 = contactsSyncToServerRoutine$fetchSyncRequestDetails$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = contactsSyncToServerRoutine$fetchSyncRequestDetails$1.label;
            if (i != 0) {
            }
            return new Pair(contactRepository$AliasBySyncState, obj2);
        }

        public void flushAndDispatchAwaiters(Function1 function1) {
            int i;
            synchronized (this.interceptors) {
                try {
                    MutableObjectList mutableObjectList = (MutableObjectList) this.lazyFetcherFactories;
                    this.lazyFetcherFactories = (MutableObjectList) this.lazyDecoderFactories;
                    this.lazyDecoderFactories = mutableObjectList;
                    AtomicInt atomicInt = (AtomicInt) this.keyers;
                    do {
                        i = atomicInt.get();
                    } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                    int i2 = mutableObjectList._size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        function1.invoke(mutableObjectList.get(i3));
                    }
                    mutableObjectList.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public float getDownstreamHorizontal(int i, boolean z) {
            Layout layout = (Layout) this.keyers;
            int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
            if (i > lineEnd) {
                i = lineEnd;
            }
            return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
        }

        @Override // androidx.compose.ui.text.ParagraphIntrinsics
        public boolean getHasStaleResolvedFonts() {
            ArrayList arrayList = (ArrayList) this.interceptors;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ParagraphIntrinsicInfo) arrayList.get(i)).intrinsics.getHasStaleResolvedFonts()) {
                    return true;
                }
            }
            return false;
        }

        public float getHorizontalPosition(int i, boolean z, boolean z2) {
            int i2;
            int i3;
            Layout layout = (Layout) this.keyers;
            if (!z2) {
                return getDownstreamHorizontal(i, z);
            }
            int lineForOffset = LayoutCompat_androidKt.getLineForOffset(layout, i, z2);
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (i != lineStart && i != lineEnd) {
                return getDownstreamHorizontal(i, z);
            }
            if (i == 0 || i == layout.getText().length()) {
                return getDownstreamHorizontal(i, z);
            }
            int paragraphForOffset = getParagraphForOffset(i, z2);
            boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(getParagraphStart(paragraphForOffset))) == -1;
            int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd, lineStart);
            int paragraphStart = getParagraphStart(paragraphForOffset);
            int i4 = lineStart - paragraphStart;
            int i5 = lineEndToVisibleEnd - paragraphStart;
            Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
            Bidi createLineBidi = analyzeBidi != null ? analyzeBidi.createLineBidi(i4, i5) : null;
            if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
                boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
                if (z || z3 == isRtlCharAt) {
                    z3 = !z3;
                }
                return i == lineStart ? z3 : !z3 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
            }
            int runCount = createLineBidi.getRunCount();
            LayoutHelper$BidiRun[] layoutHelper$BidiRunArr = new LayoutHelper$BidiRun[runCount];
            for (int i6 = 0; i6 < runCount; i6++) {
                layoutHelper$BidiRunArr[i6] = new LayoutHelper$BidiRun(createLineBidi.getRunStart(i6) + lineStart, createLineBidi.getRunLimit(i6) + lineStart, createLineBidi.getRunLevel(i6) % 2 == 1);
            }
            int runCount2 = createLineBidi.getRunCount();
            byte[] bArr = new byte[runCount2];
            for (int i7 = 0; i7 < runCount2; i7++) {
                bArr[i7] = (byte) createLineBidi.getRunLevel(i7);
            }
            Bidi.reorderVisually(bArr, 0, layoutHelper$BidiRunArr, 0, runCount);
            if (i == lineStart) {
                int i8 = 0;
                while (true) {
                    if (i8 >= runCount) {
                        i3 = -1;
                        break;
                    }
                    if (layoutHelper$BidiRunArr[i8].getStart() == i) {
                        i3 = i8;
                        break;
                    }
                    i8++;
                }
                boolean z4 = (z || z3 == layoutHelper$BidiRunArr[i3].isRtl()) ? !z3 : z3;
                return (i3 == 0 && z4) ? layout.getLineLeft(lineForOffset) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(layoutHelper$BidiRunArr[i3 - 1].getStart()) : layout.getPrimaryHorizontal(layoutHelper$BidiRunArr[i3 + 1].getStart()) : layout.getLineRight(lineForOffset);
            }
            int lineEndToVisibleEnd2 = i > lineEndToVisibleEnd ? lineEndToVisibleEnd(i, lineStart) : i;
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i2 = -1;
                    break;
                }
                if (layoutHelper$BidiRunArr[i9].getEnd() == lineEndToVisibleEnd2) {
                    i2 = i9;
                    break;
                }
                i9++;
            }
            boolean z5 = (z || z3 == layoutHelper$BidiRunArr[i2].isRtl()) ? z3 : !z3;
            return (i2 == 0 && z5) ? layout.getLineLeft(lineForOffset) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(layoutHelper$BidiRunArr[i2 - 1].getEnd()) : layout.getPrimaryHorizontal(layoutHelper$BidiRunArr[i2 + 1].getEnd()) : layout.getLineRight(lineForOffset);
        }

        @Override // androidx.compose.ui.text.ParagraphIntrinsics
        public float getMaxIntrinsicWidth() {
            return ((Number) ((Lazy) this.lazyDecoderFactories).getValue()).floatValue();
        }

        @Override // androidx.compose.ui.text.ParagraphIntrinsics
        public float getMinIntrinsicWidth() {
            return ((Number) ((Lazy) this.lazyFetcherFactories).getValue()).floatValue();
        }

        public int getParagraphForOffset(int i, boolean z) {
            ArrayList arrayList = (ArrayList) this.interceptors;
            int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(arrayList, Integer.valueOf(i));
            int i2 = binarySearch$default < 0 ? -(binarySearch$default + 1) : binarySearch$default + 1;
            if (z && i2 > 0) {
                int i3 = i2 - 1;
                if (i == ((Number) arrayList.get(i3)).intValue()) {
                    return i3;
                }
            }
            return i2;
        }

        public int getParagraphStart(int i) {
            if (i == 0) {
                return 0;
            }
            return ((Number) ((ArrayList) this.interceptors).get(i - 1)).intValue();
        }

        public Plugin instantiatePlugin(String str, boolean z) {
            Logger logger = (Logger) this.mappers;
            try {
                Object newInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
                newInstance.getClass();
                return (Plugin) newInstance;
            } catch (ClassNotFoundException unused) {
                if (z) {
                    logger.d("Plugin '" + str + "' is not on the classpath - functionality will not be enabled.");
                }
                return null;
            } catch (Throwable th) {
                logger.e("Failed to load plugin '" + str + '\'', th);
                return null;
            }
        }

        public int lineEndToVisibleEnd(int i, int i2) {
            while (i > i2) {
                char charAt = ((Layout) this.keyers).getText().charAt(i - 1);
                if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.compare((int) charAt, PKIFailureInfo.certRevoked) < 0 || Intrinsics.compare((int) charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                    return i;
                }
                i--;
            }
            return i;
        }

        @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
        public MoneyTabPresenter$models$lambda$31$$inlined$map$1 loadBackgrounds(boolean z) {
            return ((RealPersonalizationRepository) this.interceptors).loadBackgrounds(z);
        }

        @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
        public Object loadCachedBackgrounds(RingtoneView$playRingtone$1 ringtoneView$playRingtone$1) {
            return ((RealPersonalizationRepository) this.interceptors).loadCachedBackgrounds(ringtoneView$playRingtone$1);
        }

        @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
        public Object loadCachedStickers(RingtoneView$playRingtone$1 ringtoneView$playRingtone$1) {
            return ((RealPersonalizationRepository) this.interceptors).loadCachedStickers(ringtoneView$playRingtone$1);
        }

        @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
        public Flow loadPersonalizedTransaction(String str) {
            return ((RealPersonalizationRepository) this.interceptors).loadPersonalizedTransaction(str);
        }

        @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
        public MoneyTabPresenter$models$lambda$31$$inlined$map$1 loadStickers() {
            return ((RealPersonalizationRepository) this.interceptors).loadStickers();
        }

        @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
        public Object markPaymentPersonalizationRead(String str, RealPersonalizePaymentManager$markViewed$1 realPersonalizePaymentManager$markViewed$1) {
            Object markPaymentPersonalizationRead = ((RealPersonalizationRepository) this.interceptors).markPaymentPersonalizationRead(str, realPersonalizePaymentManager$markViewed$1);
            return markPaymentPersonalizationRead == CoroutineSingletons.COROUTINE_SUSPENDED ? markPaymentPersonalizationRead : Unit.INSTANCE;
        }

        public void persist() {
            BufferedWriter bufferedWriter;
            File file = (File) this.interceptors;
            ((ReentrantReadWriteLock) this.keyers).writeLock().lock();
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), PKIFailureInfo.certRevoked);
            } finally {
                try {
                } finally {
                }
            }
            try {
                JsonStream jsonStream = new JsonStream(bufferedWriter);
                try {
                    ((ExitInfoPluginStore$PersistentState) this.lazyDecoderFactories).toStream(jsonStream);
                    jsonStream.close();
                    bufferedWriter.close();
                } finally {
                }
            } finally {
            }
        }

        @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
        public Object refreshPersonalizationResources(ContinuationImpl continuationImpl) {
            return JobKt.withContext((CoroutineContext) this.keyers, new MusicPresenter$models$3$1(this, null, 16), continuationImpl);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0286, code lost:
        
            r7 = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02a0  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02a7  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x014f  */
        /* JADX WARN: Type inference failed for: r8v24 */
        /* JADX WARN: Type inference failed for: r8v26 */
        /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v7, types: [app.cash.api.ApiResult, com.squareup.cash.cdf.ContactSyncTriggerReason, com.squareup.cash.cdf.ContactSyncType, com.squareup.cash.data.contacts.ContactRepository$AliasBySyncState, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x021f -> B:12:0x0221). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object syncToServer(ContactSync$SyncReason contactSync$SyncReason, ContinuationImpl continuationImpl) {
            ContactsSyncToServerRoutine$syncToServer$1 contactsSyncToServerRoutine$syncToServer$1;
            Builder builder;
            int i;
            ContactSync$SyncReason contactSync$SyncReason2;
            ContactSync$SyncReason contactSync$SyncReason3;
            Builder builder2;
            ContactRepository$AliasBySyncState contactRepository$AliasBySyncState;
            long j;
            ContactSyncTriggerReason contactSyncTriggerReason;
            String str;
            ContactSyncType contactSyncType;
            Builder builder3;
            boolean z;
            boolean z2;
            String m;
            String str2;
            ContactSyncResult syncResult;
            boolean z3;
            boolean z4;
            String str3;
            ContactSyncTriggerReason cdfTriggerReason;
            Object syncContacts;
            Serializable fetchSyncRequestDetails;
            if (continuationImpl instanceof ContactsSyncToServerRoutine$syncToServer$1) {
                contactsSyncToServerRoutine$syncToServer$1 = (ContactsSyncToServerRoutine$syncToServer$1) continuationImpl;
                int i2 = contactsSyncToServerRoutine$syncToServer$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    contactsSyncToServerRoutine$syncToServer$1.label = i2 - PKIFailureInfo.systemUnavail;
                    builder = this;
                    Object obj = contactsSyncToServerRoutine$syncToServer$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = contactsSyncToServerRoutine$syncToServer$1.label;
                    int i3 = 2;
                    boolean z5 = true;
                    ?? r8 = 1;
                    ?? r9 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        contactSync$SyncReason2 = contactSync$SyncReason;
                        contactsSyncToServerRoutine$syncToServer$1.L$0 = contactSync$SyncReason2;
                        contactsSyncToServerRoutine$syncToServer$1.L$1 = builder;
                        contactsSyncToServerRoutine$syncToServer$1.L$2 = r9;
                        contactsSyncToServerRoutine$syncToServer$1.L$3 = r9;
                        contactsSyncToServerRoutine$syncToServer$1.L$4 = r9;
                        contactsSyncToServerRoutine$syncToServer$1.L$5 = r9;
                        contactsSyncToServerRoutine$syncToServer$1.L$6 = r9;
                        contactsSyncToServerRoutine$syncToServer$1.label = z5 ? 1 : 0;
                        fetchSyncRequestDetails = builder.fetchSyncRequestDetails(contactsSyncToServerRoutine$syncToServer$1);
                        if (fetchSyncRequestDetails != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        builder = contactsSyncToServerRoutine$syncToServer$1.L$1;
                        ContactSync$SyncReason contactSync$SyncReason4 = contactsSyncToServerRoutine$syncToServer$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        contactSync$SyncReason3 = contactSync$SyncReason4;
                        builder2 = builder;
                        Pair pair = (Pair) obj;
                        contactRepository$AliasBySyncState = (ContactRepository$AliasBySyncState) pair.first;
                        str3 = (String) pair.second;
                        cdfTriggerReason = Strings.toCdfTriggerReason(contactSync$SyncReason3);
                        if (str3 != null) {
                        }
                        if (str3 == null) {
                        }
                        Matchers.trackContactSyncStart((Analytics) builder2.lazyDecoderFactories, cdfTriggerReason, new Integer(((ArrayList) contactRepository$AliasBySyncState.getAdded()).size()), new Integer(((ArrayList) contactRepository$AliasBySyncState.getRemoved()).size()), contactSyncType);
                        j = ((AndroidClock) builder2.lazyFetcherFactories).millis();
                        AppService appService = (AppService) builder2.keyers;
                        SyncContactsRequest syncContactsRequest = new SyncContactsRequest(str3, toByteStringList(contactRepository$AliasBySyncState.getAdded()), toByteStringList(contactRepository$AliasBySyncState.getRemoved()), ByteString.EMPTY);
                        contactsSyncToServerRoutine$syncToServer$1.L$0 = contactSync$SyncReason3;
                        contactsSyncToServerRoutine$syncToServer$1.L$1 = builder2;
                        contactsSyncToServerRoutine$syncToServer$1.L$2 = contactRepository$AliasBySyncState;
                        contactsSyncToServerRoutine$syncToServer$1.L$3 = str3;
                        contactsSyncToServerRoutine$syncToServer$1.L$4 = cdfTriggerReason;
                        contactsSyncToServerRoutine$syncToServer$1.L$5 = contactSyncType;
                        contactsSyncToServerRoutine$syncToServer$1.J$0 = j;
                        contactsSyncToServerRoutine$syncToServer$1.label = i3;
                        syncContacts = appService.syncContacts(syncContactsRequest, contactsSyncToServerRoutine$syncToServer$1);
                        if (syncContacts != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i == 2) {
                        j = contactsSyncToServerRoutine$syncToServer$1.J$0;
                        contactSyncType = contactsSyncToServerRoutine$syncToServer$1.L$5;
                        ContactSyncTriggerReason contactSyncTriggerReason2 = contactsSyncToServerRoutine$syncToServer$1.L$4;
                        String str4 = contactsSyncToServerRoutine$syncToServer$1.L$3;
                        contactRepository$AliasBySyncState = contactsSyncToServerRoutine$syncToServer$1.L$2;
                        builder2 = contactsSyncToServerRoutine$syncToServer$1.L$1;
                        contactSync$SyncReason3 = contactsSyncToServerRoutine$syncToServer$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        contactSyncTriggerReason = contactSyncTriggerReason2;
                        str = str4;
                        ContactSyncType contactSyncType2 = contactSyncType;
                        ContactRepository$AliasBySyncState contactRepository$AliasBySyncState2 = contactRepository$AliasBySyncState;
                        builder3 = builder2;
                        long j2 = j;
                        ApiResult apiResult = (ApiResult) obj;
                        AndroidClock androidClock = (AndroidClock) builder3.lazyFetcherFactories;
                        Analytics analytics = (Analytics) builder3.lazyDecoderFactories;
                        double millis = (androidClock.millis() - j2) / 1000.0d;
                        ContactSyncSendToServer.ServerResponse serverResponse = Strings.toServerResponse(apiResult);
                        z = apiResult instanceof ApiResult.Success;
                        if (z) {
                        }
                        syncResult = Strings.toSyncResult(serverResponse);
                        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                        String str5 = str2;
                        z3 = z2;
                        Matchers.trackContactSyncComplete(analytics, contactSyncTriggerReason, contactSyncType2, syncResult, str5, new Double(millis));
                        if (Strings.isNetworkError(syncResult)) {
                        }
                        ContactSyncSendToServer.SyncLogicType syncLogicType = ContactSyncSendToServer.SyncLogicType.LEGACY;
                        Matchers.trackContactSyncSendToServer(analytics, Boolean.valueOf(str != null), new Integer(((ArrayList) contactRepository$AliasBySyncState2.getAdded()).size()), new Integer(((ArrayList) contactRepository$AliasBySyncState2.getRemoved()).size()), new Double(millis), serverResponse, ContactSyncSendToServer.SyncLogicType.LEGACY, str5);
                        if (!z3) {
                        }
                        z4 = false;
                        if (z3) {
                        }
                    } else {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ApiResult apiResult2 = contactsSyncToServerRoutine$syncToServer$1.L$6;
                        str = contactsSyncToServerRoutine$syncToServer$1.L$3;
                        Builder builder4 = contactsSyncToServerRoutine$syncToServer$1.L$1;
                        ContactSync$SyncReason contactSync$SyncReason5 = contactsSyncToServerRoutine$syncToServer$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                        builder3 = builder4;
                        contactSync$SyncReason2 = contactSync$SyncReason5;
                        ApiResult apiResult3 = apiResult2;
                        z4 = false;
                        if (str == null) {
                            ApiResult.Success success = (ApiResult.Success) apiResult3;
                            if (!((SyncContactsResponse) success.response).add_contacts.isEmpty()) {
                                List list = ((SyncContactsResponse) success.response).add_contacts;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    if (Intrinsics.areEqual(((SyncedContact) obj2).is_cash_customer, Boolean.FALSE)) {
                                        arrayList.add(obj2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    Analytics analytics2 = (Analytics) builder3.lazyDecoderFactories;
                                    if (!arrayList.isEmpty()) {
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            if (((SyncedContact) it.next()).hashed_alias_id != null) {
                                                break;
                                            }
                                        }
                                    }
                                    boolean z6 = z4;
                                    Matchers.trackContactSyncCompleteFreshSync(analytics2, Boolean.valueOf(z6));
                                }
                            }
                        }
                        if (((SyncContactsResponse) ((ApiResult.Success) apiResult3).response).sync_token == null) {
                            builder = builder3;
                            coroutineSingletons = coroutineSingletons3;
                            i3 = 2;
                            z5 = true;
                            r9 = 0;
                            contactsSyncToServerRoutine$syncToServer$1.L$0 = contactSync$SyncReason2;
                            contactsSyncToServerRoutine$syncToServer$1.L$1 = builder;
                            contactsSyncToServerRoutine$syncToServer$1.L$2 = r9;
                            contactsSyncToServerRoutine$syncToServer$1.L$3 = r9;
                            contactsSyncToServerRoutine$syncToServer$1.L$4 = r9;
                            contactsSyncToServerRoutine$syncToServer$1.L$5 = r9;
                            contactsSyncToServerRoutine$syncToServer$1.L$6 = r9;
                            contactsSyncToServerRoutine$syncToServer$1.label = z5 ? 1 : 0;
                            fetchSyncRequestDetails = builder.fetchSyncRequestDetails(contactsSyncToServerRoutine$syncToServer$1);
                            if (fetchSyncRequestDetails != coroutineSingletons) {
                                contactSync$SyncReason3 = contactSync$SyncReason2;
                                obj = fetchSyncRequestDetails;
                                r8 = z5;
                                builder2 = builder;
                                Pair pair2 = (Pair) obj;
                                contactRepository$AliasBySyncState = (ContactRepository$AliasBySyncState) pair2.first;
                                str3 = (String) pair2.second;
                                cdfTriggerReason = Strings.toCdfTriggerReason(contactSync$SyncReason3);
                                contactSyncType = str3 != null ? ContactSyncType.FRESH : ContactSyncType.INCREMENTAL;
                                if (str3 == null && contactRepository$AliasBySyncState.isEmpty()) {
                                    Analytics analytics3 = (Analytics) builder2.lazyDecoderFactories;
                                    ContactSkipReason contactSkipReason = ContactSkipReason.EMPTY_CONTACTS;
                                    Matchers.trackContactSyncSkip(analytics3, contactSyncType);
                                    Analytics analytics4 = (Analytics) builder2.lazyDecoderFactories;
                                    ContactSyncType contactSyncType3 = ContactSyncType.INCREMENTAL;
                                    ContactSyncResult contactSyncResult = ContactSyncResult.SUCCESS;
                                    Matchers.trackContactSyncComplete(analytics4, cdfTriggerReason, ContactSyncType.INCREMENTAL, ContactSyncResult.REQUEST_SKIPPED, null, null);
                                    return new ContactsSyncResponse.Success((boolean) r8, (int) r8);
                                }
                                Matchers.trackContactSyncStart((Analytics) builder2.lazyDecoderFactories, cdfTriggerReason, new Integer(((ArrayList) contactRepository$AliasBySyncState.getAdded()).size()), new Integer(((ArrayList) contactRepository$AliasBySyncState.getRemoved()).size()), contactSyncType);
                                j = ((AndroidClock) builder2.lazyFetcherFactories).millis();
                                AppService appService2 = (AppService) builder2.keyers;
                                SyncContactsRequest syncContactsRequest2 = new SyncContactsRequest(str3, toByteStringList(contactRepository$AliasBySyncState.getAdded()), toByteStringList(contactRepository$AliasBySyncState.getRemoved()), ByteString.EMPTY);
                                contactsSyncToServerRoutine$syncToServer$1.L$0 = contactSync$SyncReason3;
                                contactsSyncToServerRoutine$syncToServer$1.L$1 = builder2;
                                contactsSyncToServerRoutine$syncToServer$1.L$2 = contactRepository$AliasBySyncState;
                                contactsSyncToServerRoutine$syncToServer$1.L$3 = str3;
                                contactsSyncToServerRoutine$syncToServer$1.L$4 = cdfTriggerReason;
                                contactsSyncToServerRoutine$syncToServer$1.L$5 = contactSyncType;
                                contactsSyncToServerRoutine$syncToServer$1.J$0 = j;
                                contactsSyncToServerRoutine$syncToServer$1.label = i3;
                                syncContacts = appService2.syncContacts(syncContactsRequest2, contactsSyncToServerRoutine$syncToServer$1);
                                if (syncContacts != coroutineSingletons) {
                                    contactSyncTriggerReason = cdfTriggerReason;
                                    str = str3;
                                    obj = syncContacts;
                                    ContactSyncType contactSyncType22 = contactSyncType;
                                    ContactRepository$AliasBySyncState contactRepository$AliasBySyncState22 = contactRepository$AliasBySyncState;
                                    builder3 = builder2;
                                    long j22 = j;
                                    ApiResult apiResult4 = (ApiResult) obj;
                                    AndroidClock androidClock2 = (AndroidClock) builder3.lazyFetcherFactories;
                                    Analytics analytics5 = (Analytics) builder3.lazyDecoderFactories;
                                    double millis2 = (androidClock2.millis() - j22) / 1000.0d;
                                    ContactSyncSendToServer.ServerResponse serverResponse2 = Strings.toServerResponse(apiResult4);
                                    z = apiResult4 instanceof ApiResult.Success;
                                    if (z) {
                                        z2 = z;
                                        str2 = null;
                                    } else {
                                        if (apiResult4 instanceof ApiResult.Failure.NetworkFailure) {
                                            ApiResult.Failure.NetworkFailure networkFailure = (ApiResult.Failure.NetworkFailure) apiResult4;
                                            Throwable th = networkFailure.error;
                                            z2 = z;
                                            m = !(th instanceof SocketTimeoutException) ? th instanceof ConnectException ? "Network Failure: Failed To Connect" : networkFailure.toString() : "Network Failure: Socket Timeout";
                                        } else {
                                            z2 = z;
                                            if (!(apiResult4 instanceof ApiResult.Failure.HttpFailure)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult4).code, "Http Failure: ");
                                        }
                                        str2 = m;
                                    }
                                    syncResult = Strings.toSyncResult(serverResponse2);
                                    CoroutineSingletons coroutineSingletons22 = coroutineSingletons;
                                    String str52 = str2;
                                    z3 = z2;
                                    Matchers.trackContactSyncComplete(analytics5, contactSyncTriggerReason, contactSyncType22, syncResult, str52, new Double(millis2));
                                    if (Strings.isNetworkError(syncResult)) {
                                        Matchers.trackContactSyncNetworkError(analytics5, contactSyncTriggerReason, str52, contactSyncType22);
                                    }
                                    ContactSyncSendToServer.SyncLogicType syncLogicType2 = ContactSyncSendToServer.SyncLogicType.LEGACY;
                                    Matchers.trackContactSyncSendToServer(analytics5, Boolean.valueOf(str != null), new Integer(((ArrayList) contactRepository$AliasBySyncState22.getAdded()).size()), new Integer(((ArrayList) contactRepository$AliasBySyncState22.getRemoved()).size()), new Double(millis2), serverResponse2, ContactSyncSendToServer.SyncLogicType.LEGACY, str52);
                                    if (!z3 && ((SyncContactsResponse) ((ApiResult.Success) apiResult4).response).status == SyncContactsResponse.Status.TOO_MANY_ATTEMPTS) {
                                        return new ContactsSyncResponse.Success(false, 2);
                                    }
                                    z4 = false;
                                    if (z3) {
                                        return FillrAuthenticationStore.isDeviceAttestationFailure(apiResult4) ? new ContactsSyncResponse.Failure((ApiResult.Failure) apiResult4, true) : apiResult4 instanceof ApiResult.Failure ? new ContactsSyncResponse.Failure((ApiResult.Failure) apiResult4, 2) : new ContactsSyncResponse.Failure((ApiResult.Failure) null, 3);
                                    }
                                    SyncContactsResponse syncContactsResponse = (SyncContactsResponse) ((ApiResult.Success) apiResult4).response;
                                    contactsSyncToServerRoutine$syncToServer$1.L$0 = contactSync$SyncReason3;
                                    contactsSyncToServerRoutine$syncToServer$1.L$1 = builder3;
                                    contactsSyncToServerRoutine$syncToServer$1.L$2 = null;
                                    contactsSyncToServerRoutine$syncToServer$1.L$3 = str;
                                    contactsSyncToServerRoutine$syncToServer$1.L$4 = null;
                                    contactsSyncToServerRoutine$syncToServer$1.L$5 = null;
                                    contactsSyncToServerRoutine$syncToServer$1.L$6 = apiResult4;
                                    contactsSyncToServerRoutine$syncToServer$1.J$0 = j22;
                                    contactsSyncToServerRoutine$syncToServer$1.label = 3;
                                    coroutineSingletons3 = coroutineSingletons22;
                                    if (builder3.writeContactResponseDetails(contactRepository$AliasBySyncState22, syncContactsResponse, contactsSyncToServerRoutine$syncToServer$1) == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    apiResult3 = apiResult4;
                                    contactSync$SyncReason2 = contactSync$SyncReason3;
                                    if (str == null) {
                                    }
                                    if (((SyncContactsResponse) ((ApiResult.Success) apiResult3).response).sync_token == null) {
                                        return new ContactsSyncResponse.Success(true, (int) (true ? 1 : 0));
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                }
            }
            builder = this;
            contactsSyncToServerRoutine$syncToServer$1 = new ContactsSyncToServerRoutine$syncToServer$1(builder, continuationImpl);
            Object obj3 = contactsSyncToServerRoutine$syncToServer$1.result;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = contactsSyncToServerRoutine$syncToServer$1.label;
            int i32 = 2;
            boolean z52 = true;
            ?? r82 = 1;
            ?? r92 = 0;
            if (i != 0) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object writeContactResponseDetails(ContactRepository$AliasBySyncState contactRepository$AliasBySyncState, SyncContactsResponse syncContactsResponse, ContinuationImpl continuationImpl) {
            ContactsSyncToServerRoutine$writeContactResponseDetails$1 contactsSyncToServerRoutine$writeContactResponseDetails$1;
            int i;
            List list;
            boolean z;
            final RealContactRepository realContactRepository = (RealContactRepository) this.interceptors;
            if (continuationImpl instanceof ContactsSyncToServerRoutine$writeContactResponseDetails$1) {
                contactsSyncToServerRoutine$writeContactResponseDetails$1 = (ContactsSyncToServerRoutine$writeContactResponseDetails$1) continuationImpl;
                int i2 = contactsSyncToServerRoutine$writeContactResponseDetails$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    contactsSyncToServerRoutine$writeContactResponseDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = contactsSyncToServerRoutine$writeContactResponseDetails$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = contactsSyncToServerRoutine$writeContactResponseDetails$1.label;
                    final int i3 = 0;
                    final int i4 = 1;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealContactSyncDetailsRepository realContactSyncDetailsRepository = (RealContactSyncDetailsRepository) this.mappers;
                        String str = syncContactsResponse.sync_token;
                        contactsSyncToServerRoutine$writeContactResponseDetails$1.L$0 = contactRepository$AliasBySyncState;
                        contactsSyncToServerRoutine$writeContactResponseDetails$1.L$1 = syncContactsResponse;
                        contactsSyncToServerRoutine$writeContactResponseDetails$1.label = 1;
                        SessionQueries sessionQueries = realContactSyncDetailsRepository.syncDetailsQueries;
                        sessionQueries.driver.execute(-435297063, "UPDATE sync_details\nSET sync_token = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 6));
                        sessionQueries.notifyQueries(-435297063, new InstrumentQueries$$ExternalSyntheticLambda2(22, null == true ? 1 : 0));
                        if (Unit.INSTANCE == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        syncContactsResponse = contactsSyncToServerRoutine$writeContactResponseDetails$1.L$1;
                        contactRepository$AliasBySyncState = contactsSyncToServerRoutine$writeContactResponseDetails$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    list = syncContactsResponse.add_contacts;
                    if (!list.isEmpty()) {
                        List list2 = list;
                        final ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (Intrinsics.areEqual(((SyncedContact) obj2).is_cash_customer, Boolean.TRUE)) {
                                arrayList.add(obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            realContactRepository.customerQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.data.contacts.RealContactRepository$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    SyncedContact syncedContact;
                                    int i5 = i4;
                                    RealContactRepository realContactRepository2 = realContactRepository;
                                    ArrayList arrayList2 = arrayList;
                                    switch (i5) {
                                        case 0:
                                            ((TransactionWrapper) obj3).getClass();
                                            Iterator it = arrayList2.iterator();
                                            while (it.hasNext()) {
                                                SyncedContact syncedContact2 = (SyncedContact) it.next();
                                                ByteString byteString = syncedContact2.hashed_alias;
                                                if (byteString != null) {
                                                    String hex = byteString.hex();
                                                    String str2 = syncedContact2.hashed_alias_id;
                                                    if (str2 != null) {
                                                        realContactRepository2.aliasQueries.updateHashedAliasId(str2, hex);
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            final RewardSlotQueries rewardSlotQueries = realContactRepository2.customerQueries;
                                            ((TransactionWrapper) obj3).getClass();
                                            Iterator it2 = arrayList2.iterator();
                                            while (it2.hasNext()) {
                                                SyncedContact syncedContact3 = (SyncedContact) it2.next();
                                                InstrumentQueries instrumentQueries = realContactRepository2.aliasQueries;
                                                String str3 = syncedContact3.customer_token;
                                                Country country = syncedContact3.country_code;
                                                Boolean bool = syncedContact3.is_verified_account;
                                                Boolean bool2 = syncedContact3.is_business;
                                                Boolean bool3 = syncedContact3.is_cash_customer;
                                                Boolean bool4 = syncedContact3.can_accept_payments;
                                                String str4 = syncedContact3.photo_url;
                                                str3.getClass();
                                                Image image = str4 != null ? new Image(str4, str4, 4) : null;
                                                final String str5 = syncedContact3.cashtag;
                                                final String str6 = syncedContact3.display_name;
                                                Iterator it3 = it2;
                                                boolean booleanValue = bool4 != null ? bool4.booleanValue() : false;
                                                Boolean bool5 = Boolean.FALSE;
                                                final boolean z2 = !Intrinsics.areEqual(bool3, bool5);
                                                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                                boolean booleanValue3 = bool != null ? bool.booleanValue() : false;
                                                final Image image2 = image;
                                                final Long l = syncedContact3.credit_card_fee_bps;
                                                final BlockState blockState = BlockState.NOT_BLOCKED;
                                                Region region = country != null ? Countries.toRegion(country) : null;
                                                rewardSlotQueries.getClass();
                                                blockState.getClass();
                                                RealContactRepository realContactRepository3 = realContactRepository2;
                                                final boolean z3 = booleanValue;
                                                final boolean z4 = booleanValue3;
                                                final boolean z5 = booleanValue2;
                                                final Region region2 = region;
                                                final String str7 = str3;
                                                final RewardSlotQueries rewardSlotQueries2 = rewardSlotQueries;
                                                rewardSlotQueries = rewardSlotQueries2;
                                                rewardSlotQueries.driver.execute(2120243581, "INSERT OR IGNORE INTO customer (customer_id, photo, cashtag, customer_display_name,\n  can_accept_payments, is_square, is_cash_customer, is_business, is_verified, credit_card_fee,\n  blocked, region, joined_on, is_special_customer)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj4) {
                                                        AndroidStatement androidStatement = (AndroidStatement) obj4;
                                                        androidStatement.getClass();
                                                        androidStatement.bindString(0, str7);
                                                        Image image3 = image2;
                                                        RewardSlotQueries rewardSlotQueries3 = rewardSlotQueries2;
                                                        androidStatement.bindBytes(1, image3 != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).lazyFetcherFactories).encode(image3) : null);
                                                        androidStatement.bindString(2, str5);
                                                        androidStatement.bindString(3, str6);
                                                        androidStatement.bindBoolean(4, Boolean.valueOf(z3));
                                                        Boolean bool6 = Boolean.FALSE;
                                                        androidStatement.bindBoolean(5, bool6);
                                                        androidStatement.bindBoolean(6, Boolean.valueOf(z2));
                                                        androidStatement.bindBoolean(7, Boolean.valueOf(z5));
                                                        androidStatement.bindBoolean(8, Boolean.valueOf(z4));
                                                        androidStatement.bindLong(9, l);
                                                        androidStatement.bindString(10, (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).interceptors).encode(blockState));
                                                        Region region3 = region2;
                                                        androidStatement.bindString(11, region3 != null ? (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).keyers).encode(region3) : null);
                                                        androidStatement.bindLong(12, null);
                                                        androidStatement.bindBoolean(13, bool6);
                                                        return Unit.INSTANCE;
                                                    }
                                                });
                                                rewardSlotQueries.notifyQueries(2120243581, new ContactQueries$$ExternalSyntheticLambda1(12));
                                                int i6 = 13;
                                                if (realContactRepository3.noRowsWereModified()) {
                                                    Image image3 = str4 != null ? new Image(str4, str4, 4) : null;
                                                    syncedContact = syncedContact3;
                                                    final String str8 = syncedContact.cashtag;
                                                    final String str9 = syncedContact.display_name;
                                                    final boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                                                    final boolean z6 = !Intrinsics.areEqual(bool3, bool5);
                                                    final boolean booleanValue5 = bool2 != null ? bool2.booleanValue() : false;
                                                    final boolean booleanValue6 = bool != null ? bool.booleanValue() : false;
                                                    final Long l2 = syncedContact.credit_card_fee_bps;
                                                    final Region region3 = country != null ? Countries.toRegion(country) : null;
                                                    rewardSlotQueries.getClass();
                                                    SqlDriver sqlDriver = rewardSlotQueries.driver;
                                                    final Image image4 = image3;
                                                    Function1 function1 = new Function1() { // from class: com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj4) {
                                                            AndroidStatement androidStatement = (AndroidStatement) obj4;
                                                            androidStatement.getClass();
                                                            Image image5 = Image.this;
                                                            RewardSlotQueries rewardSlotQueries3 = rewardSlotQueries;
                                                            androidStatement.bindBytes(0, image5 != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).lazyFetcherFactories).encode(image5) : null);
                                                            androidStatement.bindString(1, str8);
                                                            androidStatement.bindString(2, str9);
                                                            androidStatement.bindBoolean(3, Boolean.valueOf(booleanValue4));
                                                            androidStatement.bindBoolean(4, Boolean.FALSE);
                                                            androidStatement.bindBoolean(5, Boolean.valueOf(z6));
                                                            androidStatement.bindBoolean(6, Boolean.valueOf(booleanValue5));
                                                            androidStatement.bindBoolean(7, Boolean.valueOf(booleanValue6));
                                                            androidStatement.bindLong(8, l2);
                                                            Region region4 = region3;
                                                            androidStatement.bindString(9, region4 != null ? (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).keyers).encode(region4) : null);
                                                            androidStatement.bindString(10, str7);
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    str7 = str7;
                                                    sqlDriver.execute(-873757232, "UPDATE customer\nSET photo = ?, cashtag = ?, customer_display_name = ?, can_accept_payments = ?, is_square = ?, is_cash_customer = ?,\n    is_business = ?, is_verified = ?, credit_card_fee = ?, region = ?\nWHERE customer_id = ?", function1);
                                                    rewardSlotQueries.notifyQueries(-873757232, new ContactQueries$$ExternalSyntheticLambda1(13));
                                                } else {
                                                    syncedContact = syncedContact3;
                                                }
                                                ByteString byteString2 = syncedContact.hashed_alias;
                                                if (byteString2 != null) {
                                                    String hex2 = byteString2.hex();
                                                    instrumentQueries.getClass();
                                                    hex2.getClass();
                                                    instrumentQueries.driver.execute(-34340507, "UPDATE alias\nSET customer_id = ?\nWHERE hashed_alias = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str7, hex2, i6));
                                                    instrumentQueries.notifyQueries(-34340507, new WebLoginConfigQueries$$ExternalSyntheticLambda2(14, false));
                                                    String str10 = syncedContact.hashed_alias_id;
                                                    if (str10 != null) {
                                                        instrumentQueries.updateHashedAliasId(str10, hex2);
                                                    }
                                                }
                                                it2 = it3;
                                                realContactRepository2 = realContactRepository3;
                                            }
                                            ContactQueries contactQueries = realContactRepository2.contactQueries;
                                            contactQueries.driver.execute(1079844937, "UPDATE contact SET has_multiple_customers = lookup_key IN customer_contact", null);
                                            contactQueries.notifyQueries(1079844937, new ContactQueries$$ExternalSyntheticLambda1(2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        final ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (Intrinsics.areEqual(((SyncedContact) obj3).is_cash_customer, Boolean.FALSE)) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            Analytics analytics = (Analytics) this.lazyDecoderFactories;
                            if (!arrayList2.isEmpty()) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    if (((SyncedContact) it.next()).hashed_alias_id != null) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            z = false;
                            Matchers.trackContactSyncPersistNonCustomers(analytics, Boolean.valueOf(z));
                            realContactRepository.aliasQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.data.contacts.RealContactRepository$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj32) {
                                    SyncedContact syncedContact;
                                    int i5 = i3;
                                    RealContactRepository realContactRepository2 = realContactRepository;
                                    ArrayList arrayList22 = arrayList2;
                                    switch (i5) {
                                        case 0:
                                            ((TransactionWrapper) obj32).getClass();
                                            Iterator it2 = arrayList22.iterator();
                                            while (it2.hasNext()) {
                                                SyncedContact syncedContact2 = (SyncedContact) it2.next();
                                                ByteString byteString = syncedContact2.hashed_alias;
                                                if (byteString != null) {
                                                    String hex = byteString.hex();
                                                    String str2 = syncedContact2.hashed_alias_id;
                                                    if (str2 != null) {
                                                        realContactRepository2.aliasQueries.updateHashedAliasId(str2, hex);
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            final RewardSlotQueries rewardSlotQueries = realContactRepository2.customerQueries;
                                            ((TransactionWrapper) obj32).getClass();
                                            Iterator it22 = arrayList22.iterator();
                                            while (it22.hasNext()) {
                                                SyncedContact syncedContact3 = (SyncedContact) it22.next();
                                                InstrumentQueries instrumentQueries = realContactRepository2.aliasQueries;
                                                String str3 = syncedContact3.customer_token;
                                                Country country = syncedContact3.country_code;
                                                Boolean bool = syncedContact3.is_verified_account;
                                                Boolean bool2 = syncedContact3.is_business;
                                                Boolean bool3 = syncedContact3.is_cash_customer;
                                                Boolean bool4 = syncedContact3.can_accept_payments;
                                                String str4 = syncedContact3.photo_url;
                                                str3.getClass();
                                                Image image = str4 != null ? new Image(str4, str4, 4) : null;
                                                final String str5 = syncedContact3.cashtag;
                                                final String str6 = syncedContact3.display_name;
                                                Iterator it3 = it22;
                                                boolean booleanValue = bool4 != null ? bool4.booleanValue() : false;
                                                Boolean bool5 = Boolean.FALSE;
                                                final boolean z2 = !Intrinsics.areEqual(bool3, bool5);
                                                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                                boolean booleanValue3 = bool != null ? bool.booleanValue() : false;
                                                final Image image2 = image;
                                                final Long l = syncedContact3.credit_card_fee_bps;
                                                final BlockState blockState = BlockState.NOT_BLOCKED;
                                                Region region = country != null ? Countries.toRegion(country) : null;
                                                rewardSlotQueries.getClass();
                                                blockState.getClass();
                                                RealContactRepository realContactRepository3 = realContactRepository2;
                                                final boolean z3 = booleanValue;
                                                final boolean z4 = booleanValue3;
                                                final boolean z5 = booleanValue2;
                                                final Region region2 = region;
                                                final String str7 = str3;
                                                final RewardSlotQueries rewardSlotQueries2 = rewardSlotQueries;
                                                rewardSlotQueries = rewardSlotQueries2;
                                                rewardSlotQueries.driver.execute(2120243581, "INSERT OR IGNORE INTO customer (customer_id, photo, cashtag, customer_display_name,\n  can_accept_payments, is_square, is_cash_customer, is_business, is_verified, credit_card_fee,\n  blocked, region, joined_on, is_special_customer)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj4) {
                                                        AndroidStatement androidStatement = (AndroidStatement) obj4;
                                                        androidStatement.getClass();
                                                        androidStatement.bindString(0, str7);
                                                        Image image3 = image2;
                                                        RewardSlotQueries rewardSlotQueries3 = rewardSlotQueries2;
                                                        androidStatement.bindBytes(1, image3 != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).lazyFetcherFactories).encode(image3) : null);
                                                        androidStatement.bindString(2, str5);
                                                        androidStatement.bindString(3, str6);
                                                        androidStatement.bindBoolean(4, Boolean.valueOf(z3));
                                                        Boolean bool6 = Boolean.FALSE;
                                                        androidStatement.bindBoolean(5, bool6);
                                                        androidStatement.bindBoolean(6, Boolean.valueOf(z2));
                                                        androidStatement.bindBoolean(7, Boolean.valueOf(z5));
                                                        androidStatement.bindBoolean(8, Boolean.valueOf(z4));
                                                        androidStatement.bindLong(9, l);
                                                        androidStatement.bindString(10, (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).interceptors).encode(blockState));
                                                        Region region3 = region2;
                                                        androidStatement.bindString(11, region3 != null ? (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).keyers).encode(region3) : null);
                                                        androidStatement.bindLong(12, null);
                                                        androidStatement.bindBoolean(13, bool6);
                                                        return Unit.INSTANCE;
                                                    }
                                                });
                                                rewardSlotQueries.notifyQueries(2120243581, new ContactQueries$$ExternalSyntheticLambda1(12));
                                                int i6 = 13;
                                                if (realContactRepository3.noRowsWereModified()) {
                                                    Image image3 = str4 != null ? new Image(str4, str4, 4) : null;
                                                    syncedContact = syncedContact3;
                                                    final String str8 = syncedContact.cashtag;
                                                    final String str9 = syncedContact.display_name;
                                                    final boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                                                    final boolean z6 = !Intrinsics.areEqual(bool3, bool5);
                                                    final boolean booleanValue5 = bool2 != null ? bool2.booleanValue() : false;
                                                    final boolean booleanValue6 = bool != null ? bool.booleanValue() : false;
                                                    final Long l2 = syncedContact.credit_card_fee_bps;
                                                    final Region region3 = country != null ? Countries.toRegion(country) : null;
                                                    rewardSlotQueries.getClass();
                                                    SqlDriver sqlDriver = rewardSlotQueries.driver;
                                                    final Image image4 = image3;
                                                    Function1 function1 = new Function1() { // from class: com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj4) {
                                                            AndroidStatement androidStatement = (AndroidStatement) obj4;
                                                            androidStatement.getClass();
                                                            Image image5 = Image.this;
                                                            RewardSlotQueries rewardSlotQueries3 = rewardSlotQueries;
                                                            androidStatement.bindBytes(0, image5 != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).lazyFetcherFactories).encode(image5) : null);
                                                            androidStatement.bindString(1, str8);
                                                            androidStatement.bindString(2, str9);
                                                            androidStatement.bindBoolean(3, Boolean.valueOf(booleanValue4));
                                                            androidStatement.bindBoolean(4, Boolean.FALSE);
                                                            androidStatement.bindBoolean(5, Boolean.valueOf(z6));
                                                            androidStatement.bindBoolean(6, Boolean.valueOf(booleanValue5));
                                                            androidStatement.bindBoolean(7, Boolean.valueOf(booleanValue6));
                                                            androidStatement.bindLong(8, l2);
                                                            Region region4 = region3;
                                                            androidStatement.bindString(9, region4 != null ? (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) rewardSlotQueries3.rewardSlotAdapter).keyers).encode(region4) : null);
                                                            androidStatement.bindString(10, str7);
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    str7 = str7;
                                                    sqlDriver.execute(-873757232, "UPDATE customer\nSET photo = ?, cashtag = ?, customer_display_name = ?, can_accept_payments = ?, is_square = ?, is_cash_customer = ?,\n    is_business = ?, is_verified = ?, credit_card_fee = ?, region = ?\nWHERE customer_id = ?", function1);
                                                    rewardSlotQueries.notifyQueries(-873757232, new ContactQueries$$ExternalSyntheticLambda1(13));
                                                } else {
                                                    syncedContact = syncedContact3;
                                                }
                                                ByteString byteString2 = syncedContact.hashed_alias;
                                                if (byteString2 != null) {
                                                    String hex2 = byteString2.hex();
                                                    instrumentQueries.getClass();
                                                    hex2.getClass();
                                                    instrumentQueries.driver.execute(-34340507, "UPDATE alias\nSET customer_id = ?\nWHERE hashed_alias = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str7, hex2, i6));
                                                    instrumentQueries.notifyQueries(-34340507, new WebLoginConfigQueries$$ExternalSyntheticLambda2(14, false));
                                                    String str10 = syncedContact.hashed_alias_id;
                                                    if (str10 != null) {
                                                        instrumentQueries.updateHashedAliasId(str10, hex2);
                                                    }
                                                }
                                                it22 = it3;
                                                realContactRepository2 = realContactRepository3;
                                            }
                                            ContactQueries contactQueries = realContactRepository2.contactQueries;
                                            contactQueries.driver.execute(1079844937, "UPDATE contact SET has_multiple_customers = lookup_key IN customer_contact", null);
                                            contactQueries.notifyQueries(1079844937, new ContactQueries$$ExternalSyntheticLambda1(2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    }
                    if (!contactRepository$AliasBySyncState.getRemoved().isEmpty()) {
                        final List removed = contactRepository$AliasBySyncState.getRemoved();
                        InstrumentQueries instrumentQueries = realContactRepository.aliasQueries;
                        final Object[] objArr = null == true ? 1 : 0;
                        instrumentQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.data.contacts.RealContactRepository$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i5 = objArr;
                                RealContactRepository realContactRepository2 = realContactRepository;
                                List list3 = removed;
                                ((TransactionWrapper) obj4).getClass();
                                switch (i5) {
                                    case 0:
                                        CollectionsKt.chunked(list3, 100, new RealContactRepository$$ExternalSyntheticLambda5(realContactRepository2, 2));
                                        break;
                                    default:
                                        CollectionsKt.chunked(list3, 100, new RealContactRepository$$ExternalSyntheticLambda5(realContactRepository2, 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    if (!contactRepository$AliasBySyncState.getAdded().isEmpty()) {
                        final List added = contactRepository$AliasBySyncState.getAdded();
                        realContactRepository.aliasQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.data.contacts.RealContactRepository$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i5 = i4;
                                RealContactRepository realContactRepository2 = realContactRepository;
                                List list3 = added;
                                ((TransactionWrapper) obj4).getClass();
                                switch (i5) {
                                    case 0:
                                        CollectionsKt.chunked(list3, 100, new RealContactRepository$$ExternalSyntheticLambda5(realContactRepository2, 2));
                                        break;
                                    default:
                                        CollectionsKt.chunked(list3, 100, new RealContactRepository$$ExternalSyntheticLambda5(realContactRepository2, 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    return Unit.INSTANCE;
                }
            }
            contactsSyncToServerRoutine$writeContactResponseDetails$1 = new ContactsSyncToServerRoutine$writeContactResponseDetails$1(this, continuationImpl);
            Object obj4 = contactsSyncToServerRoutine$writeContactResponseDetails$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = contactsSyncToServerRoutine$writeContactResponseDetails$1.label;
            final int i32 = 0;
            final int i42 = 1;
            if (i != 0) {
            }
            list = syncContactsResponse.add_contacts;
            if (!list.isEmpty()) {
            }
            if (!contactRepository$AliasBySyncState.getRemoved().isEmpty()) {
            }
            if (!contactRepository$AliasBySyncState.getAdded().isEmpty()) {
            }
            return Unit.INSTANCE;
        }

        public void add(FileMapper fileMapper, KClass kClass) {
            ((ArrayList) this.mappers).add(new Pair(fileMapper, kClass));
        }

        public void add(Interceptor interceptor) {
            ((ArrayList) this.interceptors).add(interceptor);
        }

        public void add(Decoder.Factory factory) {
            ((ArrayList) this.lazyDecoderFactories).add(new ComponentRegistry$Builder$$ExternalSyntheticLambda0(factory, 0));
        }

        public /* synthetic */ Builder(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            this.interceptors = obj;
            this.mappers = obj2;
            this.keyers = obj3;
            this.lazyFetcherFactories = obj4;
            this.lazyDecoderFactories = obj5;
        }

        public Builder(int i) {
            switch (i) {
                case 1:
                    this.interceptors = new Object();
                    this.keyers = new AtomicInt(0);
                    this.lazyFetcherFactories = new MutableObjectList();
                    this.lazyDecoderFactories = new MutableObjectList();
                    break;
                default:
                    this.interceptors = new ArrayList();
                    this.mappers = new ArrayList();
                    this.keyers = new ArrayList();
                    this.lazyFetcherFactories = new ArrayList();
                    this.lazyDecoderFactories = new ArrayList();
                    break;
            }
        }
    }
}
