package com.miteksystems.misnap.document;

import android.graphics.Point;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import com.miteksystems.misnap.document.internal.BaseDocument;
import com.miteksystems.misnap.document.internal.SpikeNormalizer;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public final MiSnapSettings.Analysis.Document a;
    public final boolean b;
    public final boolean c;
    public final MiSnapSettings.Analysis.Document.Advanced.DocType d;
    public JSONObject e;
    public JSONObject f;
    public JSONObject g;
    public ArrayList h;
    public final MibiData.Session i;
    public final Lazy j;
    public final Lazy k;

    public abstract /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.Analysis.Document.Advanced.DocType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            a aVar = a.this;
            MiSnapSettings.Analysis.Document.Advanced advanced = aVar.a.advanced;
            boolean z = aVar.c;
            advanced.getClass();
            return new SpikeNormalizer(DocumentAnalysisSettings.a(advanced, z, advanced.k, DocumentAnalysisSettings.j.a));
        }
    }

    public final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            a aVar = a.this;
            MiSnapSettings.Analysis.Document.Advanced advanced = aVar.a.advanced;
            boolean z = aVar.c;
            advanced.getClass();
            return new SpikeNormalizer(DocumentAnalysisSettings.a(advanced, z, advanced.j, DocumentAnalysisSettings.l.a));
        }
    }

    public a(MiSnapSettings.Analysis.Document document, boolean z, boolean z2) {
        document.getClass();
        this.a = document;
        this.b = z;
        this.c = z2;
        this.d = DocumentAnalysisSettings.requireDocType(document.advanced);
        this.e = new JSONObject();
        this.f = new JSONObject();
        this.g = new JSONObject();
        this.h = new ArrayList();
        this.i = MibiData.bindSession();
        this.j = LazyKt.lazy(new d());
        this.k = LazyKt.lazy(new c());
    }

    public static int[][] a(Point[] pointArr) {
        int length = pointArr.length;
        int[][] iArr = new int[length][];
        for (int i = 0; i < length; i++) {
            iArr[i] = new int[2];
        }
        int length2 = pointArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            int[] iArr2 = iArr[i2];
            Point point = pointArr[i2];
            iArr2[0] = point.x;
            iArr2[1] = point.y;
        }
        return iArr;
    }

    public static boolean b(BaseDocument baseDocument) {
        if (!(baseDocument instanceof BaseDocument.Check)) {
            return false;
        }
        BaseDocument.Check check = (BaseDocument.Check) baseDocument;
        return check.getAccountNumber().length() > 0 || check.getCheckNumber().length() > 0 || check.getRoutingTransit().length() > 0;
    }
}
