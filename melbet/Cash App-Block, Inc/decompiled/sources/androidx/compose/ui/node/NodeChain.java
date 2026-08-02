package androidx.compose.ui.node;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.text.input.internal.ImeEditCommandScope;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.GraphicsLayerOwnerLayer;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.api.ApiResult;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.internal.dag.ContextModule;
import com.datadog.trace.core.util.GlobPattern;
import com.datadog.trace.core.util.JsonObjectUtils;
import com.datadog.trace.core.util.Matchers;
import com.datadog.trace.util.Strings;
import com.fillr.analytics.util.HttpService;
import com.fillr.browsersdk.BrowserSDKLogger$Companion;
import com.squareup.cash.cdf.ContactClearDataReason;
import com.squareup.cash.cdf.ContactSkipReason;
import com.squareup.cash.cdf.ContactSyncResult;
import com.squareup.cash.cdf.ContactSyncTriggerReason;
import com.squareup.cash.cdf.ContactSyncType;
import com.squareup.cash.cdf.contact.ContactSyncSendToServer;
import com.squareup.cash.contacts.encryption.HybridEncryptor;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$FullDetails;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$LatestAndRow;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$PrimaryKey;
import com.squareup.cash.data.contacts.ContactSync$SyncReason;
import com.squareup.cash.data.contacts.ContactsSyncResponse;
import com.squareup.cash.data.contacts.ContactsSyncRoutine;
import com.squareup.cash.data.contacts.DetailedContactsSyncEncryptedRoutine$WhenMappings;
import com.squareup.cash.data.contacts.DetailedContactsSyncEncryptedRoutine$buildProtoList$1;
import com.squareup.cash.data.contacts.DetailedContactsSyncEncryptedRoutine$contactsSync$1;
import com.squareup.cash.data.contacts.DetailedContactsSyncEncryptedRoutine$uploadAddressBook$1;
import com.squareup.cash.data.contacts.DetailedContactsSyncEncryptedRoutine$write$1;
import com.squareup.cash.data.contacts.ImageMetaDataExtract$ImageMetaData;
import com.squareup.cash.data.contacts.RealContactDetailsSyncState;
import com.squareup.cash.data.contacts.RealContactSyncDetailsRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.Sync_details;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.ContactDetailsSyncStateQueries$all$2;
import com.squareup.cash.db2.contacts.Contact_detailed_sync_state;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.exif.ExifInterface;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.ContactBook$Contact$DetailedContact;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.contacts.app.AddressBookContact;
import com.squareup.protos.cash.contacts.app.ContactsAppClientService;
import com.squareup.protos.cash.contacts.app.ContactsPatch;
import com.squareup.protos.cash.contacts.app.SyncContactsRequest;
import com.squareup.protos.cash.contacts.app.SyncContactsResponse;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.util.android.Emails;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Regions;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingConfig;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.RequestFactory;

/* loaded from: classes.dex */
public final class NodeChain implements ImeEditCommandScope, ContactsSyncRoutine {
    public final /* synthetic */ int $r8$classId;
    public Object buffer;
    public Object cachedDiffer;
    public Object current;
    public Object head;
    public final Object innerCoordinator;
    public final Object layoutNode;
    public Object outerCoordinator;
    public final Object sentinelHead;
    public final Object stack;
    public final Object tail;

    public final class Differ {
        public MutableVector after;
        public MutableVector before;
        public Modifier.Node node;
        public int offset;
        public boolean shouldAttachOnInsert;

        public Differ(Modifier.Node node, int i, MutableVector mutableVector, MutableVector mutableVector2, boolean z) {
            this.node = node;
            this.offset = i;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z;
        }

        public final boolean areItemsTheSame(int i, int i2) {
            MutableVector mutableVector = this.before;
            int i3 = this.offset;
            Modifier.Element element = (Modifier.Element) mutableVector.content[i + i3];
            Modifier.Element element2 = (Modifier.Element) this.after.content[i3 + i2];
            return Intrinsics.areEqual(element, element2) || element.getClass() == element2.getClass();
        }
    }

    public NodeChain(ContactsAppClientService contactsAppClientService, RealContactSyncDetailsRepository realContactSyncDetailsRepository, RealContactDetailsSyncState realContactDetailsSyncState, ContextModule contextModule, UiAlias.Type.Companion companion, AndroidClock androidClock, Analytics analytics, RealProfileManager realProfileManager, RealContactBook realContactBook, Context context) {
        this.$r8$classId = 9;
        this.layoutNode = contactsAppClientService;
        this.sentinelHead = realContactSyncDetailsRepository;
        this.innerCoordinator = realContactDetailsSyncState;
        this.outerCoordinator = companion;
        this.tail = androidClock;
        this.head = analytics;
        this.current = realProfileManager;
        this.buffer = realContactBook;
        this.stack = context;
        InputStream open = contextModule.ctx.getAssets().open("contacts_public_key_production.json");
        open.getClass();
        this.cachedDiffer = new HybridEncryptor(open);
    }

    public static final void access$propagateCoordinator(NodeChain nodeChain, Modifier.Node node, NodeCoordinator nodeCoordinator) {
        for (Modifier.Node parent$ui = node.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (parent$ui == ((NodeChain$sentinelHead$1) nodeChain.sentinelHead)) {
                LayoutNode parent$ui2 = ((LayoutNode) nodeChain.layoutNode).getParent$ui();
                nodeCoordinator.wrappedBy = parent$ui2 != null ? (InnerNodeCoordinator) parent$ui2.nodes.innerCoordinator : null;
                nodeChain.outerCoordinator = nodeCoordinator;
                return;
            } else {
                if ((parent$ui.getKindSet$ui() & 2) != 0) {
                    return;
                }
                parent$ui.updateCoordinator$ui(nodeCoordinator);
            }
        }
    }

