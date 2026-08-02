package com.miteksystems.misnap.document;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.WindowCompat$Api35Impl;
import com.miteksystems.misnap.core.LicenseException;
import com.miteksystems.misnap.core.LicenseStatus;
import com.miteksystems.misnap.core.LicenseUtil;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.document.internal.DocumentAnalyzerNativeWrapper;
import java.lang.ref.WeakReference;
import kotlin.Result;
import net.oneformapp.helper.HelperFunctions;

/* loaded from: classes4.dex */
public final class MiSnapDocumentAnalyzer {
    public int a;
    public final boolean b;
    public final DocumentAnalyzerNativeWrapper c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final MiSnapSettings.Analysis.Document h;
    public final boolean i;
    public final a j;
    public final MiSnapSettings.Analysis.Document.Advanced.DocType k;
    public final WeakReference l;
    public final MibiData.Session m;
    public final MiSnapDocumentAnalyzer$displayListener$1 n;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LicenseStatus.values().length];
            try {
                iArr[LicenseStatus.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LicenseStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$displayListener$1] */
    public MiSnapDocumentAnalyzer(final Context context, MiSnapSettings.Analysis.Document document, String str) {
        Object failure;
        document.getClass();
        str.getClass();
        int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context);
        boolean z = true;
        boolean z2 = DocumentAnalysisSettings.requireTrigger(document) != MiSnapSettings.Analysis.Document.Trigger.MANUAL;
        DocumentAnalyzerNativeWrapper documentAnalyzerNativeWrapper = new DocumentAnalyzerNativeWrapper();
        this.a = deviceCurrentBasicOrientation;
        this.b = true;
        this.c = documentAnalyzerNativeWrapper;
        MiSnapSettings.Analysis.Document m2166clone = document.m2166clone();
        this.h = m2166clone;
        Object systemService = context.getSystemService("accessibility");
        String str2 = null;
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        boolean z3 = accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        this.i = z3;
        this.j = new a(m2166clone, z2, z3);
        MiSnapSettings.Analysis.Document.Advanced.DocType requireDocType = DocumentAnalysisSettings.requireDocType(document.advanced);
        this.k = requireDocType;
        this.l = new WeakReference(context);
        this.m = MibiData.bindSession();
        this.n = new DisplayManager.DisplayListener() { // from class: com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$displayListener$1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i) {
                MiSnapDocumentAnalyzer miSnapDocumentAnalyzer = MiSnapDocumentAnalyzer.this;
                if (((Context) miSnapDocumentAnalyzer.l.get()) != null) {
                    miSnapDocumentAnalyzer.a = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context);
                }
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i) {
            }
        };
        try {
            this.f = documentAnalyzerNativeWrapper.a(str, requireDocType);
            boolean z4 = LicenseUtil.a;
            LicenseStatus checkLicenseStatus = HelperFunctions.checkLicenseStatus(str, null);
            int i = WhenMappings.$EnumSwitchMapping$0[checkLicenseStatus.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str2 = checkLicenseStatus.toMessage();
                } else {
                    this.g = true;
                }
            }
        } catch (LicenseException e) {
            str2 = e.getMessage();
        }
        this.e = str2;
        try {
            Result.Companion companion = Result.Companion;
            boolean z5 = LicenseUtil.a;
            int i2 = WhenMappings.$EnumSwitchMapping$0[HelperFunctions.checkLicenseStatus(str, "ode").ordinal()];
            if (i2 != 1 && i2 != 2) {
                this.m.addUxpEvent("ODELF", new String[0]);
                z = false;
            }
            failure = Boolean.valueOf(z);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (Result.m4120exceptionOrNullimpl(failure) != null) {
            this.m.addUxpEvent("ODELF", new String[0]);
            failure = Boolean.FALSE;
        }
        this.d = ((Boolean) failure).booleanValue();
        if (this.b) {
            Object systemService2 = context.getSystemService("display");
            systemService2.getClass();
            DisplayManager displayManager = (DisplayManager) systemService2;
            MiSnapDocumentAnalyzer$displayListener$1 miSnapDocumentAnalyzer$displayListener$1 = this.n;
            Looper myLooper = Looper.myLooper();
            displayManager.registerDisplayListener(miSnapDocumentAnalyzer$displayListener$1, new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
        }
    }
}
