package com.google.android.datatransport;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.icewinter.flow.winter.icecatch.R;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowInheritanceProtocol extends WinterFlowDecoratorUI {
    public static int WinterFlowSoftwareProtocol(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font WinterFlowStrategyTool(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(Constants.MINIMAL_ERROR_STATUS_CODE, 0);
        Font font = fontFamily.getFont(0);
        int WinterFlowSoftwareProtocol = WinterFlowSoftwareProtocol(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            Font font2 = fontFamily.getFont(i);
            int WinterFlowSoftwareProtocol2 = WinterFlowSoftwareProtocol(fontStyle, font2.getStyle());
            if (WinterFlowSoftwareProtocol2 < WinterFlowSoftwareProtocol) {
                font = font2;
                WinterFlowSoftwareProtocol = WinterFlowSoftwareProtocol2;
            }
        }
        return font;
    }

    public final FontFamily WinterFlowCacheManagerListener(WinterFlowLibraryEntity[] winterFlowLibraryEntityArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (WinterFlowLibraryEntity winterFlowLibraryEntity : winterFlowLibraryEntityArr) {
            if (Objects.equals(winterFlowLibraryEntity.WinterFlowRouterStructure.getScheme(), "systemfont")) {
                font = WinterFlowPackageIDE(winterFlowLibraryEntity);
            } else {
                try {
                    Uri uri = winterFlowLibraryEntity.WinterFlowRouterStructure;
                    str = winterFlowLibraryEntity.WinterFlowVariableVersionControl;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(winterFlowLibraryEntity.WinterFlowCacheManagerAgent).setSlant(winterFlowLibraryEntity.WinterFlowArrayNetwork ? 1 : 0).setTtcIndex(winterFlowLibraryEntity.WinterFlowHookDataSource);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font WinterFlowPackageIDE(WinterFlowLibraryEntity winterFlowLibraryEntity) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorUI
    public final Typeface WinterFlowServerProtocol(Context context, WinterFlowLibraryEntity[] winterFlowLibraryEntityArr) {
        try {
            FontFamily WinterFlowCacheManagerListener = WinterFlowCacheManagerListener(winterFlowLibraryEntityArr, context.getContentResolver());
            if (WinterFlowCacheManagerListener == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(WinterFlowCacheManagerListener).setStyle(WinterFlowStrategyTool(WinterFlowCacheManagerListener).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorUI
    public final Typeface WinterFlowServiceUtility(Context context, Resources resources, String str) {
        try {
            Font build = new Font.Builder(resources, R.font.winter_app_font).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorUI
    public final Typeface WinterFlowThreadListener(Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily WinterFlowCacheManagerListener = WinterFlowCacheManagerListener((WinterFlowLibraryEntity[]) list.get(0), contentResolver);
            if (WinterFlowCacheManagerListener == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(WinterFlowCacheManagerListener);
            for (int i = 1; i < list.size(); i++) {
                FontFamily WinterFlowCacheManagerListener2 = WinterFlowCacheManagerListener((WinterFlowLibraryEntity[]) list.get(i), contentResolver);
                if (WinterFlowCacheManagerListener2 != null) {
                    customFallbackBuilder.addCustomFallback(WinterFlowCacheManagerListener2);
                }
            }
            return customFallbackBuilder.setStyle(WinterFlowStrategyTool(WinterFlowCacheManagerListener).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorUI
    public final Typeface WinterFlowTransactionAgent(Context context, WinterFlowDecoratorView winterFlowDecoratorView, Resources resources) {
        try {
            FontFamily.Builder builder = null;
            for (WinterFlowExceptionHook winterFlowExceptionHook : winterFlowDecoratorView.WinterFlowRouterStructure) {
                try {
                    Font build = new Font.Builder(resources, winterFlowExceptionHook.WinterFlowTransactionManagerStrategy).setWeight(winterFlowExceptionHook.WinterFlowHookDataSource).setSlant(winterFlowExceptionHook.WinterFlowCacheManagerAgent ? 1 : 0).setTtcIndex(winterFlowExceptionHook.WinterFlowVariableVersionControl).setFontVariationSettings(winterFlowExceptionHook.WinterFlowArrayNetwork).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(WinterFlowStrategyTool(build2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }
}