    public static Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        Modifier.Node node2;
        if (element instanceof ModifierNodeElement) {
            node2 = ((ModifierNodeElement) element).create();
            node2.setKindSet$ui(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node2));
        } else {
            BackwardsCompatNode backwardsCompatNode = new BackwardsCompatNode();
            backwardsCompatNode.setKindSet$ui(NodeKindKt.calculateNodeKindSetFrom(element));
            backwardsCompatNode.element = element;
            backwardsCompatNode.readValues = new HashSet();
            node2 = backwardsCompatNode;
        }
        if (node2.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        node2.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        Modifier.Node child$ui = node.getChild$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(node2);
            node2.setChild$ui(child$ui);
        }
        node.setChild$ui(node2);
        node2.setParent$ui(node);
        return node2;
    }

    public static Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            MutableObjectIntMap mutableObjectIntMap = NodeKindKt.classToKindSetMap;
            if (!node.isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
            }
            NodeKindKt.autoInvalidateNodeIncludingDelegates(node, -1, 2);
            node.runDetachLifecycle$ui();
            node.markAsDetached$ui();
        }
        Modifier.Node child$ui = node.getChild$ui();
        Modifier.Node parent$ui = node.getParent$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(parent$ui);
            node.setChild$ui(null);
        }
        if (parent$ui != null) {
            parent$ui.setChild$ui(child$ui);
            node.setParent$ui(null);
        }
        parent$ui.getClass();
        return parent$ui;
    }

    public static void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            node.getClass();
            ((ModifierNodeElement) element2).update(node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            InlineClassHelperKt.throwIllegalStateException("Unknown Modifier.Node type");
            return;
        }
        BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) node;
        if (backwardsCompatNode.isAttached()) {
            backwardsCompatNode.unInitializeModifier();
        }
        backwardsCompatNode.element = element2;
        backwardsCompatNode.setKindSet$ui(NodeKindKt.calculateNodeKindSetFrom(element2));
        if (backwardsCompatNode.isAttached()) {
            backwardsCompatNode.initializeModifier(false);
        }
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateUpdatedNode(node);
        } else {
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c8 A[LOOP:3: B:90:0x01c2->B:92:0x01c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable buildProtoList(List list, ContinuationImpl continuationImpl) {
        DetailedContactsSyncEncryptedRoutine$buildProtoList$1 detailedContactsSyncEncryptedRoutine$buildProtoList$1;
        int i;
        List list2;
        Iterator it;
        ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact;
        ImageMetaDataExtract$ImageMetaData imageMetaDataExtract$ImageMetaData;
        final Long l;
        if (continuationImpl instanceof DetailedContactsSyncEncryptedRoutine$buildProtoList$1) {
            detailedContactsSyncEncryptedRoutine$buildProtoList$1 = (DetailedContactsSyncEncryptedRoutine$buildProtoList$1) continuationImpl;
            int i2 = detailedContactsSyncEncryptedRoutine$buildProtoList$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                detailedContactsSyncEncryptedRoutine$buildProtoList$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = detailedContactsSyncEncryptedRoutine$buildProtoList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedContactsSyncEncryptedRoutine$buildProtoList$1.label;
                ContactBook$Contact$DetailedContact.LabeledData labeledData = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileManager realProfileManager = (RealProfileManager) this.current;
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(StateFlowKt.runUntil(DBUtil.toFlow(realProfileManager.profileQueries.selectRegion()), realProfileManager.signOutSignal), realProfileManager.ioDispatcher);
                    detailedContactsSyncEncryptedRoutine$buildProtoList$1.L$0 = list;
                    detailedContactsSyncEncryptedRoutine$buildProtoList$1.label = 1;
                    obj = FlowKt.first(mapToOneOrNull, detailedContactsSyncEncryptedRoutine$buildProtoList$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = list;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = detailedContactsSyncEncryptedRoutine$buildProtoList$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                SelectRegion selectRegion = (SelectRegion) obj;
                Region region = selectRegion == null ? selectRegion.region : null;
                List<ContactBook$Contact$DetailedContact> list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact2 : list3) {
                    List<ContactBook$Contact$DetailedContact.LabeledData> phoneNumbers = contactBook$Contact$DetailedContact2.getPhoneNumbers();
                    ArrayList arrayList2 = new ArrayList();
                    for (ContactBook$Contact$DetailedContact.LabeledData labeledData2 : phoneNumbers) {
                        String normalize = PhoneNumbers.normalize(labeledData2.getValue(), region != null ? Regions.toCountry(region).name() : labeledData);
                        ContactBook$Contact$DetailedContact.LabeledData labeledData3 = normalize != null ? new ContactBook$Contact$DetailedContact.LabeledData(labeledData2.getLabel(), normalize) : labeledData;
                        if (labeledData3 != null) {
                            arrayList2.add(labeledData3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    List<ContactBook$Contact$DetailedContact.LabeledData> emailAddresses = contactBook$Contact$DetailedContact2.getEmailAddresses();
                    ArrayList arrayList4 = new ArrayList();
                    for (ContactBook$Contact$DetailedContact.LabeledData labeledData4 : emailAddresses) {
                        String normalize2 = Emails.normalize(labeledData4.getValue());
                        ContactBook$Contact$DetailedContact.LabeledData labeledData5 = normalize2 != null ? new ContactBook$Contact$DetailedContact.LabeledData(labeledData4.getLabel(), normalize2) : labeledData;
                        if (labeledData5 != null) {
                            arrayList4.add(labeledData5);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList4);
                    String imagePath = contactBook$Contact$DetailedContact2.getImagePath();
                    if (imagePath != null) {
                        UiAlias.Type.Companion companion = (UiAlias.Type.Companion) this.outerCoordinator;
                        try {
                            AssetFileDescriptor openAssetFileDescriptor = ((Context) this.stack).getContentResolver().openAssetFileDescriptor(Uri.parse(imagePath), "r");
                            if (openAssetFileDescriptor == null) {
                                imageMetaDataExtract$ImageMetaData = labeledData;
                                contactBook$Contact$DetailedContact = contactBook$Contact$DetailedContact2;
                            } else {
                                ExifInterface exifInterface = new ExifInterface(openAssetFileDescriptor.createInputStream());
                                final String json = companion.toJson(exifInterface);
                                openAssetFileDescriptor.close();
                                final long length = openAssetFileDescriptor.getLength();
                                if (exifInterface.getAttributeInt("ImageWidth") != null) {
                                    contactBook$Contact$DetailedContact = contactBook$Contact$DetailedContact2;
                                    try {
                                        l = Long.valueOf(r5.intValue());
                                    } catch (IOException unused) {
                                    }
                                } else {
                                    contactBook$Contact$DetailedContact = contactBook$Contact$DetailedContact2;
                                    l = null;
                                }
                                final Long valueOf = exifInterface.getAttributeInt("ImageLength") != null ? Long.valueOf(r5.intValue()) : null;
                                imageMetaDataExtract$ImageMetaData = new Object(length, l, valueOf, json) { // from class: com.squareup.cash.data.contacts.ImageMetaDataExtract$ImageMetaData
                                    public final String exifJson;
                                    public final Long height;
                                    public final long sizeBytes;
                                    public final Long width;

                                    {
                                        json.getClass();
                                        this.sizeBytes = length;
                                        this.width = l;
                                        this.height = valueOf;
                                        this.exifJson = json;
                                    }

                                    public final boolean equals(Object obj2) {
                                        if (this == obj2) {
                                            return true;
                                        }
                                        if (!(obj2 instanceof ImageMetaDataExtract$ImageMetaData)) {
                                            return false;
                                        }
                                        ImageMetaDataExtract$ImageMetaData imageMetaDataExtract$ImageMetaData2 = (ImageMetaDataExtract$ImageMetaData) obj2;
                                        return this.sizeBytes == imageMetaDataExtract$ImageMetaData2.sizeBytes && Intrinsics.areEqual(this.width, imageMetaDataExtract$ImageMetaData2.width) && Intrinsics.areEqual(this.height, imageMetaDataExtract$ImageMetaData2.height) && Intrinsics.areEqual(this.exifJson, imageMetaDataExtract$ImageMetaData2.exifJson);
                                    }

                                    public final String getExifJson() {
                                        return this.exifJson;
                                    }

                                    public final Long getHeight() {
                                        return this.height;
                                    }

                                    public final long getSizeBytes() {
                                        return this.sizeBytes;
                                    }

                                    public final Long getWidth() {
                                        return this.width;
                                    }

                                    public final int hashCode() {
                                        int hashCode = Long.hashCode(this.sizeBytes) * 31;
                                        Long l2 = this.width;
                                        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
                                        Long l3 = this.height;
                                        return this.exifJson.hashCode() + ((hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31);
                                    }

                                    public final String toString() {
                                        return "ImageMetaData(sizeBytes=" + this.sizeBytes + ", width=" + this.width + ", height=" + this.height + ", exifJson=" + this.exifJson + ")";
                                    }
                                };
                            }
                        } catch (IOException unused2) {
                        }
                        arrayList.add(ContactBook$Contact$DetailedContact.copy$default(contactBook$Contact$DetailedContact, null, arrayList5, arrayList3, imageMetaDataExtract$ImageMetaData == 0 ? new Long(imageMetaDataExtract$ImageMetaData.getSizeBytes()) : null, imageMetaDataExtract$ImageMetaData == 0 ? imageMetaDataExtract$ImageMetaData.getWidth() : null, imageMetaDataExtract$ImageMetaData == 0 ? imageMetaDataExtract$ImageMetaData.getHeight() : null, imageMetaDataExtract$ImageMetaData == 0 ? imageMetaDataExtract$ImageMetaData.getExifJson() : null, -2015625217));
                        labeledData = null;
                    }
                    contactBook$Contact$DetailedContact = contactBook$Contact$DetailedContact2;
                    imageMetaDataExtract$ImageMetaData = 0;
                    arrayList.add(ContactBook$Contact$DetailedContact.copy$default(contactBook$Contact$DetailedContact, null, arrayList5, arrayList3, imageMetaDataExtract$ImageMetaData == 0 ? new Long(imageMetaDataExtract$ImageMetaData.getSizeBytes()) : null, imageMetaDataExtract$ImageMetaData == 0 ? imageMetaDataExtract$ImageMetaData.getWidth() : null, imageMetaDataExtract$ImageMetaData == 0 ? imageMetaDataExtract$ImageMetaData.getHeight() : null, imageMetaDataExtract$ImageMetaData == 0 ? imageMetaDataExtract$ImageMetaData.getExifJson() : null, -2015625217));
                    labeledData = null;
                }
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList6.add(HttpService.toProto((ContactBook$Contact$DetailedContact) it.next()));
                }
                return arrayList6;
            }
        }
        detailedContactsSyncEncryptedRoutine$buildProtoList$1 = new DetailedContactsSyncEncryptedRoutine$buildProtoList$1(this, continuationImpl);
        Object obj2 = detailedContactsSyncEncryptedRoutine$buildProtoList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedContactsSyncEncryptedRoutine$buildProtoList$1.label;
        ContactBook$Contact$DetailedContact.LabeledData labeledData6 = null;
        if (i != 0) {
        }
        SelectRegion selectRegion2 = (SelectRegion) obj2;
        if (selectRegion2 == null) {
        }
        List<ContactBook$Contact$DetailedContact> list32 = list2;
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10));
        while (r2.hasNext()) {
        }
        ArrayList arrayList62 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
        it = arrayList7.iterator();
        while (it.hasNext()) {
        }
        return arrayList62;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r12 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3 A[LOOP:0: B:13:0x00ad->B:15:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.squareup.cash.data.contacts.ContactsSyncRoutine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object contactsSync(List list, ContactSync$SyncReason contactSync$SyncReason, ContinuationImpl continuationImpl) {
        DetailedContactsSyncEncryptedRoutine$contactsSync$1 detailedContactsSyncEncryptedRoutine$contactsSync$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Serializable buildProtoList;
        Map map;
        Map map2;
        RealContactDetailsSyncState realContactDetailsSyncState = (RealContactDetailsSyncState) this.innerCoordinator;
        if (continuationImpl instanceof DetailedContactsSyncEncryptedRoutine$contactsSync$1) {
            detailedContactsSyncEncryptedRoutine$contactsSync$1 = (DetailedContactsSyncEncryptedRoutine$contactsSync$1) continuationImpl;
            int i2 = detailedContactsSyncEncryptedRoutine$contactsSync$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                detailedContactsSyncEncryptedRoutine$contactsSync$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = detailedContactsSyncEncryptedRoutine$contactsSync$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedContactsSyncEncryptedRoutine$contactsSync$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealContactBook realContactBook = (RealContactBook) this.buffer;
                    LinkedHashMap lastSyncIdentifiers = realContactDetailsSyncState.lastSyncIdentifiers();
                    detailedContactsSyncEncryptedRoutine$contactsSync$1.L$1 = contactSync$SyncReason;
                    detailedContactsSyncEncryptedRoutine$contactsSync$1.label = 1;
                    obj = JsonObjectUtils.recoverLostContacts(realContactBook, list, lastSyncIdentifiers, detailedContactsSyncEncryptedRoutine$contactsSync$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map2 = detailedContactsSyncEncryptedRoutine$contactsSync$1.L$2;
                            SafeTrace.throwOnFailure(obj);
                            ContactsSyncResponse contactsSyncResponse = (ContactsSyncResponse) obj;
                            ArrayList arrayList = new ArrayList(map2.size());
                            for (Map.Entry entry : map2.entrySet()) {
                                ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact = (ContactBook$Contact$DetailedContact) entry.getKey();
                                ContactDetailsSyncState$LatestAndRow contactDetailsSyncState$LatestAndRow = (ContactDetailsSyncState$LatestAndRow) entry.getValue();
                                String lookupKey = contactBook$Contact$DetailedContact.getLookupKey();
                                ContactDetailsSyncState$PrimaryKey.m3515constructorimpl(lookupKey);
                                arrayList.add(new Pair(ContactDetailsSyncState$PrimaryKey.m3514boximpl(lookupKey), contactDetailsSyncState$LatestAndRow));
                            }
                            RealContactDetailsSyncState.batch$default(realContactDetailsSyncState, null, MapsKt__MapsKt.toMap(arrayList), null, 5);
                            return contactsSyncResponse;
                        }
                        this = detailedContactsSyncEncryptedRoutine$contactsSync$1.L$3;
                        map = detailedContactsSyncEncryptedRoutine$contactsSync$1.L$2;
                        contactSync$SyncReason = detailedContactsSyncEncryptedRoutine$contactsSync$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        detailedContactsSyncEncryptedRoutine$contactsSync$1.L$1 = null;
                        detailedContactsSyncEncryptedRoutine$contactsSync$1.L$2 = map;
                        detailedContactsSyncEncryptedRoutine$contactsSync$1.L$3 = null;
                        detailedContactsSyncEncryptedRoutine$contactsSync$1.label = 3;
                        obj = this.uploadAddressBook((List) obj, true, contactSync$SyncReason, detailedContactsSyncEncryptedRoutine$contactsSync$1);
                        if (obj != coroutineSingletons) {
                            map2 = map;
                            ContactsSyncResponse contactsSyncResponse2 = (ContactsSyncResponse) obj;
                            ArrayList arrayList2 = new ArrayList(map2.size());
                            while (r9.hasNext()) {
                            }
                            RealContactDetailsSyncState.batch$default(realContactDetailsSyncState, null, MapsKt__MapsKt.toMap(arrayList2), null, 5);
                            return contactsSyncResponse2;
                        }
                        return coroutineSingletons;
                    }
                    contactSync$SyncReason = detailedContactsSyncEncryptedRoutine$contactsSync$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                Map map3 = (Map) obj;
                List list2 = CollectionsKt.toList(map3.keySet());
                detailedContactsSyncEncryptedRoutine$contactsSync$1.L$1 = contactSync$SyncReason;
                detailedContactsSyncEncryptedRoutine$contactsSync$1.L$2 = map3;
                detailedContactsSyncEncryptedRoutine$contactsSync$1.L$3 = this;
                detailedContactsSyncEncryptedRoutine$contactsSync$1.label = 2;
                buildProtoList = buildProtoList(list2, detailedContactsSyncEncryptedRoutine$contactsSync$1);
                if (buildProtoList != coroutineSingletons) {
                    obj = buildProtoList;
                    map = map3;
                    detailedContactsSyncEncryptedRoutine$contactsSync$1.L$1 = null;
                    detailedContactsSyncEncryptedRoutine$contactsSync$1.L$2 = map;
                    detailedContactsSyncEncryptedRoutine$contactsSync$1.L$3 = null;
                    detailedContactsSyncEncryptedRoutine$contactsSync$1.label = 3;
                    obj = this.uploadAddressBook((List) obj, true, contactSync$SyncReason, detailedContactsSyncEncryptedRoutine$contactsSync$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        detailedContactsSyncEncryptedRoutine$contactsSync$1 = new DetailedContactsSyncEncryptedRoutine$contactsSync$1(this, continuationImpl);
        Object obj2 = detailedContactsSyncEncryptedRoutine$contactsSync$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedContactsSyncEncryptedRoutine$contactsSync$1.label;
        if (i != 0) {
        }
        Map map32 = (Map) obj2;
        List list22 = CollectionsKt.toList(map32.keySet());
        detailedContactsSyncEncryptedRoutine$contactsSync$1.L$1 = contactSync$SyncReason;
        detailedContactsSyncEncryptedRoutine$contactsSync$1.L$2 = map32;
        detailedContactsSyncEncryptedRoutine$contactsSync$1.L$3 = this;
        detailedContactsSyncEncryptedRoutine$contactsSync$1.label = 2;
        buildProtoList = buildProtoList(list22, detailedContactsSyncEncryptedRoutine$contactsSync$1);
        if (buildProtoList != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(Function1 function1) {
        ((SharingConfig) this.layoutNode).edit(function1);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public int getTransformedLength() {
        return ((SharingConfig) this.sentinelHead).getTransformedLength();
    }

    /* renamed from: has-H91voCI$ui, reason: not valid java name */
    public boolean m889hasH91voCI$ui(int i) {
        return (((Modifier.Node) this.head).getAggregateChildKindSet$ui() & i) != 0;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI */
    public long mo387mapFromTransformedGEjPoXI(long j) {
        return ((SharingConfig) this.layoutNode).mo387mapFromTransformedGEjPoXI(j);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI */
    public long mo388mapToTransformedGEjPoXI(long j) {
        return ((SharingConfig) this.layoutNode).mo388mapToTransformedGEjPoXI(j);
    }

    public void runAttachLifecycle() {
        for (Modifier.Node node = (Modifier.Node) this.head; node != null; node = node.getChild$ui()) {
            node.runAttachLifecycle$ui();
            if (node.getInsertedNodeAwaitingAttachForInvalidation$ui()) {
                NodeKindKt.autoInvalidateInsertedNode(node);
            }
            if (node.getUpdatedNodeAwaitingAttachForInvalidation$ui()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
            }
            node.setInsertedNodeAwaitingAttachForInvalidation$ui(false);
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
    
        if (r14 <= r7) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a2, code lost:
    
        if (r11 <= r15) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b0, code lost:
    
        if (r0.areItemsTheSame(r14 - 1, r27 - 1) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c1, code lost:
    
        if (r24 == 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c5, code lost:
    
        if (r11 < r12) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c7, code lost:
    
        if (r11 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (r13 > r3) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void structuralUpdate(int i, MutableVector mutableVector, MutableVector mutableVector2, Modifier.Node node, boolean z) {
        int i2;
        MutableVector mutableVector3;
        MutableVector mutableVector4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Differ differ = (Differ) this.cachedDiffer;
        if (differ == null) {
            i2 = i;
            mutableVector3 = mutableVector;
            mutableVector4 = mutableVector2;
            differ = new Differ(node, i2, mutableVector3, mutableVector4, z);
            this.cachedDiffer = differ;
        } else {
            i2 = i;
            mutableVector3 = mutableVector;
            mutableVector4 = mutableVector2;
            differ.node = node;
            differ.offset = i2;
            differ.before = mutableVector3;
            differ.after = mutableVector4;
            differ.shouldAttachOnInsert = z;
        }
        NodeChain nodeChain = NodeChain.this;
        int i9 = mutableVector3.size - i2;
        int i10 = mutableVector4.size - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        IntStack intStack = new IntStack(i11 * 3);
        IntStack intStack2 = new IntStack(i11 * 4);
        int i12 = 0;
        intStack2.pushRange(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = intStack2.tos;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = intStack2.slots;
            int i15 = i12;
            int i16 = i14 - 1;
            intStack2.tos = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            intStack2.tos = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            intStack2.tos = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            intStack2.tos = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && differ.areItemsTheSame(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        intStack.pushDiagonal(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    intStack2.pushRange(i23, iArr2[i15], i19, iArr2[c2]);
                    intStack2.pushRange(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = intStack.tos;
        if (i55 % 3 != 0) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            intStack.quickSort(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        intStack.pushDiagonal(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < intStack.tos) {
            int[] iArr8 = intStack.slots;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                Modifier.Node child$ui = differ.node.getChild$ui();
                child$ui.getClass();
                if ((child$ui.getKindSet$ui() & 2) != 0) {
                    NodeCoordinator coordinator$ui = child$ui.getCoordinator$ui();
                    coordinator$ui.getClass();
                    NodeCoordinator nodeCoordinator = coordinator$ui.wrappedBy;
                    NodeCoordinator nodeCoordinator2 = coordinator$ui.wrapped;
                    nodeCoordinator2.getClass();
                    if (nodeCoordinator != null) {
                        nodeCoordinator.wrapped = nodeCoordinator2;
                    }
                    nodeCoordinator2.wrappedBy = nodeCoordinator;
                    access$propagateCoordinator(nodeChain, differ.node, nodeCoordinator2);
                }
                differ.node = detachAndRemoveNode(child$ui);
                i57++;
            }
            while (i58 < i62) {
                Modifier.Node createAndInsertNodeAsChild = createAndInsertNodeAsChild((Modifier.Element) differ.after.content[differ.offset + i58], differ.node);
                differ.node = createAndInsertNodeAsChild;
                if (differ.shouldAttachOnInsert) {
                    Modifier.Node child$ui2 = createAndInsertNodeAsChild.getChild$ui();
                    child$ui2.getClass();
                    NodeCoordinator coordinator$ui2 = child$ui2.getCoordinator$ui();
                    coordinator$ui2.getClass();
                    LayoutModifierNode asLayoutModifierNode = DepthSortedSetKt.asLayoutModifierNode(differ.node);
                    if (asLayoutModifierNode != null) {
                        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator((LayoutNode) nodeChain.layoutNode, asLayoutModifierNode);
                        differ.node.updateCoordinator$ui(layoutModifierNodeCoordinator);
                        access$propagateCoordinator(nodeChain, differ.node, layoutModifierNodeCoordinator);
                        layoutModifierNodeCoordinator.wrappedBy = coordinator$ui2.wrappedBy;
                        layoutModifierNodeCoordinator.wrapped = coordinator$ui2;
                        coordinator$ui2.wrappedBy = layoutModifierNodeCoordinator;
                    } else {
                        differ.node.updateCoordinator$ui(coordinator$ui2);
                    }
                    differ.node.markAsAttached$ui();
                    differ.node.runAttachLifecycle$ui();
                    NodeKindKt.autoInvalidateInsertedNode(differ.node);
                } else {
                    createAndInsertNodeAsChild.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    Modifier.Node child$ui3 = differ.node.getChild$ui();
                    child$ui3.getClass();
                    differ.node = child$ui3;
                    MutableVector mutableVector5 = differ.before;
                    int i64 = differ.offset;
                    Modifier.Element element = (Modifier.Element) mutableVector5.content[i64 + i57];
                    Modifier.Element element2 = (Modifier.Element) differ.after.content[i64 + i58];
                    if (!Intrinsics.areEqual(element, element2)) {
                        updateNode(element, element2, differ.node);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (Modifier.Node parent$ui = ((TailModifierNode) this.tail).getParent$ui(); parent$ui != null && parent$ui != ((NodeChain$sentinelHead$1) this.sentinelHead); parent$ui = parent$ui.getParent$ui()) {
            i65 |= parent$ui.getKindSet$ui();
            parent$ui.setAggregateChildKindSet$ui(i65);
        }
    }

    public void syncCoordinators() {
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        LayoutNode layoutNode = (LayoutNode) this.layoutNode;
        NodeCoordinator nodeCoordinator = (InnerNodeCoordinator) this.innerCoordinator;
        for (Modifier.Node node = ((TailModifierNode) this.tail).getParent$ui(); node != null; node = node.getParent$ui()) {
            LayoutModifierNode asLayoutModifierNode = DepthSortedSetKt.asLayoutModifierNode(node);
            if (asLayoutModifierNode != null) {
                if (node.getCoordinator$ui() != null) {
                    NodeCoordinator coordinator$ui = node.getCoordinator$ui();
                    coordinator$ui.getClass();
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = (LayoutModifierNodeCoordinator) coordinator$ui;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator2.layoutModifierNode;
                    layoutModifierNodeCoordinator2.setLayoutModifierNode$ui(asLayoutModifierNode);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                    if (layoutModifierNode != node) {
                        OwnedLayer ownedLayer = layoutModifierNodeCoordinator2.layer;
                        layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                        if (ownedLayer != null) {
                            ((GraphicsLayerOwnerLayer) ownedLayer).invalidate();
                            layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                        }
                    }
                } else {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator3 = new LayoutModifierNodeCoordinator(layoutNode, asLayoutModifierNode);
                    node.updateCoordinator$ui(layoutModifierNodeCoordinator3);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator3;
                }
                nodeCoordinator.wrappedBy = layoutModifierNodeCoordinator;
                layoutModifierNodeCoordinator.wrapped = nodeCoordinator;
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                node.updateCoordinator$ui(nodeCoordinator);
            }
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        nodeCoordinator.wrappedBy = parent$ui != null ? (InnerNodeCoordinator) parent$ui.nodes.innerCoordinator : null;
        this.outerCoordinator = nodeCoordinator;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                Modifier.Node node = (Modifier.Node) this.head;
                TailModifierNode tailModifierNode = (TailModifierNode) this.tail;
                if (node == tailModifierNode) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (node != null && node != tailModifierNode) {
                            sb.append(String.valueOf(node));
                            if (node.getChild$ui() == tailModifierNode) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                node = node.getChild$ui();
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0417, code lost:
    
        if (r5.write(r0, r7, r4, r1) == r3) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v29, types: [com.squareup.cash.cdf.ContactSyncTriggerReason, com.squareup.cash.cdf.ContactSyncType, com.squareup.protos.cash.contacts.app.ContactsPatch, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x03d9 -> B:13:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object uploadAddressBook(List list, boolean z, ContactSync$SyncReason contactSync$SyncReason, ContinuationImpl continuationImpl) {
        DetailedContactsSyncEncryptedRoutine$uploadAddressBook$1 detailedContactsSyncEncryptedRoutine$uploadAddressBook$1;
        NodeChain nodeChain;
        int i;
        List list2;
        ContactSync$SyncReason contactSync$SyncReason2;
        DetailedContactsSyncEncryptedRoutine$uploadAddressBook$1 detailedContactsSyncEncryptedRoutine$uploadAddressBook$12;
        ?? r1;
        int i2;
        String str;
        ContactSyncType contactSyncType;
        ContactSyncTriggerReason contactSyncTriggerReason;
        long j;
        ContactSync$SyncReason contactSync$SyncReason3;
        List list3;
        NodeChain nodeChain2;
        ContactsPatch contactsPatch;
        int i3;
        ApiResult apiResult;
        ContactSyncResult syncResult;
        List list4;
        ContactsPatch contactsPatch2;
        byte[] encrypt;
        String detailed_sync_token;
        if (continuationImpl instanceof DetailedContactsSyncEncryptedRoutine$uploadAddressBook$1) {
            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1 = (DetailedContactsSyncEncryptedRoutine$uploadAddressBook$1) continuationImpl;
            int i4 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.label = i4 - PKIFailureInfo.systemUnavail;
                nodeChain = this;
                Object obj = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.label;
                int i5 = 1;
                ?? r10 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    list2 = list;
                    contactSync$SyncReason2 = contactSync$SyncReason;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1;
                    r1 = z;
                    RealContactSyncDetailsRepository realContactSyncDetailsRepository = (RealContactSyncDetailsRepository) nodeChain.sentinelHead;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$0 = list2;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$1 = contactSync$SyncReason2;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$2 = nodeChain;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$3 = r10;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$4 = r10;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$5 = r10;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$6 = r10;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.I$0 = r1;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.label = i5;
                    Sync_details fetchDetails = realContactSyncDetailsRepository.fetchDetails();
                    if (fetchDetails == null) {
                    }
                    if (detailed_sync_token != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    i3 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.I$0;
                    NodeChain nodeChain3 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$2;
                    ContactSync$SyncReason contactSync$SyncReason4 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$1;
                    list4 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    contactSync$SyncReason3 = contactSync$SyncReason4;
                    nodeChain2 = nodeChain3;
                    str = (String) obj;
                    contactSyncType = str != null ? ContactSyncType.FRESH : ContactSyncType.INCREMENTAL;
                    contactSyncTriggerReason = Strings.toCdfTriggerReason(contactSync$SyncReason3);
                    if (str != null) {
                    }
                    Matchers.trackContactEncryptedSyncStart((Analytics) nodeChain2.head, contactSyncTriggerReason, new Integer(contactsPatch.upserted_contacts.size()), new Integer(contactsPatch.removed_contact_ids.size()), contactSyncType);
                    byte[] encode = contactsPatch.encode();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Deflater deflater = new Deflater(5, true);
                    DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                    deflaterOutputStream.write(encode);
                    deflaterOutputStream.finish();
                    deflater.end();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    ByteString.Companion companion = ByteString.Companion;
                    encrypt = ((HybridEncryptor) nodeChain2.cachedDiffer).encrypt(byteArray);
                    ByteString of$default = ByteString.Companion.of$default(encrypt);
                    j = ((AndroidClock) nodeChain2.tail).millis();
                    ContactsAppClientService contactsAppClientService = (ContactsAppClientService) nodeChain2.layoutNode;
                    List list5 = list4;
                    SyncContactsRequest syncContactsRequest = new SyncContactsRequest(str, EmptyList.INSTANCE, of$default, ByteString.EMPTY);
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$0 = list5;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$1 = contactSync$SyncReason3;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$2 = nodeChain2;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$3 = str;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$4 = contactSyncType;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$5 = contactSyncTriggerReason;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$6 = contactsPatch;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.I$0 = i3;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.J$0 = j;
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.label = 2;
                    obj = contactsAppClientService.syncContactsDetailed(syncContactsRequest, detailedContactsSyncEncryptedRoutine$uploadAddressBook$1);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 2) {
                    j = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.J$0;
                    i3 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.I$0;
                    contactsPatch = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$6;
                    contactSyncTriggerReason = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$5;
                    contactSyncType = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$4;
                    str = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$3;
                    nodeChain2 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$2;
                    contactSync$SyncReason3 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$1;
                    list3 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ContactSyncTriggerReason contactSyncTriggerReason2 = contactSyncTriggerReason;
                    ContactSyncType contactSyncType2 = contactSyncType;
                    apiResult = (ApiResult) obj;
                    ContactSyncSendToServer.ServerResponse access$toServerResponse = BrowserSDKLogger$Companion.access$toServerResponse(apiResult);
                    AndroidClock androidClock = (AndroidClock) nodeChain2.tail;
                    Analytics analytics = (Analytics) nodeChain2.head;
                    double millis = (androidClock.millis() - j) / 1000.0d;
                    String access$errorDescription = BrowserSDKLogger$Companion.access$errorDescription(apiResult);
                    syncResult = Strings.toSyncResult(access$toServerResponse);
                    Matchers.trackContactEncryptedSyncComplete(analytics, contactSyncTriggerReason2, contactSyncType2, syncResult, access$errorDescription, new Double(millis));
                    List list6 = list3;
                    if (Strings.isNetworkError(syncResult)) {
                    }
                    if (str != null) {
                    }
                    Matchers.trackContactSyncSendToServer(analytics, Boolean.valueOf(str != null), new Integer(contactsPatch.upserted_contacts.size()), new Integer(contactsPatch.removed_contact_ids.size()), new Double(millis), access$toServerResponse, ContactSyncSendToServer.SyncLogicType.MODERN, access$errorDescription);
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                } else {
                    if (i == 3) {
                        List list7 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        i2 = 3;
                        return new ContactsSyncResponse.Success(false, i2);
                    }
                    if (i != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.I$0;
                    NodeChain nodeChain4 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$2;
                    ContactSync$SyncReason contactSync$SyncReason5 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$1;
                    List list8 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    detailedContactsSyncEncryptedRoutine$uploadAddressBook$12 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1;
                    if (i3 == 0) {
                        nodeChain = nodeChain4;
                        contactSync$SyncReason2 = contactSync$SyncReason5;
                        list2 = list8;
                        r1 = 0;
                        r10 = 0;
                        RealContactSyncDetailsRepository realContactSyncDetailsRepository2 = (RealContactSyncDetailsRepository) nodeChain.sentinelHead;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$0 = list2;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$1 = contactSync$SyncReason2;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$2 = nodeChain;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$3 = r10;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$4 = r10;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$5 = r10;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.L$6 = r10;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.I$0 = r1;
                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$12.label = i5;
                        Sync_details fetchDetails2 = realContactSyncDetailsRepository2.fetchDetails();
                        detailed_sync_token = fetchDetails2 == null ? fetchDetails2.getDetailed_sync_token() : r10;
                        if (detailed_sync_token != coroutineSingletons) {
                            String str2 = detailed_sync_token;
                            list4 = list2;
                            obj = str2;
                            NodeChain nodeChain5 = nodeChain;
                            i3 = r1;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$12;
                            nodeChain2 = nodeChain5;
                            contactSync$SyncReason3 = contactSync$SyncReason2;
                            str = (String) obj;
                            contactSyncType = str != null ? ContactSyncType.FRESH : ContactSyncType.INCREMENTAL;
                            contactSyncTriggerReason = Strings.toCdfTriggerReason(contactSync$SyncReason3);
                            if (str != null) {
                                contactsPatch = new ContactsPatch(list4, EmptyList.INSTANCE);
                            } else {
                                RealContactDetailsSyncState realContactDetailsSyncState = (RealContactDetailsSyncState) nodeChain2.innerCoordinator;
                                Analytics analytics2 = (Analytics) nodeChain2.head;
                                SessionQueries sessionQueries = realContactDetailsSyncState.details;
                                sessionQueries.getClass();
                                ContactDetailsSyncStateQueries$all$2 contactDetailsSyncStateQueries$all$2 = ContactDetailsSyncStateQueries$all$2.INSTANCE;
                                SqlDriver sqlDriver = sessionQueries.driver;
                                WebLoginConfigQueries$$ExternalSyntheticLambda2 webLoginConfigQueries$$ExternalSyntheticLambda2 = new WebLoginConfigQueries$$ExternalSyntheticLambda2(23);
                                sqlDriver.getClass();
                                List<Contact_detailed_sync_state> executeAsList = new SimpleQuery(714109146, new String[]{"contact_detailed_sync_state"}, sqlDriver, "ContactDetailsSyncState.sq", "all", "SELECT primary_key, latest_lookup_key, row_id, hash\nFROM contact_detailed_sync_state", webLoginConfigQueries$$ExternalSyntheticLambda2).executeAsList();
                                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
                                if (mapCapacity < 16) {
                                    mapCapacity = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                                for (Contact_detailed_sync_state contact_detailed_sync_state : executeAsList) {
                                    String primary_key = contact_detailed_sync_state.getPrimary_key();
                                    ContactDetailsSyncState$PrimaryKey.m3515constructorimpl(primary_key);
                                    ContactDetailsSyncState$PrimaryKey m3514boximpl = ContactDetailsSyncState$PrimaryKey.m3514boximpl(primary_key);
                                    String hash = contact_detailed_sync_state.getHash();
                                    GlobPattern.m1917constructorimpl(hash);
                                    linkedHashMap.put(m3514boximpl, new ContactDetailsSyncState$FullDetails(primary_key, primary_key, hash));
                                    realContactDetailsSyncState = realContactDetailsSyncState;
                                }
                                RealContactDetailsSyncState realContactDetailsSyncState2 = realContactDetailsSyncState;
                                List list9 = list4;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list9) {
                                    AddressBookContact addressBookContact = (AddressBookContact) obj2;
                                    List list10 = list9;
                                    String str3 = addressBookContact.contact_id;
                                    if (str3 == null) {
                                        str3 = null;
                                    }
                                    if (str3 != null) {
                                        ContactDetailsSyncState$FullDetails contactDetailsSyncState$FullDetails = (ContactDetailsSyncState$FullDetails) linkedHashMap.get(ContactDetailsSyncState$PrimaryKey.m3514boximpl(str3));
                                        String m3511getHash0vXzpQ = contactDetailsSyncState$FullDetails != null ? contactDetailsSyncState$FullDetails.m3511getHash0vXzpQ() : null;
                                        if (!(m3511getHash0vXzpQ == null ? false : GlobPattern.m1918equalsimpl0(m3511getHash0vXzpQ, BrowserSDKLogger$Companion.access$hash(addressBookContact)))) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    list9 = list10;
                                }
                                List list11 = list9;
                                Set set = CollectionsKt.toSet(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = list11.iterator();
                                while (it.hasNext()) {
                                    String str4 = ((AddressBookContact) it.next()).contact_id;
                                    if (str4 != null) {
                                        arrayList2.add(str4);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    String str5 = (String) it2.next();
                                    ContactDetailsSyncState$PrimaryKey.m3515constructorimpl(str5);
                                    arrayList3.add(ContactDetailsSyncState$PrimaryKey.m3514boximpl(str5));
                                }
                                Set minus = SetsKt___SetsKt.minus(realContactDetailsSyncState2.lastSyncIdentifiers().keySet(), (Iterable) CollectionsKt.toSet(arrayList3));
                                if (set.isEmpty() && minus.isEmpty()) {
                                    contactsPatch2 = null;
                                } else {
                                    List list12 = CollectionsKt.toList(set);
                                    Set set2 = minus;
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                                    Iterator it3 = set2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList4.add(((ContactDetailsSyncState$PrimaryKey) it3.next()).m3516unboximpl());
                                    }
                                    contactsPatch2 = new ContactsPatch(list12, arrayList4);
                                }
                                if (contactsPatch2 == null) {
                                    ContactSkipReason contactSkipReason = ContactSkipReason.EMPTY_CONTACTS;
                                    Matchers.trackContactEncryptedSyncSkip(analytics2, contactSyncType);
                                    ContactSyncResult contactSyncResult = ContactSyncResult.SUCCESS;
                                    Matchers.trackContactEncryptedSyncComplete(analytics2, contactSyncTriggerReason, contactSyncType, ContactSyncResult.REQUEST_SKIPPED, null, null);
                                    return new ContactsSyncResponse.Success(false, 3);
                                }
                                contactsPatch = contactsPatch2;
                            }
                            Matchers.trackContactEncryptedSyncStart((Analytics) nodeChain2.head, contactSyncTriggerReason, new Integer(contactsPatch.upserted_contacts.size()), new Integer(contactsPatch.removed_contact_ids.size()), contactSyncType);
                            byte[] encode2 = contactsPatch.encode();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            Deflater deflater2 = new Deflater(5, true);
                            DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream2, deflater2);
                            deflaterOutputStream2.write(encode2);
                            deflaterOutputStream2.finish();
                            deflater2.end();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                            ByteString.Companion companion2 = ByteString.Companion;
                            encrypt = ((HybridEncryptor) nodeChain2.cachedDiffer).encrypt(byteArray2);
                            ByteString of$default2 = ByteString.Companion.of$default(encrypt);
                            j = ((AndroidClock) nodeChain2.tail).millis();
                            ContactsAppClientService contactsAppClientService2 = (ContactsAppClientService) nodeChain2.layoutNode;
                            List list52 = list4;
                            SyncContactsRequest syncContactsRequest2 = new SyncContactsRequest(str, EmptyList.INSTANCE, of$default2, ByteString.EMPTY);
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$0 = list52;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$1 = contactSync$SyncReason3;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$2 = nodeChain2;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$3 = str;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$4 = contactSyncType;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$5 = contactSyncTriggerReason;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$6 = contactsPatch;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.I$0 = i3;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.J$0 = j;
                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.label = 2;
                            obj = contactsAppClientService2.syncContactsDetailed(syncContactsRequest2, detailedContactsSyncEncryptedRoutine$uploadAddressBook$1);
                            if (obj != coroutineSingletons) {
                                list3 = list52;
                                ContactSyncTriggerReason contactSyncTriggerReason22 = contactSyncTriggerReason;
                                ContactSyncType contactSyncType22 = contactSyncType;
                                apiResult = (ApiResult) obj;
                                ContactSyncSendToServer.ServerResponse access$toServerResponse2 = BrowserSDKLogger$Companion.access$toServerResponse(apiResult);
                                AndroidClock androidClock2 = (AndroidClock) nodeChain2.tail;
                                Analytics analytics3 = (Analytics) nodeChain2.head;
                                double millis2 = (androidClock2.millis() - j) / 1000.0d;
                                String access$errorDescription2 = BrowserSDKLogger$Companion.access$errorDescription(apiResult);
                                syncResult = Strings.toSyncResult(access$toServerResponse2);
                                Matchers.trackContactEncryptedSyncComplete(analytics3, contactSyncTriggerReason22, contactSyncType22, syncResult, access$errorDescription2, new Double(millis2));
                                List list62 = list3;
                                if (Strings.isNetworkError(syncResult)) {
                                    Matchers.trackContactSyncNetworkError(analytics3, contactSyncTriggerReason22, access$errorDescription2, contactSyncType22);
                                }
                                Matchers.trackContactSyncSendToServer(analytics3, Boolean.valueOf(str != null), new Integer(contactsPatch.upserted_contacts.size()), new Integer(contactsPatch.removed_contact_ids.size()), new Double(millis2), access$toServerResponse2, ContactSyncSendToServer.SyncLogicType.MODERN, access$errorDescription2);
                                if (!(apiResult instanceof ApiResult.Success)) {
                                    if (apiResult instanceof ApiResult.Failure) {
                                        return new ContactsSyncResponse.Failure((ApiResult.Failure) apiResult, 2);
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                SyncContactsResponse syncContactsResponse = (SyncContactsResponse) ((ApiResult.Success) apiResult).response;
                                SyncContactsResponse.ResponseCode responseCode = syncContactsResponse.response_code;
                                int i6 = responseCode == null ? -1 : DetailedContactsSyncEncryptedRoutine$WhenMappings.$EnumSwitchMapping$0[responseCode.ordinal()];
                                if (i6 != -1) {
                                    i5 = 1;
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$0 = list62;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$1 = contactSync$SyncReason3;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$2 = nodeChain2;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$3 = null;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$4 = null;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$5 = null;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$6 = null;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.I$0 = i3;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.J$0 = j;
                                        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.label = 4;
                                        Matchers.trackContactEncryptedSyncClearData(analytics3, ContactClearDataReason.NON_RETRYABLE_ERROR);
                                        SessionQueries sessionQueries2 = ((RealContactDetailsSyncState) nodeChain2.innerCoordinator).details;
                                        sessionQueries2.driver.execute(-920376760, "DELETE FROM contact_detailed_sync_state", null);
                                        sessionQueries2.notifyQueries(-920376760, new WebLoginConfigQueries$$ExternalSyntheticLambda2(22, false));
                                        Unit detailedSyncToken = ((RealContactSyncDetailsRepository) nodeChain2.sentinelHead).setDetailedSyncToken(null);
                                        if (detailedSyncToken != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            detailedSyncToken = Unit.INSTANCE;
                                        }
                                        if (detailedSyncToken != coroutineSingletons) {
                                            list8 = list62;
                                            nodeChain4 = nodeChain2;
                                            contactSync$SyncReason5 = contactSync$SyncReason3;
                                            detailedContactsSyncEncryptedRoutine$uploadAddressBook$12 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1;
                                            if (i3 == 0) {
                                                return new ContactsSyncResponse.Failure((ApiResult.Failure) null, 3);
                                            }
                                        }
                                    }
                                }
                                ArrayList access$added = BrowserSDKLogger$Companion.access$added(contactsPatch);
                                ArrayList access$removed = BrowserSDKLogger$Companion.access$removed(contactsPatch);
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$0 = null;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$1 = null;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$2 = null;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$3 = null;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$4 = null;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$5 = null;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.L$6 = null;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.I$0 = i3;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.J$0 = j;
                                i2 = 3;
                                detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.label = 3;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        nodeChain = this;
        detailedContactsSyncEncryptedRoutine$uploadAddressBook$1 = new DetailedContactsSyncEncryptedRoutine$uploadAddressBook$1(nodeChain, continuationImpl);
        Object obj3 = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedContactsSyncEncryptedRoutine$uploadAddressBook$1.label;
        int i52 = 1;
        ?? r102 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object write(SyncContactsResponse syncContactsResponse, ArrayList arrayList, ArrayList arrayList2, ContinuationImpl continuationImpl) {
        DetailedContactsSyncEncryptedRoutine$write$1 detailedContactsSyncEncryptedRoutine$write$1;
        int i;
        if (continuationImpl instanceof DetailedContactsSyncEncryptedRoutine$write$1) {
            detailedContactsSyncEncryptedRoutine$write$1 = (DetailedContactsSyncEncryptedRoutine$write$1) continuationImpl;
            int i2 = detailedContactsSyncEncryptedRoutine$write$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                detailedContactsSyncEncryptedRoutine$write$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = detailedContactsSyncEncryptedRoutine$write$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedContactsSyncEncryptedRoutine$write$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealContactSyncDetailsRepository realContactSyncDetailsRepository = (RealContactSyncDetailsRepository) this.sentinelHead;
                    String str = syncContactsResponse.patch_id;
                    detailedContactsSyncEncryptedRoutine$write$1.L$1 = arrayList;
                    detailedContactsSyncEncryptedRoutine$write$1.L$2 = arrayList2;
                    detailedContactsSyncEncryptedRoutine$write$1.label = 1;
                    if (realContactSyncDetailsRepository.setDetailedSyncToken(str) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList2 = detailedContactsSyncEncryptedRoutine$write$1.L$2;
                    arrayList = detailedContactsSyncEncryptedRoutine$write$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                RealContactDetailsSyncState.batch$default((RealContactDetailsSyncState) this.innerCoordinator, arrayList, null, arrayList2, 2);
                return Unit.INSTANCE;
            }
        }
        detailedContactsSyncEncryptedRoutine$write$1 = new DetailedContactsSyncEncryptedRoutine$write$1(this, continuationImpl);
        Object obj2 = detailedContactsSyncEncryptedRoutine$write$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedContactsSyncEncryptedRoutine$write$1.label;
        if (i != 0) {
        }
        RealContactDetailsSyncState.batch$default((RealContactDetailsSyncState) this.innerCoordinator, arrayList, null, arrayList2, 2);
        return Unit.INSTANCE;
    }

    public NodeChain(LayoutNode layoutNode) {
        this.$r8$classId = 0;
        this.layoutNode = layoutNode;
        NodeChain$sentinelHead$1 nodeChain$sentinelHead$1 = new NodeChain$sentinelHead$1();
        nodeChain$sentinelHead$1.setAggregateChildKindSet$ui(-1);
        this.sentinelHead = nodeChain$sentinelHead$1;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tailModifierNode = innerNodeCoordinator.tail;
        this.tail = tailModifierNode;
        this.head = tailModifierNode;
        this.stack = new MutableVector(0, new Modifier[16]);
    }

    public /* synthetic */ NodeChain(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        this.$r8$classId = i;
        this.layoutNode = obj;
        this.sentinelHead = obj2;
        this.innerCoordinator = obj3;
        this.outerCoordinator = obj4;
        this.tail = obj5;
        this.head = obj6;
        this.current = obj7;
        this.buffer = obj8;
        this.stack = obj9;
        this.cachedDiffer = obj10;
    }

    public NodeChain(SharingConfig sharingConfig, TransformedTextFieldState transformedTextFieldState, WorkLauncherImpl workLauncherImpl, Function1 function1, RequestFactory requestFactory, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration, Function1 function12) {
        this.$r8$classId = 1;
        this.sentinelHead = sharingConfig;
        this.innerCoordinator = transformedTextFieldState;
        this.outerCoordinator = workLauncherImpl;
        this.tail = function1;
        this.head = requestFactory;
        this.current = textLayoutState;
        this.buffer = function0;
        this.stack = viewConfiguration;
        this.cachedDiffer = function12;
        this.layoutNode = sharingConfig;
    }
}
