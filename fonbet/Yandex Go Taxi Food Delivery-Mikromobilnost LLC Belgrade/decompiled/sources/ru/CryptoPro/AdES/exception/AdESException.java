package ru.CryptoPro.AdES.exception;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/* loaded from: classes4.dex */
public class AdESException extends Exception implements IAdESException {
    protected static final Map<Integer, String> errorNames;
    private final String detailedMessage;
    private final Set<Integer> errorCodes;

    static {
        HashMap hashMap = new HashMap();
        errorNames = hashMap;
        hashMap.put(IAdESException.ecInternal, "Application error");
        hashMap.put(IAdESException.ecUnknown, "Unknown error");
        hashMap.put(IAdESException.ecSuccess, "Successful operation");
        hashMap.put(IAdESException.ecWrongCertificateChain, "Invalid certificate chain");
        hashMap.put(IAdESException.ecCertificateChainIsNull, "Certificate chain is null");
        hashMap.put(IAdESException.ecSignatureSignedDataIsNull, "Signed data is null");
        hashMap.put(IAdESException.ecSignatureUnsupported, "Unsupported signature type");
        hashMap.put(IAdESException.ecSignatureSignerIsNull, "Signer is null");
        hashMap.put(IAdESException.ecSignatureWrongAttributeCount, "Invalid attribute count");
        hashMap.put(IAdESException.ecSignaturePrivateKeyUsagePeriodExpiredOrNotYetValid, "Private key usage period is expired or not yet valid");
        hashMap.put(IAdESException.ecSignatureInvalid, "Signature is invalid");
        hashMap.put(IAdESException.ecSignerWrongCountersignature, "Invalid countersignature format");
        hashMap.put(IAdESException.ecSignerCertificateIsNull, "Signer certificate is null");
        hashMap.put(IAdESException.ecFinderWrongCertRef, "Invalid certificate reference");
        hashMap.put(IAdESException.ecFinderListIsNull, "List of certificates is null");
        hashMap.put(IAdESException.ecFinderCertificateIsNull, "Certificate not found in the certificate list");
        hashMap.put(IAdESException.ecFinderWrongOcspRef, "Invalid OCSP evidence's reference");
        hashMap.put(IAdESException.ecFinderWrongCrlRef, "Invalid CRL evidence's reference");
        hashMap.put(IAdESException.ecRevocationIsNull, "Evidence is null");
        hashMap.put(IAdESException.ecRevocationCertificateStatusIsRevoked, "Certificate status is revoked");
        hashMap.put(IAdESException.ecRevocationCertificateStatusIsUnknown, "Certificate status is unknown");
        hashMap.put(IAdESException.ecRevocationWrongCertificateConstraints, "Invalid constraints of the certificate");
        hashMap.put(IAdESException.ecRevocationWrongCertRef, "Invalid reference to certificate among the evidences");
        hashMap.put(IAdESException.ecRevocationWrongOcspResponsePeriod, "Invalid OCSP evidence's response period");
        hashMap.put(IAdESException.ecParserWrongCertRef, "Invalid reference to certificate while decoding");
        hashMap.put(IAdESException.ecParserWrongOcspRef, "Invalid reference to OCSP evidence while decoding");
        hashMap.put(IAdESException.ecParserWrongCrlRef, "Invalid reference to CRL evidence while decoding");
        hashMap.put(IAdESException.ecParserSigningCertificateConflict, "Conflict: signing-certificateV2 and other-certificate are found");
        hashMap.put(IAdESException.ecParserSigningCertificateIsNull, "Signer certificate is null while decoding");
        hashMap.put(IAdESException.ecParserIsNull, "Signature is not decoded");
        hashMap.put(IAdESException.ecOnlineCallFailed, "Calling a remote service failed");
        hashMap.put(IAdESException.ecBuilderRootIsAbsent, "Root certificate not found either in certificate chain or in cacerts");
        hashMap.put(IAdESException.ecBuilderRootIsUntrusted, "Root certificate is in the certificate chain but not in cacerts");
        hashMap.put(IAdESException.ecBuilderPKIXInvalidChain, "PKIX failure: invalid parameters of certificate");
        hashMap.put(IAdESException.ecTimestampInvalid, "Timestamp is invalid");
        hashMap.put(IAdESException.ecTimestampWrongImprint, "Timestamp has invalid imprint (digest)");
        hashMap.put(IAdESException.ecArchiveTimestampV3WrongImprint, "Archive-timestamp-V3 has invalid imprint (digest)");
        hashMap.put(IAdESException.ecSignatureGeneratorUndefined, "Signature generator is undefined");
        hashMap.put(IAdESException.ecSignatureInputStreamUndefined, "Signature input stream is undefined");
        hashMap.put(IAdESException.ecSignatureOutputStreamUndefined, "Signature output stream is undefined");
        hashMap.put(IAdESException.ecOpeningOutputContextFailed, "Opening of output context failed");
        hashMap.put(IAdESException.ecClosingOutputContextFailed, "Closing of output context failed");
        hashMap.put(IAdESException.ecClosingSignatureFailed, "Signature output stream is undefined. Did you forget to open and update?");
        hashMap.put(IAdESException.ecReplacingSignatureSignersFailed, "Replacing of signers failed");
        hashMap.put(IAdESException.ecReplacingSignatureCertificatesAndCRLsFailed, "Replacing of certificates and CRLs failed");
        hashMap.put(IAdESException.ecRevocationCRLWrongNextUpdate, "Invalid nextUpdate in CRL (later than *AdES-C-timestamp)");
        hashMap.put(IAdESException.ecRevocationCRLNotSuitable, "CRL is not suitable for the certificate");
        hashMap.put(IAdESException.ecRevocationCertificateStatusIsUnknownOrRevoked, "Certificate status is unknown or revoked");
        hashMap.put(IAdESException.ecRevocationInvalidCRL, "Invalid CRL found during decoding");
        hashMap.put(IAdESException.ecRevocationInvalidOCSP, "Invalid OCSP response found during decoding");
        hashMap.put(IAdESException.ecTimestampNotFound, "Timestamp not found");
        hashMap.put(IAdESException.ecSignatureMarshallingFailed, "Signature marshalling failed");
        hashMap.put(IAdESException.ecSignatureFailed, "Signature failed");
        hashMap.put(IAdESException.ecNodeEncodingFailed, "Encoding of node content failed");
        hashMap.put(IAdESException.ecNodeDecodingFailed, "Decoding of node content failed");
        hashMap.put(IAdESException.ecNodeNotFound, "Node not found");
        hashMap.put(IAdESException.ecNodeInvalidContent, "Node has invalid content");
        hashMap.put(IAdESException.ecNormalizingFailed, "Normalization of references, certificates and revocations failed");
        hashMap.put(IAdESException.ecKeyMismatch, "Private key does not match public key");
        hashMap.put(IAdESException.ecWrongKeyUsage, "Wrong key usage");
        hashMap.put(IAdESException.ecAlgorithmMismatch, "Algorithm mismatch");
        hashMap.put(IAdESException.ecATSHashIndexCreatingFailure, "Failure during ats-hash-index creating");
        hashMap.put(IAdESException.ecInvalidATSHashIndex, "Invalid ats-hash-index value");
        hashMap.put(IAdESException.ecCAdESACreatingFailure, "Failure during CAdES-A generating");
        hashMap.put(IAdESException.ecGetMessageDigestFailure, "Invalid calculated message-digest");
        hashMap.put(IAdESException.ecCAdESAEnhancingFailure, "Failure during CAdES-A enhancement");
        hashMap.put(IAdESException.ecCAdESANoIdenticDigAlgFailure, "Enhancement of attached signature with different digest algorithms prohibited");
        hashMap.put(IAdESException.ecClosingInputDataContextFailed, "Closing of input context failed");
        hashMap.put(IAdESException.ecCAdESADateMismatch, "Invalid date/time of new archive timestamp");
        hashMap.put(IAdESException.ecCAdESAVerifingFailure, "Failure during CAdES-A validation");
        hashMap.put(IAdESException.ecUnexpectedTimestampCount, "Unexpected timestamp count");
        hashMap.put(IAdESException.ecRevocationCRLWrongThisUpdate, "CRL has wrong thisUpdate");
        hashMap.put(IAdESException.ecCertificateExpiredOrNotYetValid, "Certificate expired or not yet valid");
        hashMap.put(IAdESException.ecNoOneSignerFound, "No one signer found");
        hashMap.put(IAdESException.ecInvalidSignatureEncodingFormat, "Invalid signature encoding format");
    }

