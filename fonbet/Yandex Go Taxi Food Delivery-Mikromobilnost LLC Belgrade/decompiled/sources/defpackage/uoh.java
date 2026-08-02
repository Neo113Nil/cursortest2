package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class uoh implements lu {
    public static final uoh b = new uoh(0);
    public static final uoh c = new uoh(1);
    public static final uoh d = new uoh(2);
    public static final uoh e = new uoh(3);
    public static final uoh f = new uoh(4);
    public static final uoh g = new uoh(5);
    public static final uoh h = new uoh(6);
    public static final uoh i = new uoh(7);
    public static final uoh j = new uoh(8);
    public static final uoh k = new uoh(9);
    public static final uoh l = new uoh(10);
    public static final uoh m = new uoh(11);
    public static final uoh n = new uoh(12);
    public final /* synthetic */ int a;

    public /* synthetic */ uoh(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.lu
    public final KSerializer decoder(String str) {
        switch (this.a) {
            case 0:
                if (str.equals("DeferredDecodingAction")) {
                    return toh.Companion.serializer();
                }
                return null;
            case 1:
                switch (str.hashCode()) {
                    case -594977026:
                        if (str.equals("RenewDocumentAction")) {
                            return zyi0.Companion.serializer();
                        }
                        return null;
                    case -399941510:
                        if (str.equals("UpdateDocumentAction")) {
                            return x621.Companion.serializer();
                        }
                        return null;
                    case 144632143:
                        if (str.equals("ReloadAction")) {
                            return ysi0.INSTANCE.serializer();
                        }
                        return null;
                    case 1375608575:
                        if (str.equals("HideKeyboardAction")) {
                            return aiu.INSTANCE.serializer();
                        }
                        return null;
                    case 1721620818:
                        if (str.equals("RedirectAction")) {
                            return yki0.Companion.serializer();
                        }
                        return null;
                    default:
                        return null;
                }
            case 2:
                switch (str.hashCode()) {
                    case 28100752:
                        if (str.equals("DeeplinkNavigationAction")) {
                            return q2h.Companion.serializer();
                        }
                        return null;
                    case 210875961:
                        if (str.equals("DispatchOnParentAction")) {
                            return nyj.Companion.serializer();
                        }
                        return null;
                    case 427208364:
                        if (str.equals("AdvertisementBillingAction")) {
                            return ge1.Companion.serializer();
                        }
                        return null;
                    case 1483840112:
                        if (str.equals("AdvertisementPixelBillingAction")) {
                            return te1.Companion.serializer();
                        }
                        return null;
                    case 1778928901:
                        if (str.equals("ApplinkNavigationAction")) {
                            return t13.Companion.serializer();
                        }
                        return null;
                    default:
                        return null;
                }
            case 3:
                if (str.equals("InvalidateCacheAction")) {
                    return ovw.Companion.serializer();
                }
                return null;
            case 4:
                if (str.equals("ListAction")) {
                    return gqy.Companion.serializer();
                }
                return null;
            case 5:
                switch (str.hashCode()) {
                    case -899134839:
                        if (str.equals("ShowOverlayAction")) {
                            return y7s0.Companion.serializer();
                        }
                        return null;
                    case -319271911:
                        if (str.equals("BackwardAction")) {
                            return hj4.Companion.serializer();
                        }
                        return null;
                    case -124959429:
                        if (str.equals("ForwardAction")) {
                            return t9s.Companion.serializer();
                        }
                        return null;
                    case 198664838:
                        if (str.equals("OverlayAction")) {
                            return w090.Companion.serializer();
                        }
                        return null;
                    case 451263808:
                        if (str.equals("DismissAction")) {
                            return iyj.Companion.serializer();
                        }
                        return null;
                    case 1192844965:
                        if (str.equals("ShowPopupAction")) {
                            return w8s0.Companion.serializer();
                        }
                        return null;
                    case 1990713444:
                        if (str.equals("HideOverlayAction")) {
                            return eiu.Companion.serializer();
                        }
                        return null;
                    default:
                        return null;
                }
            case 6:
                int hashCode = str.hashCode();
                if (hashCode == -2017092225) {
                    if (str.equals("PreloadAction")) {
                        return ooe0.Companion.serializer();
                    }
                    return null;
                }
                if (hashCode == -1953951878) {
                    if (str.equals("RemovePreloadedAction")) {
                        return ywi0.Companion.serializer();
                    }
                    return null;
                }
                if (hashCode == -1447327535 && str.equals("CleanPreloadStorageAction")) {
                    return l0c.INSTANCE.serializer();
                }
                return null;
            case 7:
                if (str.equals("RemoteAction")) {
                    return kui0.Companion.serializer();
                }
                return null;
            case 8:
                if (str.equals("ScenarioAction")) {
                    return gmm0.Companion.serializer();
                }
                return null;
            case 9:
                if (str.equals("ScriptAction")) {
                    return wgp0.Companion.serializer();
                }
                return null;
            case 10:
                switch (str.hashCode()) {
                    case -1997289205:
                        if (str.equals("ContinueLoadingAction")) {
                            return ble.Companion.serializer();
                        }
                        return null;
                    case -1961054264:
                        if (str.equals("RemoveSectionsAction")) {
                            return exi0.Companion.serializer();
                        }
                        return null;
                    case -1685449010:
                        if (str.equals("HideSnippetsAction")) {
                            return siu.Companion.serializer();
                        }
                        return null;
                    case -1442249845:
                        if (str.equals("HideAllSnippetsAction")) {
                            return lhu.Companion.serializer();
                        }
                        return null;
                    case -1076432567:
                        if (str.equals("ShowSnippetsAction")) {
                            return f9s0.Companion.serializer();
                        }
                        return null;
                    case -982419694:
                        if (str.equals("UpdateSectionAction")) {
                            return x721.Companion.serializer();
                        }
                        return null;
                    case -810239170:
                        if (str.equals("ReloadLabeledSectionsAction")) {
                            return bti0.Companion.serializer();
                        }
                        return null;
                    case -788285065:
                        if (str.equals("ScrollToScreenTopAction")) {
                            return gjp0.Companion.serializer();
                        }
                        return null;
                    case -516457403:
                        if (str.equals("EnableSectionScrollAction")) {
                            return eyn.Companion.serializer();
                        }
                        return null;
                    case -507236608:
                        if (str.equals("DisableSectionScrollAction")) {
                            return rnj.Companion.serializer();
                        }
                        return null;
                    case -396865074:
                        if (str.equals("SetSelectedLoadMoreAction")) {
                            return a4r0.Companion.serializer();
                        }
                        return null;
                    case -175254736:
                        if (str.equals("ShowAllSnippetsAction")) {
                            return p5s0.Companion.serializer();
                        }
                        return null;
                    case 583435153:
                        if (str.equals("ScrollToItemAction")) {
                            return yip0.Companion.serializer();
                        }
                        return null;
                    case 773022820:
                        if (str.equals("SetPaginationStatusAction")) {
                            return u3r0.Companion.serializer();
                        }
                        return null;
                    case 1030050969:
                        if (str.equals("ReplaceAllSnippetsAction")) {
                            return b1j0.Companion.serializer();
                        }
                        return null;
                    case 1066406016:
                        if (str.equals("ReplaceSnippetsAction")) {
                            return j1j0.Companion.serializer();
                        }
                        return null;
                    case 1461865539:
                        if (str.equals("MergeSectionAction")) {
                            return qr10.Companion.serializer();
                        }
                        return null;
                    case 1605050183:
                        if (str.equals("ReplaceSectionAction")) {
                            return g1j0.Companion.serializer();
                        }
                        return null;
                    default:
                        return null;
                }
            case 11:
                if (str.equals("TemplatedAction")) {
                    return dgy0.a;
                }
                return null;
            default:
                switch (str.hashCode()) {
                    case -1137307170:
                        if (str.equals("LimiterAction")) {
                            return bgy.Companion.serializer();
                        }
                        return null;
                    case -219809256:
                        if (str.equals("DelayedAction")) {
                            return uph.Companion.serializer();
                        }
                        return null;
                    case 83376672:
                        if (str.equals("ThrottleAction")) {
                            return xzy0.Companion.serializer();
                        }
                        return null;
                    case 1950120447:
                        if (str.equals("DebounceAction")) {
                            return dtg.Companion.serializer();
                        }
                        return null;
                    default:
                        return null;
                }
        }
    }
}
