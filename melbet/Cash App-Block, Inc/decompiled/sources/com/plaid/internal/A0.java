package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0341z0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.I2;
import com.plaid.internal.N2;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkException;
import com.plaid.link.exception.LinkInvalidResultException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class A0 {
    public final InterfaceC0338y6 a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Pane$PaneRendering.b.values().length];
            try {
                iArr[Pane$PaneRendering.b.SINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pane$PaneRendering.b.HEADLESS_O_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[SdkResult$SDKResult.b.values().length];
            try {
                iArr2[SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public A0(InterfaceC0338y6 interfaceC0338y6) {
        interfaceC0338y6.getClass();
        this.a = interfaceC0338y6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N2 n2, ContinuationImpl continuationImpl) {
        B0 b0;
        int i;
        r8 f;
        Object a2;
        Pane$PaneRendering pane$PaneRendering;
        if (continuationImpl instanceof B0) {
            b0 = (B0) continuationImpl;
            int i2 = b0.f;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                b0.f = i2 - PKIFailureInfo.systemUnavail;
                Object obj = b0.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b0.f;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (n2 instanceof N2.e) {
                        return new AbstractC0341z0.d(((N2.e) n2).i());
                    }
                    if (n2 instanceof N2.i) {
                        return new AbstractC0341z0.c((N2.i) n2);
                    }
                    if (n2 instanceof N2.k) {
                        N2.k kVar = (N2.k) n2;
                        return kVar.m() ? kVar.i() == null ? a(new D2("Can't open out of process webview without channel info"), n2.h()) : new AbstractC0341z0.h(kVar.k(), kVar.l(), kVar.i()) : new AbstractC0341z0.k(kVar.k(), kVar.l(), kVar.j());
                    }
                    if (n2 instanceof N2.d) {
                        return new AbstractC0341z0.b(((N2.d) n2).i());
                    }
                    f = n2.f();
                    InterfaceC0338y6 interfaceC0338y6 = this.a;
                    b0.a = this;
                    b0.b = n2;
                    b0.c = f;
                    b0.f = 1;
                    a2 = interfaceC0338y6.a(f, b0);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r8 r8Var = b0.c;
                    n2 = b0.b;
                    A0 a0 = b0.a;
                    SafeTrace.throwOnFailure(obj);
                    f = r8Var;
                    this = a0;
                    a2 = obj;
                }
                pane$PaneRendering = (Pane$PaneRendering) a2;
                if (pane$PaneRendering != null) {
                    C2 c2 = new C2("No pane in response");
                    String h = n2.h();
                    this.getClass();
                    return a(c2, h);
                }
                Pane$PaneRendering.b renderingCase = pane$PaneRendering.getRenderingCase();
                int i3 = renderingCase == null ? -1 : a.a[renderingCase.ordinal()];
                if (i3 == -1) {
                    D2 d2 = new D2("Can't render pane because rendering is null");
                    String h2 = n2.h();
                    this.getClass();
                    return a(d2, h2);
                }
                if (i3 == 1) {
                    this.getClass();
                    return a(pane$PaneRendering, n2);
                }
                if (i3 == 2) {
                    return new AbstractC0341z0.i.a(f);
                }
                String str = "Native panes are no longer supported: " + pane$PaneRendering.getRenderingCase();
                pane$PaneRendering.getId();
                pane$PaneRendering.getPaneNodeId();
                C2 c22 = new C2(str);
                String h3 = n2.h();
                this.getClass();
                return a(c22, h3);
            }
        }
        b0 = new B0(this, continuationImpl);
        Object obj2 = b0.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b0.f;
        if (i != 0) {
        }
        pane$PaneRendering = (Pane$PaneRendering) a2;
        if (pane$PaneRendering != null) {
        }
    }

    public static AbstractC0341z0 a(Pane$PaneRendering pane$PaneRendering, N2 n2) {
        List<Common$SDKEvent> onAppearList;
        if (pane$PaneRendering.hasSink()) {
            SinkPaneOuterClass$SinkPane.Rendering sink = pane$PaneRendering.getSink();
            if (sink.hasResult()) {
                SdkResult$SDKResult result = sink.getResult();
                SinkPaneOuterClass$SinkPane.Rendering.Events events = sink.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (Common$SDKEvent common$SDKEvent : onAppearList) {
                        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            common$SDKEvent.getClass();
                            linkEventListenerInternal$link_sdk_release.invoke(S6.a(common$SDKEvent), I2.d.a);
                        }
                    }
                }
                try {
                    SdkResult$SDKResult.b callback = result.getCallback();
                    int i = callback == null ? -1 : a.b[callback.ordinal()];
                    if (i == 1) {
                        String metadataJson = sink.getMetadataJson();
                        metadataJson.getClass();
                        return new AbstractC0341z0.j(a(result, metadataJson));
                    }
                    if (i == 2) {
                        String a2 = O2.a(n2);
                        String errorJson = sink.getErrorJson();
                        errorJson.getClass();
                        String metadataJson2 = sink.getMetadataJson();
                        metadataJson2.getClass();
                        return new AbstractC0341z0.d(a(result, a2, errorJson, metadataJson2));
                    }
                    throw new LinkInvalidResultException("Result type not supported by client: " + result.getCallback());
                } catch (Throwable th) {
                    return a(th, n2.h());
                }
            }
            pane$PaneRendering.getId();
            pane$PaneRendering.getPaneNodeId();
            return a(new C2("Tried to convert sink pane but result was null"), n2.h());
        }
        pane$PaneRendering.getId();
        pane$PaneRendering.getPaneNodeId();
        return a(new C2("Tried to get sink but didn't exist"), n2.h());
    }

    public static LinkExit a(SdkResult$SDKResult sdkResult$SDKResult, String str, String str2, String str3) {
        LinkExitMetadata a2;
        sdkResult$SDKResult.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        if (sdkResult$SDKResult.hasError() && !Intrinsics.areEqual(sdkResult$SDKResult.getError().getRequestId(), "")) {
            str = sdkResult$SDKResult.getError().getRequestId();
        }
        String str4 = str;
        LinkError linkError = null;
        if (sdkResult$SDKResult.hasMetadata()) {
            SdkResult$SDKResult.Metadata.Institution institution = sdkResult$SDKResult.getMetadata().hasInstitution() ? sdkResult$SDKResult.getMetadata().getInstitution() : null;
            String linkSessionId = sdkResult$SDKResult.getMetadata().getLinkSessionId();
            String name = institution != null ? institution.getName() : null;
            String institutionId = institution != null ? institution.getInstitutionId() : null;
            String str5 = name;
            a2 = new LinkExitMetadata(LinkExitMetadataStatus.INSTANCE.fromString(sdkResult$SDKResult.getMetadata().getStatus()), (institutionId == null || institutionId.length() == 0 || str5 == null || str5.length() == 0) ? null : new LinkInstitution(institutionId, str5), linkSessionId, str4, str3);
        } else {
            a2 = L2.a(55, str4);
        }
        SdkResult$SDKResult.Error error = sdkResult$SDKResult.hasError() ? sdkResult$SDKResult.getError() : null;
        if (error != null) {
            String errorCode = error.getErrorCode();
            errorCode.getClass();
            String errorMessage = error.getErrorMessage();
            errorMessage.getClass();
            String displayMessage = error.getDisplayMessage();
            displayMessage.getClass();
            errorCode.getClass();
            errorMessage.getClass();
            displayMessage.getClass();
            str2.getClass();
            linkError = new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, str2);
        }
        a2.getClass();
        return new LinkExit(linkError, a2);
    }

    public static LinkSuccess a(SdkResult$SDKResult sdkResult$SDKResult, String str) {
        String str2;
        sdkResult$SDKResult.getClass();
        str.getClass();
        if (sdkResult$SDKResult.hasMetadata()) {
            SdkResult$SDKResult.Metadata metadata = sdkResult$SDKResult.getMetadata();
            metadata.getClass();
            List<SdkResult$SDKResult.Metadata.Account> accountsList = metadata.getAccountsList();
            accountsList.getClass();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(accountsList, 10));
            Iterator<T> it = accountsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SdkResult$SDKResult.Metadata.Account account = (SdkResult$SDKResult.Metadata.Account) it.next();
                String id = account.getId();
                id.getClass();
                String name = account.getName();
                String mask = account.getMask();
                LinkAccountSubtype convert = LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType());
                String verificationStatus = account.getVerificationStatus();
                if (verificationStatus != null && verificationStatus.length() != 0) {
                    str2 = account.getVerificationStatus();
                }
                id.getClass();
                convert.getClass();
                arrayList.add(new LinkAccount(id, name, mask, convert, LinkAccountVerificationStatus.INSTANCE.convert(str2), null, 32, null));
            }
            SdkResult$SDKResult.Metadata.Institution institution = metadata.hasInstitution() ? metadata.getInstitution() : null;
            String institutionId = institution != null ? institution.getInstitutionId() : null;
            str2 = institution != null ? institution.getName() : null;
            String linkSessionId = metadata.getLinkSessionId();
            linkSessionId.getClass();
            LinkSuccessMetadata a2 = L2.a(arrayList, institutionId, str2, linkSessionId, str);
            String publicToken = sdkResult$SDKResult.getPublicToken();
            publicToken.getClass();
            return L2.a(publicToken, a2);
        }
        throw new LinkException("Was successful but returned no data: " + sdkResult$SDKResult);
    }

    public static AbstractC0341z0.d a(Throwable th, String str) {
        C0095a6.a.a(C0095a6.a, th);
        return new AbstractC0341z0.d(L2.b(th, str));
    }
}
