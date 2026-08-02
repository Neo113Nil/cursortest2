package com.knotapi.knot.ui.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.knotapi.knot.R;
import com.knotapi.knot.interfaces.MerchantViewListener;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.DialogOptions;
import com.knotapi.knot.models.ExtraInfo;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.knotapi.knot.utilities.Constants;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.utilities.Helper;
import com.knotapi.knot.utilities.LoaderView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;
import com.knotapi.knot.webview.PopupChromeClient;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class MerchantWebViewListenerFragment extends BottomSheetDialogFragment implements MerchantViewListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String ARG_BOT = "bot";
    public static MerchantWebViewListenerFragment INSTANCE = null;
    public static final String TAG = "Knot:MerchantWebViewListenerFragment";
    public BottomSheetDialog dialog;
    public WebView errorWebView;
    String exitConfirmationTitle;
    String exitNoButton;
    String exitOverlayCloseButton;
    String exitYesButton;
    String knotBottomSheetDialog;
    public ImageView mBackIcon;
    public Bot mBot;
    public ImageView mImgCloseWeb;
    public ImageView mKnotIcon;
    ProgressBar mLoader;
    TextView mTvRefresh;
    private RelativeLayout mainContentView;
    private int[] merchantIds;
    public KnotView merchantWebView;
    String metaBackButton;
    String metaClose;
    private LinearLayout noInternetView;
    private LoaderView overlayLoader;
    private Map<String, String> pendingAssets;
    String pressedBackInitial;
    String pressedExitInitial;
    View rootView;
    public List<Cookie> transactionCookies;
    public WebView transactionWebView;
    public MerchantWebViewDelegate webViewDelegate;
    public Boolean shouldStartBot = Boolean.FALSE;
    private String lastLoadedUrl = "";
    private final View.OnClickListener onBackIconClick = new MerchantWebViewListenerFragment$$ExternalSyntheticLambda2(this, 1);
    public ExtraInfo mExtraInfo = new ExtraInfo();

    /* renamed from: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$1, reason: invalid class name */
    public class AnonymousClass1 extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ Boolean[] val$isFirstLoad;

        public AnonymousClass1(Boolean[] boolArr) {
            this.val$isFirstLoad = boolArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAvailable$0(Boolean[] boolArr) {
            if (!MerchantWebViewListenerFragment.this.lastLoadedUrl.isEmpty() && !boolArr[0].booleanValue()) {
                String unused = MerchantWebViewListenerFragment.this.lastLoadedUrl;
                MerchantWebViewListenerFragment merchantWebViewListenerFragment = MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment.merchantWebView.loadUrl(merchantWebViewListenerFragment.lastLoadedUrl);
                MerchantWebViewListenerFragment.this.lastLoadedUrl = "";
                MerchantWebViewListenerFragment.this.manageNoInternetView(Boolean.FALSE);
            }
            boolArr[0] = Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLost$1() {
            MerchantWebViewListenerFragment merchantWebViewListenerFragment = MerchantWebViewListenerFragment.this;
            KnotView knotView = merchantWebViewListenerFragment.merchantWebView;
            merchantWebViewListenerFragment.lastLoadedUrl = knotView != null ? knotView.getUrl() : "";
            MerchantWebViewListenerFragment.this.manageNoInternetView(Boolean.TRUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            try {
                if (MerchantWebViewListenerFragment.this.getActivity() != null) {
                    MerchantWebViewListenerFragment.this.getActivity().runOnUiThread(new MerchantWebViewListenerFragment$$ExternalSyntheticLambda8(1, this, this.val$isFirstLoad));
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            try {
                if (MerchantWebViewListenerFragment.this.getActivity() != null) {
                    MerchantWebViewListenerFragment.this.getActivity().runOnUiThread(new MerchantWebViewListenerFragment$$ExternalSyntheticLambda4(this, 1));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$4, reason: invalid class name */
    public class AnonymousClass4 {
        public AnonymousClass4() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onErrorViewContinue$1() {
            try {
                MerchantWebViewListenerFragment.this.merchantWebView.clear();
                MerchantWebViewListenerFragment merchantWebViewListenerFragment = MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment.webViewDelegate.removeFragment(merchantWebViewListenerFragment.mBot.getBotId(), false);
                MerchantWebViewListenerFragment merchantWebViewListenerFragment2 = MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment2.webViewDelegate.userCloseMerchantView(merchantWebViewListenerFragment2.mBot.getBotId(), MerchantWebViewListenerFragment.this.mBot.getMerchantId());
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTryAgain$0() {
            try {
                MerchantWebViewListenerFragment.this.merchantWebView.clear();
                MerchantWebViewListenerFragment merchantWebViewListenerFragment = MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment.webViewDelegate.removeFragment(merchantWebViewListenerFragment.mBot.getBotId(), false);
                MerchantWebViewListenerFragment merchantWebViewListenerFragment2 = MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment2.webViewDelegate.onTryAgain(merchantWebViewListenerFragment2.mBot);
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void onErrorViewContinue(String str) {
            new Handler(Looper.getMainLooper()).post(new MerchantWebViewListenerFragment$4$$ExternalSyntheticLambda0(this, 1));
        }

        @JavascriptInterface
        public void onTryAgain(String str) {
            new Handler(Looper.getMainLooper()).post(new MerchantWebViewListenerFragment$4$$ExternalSyntheticLambda0(this, 0));
        }
    }

    private void addWebViewToContainer(View view) {
        try {
            KnotView knotView = this.merchantWebView;
            if (knotView != null) {
                if (knotView.getParent() != null) {
                    ((ViewGroup) this.merchantWebView.getParent()).removeView(this.merchantWebView);
                }
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.webView_container);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(3, R.id.error_webview);
                relativeLayout.addView(this.merchantWebView, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    private void checkNetworkConnectivity() {
        Boolean[] boolArr = {Boolean.TRUE};
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(boolArr);
        ConnectivityManager connectivityManager = getActivity() != null ? (ConnectivityManager) getActivity().getSystemService(ConnectivityManager.class) : null;
        if (connectivityManager != null) {
            connectivityManager.requestNetwork(build, anonymousClass1);
        }
    }

    private void errorWebViewSetup() {
        try {
            this.errorWebView.getSettings().setJavaScriptEnabled(true);
            this.errorWebView.setWebViewClient(new WebViewClient() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.3
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (MerchantWebViewListenerFragment.this.overlayLoader != null) {
                        MerchantWebViewListenerFragment.this.overlayLoader.hide();
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    webView.loadUrl(str);
                    return true;
                }
            });
            this.errorWebView.addJavascriptInterface(new AnonymousClass4(), "JSInterface");
        } catch (Exception unused) {
        }
    }

    public static MerchantWebViewListenerFragment getInstance() {
        return INSTANCE;
    }

    private void handleBackPressed() {
        if (this.merchantWebView == null || this.mBackIcon.getVisibility() != 0) {
            return;
        }
        KnotView knotView = this.merchantWebView;
        String url = knotView != null ? knotView.getUrl() : "";
        MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
        if (merchantWebViewDelegate != null) {
            merchantWebViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_BUTTON_CLICKED, this.metaBackButton, url);
        }
        boolean canGoBack = this.merchantWebView.canGoBack();
        Bot bot = this.mBot;
        if (canGoBack) {
            BreadcrumbHelper.trackForMerchant(bot.getMerchantName(), this.mBot.getMerchantId(), "Back button - navigating back", BreadcrumbHelper.Category.USER_ACTION);
            this.merchantWebView.goBack();
            return;
        }
        BreadcrumbHelper.trackForMerchant(bot.getMerchantName(), this.mBot.getMerchantId(), "Back on initial page - closing", BreadcrumbHelper.Category.USER_ACTION);
        this.merchantWebView.clear();
        MerchantWebViewDelegate merchantWebViewDelegate2 = this.webViewDelegate;
        if (merchantWebViewDelegate2 != null) {
            merchantWebViewDelegate2.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_FLOW, this.pressedBackInitial, url);
            this.webViewDelegate.userCloseMerchantView(this.mBot.getBotId(), this.mBot.getMerchantId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        handleBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreateDialog$0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        MerchantWebViewDelegate merchantWebViewDelegate;
        if (i != 4 || (merchantWebViewDelegate = this.webViewDelegate) == null) {
            return false;
        }
        merchantWebViewDelegate.userCloseMerchantView(this.mBot.getBotId(), this.mBot.getMerchantId());
        this.webViewDelegate = null;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$3() {
        this.mLoader.setVisibility(8);
        this.mTvRefresh.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$4(View view) {
        try {
            this.mTvRefresh.setVisibility(8);
            this.mLoader.setVisibility(0);
            new Handler().postDelayed(new MerchantWebViewListenerFragment$$ExternalSyntheticLambda4(this, 0), 2000L);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$5(String str, KnotBottomSheetDialog knotBottomSheetDialog, View view) {
        this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_BUTTON_CLICKED, this.exitNoButton, str);
        if (knotBottomSheetDialog.isAdded()) {
            knotBottomSheetDialog.closeSheet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$6(String str, KnotBottomSheetDialog knotBottomSheetDialog, View view) {
        this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_BUTTON_CLICKED, this.exitYesButton, str);
        if (knotBottomSheetDialog.isAdded()) {
            knotBottomSheetDialog.closeSheet();
        }
        KnotView knotView = this.merchantWebView;
        if (knotView != null) {
            knotView.clear();
        }
        this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_FLOW, this.pressedExitInitial, str);
        Bot bot = this.mBot;
        if (bot != null) {
            this.webViewDelegate.userCloseMerchantView(bot.getBotId(), this.mBot.getMerchantId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$7(String str, KnotBottomSheetDialog knotBottomSheetDialog, View view) {
        this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_BUTTON_CLICKED, this.exitOverlayCloseButton, str);
        if (knotBottomSheetDialog.isAdded()) {
            knotBottomSheetDialog.closeSheet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$8(final String str, View view) {
        try {
            if (this.noInternetView.getVisibility() == 0 && getActivity() != null) {
                getActivity().finish();
                return;
            }
            MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
            if (merchantWebViewDelegate != null) {
                merchantWebViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_BUTTON_CLICKED, this.metaClose, str);
                String str2 = this.knotBottomSheetDialog;
                if (getActivity() != null) {
                    FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
                    KnotBottomSheetDialog knotBottomSheetDialog = (KnotBottomSheetDialog) supportFragmentManager.findFragmentByTag(str2);
                    if (knotBottomSheetDialog == null || !knotBottomSheetDialog.isVisible()) {
                        final KnotBottomSheetDialog knotBottomSheetDialog2 = new KnotBottomSheetDialog(this.webViewDelegate);
                        String str3 = this.exitConfirmationTitle;
                        String str4 = this.exitNoButton;
                        String str5 = this.exitYesButton;
                        final int i = 0;
                        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda5
                            public final /* synthetic */ MerchantWebViewListenerFragment f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i2 = i;
                                KnotBottomSheetDialog knotBottomSheetDialog3 = knotBottomSheetDialog2;
                                String str6 = str;
                                MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.f$0;
                                switch (i2) {
                                    case 0:
                                        merchantWebViewListenerFragment.lambda$onCreateView$5(str6, knotBottomSheetDialog3, view2);
                                        break;
                                    case 1:
                                        merchantWebViewListenerFragment.lambda$onCreateView$6(str6, knotBottomSheetDialog3, view2);
                                        break;
                                    default:
                                        merchantWebViewListenerFragment.lambda$onCreateView$7(str6, knotBottomSheetDialog3, view2);
                                        break;
                                }
                            }
                        };
                        final int i2 = 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda5
                            public final /* synthetic */ MerchantWebViewListenerFragment f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i22 = i2;
                                KnotBottomSheetDialog knotBottomSheetDialog3 = knotBottomSheetDialog2;
                                String str6 = str;
                                MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.f$0;
                                switch (i22) {
                                    case 0:
                                        merchantWebViewListenerFragment.lambda$onCreateView$5(str6, knotBottomSheetDialog3, view2);
                                        break;
                                    case 1:
                                        merchantWebViewListenerFragment.lambda$onCreateView$6(str6, knotBottomSheetDialog3, view2);
                                        break;
                                    default:
                                        merchantWebViewListenerFragment.lambda$onCreateView$7(str6, knotBottomSheetDialog3, view2);
                                        break;
                                }
                            }
                        };
                        final int i3 = 2;
                        knotBottomSheetDialog2.setDialogOptions(new DialogOptions(str3, "", str4, str5, onClickListener, onClickListener2, new View.OnClickListener(this) { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda5
                            public final /* synthetic */ MerchantWebViewListenerFragment f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i22 = i3;
                                KnotBottomSheetDialog knotBottomSheetDialog3 = knotBottomSheetDialog2;
                                String str6 = str;
                                MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.f$0;
                                switch (i22) {
                                    case 0:
                                        merchantWebViewListenerFragment.lambda$onCreateView$5(str6, knotBottomSheetDialog3, view2);
                                        break;
                                    case 1:
                                        merchantWebViewListenerFragment.lambda$onCreateView$6(str6, knotBottomSheetDialog3, view2);
                                        break;
                                    default:
                                        merchantWebViewListenerFragment.lambda$onCreateView$7(str6, knotBottomSheetDialog3, view2);
                                        break;
                                }
                            }
                        }, ""));
                        knotBottomSheetDialog2.show(supportFragmentManager, str2);
                    }
                }
            }
        } catch (Exception e) {
            Reporter.error(e, "MerchantWebViewListenerFragment.onBackIconClick");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onResume$9(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && getActivity() != null && this.noInternetView.getVisibility() == 0) {
            getActivity().finish();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onStart$10(View view) {
        try {
            View view2 = (View) view.getParent();
            if (view2 != null) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).mBehavior;
                if (behavior instanceof BottomSheetBehavior) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    bottomSheetBehavior.setPeekHeight(view.getMeasuredHeight());
                    bottomSheetBehavior.draggable = false;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WindowInsetsCompat lambda$onViewCreated$2(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), windowInsetsCompat.mImpl.getInsets(519).top, view.getPaddingRight(), view.getPaddingBottom());
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setLoaderVisibility$11(LoaderView loaderView, KnotViewClient knotViewClient) {
        loaderView.hide();
        knotViewClient.delayLoader = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void manageNoInternetView(Boolean bool) {
        try {
            if (bool.booleanValue()) {
                this.noInternetView.setVisibility(0);
                this.mainContentView.setVisibility(8);
                this.mBackIcon.setVisibility(8);
                this.mKnotIcon.setVisibility(8);
                return;
            }
            this.mainContentView.setVisibility(0);
            this.noInternetView.setVisibility(8);
            this.mBackIcon.setVisibility(0);
            this.mKnotIcon.setVisibility(0);
        } catch (Exception unused) {
        }
    }

    public static MerchantWebViewListenerFragment newInstance(Bot bot) {
        MerchantWebViewListenerFragment merchantWebViewListenerFragment = new MerchantWebViewListenerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_BOT, bot);
        merchantWebViewListenerFragment.setArguments(bundle);
        return merchantWebViewListenerFragment;
    }

    private void performLoaderAction(int i) {
        if (i == 0) {
            this.overlayLoader.show();
        } else if (i == 8) {
            this.overlayLoader.hide();
        }
    }

    private void transactionWebViewSetup() {
        try {
            WebSettings settings = this.transactionWebView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setTextZoom(100);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setSupportMultipleWindows(true);
            settings.setSupportZoom(true);
            settings.setCacheMode(this.mBot.isLoadNoCacheMode() ? 2 : -1);
            settings.setUseWideViewPort(true);
            settings.setSaveFormData(true);
            this.transactionWebView.setWebViewClient(new WebViewClient() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.2
                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    MerchantWebViewListenerFragment merchantWebViewListenerFragment = MerchantWebViewListenerFragment.this;
                    merchantWebViewListenerFragment.transactionCookies = merchantWebViewListenerFragment.getTransactionCookies(str);
                }
            });
        } catch (Exception unused) {
        }
    }

    private void webViewSetup() {
        try {
            this.shouldStartBot = Boolean.FALSE;
            if (this.merchantWebView == null || getActivity() == null) {
                return;
            }
            this.merchantWebView.init(getActivity(), this).setBot(this.mBot).setDefaultSettings().setInjectedAssets(this.pendingAssets).start();
            PopupChromeClient popupChromeClient = PopupChromeClient.getInstance();
            popupChromeClient.init(getActivity(), this.merchantWebView, this.webViewDelegate, this.mBot);
            this.merchantWebView.setWebChromeClient(popupChromeClient);
        } catch (Exception unused) {
        }
    }

    public Cookie buildTransactionCookie(String str, String str2) {
        try {
            return Cookie.buildCookie(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public List<Cookie> getTransactionCookies(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            String cookie = CookieManager.getInstance().getCookie(str);
            if (cookie != null && !cookie.isEmpty()) {
                for (String str2 : cookie.split(";")) {
                    Cookie buildTransactionCookie = buildTransactionCookie(str2, str);
                    if (buildTransactionCookie != null) {
                        arrayList.add(buildTransactionCookie);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void hideBottomFragment() {
        try {
            dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public boolean isErrorViewVisible() {
        try {
            WebView webView = this.errorWebView;
            if (webView != null) {
                if (webView.getVisibility() == 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public boolean isLoaderVisible() {
        LoaderView loaderView = this.overlayLoader;
        if (loaderView != null) {
            return loaderView.isShowing();
        }
        return false;
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void loadTransactionUrl(String str) {
        try {
            WebView webView = this.transactionWebView;
            if (webView != null) {
                webView.loadUrl(str);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.webViewDelegate = (MerchantWebViewDelegate) getActivity();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BottomSheetDialogThemeNoFloating);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        try {
            this.dialog = new BottomSheetDialog(requireContext(), getTheme());
            if (getArguments() != null) {
                this.mBot = (Bot) getArguments().getParcelable(ARG_BOT);
            }
            if (this.dialog.getWindow() != null) {
                this.dialog.getWindow().getAttributes().windowAnimations = R.style.BottomSheetDialogAnimation;
            }
            this.dialog.setOnKeyListener(new MerchantWebViewListenerFragment$$ExternalSyntheticLambda1(this, 1));
            return this.dialog;
        } catch (Exception e) {
            Reporter.error(e, "MerchantWebViewListenerFragment");
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this.requireContext(), 0);
            TypedArray obtainStyledAttributes = bottomSheetDialog.getContext().getTheme().obtainStyledAttributes(new int[]{com.squareup.cash.R.attr.enableEdgeToEdge});
            bottomSheetDialog.edgeToEdgeEnabled = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            return bottomSheetDialog;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoaderView loaderView;
        View view = null;
        try {
            int i = 0;
            view = layoutInflater.inflate(R.layout.fragment_merchant_web_view, viewGroup, false);
            this.errorWebView = (WebView) view.findViewById(R.id.error_webview);
            WebView webView = (WebView) view.findViewById(R.id.transaction_webview);
            this.transactionWebView = webView;
            webView.setVisibility(8);
            this.mBackIcon = (ImageView) view.findViewById(R.id.back_icon);
            this.mKnotIcon = (ImageView) view.findViewById(R.id.img_knot);
            this.noInternetView = (LinearLayout) view.findViewById(R.id.llNoInternet);
            this.mainContentView = (RelativeLayout) view.findViewById(R.id.rlWebView);
            this.mImgCloseWeb = (ImageView) view.findViewById(R.id.imgCloseWeb);
            this.mTvRefresh = (TextView) view.findViewById(R.id.tvRefresh);
            this.mLoader = (ProgressBar) view.findViewById(R.id.progressBar);
            if (this.merchantWebView != null) {
                addWebViewToContainer(view);
            }
            try {
                if (getActivity() != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.fragment_root_layout);
                    if (coordinatorLayout != null) {
                        this.overlayLoader = LoaderView.createOverlayLoader(getActivity(), coordinatorLayout);
                    } else {
                        this.overlayLoader = LoaderView.createOverlayLoader(getActivity());
                    }
                }
                if (this.mBot.getDetached().booleanValue() && (loaderView = this.overlayLoader) != null) {
                    loaderView.hide();
                }
            } catch (Exception e) {
                Reporter.error(e, "MerchantWebViewListenerFragment.onCreateView");
            }
            this.mBackIcon.setOnClickListener(this.onBackIconClick);
            this.errorWebView.setVisibility(8);
            this.mBackIcon.setVisibility(0);
            if (!this.mBot.getDetached().booleanValue()) {
                webViewSetup();
            }
            errorWebViewSetup();
            transactionWebViewSetup();
            if (this.webViewDelegate != null) {
                KnotView knotView = this.merchantWebView;
                this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_FLOW, "start", knotView != null ? knotView.getUrl() : "");
            }
            KnotView knotView2 = this.merchantWebView;
            final String url = knotView2 != null ? knotView2.getUrl() : "";
            this.mTvRefresh.setOnClickListener(new MerchantWebViewListenerFragment$$ExternalSyntheticLambda2(this, i));
            this.mImgCloseWeb.setOnClickListener(new View.OnClickListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MerchantWebViewListenerFragment.this.lambda$onCreateView$8(url, view2);
                }
            });
            INSTANCE = this;
            checkNetworkConnectivity();
        } catch (Exception e2) {
            Reporter.error(e2, "MerchantWebViewListenerFragment.onCreateView");
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.mBot != null) {
                Reporter.addBreadcrumb("Merchant fragment closed: " + this.mBot.getMerchantName() + " (ID: " + this.mBot.getBotId() + ")", BreadcrumbHelper.Category.NAVIGATION);
            }
            LoaderView loaderView = this.overlayLoader;
            if (loaderView != null) {
                loaderView.cleanup();
                this.overlayLoader = null;
            }
            if (this.webViewDelegate != null) {
                KnotView knotView = this.merchantWebView;
                this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_FLOW, "Cancel", knotView != null ? knotView.getUrl() : "");
                this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_FLOW, getString(R.string.webView_closed), "");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getDialog() != null) {
            getDialog().setOnKeyListener(new MerchantWebViewListenerFragment$$ExternalSyntheticLambda1(this, 0));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        try {
            if (this.mBot != null) {
                Reporter.addBreadcrumb("Merchant fragment opened: " + this.mBot.getMerchantName() + " (ID: " + this.mBot.getBotId() + ")", BreadcrumbHelper.Category.NAVIGATION);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                View findViewById = dialog.findViewById(com.squareup.cash.R.id.design_bottom_sheet);
                if (findViewById != null) {
                    findViewById.getLayoutParams().height = -1;
                }
                Helper.configureSystemBars(requireContext(), dialog.getWindow(), this.rootView);
            }
            View view = getView();
            if (view != null) {
                view.post(new MerchantWebViewListenerFragment$$ExternalSyntheticLambda4(view, 2));
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            View findViewById = view.findViewById(R.id.fragment_root_layout);
            this.rootView = findViewById;
            JWK$$ExternalSyntheticBUOutline0 jWK$$ExternalSyntheticBUOutline0 = new JWK$$ExternalSyntheticBUOutline0(12);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById, jWK$$ExternalSyntheticBUOutline0);
        } catch (Exception e) {
            Reporter.error(e, "MerchantWebViewListenerFragment.onViewCreated");
        }
        this.metaClose = Helper.safeGetString(R.string.meta_close, Constants.META_CLOSE, this);
        this.exitConfirmationTitle = Helper.safeGetString(R.string.exit_confirmation_title, Constants.EXIT_CONFIRMATION_TITLE, this);
        this.exitNoButton = Helper.safeGetString(R.string.exit_no_button, Constants.EXIT_NO_BUTTON, this);
        this.exitYesButton = Helper.safeGetString(R.string.exit_yes_button, Constants.EXIT_YES_BUTTON, this);
        this.exitOverlayCloseButton = Helper.safeGetString(R.string.exit_overlay_close_button, Constants.EXIT_OVERLAY_CLOSE_BUTTON, this);
        this.pressedExitInitial = Helper.safeGetString(R.string.pressed_exit_initial, Constants.PRESSED_EXIT_INITIAL, this);
        this.pressedBackInitial = Helper.safeGetString(R.string.pressed_back_initial, Constants.PRESSED_BACK_INITIAL, this);
        this.metaBackButton = Helper.safeGetString(R.string.meta_back_button, Constants.META_BACK_BUTTON, this);
        this.knotBottomSheetDialog = Helper.safeGetString(R.string.knot_bottom_sheet_dialog, Constants.KNOT_BOTTOM_SHEET_DIALOG, this);
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void sendPageUrl(String str) {
        try {
            MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
            if (merchantWebViewDelegate != null) {
                merchantWebViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_FLOW, "URL change: " + str, str);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void sendRunningEvent(String str, String str2) {
        try {
            boolean isTransactionsUrlSet = this.mBot.isTransactionsUrlSet();
            MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
            if (isTransactionsUrlSet) {
                merchantWebViewDelegate.sendRunningEvent(this.mBot.getBotId(), Helper.formatCookiesForPuppeteer(this.merchantWebView.getCookies()), Helper.formatCookiesForPuppeteer(this.transactionCookies), this.merchantWebView.mExtraInfo, Boolean.valueOf(!this.shouldStartBot.booleanValue()), str, str2);
            } else {
                merchantWebViewDelegate.sendRunningEvent(this.mBot.getBotId(), Helper.formatCookiesForPuppeteer(this.merchantWebView.getCookies()), "", this.merchantWebView.mExtraInfo, Boolean.valueOf(!this.shouldStartBot.booleanValue()), str, str2);
            }
        } catch (Exception unused) {
        }
        System.out.println("paymentURL: " + this.mBot.getPaymentUrl());
        this.merchantWebView.evaluateJavascript(this.mBot.getScript(), null);
        if (this.mBot.getDetached().booleanValue()) {
            return;
        }
        dismiss();
    }

    public void setBot(Bot bot) {
        this.mBot = bot;
    }

    public void setInjectedAssets(Map<String, String> map) {
        this.pendingAssets = map;
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void setLoaderVisibility(int i) {
        KnotViewClient knotViewClient;
        KnotViewClient knotViewClient2;
        try {
            LoaderView loaderView = this.overlayLoader;
            if (loaderView != null) {
                KnotView knotView = this.merchantWebView;
                if (knotView == null || (knotViewClient2 = knotView.viewClient) == null || !knotViewClient2.isLoaderShownForRedirection) {
                    if (knotView != null && (knotViewClient = knotView.viewClient) != null) {
                        int i2 = 0;
                        if (knotViewClient.delayLoader && i == 8) {
                            new Handler(Looper.getMainLooper()).postDelayed(new MerchantWebViewListenerFragment$$ExternalSyntheticLambda8(i2, loaderView, knotViewClient), 1000L);
                            return;
                        }
                        performLoaderAction(i);
                        if (i == 8) {
                            knotViewClient.delayLoader = false;
                            return;
                        }
                        return;
                    }
                    performLoaderAction(i);
                }
            }
        } catch (Exception e) {
            Reporter.error(e, "Error in setLoaderVisibility");
        }
    }

    public void setMerchantIds(int[] iArr) {
        this.merchantIds = iArr;
    }

    public void setMerchantWebView(KnotView knotView) {
        this.merchantWebView = knotView;
    }

    public void setWebViewDelegate(MerchantWebViewDelegate merchantWebViewDelegate) {
        this.webViewDelegate = merchantWebViewDelegate;
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void showErrorView(String str) {
        try {
            WebView webView = this.errorWebView;
            if (webView != null) {
                webView.setVisibility(0);
                this.mBackIcon.setVisibility(8);
                this.errorWebView.loadUrl(str);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void toggleBackButton(boolean z) {
        if (!z) {
            try {
                ImageView imageView = this.mBackIcon;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        ImageView imageView2 = this.mBackIcon;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }
}
