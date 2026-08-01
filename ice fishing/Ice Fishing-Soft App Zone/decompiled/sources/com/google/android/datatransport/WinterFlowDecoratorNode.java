package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDecoratorNode {
    public static final WinterFlowUIVersion WinterFlowHookDataSource;
    public static final Comparator[] WinterFlowRouterStructure;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new WinterFlowParserPlatform(new WinterFlowParserPlatform(i == 0 ? WinterFlowClassSystem.WinterFlowVariableVersionControl : WinterFlowClassSystem.WinterFlowCacheManagerAgent));
            i++;
        }
        WinterFlowRouterStructure = comparatorArr;
        WinterFlowHookDataSource = WinterFlowUIVersion.WinterFlowServerProtocol;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList WinterFlowHookDataSource(WinterFlowProcessorSystem winterFlowProcessorSystem, WinterFlowProviderFramework winterFlowProviderFramework, WinterFlowProviderFramework winterFlowProviderFramework2, List list) {
        int i;
        WinterFlowViewSoftware winterFlowViewSoftware = WinterFlowVersionControlAgent.WinterFlowRouterStructure;
        WinterFlowViewSoftware winterFlowViewSoftware2 = new WinterFlowViewSoftware();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            WinterFlowRouterStructure((WinterFlowProcessorSystem) list.get(i2), arrayList, winterFlowProviderFramework, winterFlowProviderFramework2, winterFlowViewSoftware2);
        }
        int i3 = 1;
        char c = winterFlowProcessorSystem.WinterFlowCacheManagerAgent.WinterFlowCompilerVariable == WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                WinterFlowProcessorSystem winterFlowProcessorSystem2 = (WinterFlowProcessorSystem) arrayList.get(i4);
                if (i4 != 0) {
                    float f = winterFlowProcessorSystem2.WinterFlowRouterRouter().WinterFlowHookDataSource;
                    float f2 = winterFlowProcessorSystem2.WinterFlowRouterRouter().WinterFlowArrayNetwork;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) ((WinterFlowServerPlatform) arrayList2.get(i6)).WinterFlowVariableVersionControl;
                            float f3 = winterFlowVersionParser.WinterFlowHookDataSource;
                            i = i3;
                            float f4 = winterFlowVersionParser.WinterFlowArrayNetwork;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new WinterFlowServerPlatform(new WinterFlowVersionParser(Math.max(winterFlowVersionParser.WinterFlowRouterStructure, 0.0f), Math.max(winterFlowVersionParser.WinterFlowHookDataSource, f), Math.min(winterFlowVersionParser.WinterFlowCacheManagerAgent, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((WinterFlowServerPlatform) arrayList2.get(i6)).WinterFlowTransactionManagerStrategy));
                                ((List) ((WinterFlowServerPlatform) arrayList2.get(i6)).WinterFlowTransactionManagerStrategy).add(winterFlowProcessorSystem2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        arrayList2.add(new WinterFlowServerPlatform(winterFlowProcessorSystem2.WinterFlowRouterRouter(), WinterFlowUnitTestLibrary.WinterFlowSyntaxSubsystem(winterFlowProcessorSystem2)));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new WinterFlowServerPlatform(winterFlowProcessorSystem2.WinterFlowRouterRouter(), WinterFlowUnitTestLibrary.WinterFlowSyntaxSubsystem(winterFlowProcessorSystem2)));
                if (i4 != size2) {
                }
            }
        } else {
            i = 1;
        }
        WinterFlowObjectHelper.WinterFlowSessionManagerInterface(arrayList2, WinterFlowClassSystem.WinterFlowTransactionManagerStrategy);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = WinterFlowRouterStructure[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) arrayList2.get(i8);
            WinterFlowObjectHelper.WinterFlowSessionManagerInterface((List) winterFlowServerPlatform.WinterFlowTransactionManagerStrategy, comparator);
            arrayList3.addAll((Collection) winterFlowServerPlatform.WinterFlowTransactionManagerStrategy);
        }
        int i9 = i;
        WinterFlowObjectHelper.WinterFlowSessionManagerInterface(arrayList3, new WinterFlowAPINode(i9, WinterFlowHookDataSource));
        int i10 = 0;
        while (i10 <= arrayList3.size() - i9) {
            List list2 = (List) winterFlowViewSoftware2.WinterFlowHookDataSource(((WinterFlowProcessorSystem) arrayList3.get(i10)).WinterFlowTransactionManagerStrategy);
            if (list2 != null) {
                if (((Boolean) winterFlowProviderFramework2.WinterFlowUnitTestResponse(arrayList3.get(i10))).booleanValue()) {
                    i10++;
                } else {
                    arrayList3.remove(i10);
                }
                arrayList3.addAll(i10, list2);
                i10 += list2.size();
            } else {
                i10++;
            }
        }
        return arrayList3;
    }

    public static final void WinterFlowRouterStructure(WinterFlowProcessorSystem winterFlowProcessorSystem, ArrayList arrayList, WinterFlowProviderFramework winterFlowProviderFramework, WinterFlowProviderFramework winterFlowProviderFramework2, WinterFlowViewSoftware winterFlowViewSoftware) {
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        Object WinterFlowUnitTestResponse = winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowServiceUtility);
        if (WinterFlowUnitTestResponse == null) {
            WinterFlowUnitTestResponse = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) WinterFlowUnitTestResponse).booleanValue();
        if ((booleanValue || ((Boolean) winterFlowProviderFramework2.WinterFlowUnitTestResponse(winterFlowProcessorSystem)).booleanValue()) && ((Boolean) winterFlowProviderFramework.WinterFlowUnitTestResponse(winterFlowProcessorSystem)).booleanValue()) {
            arrayList.add(winterFlowProcessorSystem);
        }
        if (booleanValue) {
            winterFlowViewSoftware.WinterFlowRouterRouter(winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy, WinterFlowHookDataSource(winterFlowProcessorSystem, winterFlowProviderFramework, winterFlowProviderFramework2, WinterFlowProcessorSystem.WinterFlowResponseEngine(7, winterFlowProcessorSystem)));
            return;
        }
        List WinterFlowResponseEngine = WinterFlowProcessorSystem.WinterFlowResponseEngine(7, winterFlowProcessorSystem);
        int size = WinterFlowResponseEngine.size();
        for (int i = 0; i < size; i++) {
            WinterFlowRouterStructure((WinterFlowProcessorSystem) WinterFlowResponseEngine.get(i), arrayList, winterFlowProviderFramework, winterFlowProviderFramework2, winterFlowViewSoftware);
        }
    }
}
