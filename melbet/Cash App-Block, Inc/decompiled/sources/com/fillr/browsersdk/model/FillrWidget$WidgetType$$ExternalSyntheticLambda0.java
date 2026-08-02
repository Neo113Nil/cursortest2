package com.fillr.browsersdk.model;

import bo.app.q4$$ExternalSyntheticLambda0;
import com.bugsnag.android.Client;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.e0;
import com.fillr.n1;
import com.google.mlkit.vision.text.zzd;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final /* synthetic */ class FillrWidget$WidgetType$$ExternalSyntheticLambda0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FillrWidget$WidgetType$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public final Runnable taskForWebview(final FillrWebView fillrWebView, FillrWidget.WidgetType widgetType) {
        switch (this.$r8$classId) {
            case 0:
                return new Client.AnonymousClass7(widgetType, 19);
            case 1:
                return new q4$$ExternalSyntheticLambda0(23, fillrWebView, widgetType);
            case 2:
                final int i = 0;
                return new Runnable() { // from class: com.fillr.browsersdk.model.FillrWidget.WidgetType.6
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ FillrWebView val$webView;

                    public /* synthetic */ AnonymousClass6(final FillrWebView fillrWebView2, final int i2) {
                        r2 = i2;
                        r1 = fillrWebView2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        FillrWidget fillrWidget;
                        String str2;
                        int i2 = r2;
                        FillrWebView fillrWebView2 = r1;
                        switch (i2) {
                            case 0:
                                fillrWebView2.loadJavascript("window.FillrProductPageScraper.start();");
                                break;
                            case 1:
                                Fillr fillr = Fillr.getInstance();
                                n1 n1Var = n1.getInstance();
                                zzd zzdVar = zzd.getInstance();
                                if (fillr != null && n1Var != null && zzdVar != null) {
                                    e0 e0Var = fillr.mFillrCartInformationExtraction;
                                    if (e0Var != null) {
                                        if (((String) e0Var.h) == null && (fillrWidget = (FillrWidget) e0Var.i) != null && (str2 = fillrWidget.mWidgetJavaScript) != null) {
                                            Matcher matcher = Pattern.compile("exports=\"\\S+\"").matcher(str2);
                                            if (matcher.find() && matcher.group().split("\"").length > 1) {
                                                e0Var.h = matcher.group().split("\"")[1];
                                                SVG svg = Fillr.getInstance().fillrConfig;
                                            }
                                        }
                                        str = (String) e0Var.h;
                                    } else {
                                        str = "";
                                    }
                                    String webviewReference = n1Var.getWebviewReference(fillrWebView2);
                                    fillrWebView2.viewId = webviewReference;
                                    if (str == null) {
                                        fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.sendVersion()");
                                    }
                                    if (zzd.isFeatureEnabledForUrl("DisableCartProductExtraction", null)) {
                                        fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.setCartProductExtraction(false)");
                                    }
                                    fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.setViewId(new String('" + webviewReference + "'))");
                                    fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.start()");
                                    Objects.toString(fillrWebView2.getUrl());
                                    SVG svg2 = Fillr.getInstance().fillrConfig;
                                    break;
                                }
                                break;
                            default:
                                Fillr fillr2 = Fillr.getInstance();
                                n1 n1Var2 = n1.getInstance();
                                if (fillr2 != null && n1Var2 != null) {
                                    String webviewReference2 = n1Var2.getWebviewReference(fillrWebView2);
                                    fillrWebView2.viewId = webviewReference2;
                                    fillrWebView2.loadJavascript("PopWidgetInterface.setViewId(new String('" + webviewReference2 + "'))");
                                    fillrWebView2.loadJavascript("PopWidgetInterface.setupEvents(window);");
                                    fillrWebView2.loadJavascript("PopWidgetInterface.version();");
                                    if (fillr2.mFillMode == 2) {
                                        fillrWebView2.loadJavascript("PopWidgetInterface.startMonitor();");
                                        fillrWebView2.loadJavascript("PopWidgetInterface.getFields();");
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
            case 3:
                final int i2 = 1;
                return new Runnable() { // from class: com.fillr.browsersdk.model.FillrWidget.WidgetType.6
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ FillrWebView val$webView;

                    public /* synthetic */ AnonymousClass6(final FillrWebView fillrWebView2, final int i22) {
                        r2 = i22;
                        r1 = fillrWebView2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        FillrWidget fillrWidget;
                        String str2;
                        int i22 = r2;
                        FillrWebView fillrWebView2 = r1;
                        switch (i22) {
                            case 0:
                                fillrWebView2.loadJavascript("window.FillrProductPageScraper.start();");
                                break;
                            case 1:
                                Fillr fillr = Fillr.getInstance();
                                n1 n1Var = n1.getInstance();
                                zzd zzdVar = zzd.getInstance();
                                if (fillr != null && n1Var != null && zzdVar != null) {
                                    e0 e0Var = fillr.mFillrCartInformationExtraction;
                                    if (e0Var != null) {
                                        if (((String) e0Var.h) == null && (fillrWidget = (FillrWidget) e0Var.i) != null && (str2 = fillrWidget.mWidgetJavaScript) != null) {
                                            Matcher matcher = Pattern.compile("exports=\"\\S+\"").matcher(str2);
                                            if (matcher.find() && matcher.group().split("\"").length > 1) {
                                                e0Var.h = matcher.group().split("\"")[1];
                                                SVG svg = Fillr.getInstance().fillrConfig;
                                            }
                                        }
                                        str = (String) e0Var.h;
                                    } else {
                                        str = "";
                                    }
                                    String webviewReference = n1Var.getWebviewReference(fillrWebView2);
                                    fillrWebView2.viewId = webviewReference;
                                    if (str == null) {
                                        fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.sendVersion()");
                                    }
                                    if (zzd.isFeatureEnabledForUrl("DisableCartProductExtraction", null)) {
                                        fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.setCartProductExtraction(false)");
                                    }
                                    fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.setViewId(new String('" + webviewReference + "'))");
                                    fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.start()");
                                    Objects.toString(fillrWebView2.getUrl());
                                    SVG svg2 = Fillr.getInstance().fillrConfig;
                                    break;
                                }
                                break;
                            default:
                                Fillr fillr2 = Fillr.getInstance();
                                n1 n1Var2 = n1.getInstance();
                                if (fillr2 != null && n1Var2 != null) {
                                    String webviewReference2 = n1Var2.getWebviewReference(fillrWebView2);
                                    fillrWebView2.viewId = webviewReference2;
                                    fillrWebView2.loadJavascript("PopWidgetInterface.setViewId(new String('" + webviewReference2 + "'))");
                                    fillrWebView2.loadJavascript("PopWidgetInterface.setupEvents(window);");
                                    fillrWebView2.loadJavascript("PopWidgetInterface.version();");
                                    if (fillr2.mFillMode == 2) {
                                        fillrWebView2.loadJavascript("PopWidgetInterface.startMonitor();");
                                        fillrWebView2.loadJavascript("PopWidgetInterface.getFields();");
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
            default:
                final int i3 = 2;
                return new Runnable() { // from class: com.fillr.browsersdk.model.FillrWidget.WidgetType.6
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ FillrWebView val$webView;

                    public /* synthetic */ AnonymousClass6(final FillrWebView fillrWebView2, final int i32) {
                        r2 = i32;
                        r1 = fillrWebView2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        FillrWidget fillrWidget;
                        String str2;
                        int i22 = r2;
                        FillrWebView fillrWebView2 = r1;
                        switch (i22) {
                            case 0:
                                fillrWebView2.loadJavascript("window.FillrProductPageScraper.start();");
                                break;
                            case 1:
                                Fillr fillr = Fillr.getInstance();
                                n1 n1Var = n1.getInstance();
                                zzd zzdVar = zzd.getInstance();
                                if (fillr != null && n1Var != null && zzdVar != null) {
                                    e0 e0Var = fillr.mFillrCartInformationExtraction;
                                    if (e0Var != null) {
                                        if (((String) e0Var.h) == null && (fillrWidget = (FillrWidget) e0Var.i) != null && (str2 = fillrWidget.mWidgetJavaScript) != null) {
                                            Matcher matcher = Pattern.compile("exports=\"\\S+\"").matcher(str2);
                                            if (matcher.find() && matcher.group().split("\"").length > 1) {
                                                e0Var.h = matcher.group().split("\"")[1];
                                                SVG svg = Fillr.getInstance().fillrConfig;
                                            }
                                        }
                                        str = (String) e0Var.h;
                                    } else {
                                        str = "";
                                    }
                                    String webviewReference = n1Var.getWebviewReference(fillrWebView2);
                                    fillrWebView2.viewId = webviewReference;
                                    if (str == null) {
                                        fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.sendVersion()");
                                    }
                                    if (zzd.isFeatureEnabledForUrl("DisableCartProductExtraction", null)) {
                                        fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.setCartProductExtraction(false)");
                                    }
                                    fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.setViewId(new String('" + webviewReference + "'))");
                                    fillrWebView2.loadJavascript("FillrCartInformationExtractionInterface.start()");
                                    Objects.toString(fillrWebView2.getUrl());
                                    SVG svg2 = Fillr.getInstance().fillrConfig;
                                    break;
                                }
                                break;
                            default:
                                Fillr fillr2 = Fillr.getInstance();
                                n1 n1Var2 = n1.getInstance();
                                if (fillr2 != null && n1Var2 != null) {
                                    String webviewReference2 = n1Var2.getWebviewReference(fillrWebView2);
                                    fillrWebView2.viewId = webviewReference2;
                                    fillrWebView2.loadJavascript("PopWidgetInterface.setViewId(new String('" + webviewReference2 + "'))");
                                    fillrWebView2.loadJavascript("PopWidgetInterface.setupEvents(window);");
                                    fillrWebView2.loadJavascript("PopWidgetInterface.version();");
                                    if (fillr2.mFillMode == 2) {
                                        fillrWebView2.loadJavascript("PopWidgetInterface.startMonitor();");
                                        fillrWebView2.loadJavascript("PopWidgetInterface.getFields();");
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
        }
    }
}
