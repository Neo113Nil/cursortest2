package ru.yandex.video.m3.player.report;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.h42;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q801;
import defpackage.r801;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$logOnTracksChanged$1", f = "CodecReportEventLogger.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CodecReportEventLogger$logOnTracksChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ h42 $eventTime;
    final /* synthetic */ r801 $tracks;
    int label;
    final /* synthetic */ CodecReportEventLogger this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$logOnTracksChanged$1$1", f = "CodecReportEventLogger.kt", l = {HProv.PP_VERSION_TIMESTAMP, HProv.PP_FAST_CODE, 147, 165, 179, 181}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.player.report.CodecReportEventLogger$logOnTracksChanged$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ h42 $eventTime;
        final /* synthetic */ r801 $tracks;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CodecReportEventLogger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CodecReportEventLogger codecReportEventLogger, r801 r801Var, h42 h42Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = codecReportEventLogger;
            this.$tracks = r801Var;
            this.$eventTime = h42Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$tracks, this.$eventTime, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00a0, code lost:
        
            if (r10 == r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0157, code lost:
        
            if (r4 == r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x016b, code lost:
        
            if (r0 == r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
        
            if (r2 == r1) goto L48;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00fb -> B:20:0x00bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0157 -> B:10:0x0022). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object enqueueLog;
            ImmutableList immutableList;
            int size;
            int i;
            q801 q801Var;
            int i2;
            final int i3;
            int i4;
            int i5;
            int i6;
            q801 q801Var2;
            ImmutableList immutableList2;
            int i7;
            int i8;
            int i9;
            q801 q801Var3;
            ImmutableList immutableList3;
            final int i10;
            int i11;
            ImmutableList immutableList4;
            final String buildTrackStatusString;
            final String buildFormatSupportString;
            Object enqueueLog2;
            Object enqueueLog3;
            final String buildTrackStatusString2;
            final String buildFormatSupportString2;
            Object enqueueLog4;
            boolean hasHlsMetadataEntry;
            Object enqueueLog5;
            Object enqueueLog6;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = 2;
            switch (this.label) {
                case 0:
                    b.b(obj);
                    final CodecReportEventLogger codecReportEventLogger = this.this$0;
                    final h42 h42Var = this.$eventTime;
                    sls slsVar = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger.logOnTracksChanged.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final String invoke() {
                            String buildEventTimeString;
                            StringBuilder sb = new StringBuilder("tracks [");
                            buildEventTimeString = CodecReportEventLogger.this.buildEventTimeString(h42Var);
                            sb.append(buildEventTimeString);
                            return sb.toString();
                        }
                    };
                    this.label = 1;
                    enqueueLog = codecReportEventLogger.enqueueLog(slsVar, this);
                    break;
                case 1:
                    b.b(obj);
                    ImmutableList immutableList5 = this.$tracks.a;
                    immutableList = immutableList5;
                    size = immutableList5.size();
                    i = 0;
                    if (i < size) {
                        CodecReportEventLogger codecReportEventLogger2 = this.this$0;
                        AnonymousClass6 anonymousClass6 = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger.logOnTracksChanged.1.1.6
                            @Override // defpackage.sls
                            public final String invoke() {
                                return "]";
                            }
                        };
                        this.L$0 = null;
                        this.label = 6;
                        enqueueLog5 = codecReportEventLogger2.enqueueLog(anonymousClass6, this);
                        break;
                    } else {
                        q801Var = (q801) immutableList.get(i);
                        CodecReportEventLogger codecReportEventLogger3 = this.this$0;
                        AnonymousClass2 anonymousClass2 = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger.logOnTracksChanged.1.1.2
                            @Override // defpackage.sls
                            public final String invoke() {
                                return "  group [";
                            }
                        };
                        this.L$0 = immutableList;
                        this.L$1 = q801Var;
                        this.I$0 = i;
                        this.I$1 = size;
                        this.label = i12;
                        enqueueLog6 = codecReportEventLogger3.enqueueLog(anonymousClass2, this);
                        break;
                    }
                    return coroutineSingletons;
                case 2:
                    size = this.I$1;
                    i = this.I$0;
                    q801Var = (q801) this.L$1;
                    immutableList = (ImmutableList) this.L$0;
                    b.b(obj);
                    CodecReportEventLogger codecReportEventLogger4 = this.this$0;
                    int i13 = q801Var.a;
                    hasHlsMetadataEntry = codecReportEventLogger4.hasHlsMetadataEntry(q801Var);
                    if (!hasHlsMetadataEntry || q801Var.b.c != i12) {
                        q801Var3 = q801Var;
                        i8 = size;
                        i7 = i13;
                        immutableList3 = immutableList;
                        i9 = i;
                        i10 = 0;
                        while (i10 < i7) {
                            buildTrackStatusString = this.this$0.buildTrackStatusString(q801Var3.e[i10]);
                            buildFormatSupportString = this.this$0.buildFormatSupportString(q801Var3.d[i10]);
                            final a a = q801Var3.a(i10);
                            CodecReportEventLogger codecReportEventLogger5 = this.this$0;
                            sls slsVar2 = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger.logOnTracksChanged.1.1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final String invoke() {
                                    String str = buildTrackStatusString;
                                    int i14 = i10;
                                    a aVar = a;
                                    String str2 = buildFormatSupportString;
                                    StringBuilder u = b64.u(i14, Extension.TAB_CHAR, str, " Track:", Extension.FIX_SPACE);
                                    u.append(a.c(aVar));
                                    u.append(", supported=");
                                    u.append(str2);
                                    return u.toString();
                                }
                            };
                            this.L$0 = immutableList3;
                            this.L$1 = q801Var3;
                            this.I$0 = i9;
                            this.I$1 = i8;
                            this.I$2 = i10;
                            this.I$3 = i7;
                            this.label = 4;
                            enqueueLog2 = codecReportEventLogger5.enqueueLog(slsVar2, this);
                            if (enqueueLog2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            i10++;
                        }
                        size = i8;
                        i11 = i9;
                        immutableList4 = immutableList3;
                        CodecReportEventLogger codecReportEventLogger6 = this.this$0;
                        AnonymousClass5 anonymousClass5 = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger.logOnTracksChanged.1.1.5
                            @Override // defpackage.sls
                            public final String invoke() {
                                return "  ]";
                            }
                        };
                        this.L$0 = immutableList4;
                        this.L$1 = null;
                        this.I$0 = i11;
                        this.I$1 = size;
                        this.label = 5;
                        enqueueLog3 = codecReportEventLogger6.enqueueLog(anonymousClass5, this);
                        break;
                    } else {
                        immutableList2 = immutableList;
                        i5 = size;
                        i2 = i13;
                        q801Var2 = q801Var;
                        i4 = -1;
                        i6 = i;
                        i3 = 0;
                        if (i3 >= i2) {
                            size = i5;
                            i11 = i6;
                            immutableList4 = immutableList2;
                            CodecReportEventLogger codecReportEventLogger62 = this.this$0;
                            AnonymousClass5 anonymousClass52 = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger.logOnTracksChanged.1.1.5
                                @Override // defpackage.sls
                                public final String invoke() {
                                    return "  ]";
                                }
                            };
                            this.L$0 = immutableList4;
                            this.L$1 = null;
                            this.I$0 = i11;
                            this.I$1 = size;
                            this.label = 5;
                            enqueueLog3 = codecReportEventLogger62.enqueueLog(anonymousClass52, this);
                        } else {
                            final a a2 = q801Var2.a(i3);
                            int i14 = a2.u;
                            if (i4 != i14) {
                                buildTrackStatusString2 = this.this$0.buildTrackStatusString(q801Var2.e[i3]);
                                buildFormatSupportString2 = this.this$0.buildFormatSupportString(q801Var2.d[i3]);
                                CodecReportEventLogger codecReportEventLogger7 = this.this$0;
                                sls slsVar3 = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger.logOnTracksChanged.1.1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.sls
                                    public final String invoke() {
                                        String str = buildTrackStatusString2;
                                        int i15 = i3;
                                        a aVar = a2;
                                        String str2 = buildFormatSupportString2;
                                        StringBuilder u = b64.u(i15, Extension.TAB_CHAR, str, " Track:", Extension.FIX_SPACE);
                                        u.append(a.c(aVar));
                                        u.append(", supported=");
                                        u.append(str2);
                                        return u.toString();
                                    }
                                };
                                this.L$0 = immutableList2;
                                this.L$1 = q801Var2;
                                this.I$0 = i6;
                                this.I$1 = i5;
                                this.I$2 = i14;
                                this.I$3 = i3;
                                this.I$4 = i2;
                                this.label = 3;
                                enqueueLog4 = codecReportEventLogger7.enqueueLog(slsVar3, this);
                                if (enqueueLog4 != coroutineSingletons) {
                                    i4 = i14;
                                }
                                return coroutineSingletons;
                            }
                            i3++;
                            if (i3 >= i2) {
                            }
                        }
                    }
                    break;
                case 3:
                    i2 = this.I$4;
                    i3 = this.I$3;
                    i4 = this.I$2;
                    i5 = this.I$1;
                    i6 = this.I$0;
                    q801Var2 = (q801) this.L$1;
                    immutableList2 = (ImmutableList) this.L$0;
                    b.b(obj);
                    i3++;
                    if (i3 >= i2) {
                    }
                    break;
                case 4:
                    i7 = this.I$3;
                    int i15 = this.I$2;
                    i8 = this.I$1;
                    i9 = this.I$0;
                    q801Var3 = (q801) this.L$1;
                    immutableList3 = (ImmutableList) this.L$0;
                    b.b(obj);
                    i10 = i15 + 1;
                    while (i10 < i7) {
                    }
                    size = i8;
                    i11 = i9;
                    immutableList4 = immutableList3;
                    CodecReportEventLogger codecReportEventLogger622 = this.this$0;
                    AnonymousClass5 anonymousClass522 = new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger.logOnTracksChanged.1.1.5
                        @Override // defpackage.sls
                        public final String invoke() {
                            return "  ]";
                        }
                    };
                    this.L$0 = immutableList4;
                    this.L$1 = null;
                    this.I$0 = i11;
                    this.I$1 = size;
                    this.label = 5;
                    enqueueLog3 = codecReportEventLogger622.enqueueLog(anonymousClass522, this);
                    break;
                case 5:
                    size = this.I$1;
                    i11 = this.I$0;
                    immutableList4 = (ImmutableList) this.L$0;
                    b.b(obj);
                    immutableList = immutableList4;
                    i = i11 + 1;
                    i12 = 2;
                    if (i < size) {
                    }
                    return coroutineSingletons;
                case 6:
                    b.b(obj);
                    return zy11.a;
                default:
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecReportEventLogger$logOnTracksChanged$1(CodecReportEventLogger codecReportEventLogger, r801 r801Var, h42 h42Var, Continuation<? super CodecReportEventLogger$logOnTracksChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = codecReportEventLogger;
        this.$tracks = r801Var;
        this.$eventTime = h42Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new CodecReportEventLogger$logOnTracksChanged$1(this.this$0, this.$tracks, this.$eventTime, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CodecReportEventLogger$logOnTracksChanged$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$tracks, this.$eventTime, null);
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