    public AdESException(Exception exc, Integer num) {
        super(exc);
        HashSet hashSet = new HashSet(0);
        this.errorCodes = hashSet;
        this.detailedMessage = exc instanceof AdESException ? ((AdESException) exc).detailedMessage : exc.getMessage();
        hashSet.add(num);
    }

    public static String getErrorCodeName(Integer num) {
        return errorNames.get(num);
    }

    @Override // ru.CryptoPro.AdES.exception.IAdESException
    public Integer getErrorCode() {
        return !this.errorCodes.isEmpty() ? this.errorCodes.iterator().next() : IAdESException.ecUnknown;
    }

    @Override // ru.CryptoPro.AdES.exception.IAdESException
    public Vector<Integer> getErrorCodeList() {
        return new Vector<>(this.errorCodes);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.detailedMessage;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getMessage());
        if (this.errorCodes.size() > 0) {
            stringBuffer.append("; error codes: ");
            for (Integer num : this.errorCodes) {
                stringBuffer.append("[");
                stringBuffer.append(num);
                stringBuffer.append("] '");
                stringBuffer.append(errorNames.get(num));
                stringBuffer.append("', ");
            }
        }
        return stringBuffer.toString();
    }

    public AdESException(Integer num) {
        this(getErrorCodeName(num), num);
    }

    public AdESException(String str, Exception exc, Integer num) {
        super(exc);
        HashSet hashSet = new HashSet(0);
        this.errorCodes = hashSet;
        this.detailedMessage = str;
        hashSet.add(num);
    }

    public AdESException(String str, Integer... numArr) {
        super(str);
        HashSet hashSet = new HashSet(0);
        this.errorCodes = hashSet;
        this.detailedMessage = str;
        if (numArr == null || numArr.length <= 0) {
            return;
        }
        hashSet.addAll(Arrays.asList(numArr));
    }
}
