package com.google.android.datatransport;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowAlgorithmCloud {
    public static final /* synthetic */ WinterFlowAlgorithmCloud[] WinterFlowResponseEngine;
    public static final WinterFlowUserManagerTesting WinterFlowRouterRouter;
    public static final WinterFlowWorkerMicroservice WinterFlowSyntax;
    public static final WinterFlowSoftwareObject WinterFlowUnitTestResponse;
    public final int WinterFlowTransactionManagerStrategy;
    public final WinterFlowJavaStructure WinterFlowVariableVersionControl;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowAlgorithmCloud EF0;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowAlgorithmCloud EF1;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowAlgorithmCloud EF2;

    static {
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud = new WinterFlowAlgorithmCloud("DOUBLE", 0, WinterFlowJavaStructure.WinterFlowRouterRouter, 1);
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud2 = new WinterFlowAlgorithmCloud("FLOAT", 1, WinterFlowJavaStructure.WinterFlowUnitTestResponse, 5);
        WinterFlowJavaStructure winterFlowJavaStructure = WinterFlowJavaStructure.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud3 = new WinterFlowAlgorithmCloud("INT64", 2, winterFlowJavaStructure, 0);
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud4 = new WinterFlowAlgorithmCloud("UINT64", 3, winterFlowJavaStructure, 0);
        WinterFlowJavaStructure winterFlowJavaStructure2 = WinterFlowJavaStructure.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud5 = new WinterFlowAlgorithmCloud("INT32", 4, winterFlowJavaStructure2, 0);
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud6 = new WinterFlowAlgorithmCloud("FIXED64", 5, winterFlowJavaStructure, 1);
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud7 = new WinterFlowAlgorithmCloud("FIXED32", 6, winterFlowJavaStructure2, 5);
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud8 = new WinterFlowAlgorithmCloud("BOOL", 7, WinterFlowJavaStructure.WinterFlowSyntax, 0);
        WinterFlowSoftwareObject winterFlowSoftwareObject = new WinterFlowSoftwareObject("STRING", 8, WinterFlowJavaStructure.WinterFlowResponseEngine, 2);
        WinterFlowUnitTestResponse = winterFlowSoftwareObject;
        WinterFlowJavaStructure winterFlowJavaStructure3 = WinterFlowJavaStructure.WinterFlowThreadListener;
        WinterFlowUserManagerTesting winterFlowUserManagerTesting = new WinterFlowUserManagerTesting("GROUP", 9, winterFlowJavaStructure3, 3);
        WinterFlowRouterRouter = winterFlowUserManagerTesting;
        WinterFlowWorkerMicroservice winterFlowWorkerMicroservice = new WinterFlowWorkerMicroservice("MESSAGE", 10, winterFlowJavaStructure3, 2);
        WinterFlowSyntax = winterFlowWorkerMicroservice;
        WinterFlowResponseEngine = new WinterFlowAlgorithmCloud[]{winterFlowAlgorithmCloud, winterFlowAlgorithmCloud2, winterFlowAlgorithmCloud3, winterFlowAlgorithmCloud4, winterFlowAlgorithmCloud5, winterFlowAlgorithmCloud6, winterFlowAlgorithmCloud7, winterFlowAlgorithmCloud8, winterFlowSoftwareObject, winterFlowUserManagerTesting, winterFlowWorkerMicroservice, new WinterFlowArrayPlatform("BYTES", 11, WinterFlowJavaStructure.WinterFlowTransactionAgent, 2), new WinterFlowAlgorithmCloud("UINT32", 12, winterFlowJavaStructure2, 0), new WinterFlowAlgorithmCloud("ENUM", 13, WinterFlowJavaStructure.WinterFlowServerProtocol, 0), new WinterFlowAlgorithmCloud("SFIXED32", 14, winterFlowJavaStructure2, 5), new WinterFlowAlgorithmCloud("SFIXED64", 15, winterFlowJavaStructure, 1), new WinterFlowAlgorithmCloud("SINT32", 16, winterFlowJavaStructure2, 0), new WinterFlowAlgorithmCloud("SINT64", 17, winterFlowJavaStructure, 0)};
    }

    public WinterFlowAlgorithmCloud(String str, int i, WinterFlowJavaStructure winterFlowJavaStructure, int i2) {
        this.WinterFlowVariableVersionControl = winterFlowJavaStructure;
        this.WinterFlowTransactionManagerStrategy = i2;
    }

    public static WinterFlowAlgorithmCloud valueOf(String str) {
        return (WinterFlowAlgorithmCloud) Enum.valueOf(WinterFlowAlgorithmCloud.class, str);
    }

    public static WinterFlowAlgorithmCloud[] values() {
        return (WinterFlowAlgorithmCloud[]) WinterFlowResponseEngine.clone();
    }
}
